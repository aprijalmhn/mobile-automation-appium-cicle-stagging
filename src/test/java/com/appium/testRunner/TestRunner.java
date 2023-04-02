package com.appium.testRunner;
import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(
        plugin = {
                "pretty",
                "json:target/cucumber-reports/cucumber.json",
                "html:target/cucumber-reports/cucumber-report.html"
        },
        features = "src/test/resources/Features",
        glue = {"com.appium.stepDefinition"},
        publish = true,
        tags = "@TCI06",
        monochrome = true
)

public class TestRunner extends AbstractTestNGCucumberTests {

}




