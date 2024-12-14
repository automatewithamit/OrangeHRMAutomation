package com.framework.web_elements;

import com.framework.core.BrowserManager;
import org.openqa.selenium.By;
import org.openqa.selenium.StaleElementReferenceException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class Canvas {

    WebDriverWait wait = new WebDriverWait(BrowserManager.getDriver(), Duration.ofSeconds(TimeDelay.TimeOut20Secs));
    public By locator;

    public Canvas(By locator) {
        this.locator = locator;
    }

    public String getText() {

        WebElement element;
        try {

            element = BrowserManager.getDriver().findElement(locator);

        } catch (StaleElementReferenceException ex) {

            element = BrowserManager.getDriver().findElement(locator);
        }

        return element.getText();
    }

    public boolean isDisplayed() {

        return true;
    }

    public boolean isEnabled() {

        return true;
    }

}
