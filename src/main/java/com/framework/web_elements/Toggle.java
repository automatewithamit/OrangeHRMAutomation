package com.framework.web_elements;

import com.framework.core.ElementUtil;
import com.framework.reporting.Reporter;
import org.openqa.selenium.By;

public class Toggle {

    public Toggle(By locator) {
        this.locator = locator;
    }

    public By locator;

    public void click() {
       Reporter.info("Turning On Toggle --> " + locator );
        ElementUtil.click(locator);
       Reporter.info("Clicked on Button --> " + locator );
    }


}


