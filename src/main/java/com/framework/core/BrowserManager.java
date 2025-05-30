package com.framework.core;

import com.framework.helpers.ExcelHelper;
import com.framework.helpers.PropertiesHelper;
import com.framework.reporting.Reporter;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;



//SOLID
//S-> SRE-> Single Responsibility Principle
//O-> OCP-> Open Closed Principle --> Any Class or Method should be Open for Extension and Closed for
//Modification
//L->Liskov Substitution Principle
//I->Interface Segregation Principle
//D->Dependency Inversion Principle

public class BrowserManager {
    public BrowserManager(){

    }


    private static ThreadLocal<WebDriver> localWebDriver = new ThreadLocal<>();

    OptionsManager optionsManager = new OptionsManager();
    PropertiesHelper configProperty = new PropertiesHelper("/src/test/resources/config/config.properties");
    ExcelHelper projectData = new ExcelHelper("\\src\\test\\resources\\com\\hrm\\data\\ProjectData.xlsx");
    //PropertiesHelper urlHelper = new PropertiesHelper("//resources//url.properties");

    public void startBrowser() {

        String browserType = configProperty.getProperty("browserType").toLowerCase();
        boolean isRemote = Boolean.parseBoolean(configProperty.getProperty("isRemote").toLowerCase());
        Reporter.info("Starting Browser.... " + browserType);

        if (browserType.equals("edge")) {
            if (isRemote) {
                startRemoteDriver(browserType);
            } else {
                localWebDriver.set(new EdgeDriver(optionsManager.getEdgeOptions()));
            }
        }

        if (browserType.equals("chrome")) {
            if (isRemote) {
                startRemoteDriver(browserType);
            } else {
                localWebDriver.set(new ChromeDriver(optionsManager.getChromeOptions()));
            }
        }

        Reporter.info(browserType + " Browser Type is not available");

        getDriver().manage().window().maximize();
        getDriver().manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
    }

    public void startRemoteDriver(String browserType) {
        //String remoteUrl = urlHelper.getProperty("hubURL");
        DesiredCapabilities capabilities = new DesiredCapabilities();
        if (browserType.equalsIgnoreCase("chrome")) {
            capabilities.setBrowserName("chrome");
            Reporter.info("############TEST CASE EXECUTION STARTED ON ==> ### " + browserType);
        } else if (browserType.equalsIgnoreCase("edge")) {
            capabilities.setBrowserName("MicrosoftEde");
            Reporter.info("############TEST CASE EXECUTION STARTED ON ==> ### " + browserType);
        }

        try {
            localWebDriver.set(new RemoteWebDriver(new URL(""), capabilities));
            //localWebDriver.set(new RemoteWebDriver(new URL(remoteUrl), capabilities));
        } catch (MalformedURLException e) {
            Reporter.info("MalFormed Exception Occurred ");
        }

    }

    public static WebDriver getDriver() {
        return localWebDriver.get();
    }

    public void quitBrowser() {
        getDriver().quit();
    }


}



