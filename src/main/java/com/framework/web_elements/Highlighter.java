package com.framework.web_elements;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Highlighter {

    public static void highlightElement(WebDriver getDriver, WebElement element) {
        JavascriptExecutor js = (JavascriptExecutor) getDriver;
        js.executeScript("arguments[0].setAttribute('style', ' background: pink', 'border: 8x solid purple');", element);

        /*try
        {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            System.out.println(e.getMessage());
        }
        js.executeScript("arguments[0].setAttribute('style', border: solid 2px white')", element);
    }*/


    }
}