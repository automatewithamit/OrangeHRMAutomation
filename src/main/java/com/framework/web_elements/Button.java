package com.framework.web_elements;

import com.framework.constants.TimeDelay;
import com.framework.core.BrowserManager;
import com.framework.core.ElementUtil;
import com.framework.reporting.Reporter;
import org.openqa.selenium.By;
import org.openqa.selenium.StaleElementReferenceException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class Button {


    WebDriverWait wait = new WebDriverWait(BrowserManager.getDriver(), Duration.ofSeconds(TimeDelay.TimeOut20Secs));
    public By locator;

    public Button(By locator) {
        this.locator = locator;
    }

    @SuppressWarnings("deprecation")

    public <T> T click(Class<T> type) {
        ElementUtil.click(locator);
        T typeClass = null;
        try {
            typeClass = type.newInstance();
        } catch (InstantiationException | IllegalAccessException e) {
            Reporter.fail("Exception occurred in Weblink...");
        }
        return typeClass;

    }

    public void click() {
        ElementUtil.click(locator);
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


