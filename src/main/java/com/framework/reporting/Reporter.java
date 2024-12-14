package com.framework.reporting;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.text.SimpleDateFormat;

import org.apache.commons.codec.binary.Base64;
import org.apache.commons.io.FileUtils;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;


import com.aventstack.extentreports.MediaEntityBuilder;
import com.aventstack.extentreports.Status;
import com.framework.core.BrowserManager;

public class Reporter{

    private static Logger Log = LogManager.getLogger(Reporter.class.getName());
    public static String testMethodReportFolder;
    private static String screenshotBase64 = null;

    public static void takeScreenShot(String screenshotName) {

        try {
            String timeStamp = new SimpleDateFormat("yyyy.MM.dd.HH.mm.ss").format(new java.util.Date());
            TakesScreenshot scrShot = ((TakesScreenshot) BrowserManager.getDriver());

            // Call getScreenshotAs method to create image file
            File fullScreenshot = scrShot.getScreenshotAs(OutputType.FILE);

            // Use a file utility library to save the screenshot to a desired location
            FileUtils.copyFile(fullScreenshot,
                    new File(testMethodReportFolder + "//" + screenshotName + "_" + timeStamp + ".png"));
        } catch (Exception e) {

        }

    }

    public static void takeScreenShot() {

        try {
            String timeStamp = new SimpleDateFormat("yyyy.MM.dd.HH.mm.ss").format(new java.util.Date());
            TakesScreenshot scrShot = ((TakesScreenshot) BrowserManager.getDriver());

            // Call getScreenshotAs method to create image file
            File fullScreenshot = scrShot.getScreenshotAs(OutputType.FILE);

            // Use a file utility library to save the screenshot to a desired location
            FileUtils.copyFile(fullScreenshot, new File(testMethodReportFolder + "//" + timeStamp + ".png"));
        } catch (Exception e) {

        }

    }

    public static void extentScreenShot() {

        try {
            String timeStamp = new SimpleDateFormat("yyyy.MM.dd.HH.mm.ss").format(new java.util.Date());
            TakesScreenshot scrShot = ((TakesScreenshot) BrowserManager.getDriver());

            // Call getScreenshotAs method to create image file
            File fullScreenshot = scrShot.getScreenshotAs(OutputType.FILE);

            try {
                FileInputStream fileInputStream = new FileInputStream(fullScreenshot);
                byte[] bytes = new byte[(int) fullScreenshot.length()];
                fileInputStream.read(bytes);
                screenshotBase64 = new String(Base64.encodeBase64(bytes));
            } catch (IOException e) {
                screenshotBase64 = null;
            }

        } catch (Exception e) {
            screenshotBase64 = null;
        }

    }

}

