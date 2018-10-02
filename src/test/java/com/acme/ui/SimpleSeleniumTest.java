package com.acme.ui;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.After;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import static org.junit.Assert.assertEquals;

public class SimpleSeleniumTest {
    private WebDriver driver;

    @BeforeClass
    public static void setupClass() {
        WebDriverManager.getInstance(ChromeDriver.class).setup();
    }

    @Before
    public void openBrowser() {
        driver = new ChromeDriver();
    }

    @Test
    public void shouldGetYandexWeatherPage() throws InterruptedException {
        driver.get("http://ya.ru");
        WebElement inputField = driver.findElement(By.id("text"));
        inputField.sendKeys("test");
        inputField.submit();
    }

    @After
    public void tearDown() {
        if (driver != null) {
            driver.quit();
        }
    }
}
