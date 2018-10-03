package com.acme.features;

import com.acme.ui.YandexWeatherDetailedPage;
import com.acme.ui.YandexWeatherPage;
import cucumber.api.java.After;
import cucumber.api.java.Before;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import io.github.bonigarcia.wdm.ChromeDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import static org.fest.assertions.api.Assertions.assertThat;


//BDD = (A)TDD + DDD (Eric Evans)
public class YandexWeatherSteps {
    private WebDriver driver;
    private YandexWeatherPage weatherPage;
    private YandexWeatherDetailedPage weatherDetailedPage;
    private WebElement nightWeather;

    @Before
    public static void setupClass() {
        ChromeDriverManager.getInstance().setup();
//        System.setProperty("wdm.phantomjsDriverVersion", "2.1.1");
//        PhantomJsDriverManager.getInstance().setup();
    }

    @After
    public void tearDownBrowser() {
        if (driver != null) {
            driver.quit();
        }
    }

    @Given("^opened browser at page (.*)$")
    public void openedBrowserAtPageYandexRu(String url) throws Throwable {
        driver = new ChromeDriver();
        driver.get("http://" + url);
        weatherPage = new YandexWeatherPage(driver);
    }

    @When("^I click Погода$")
    public void iClickПогода() throws Throwable {
        weatherDetailedPage = weatherPage
                .checkWeather(); //DSL = DDD-API
        //DROOLS a la JBehave || Gherkin (Cucumber/java)
        //xtext || MPS
    }

    @And("^then click подробно$")
    public void thenClickПодробно() throws Throwable {
        nightWeather = weatherDetailedPage.detailedWeatherClick().getNightWeather();
    }

    @Then("^I see temperature for time \"([^\"]*)\"$")
    public void iSeeTemperatureForTimeНочью(String label) throws Throwable {
        assertThat(nightWeather.getText()).contains(label);
    }
}
