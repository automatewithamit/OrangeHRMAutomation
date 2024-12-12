package com.framework.web_elements;

import com.framework.core.ElementUtil;
import org.openqa.selenium.By;

public class Label {

    public By locator;

    public Label(By locator) {
        this.locator = locator;
    }

    public String getText() {
        return ElementUtil.getText(locator);
    }

    public boolean isDisplayed() {
        return ElementUtil.isDisplayed(locator);
    }
}
