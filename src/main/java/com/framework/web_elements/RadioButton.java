package com.framework.web_elements;

import com.framework.core.ElementUtil;
import org.openqa.selenium.By;

public class RadioButton {

    public By locator;

    public RadioButton(By locator) {
        this.locator = locator;
    }

    public void click() {

        ElementUtil.click(locator);

    }
}
