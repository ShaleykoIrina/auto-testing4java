package com.acme.ui;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

public class YandexWeatherPage {
    private WebDriver driver;

    @FindBy(how = How.LINK_TEXT, using = "Погода")
    private WebElement weatherLink;


    public YandexWeatherPage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    public YandexWeatherDetailedPage checkWeather() {
        weatherLink.click();
        return new YandexWeatherDetailedPage(driver);
    }
}
