package com.cybertek.utilities;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;

import java.net.URL;

public class Driver {

    //1-Make constructor private
    private Driver(){
    }

    private static WebDriver driver;

    public static WebDriver getDriver(){

        if (driver == null){
            String browser = ConfigurationReader.getProperty("browser");

            switch (browser){
                case "chrome":
                    WebDriverManager.chromedriver().setup();
                    driver = new ChromeDriver();
                    break;
                case "firefox":
                    WebDriverManager.firefoxdriver().setup();
                    driver = new FirefoxDriver();
                    break;
                case "chrome-headless":
                    WebDriverManager.chromedriver().setup();
                    driver = new ChromeDriver(new ChromeOptions().setHeadless(true));
                    break;
                case "remote-chrome":

                    try {
                        //   ChromeOptions chromeOptions = new ChromeOptions();
                        DesiredCapabilities desiredCapabilities = new DesiredCapabilities();
                        desiredCapabilities.setBrowserName("chrome");
                        // URL gridUrl = new URL("http://3.85.172.23:4444/wd/hub");
                        URL gridUrl = new URL("http://3.82.5.142:4444/wd/hub");

                        driver = new RemoteWebDriver(gridUrl, desiredCapabilities);
                    } catch (Exception e) {
                        e.printStackTrace();
                    }

                    break;
                case "firefox-headless":
                    WebDriverManager.firefoxdriver().setup();
                    driver = new FirefoxDriver(new FirefoxOptions().setHeadless(true));
                    break;

            }
        }

        return driver;

    }

    public static void closeDriver(){
        if (driver != null){
            driver.quit();
            driver=null;
        }
    }


}
