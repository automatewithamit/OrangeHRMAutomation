/**
 *
 */
package com.framework.core;

import com.framework.helpers.PropertiesHelper;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;

/**
 * @author DragonWarrior-PC
 *
 */
public class OptionsManager {
    PropertiesHelper configProperty = new PropertiesHelper("/src/test/resources/config/config.properties");

    public ChromeOptions getChromeOptions() {

        ChromeOptions options = new ChromeOptions();
        String headlessModeON = configProperty.getProperty("headlessModeON");
        System.out.println("Values of Headless Mode ON is -->" +headlessModeON);
        if(Boolean.parseBoolean(headlessModeON)){
            options.addArguments("--headless");
        }

        //options.addArguments("--remote-allow-origins=*");
        //options.setCapability("browserVersion", "116.0.5845.111");

        return options;
    }



    public EdgeOptions getEdgeOptions() {
        EdgeOptions options = new EdgeOptions();

        //options.addArguments("--remote-allow-origins=*");
        options.setCapability("browserVersion", "116.0.5845.111");
        return options;
    }
    public FirefoxOptions getFirefoxOptions() {
        FirefoxOptions options = new FirefoxOptions();

        //options.addArguments("--remote-allow-origins=*");
        options.setCapability("browserVersion", "116.0.5845.111");
        return options;
    }


}