package com.framework.web_elements;

import com.framework.core.BrowserManager;
import com.framework.reporting.Reporter;
import org.openqa.selenium.By;
import org.openqa.selenium.StaleElementReferenceException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.pagefactory.ByChained;


public class DropDown {

    public By locator;

    public DropDown(By locator) {
        this.locator = locator;
    }

    public void click() {
        Reporter.info("Clicking on Button --> " + locator);
        WebElement element = BrowserManager.getDriver().findElement(locator);
        element.click();
        Reporter.info("Clicked on Button --> " + locator);
    }


    public void selectOption(String option) {
        click();
        this.locator = new ByChained(this.locator, By.xpath("//following::div[@role='option' and .='" + option + "']"));
        click();
    }
    public void selectOption(int indexNumber) {
        click();
        this.locator = new ByChained(this.locator, By.xpath("(//following::div[@role='option'])["+indexNumber+"]"));
        click();
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


