package com.acme.edu;

import org.junit.After;
import org.junit.Before;
import org.junit.Rule;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.runners.MockitoJUnitRunner;

import static org.mockito.Mockito.when;


@RunWith(MockitoJUnitRunner.class)
public class LoggerIT {
    @Rule public LoggerRule logger = new LoggerRule();

    @Mock private LoggerSaver stub1; //= mock(LoggerSaver.class)

    @Before @After public void setUp() {
        System.out.println("fixture");
    }

    @Test(timeout = 10_000) //BDD = DDD + test
    public void shouldLogSuccessfullyWhenStateAndParamIsNotNull() { //Counter Anti-pattern
        when(stub1.toString()).thenReturn("my super stub");
        System.out.println(stub1);
    }
}
