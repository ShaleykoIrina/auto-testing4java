package com.acme.ui;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import io.github.bonigarcia.wdm.ChromeDriverManager;
import org.junit.BeforeClass;
import org.junit.Ignore;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        features = "src/test/java/com/acme/features",
        glue = "src/test/java/com/acme/features",
        format = {
                "pretty",
                "json:target/cucumber.json",
                "html:target/site/cucumber-pretty",
                "html:target/cucumber-htmlreport"
        }
)
public class YandexWeatherTest {}
