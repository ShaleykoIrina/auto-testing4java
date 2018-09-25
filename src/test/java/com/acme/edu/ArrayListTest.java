package com.acme.edu;

import org.hamcrest.CoreMatchers.*;
import org.fest.assertions.api.Assertions;
import org.junit.*;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.invocation.InvocationOnMock;
import org.mockito.runners.MockitoJUnitRunner;
import org.mockito.stubbing.Answer;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;

import static org.hamcrest.CoreMatchers.allOf;
import static org.hamcrest.core.StringContains.*;
import static junit.framework.TestCase.assertTrue;

import static org.junit.Assert.assertEquals;
import static org.junit.Assume.assumeTrue;

import static org.fest.assertions.api.Assertions.assertThat;
import static org.mockito.Mockito.*;

@RunWith(MockitoJUnitRunner.class)
public class ArrayListTest {
    private ArrayList<Object> sut;

    @Mock
    private Object filterStub; //=mock(Object.class)

    @BeforeClass @AfterClass
    public static void globalSetUp() {

    }

    @Before @After
    public void setUp() {
        sut = new ArrayList<>(); //Diamond operator
    }

    @Test
    public void shouldSizeIncrementedWhenAddElementNotNull() {
        //region Given
        Object dummy = new Object();
        assumeTrue(sut.size() == 0);
        //endregion

        //region When
        sut.add(dummy);
        if (1 != 1) throw new RuntimeException("test");
        //endregion

        //region Then
        assertEquals(1, sut.size());
        //endregion
    }

    @Test//(expected = Throwable.class)
    public void shouldThrowExceptionWhenAddNullElement() {
        //region When
        sut.add(null);
        //endregion
    }

    @Test
    public void shouldGetStringRepresentationFromElementsWhenToString() {
        //region Given
        sut.add("test 1");
        sut.add(2);
        //endregion

        //region When
        String result = sut.toString();
        //endregion

        //region Then
        assertTrue(
                result.contains("test 1") &&
                result.contains("2")
        );

        String str;
        Assert.assertThat(
                result,
                allOf(
                        containsString("2"),
                        containsString("test 1")
                )
        );

        Assertions.assertThat(result)
            .contains("2")
            .contains("test 1");
        //endregion
    }

    /**
     * State-based testing
     */
    @Test //Counter anti-pattern
    public void shouldGetStringRepresentationFromElementsWhenToString2() {
        //region Given
        Object stub1 = mock(Object.class);
        when(stub1.toString()).thenReturn("test 1"); //PowerMockito

        Object stub2 = mock(Object.class);
        when(stub2.toString()).thenAnswer(ctx -> {
            return "2";
        });

        sut.add(stub1);
        sut.add(stub2);
        //endregion

        Assertions.assertThat(sut.toString())
                .contains("2")
                .contains("test 1");


    }

    /**
     * Interaction-based testing | Mocking
     */
    @Test @Ignore //Counter anti-pattern
    public void shouldGetStringRepresentationFromElementsWhenToString3() {
        //region Given
        Object mock1 = mock(Object.class);
        Object mock2 = mock(Object.class);

        sut.add(mock1);
        sut.add(mock2);
        //endregion

        //region When
        sut.toString();
        //endregion

        //region Then
//        verify(mock1).toString(any(MyClass.class));
        verify(mock1).toString();
        verify(mock2, times(1)).toString();
        //endregion
    }

    @Test
    public void hashSetShouldCallHashCodeWhenAddElementIT() {
        //region Given
        LoggerSaver saverSpy = spy(new ConsoleLoggerSaver());
        LoggerFilter filterStub = mock(LoggerFilter.class);
        when(filterStub.filter(any(String.class))).thenReturn(true);
        Logger sut = new Logger(filterStub, saverSpy);
        //endregion

        //region When
       sut.log("test string");
       //endregion

        //region Then
        verify(saverSpy).save("test string");
        //endregion
    }

    //region Demo
    private static<T> T myMock(Class<T> typeInfo) {
        return null;
    }
    //endregion
}

class DAO {
    @Override
    public String toString() {
        return super.toString();
    }
}
