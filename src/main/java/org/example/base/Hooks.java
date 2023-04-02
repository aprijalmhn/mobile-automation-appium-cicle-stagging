package org.example.base;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.*;
import java.io.FileInputStream;
import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

public class Hooks {

    public static AppiumDriver<MobileElement> driver = null;

    public static Properties properties;

    public Hooks() {
        try {
            properties = new Properties();
            FileInputStream inputStream = new  FileInputStream("src/main/java/org/example/config/config.properties");
        } catch (IOException exception) {
            exception.printStackTrace();

        }
    }

    @BeforeClass
    public static AppiumDriver<MobileElement> setUp() {
        try {
            DesiredCapabilities capabilities = new DesiredCapabilities();
            capabilities.setCapability("deviceName", "147b06de");
            capabilities.setCapability("platformName", "Android");
            capabilities.setCapability("platformVersion", "11");
            capabilities.setCapability("appPacakge", "staging.cicle");
            capabilities.setCapability("appActivity", "staging.cicle.MainActivity");
            capabilities.setCapability("noReset", "true");

            URL url = new URL("http://127.0.0.1:4723/wd/hub");
            driver = new AppiumDriver<>(url, capabilities);
            driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);

        } catch (MalformedURLException e) {
            e.printStackTrace();
        }
        return driver;
    }

    @AfterClass
    public void teardown() {
        driver.closeApp();
        driver.quit();
    }

}

