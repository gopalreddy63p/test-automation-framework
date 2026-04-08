package com.gopalreddypatlolla.automation.base;

import java.nio.file.Path;
import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriverException;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.SkipException;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public abstract class BaseUiTest {

    protected WebDriver driver;
/*
    //added comment
    @BeforeMethod
    public void setUp() {
        ChromeOptions options = new ChromeOptions();
        if (Boolean.parseBoolean(System.getProperty("headless", "true"))) {
            options.addArguments("--headless=new");
            options.addArguments("--window-size=1920,1080");
        }
        options.addArguments("--disable-gpu");
        options.addArguments("--no-sandbox");

        try {
            driver = new ChromeDriver(options);
            driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
        } catch (WebDriverException exception) {
            throw new SkipException(
                    "Skipping UI test because Chrome or a compatible WebDriver session could not be started: "
                            + exception.getMessage(),
                    exception);
        }
    }

    @AfterMethod(alwaysRun = true)
    public void tearDown() {
        if (driver != null) {
            driver.quit();
        }
    }

    protected void openLocalPage(String relativePath) {
        Path pagePath = Path.of("src", "test", "resources", relativePath);
        driver.get(pagePath.toUri().toString());
    }*/
}

