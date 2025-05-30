package com.framework.reporting;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;

import java.io.File;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

public class ExtentHelper {
    public static final ExtentReports extentReports = new ExtentReports();

    static Map<Integer, ExtentTest> extentTestMap = new HashMap<Integer, ExtentTest>();
    private static String projectDir = System.getProperty("user.dir");

    public synchronized static ExtentReports createExtentReports(String reportPath, String reportName) {

        ExtentSparkReporter reporter = new ExtentSparkReporter(projectDir+ reportPath + reportName);
        try {
            System.out.println(projectDir + "/src/test/resources/config//");
            reporter.loadXMLConfig(new File(projectDir + "/src/test/resources/config/spark-config.xml"));
        } catch (IOException e) {
            Reporter.info("Not able to fetch the Extent Report...");
        }
        reporter.config().setReportName(reportName);
        extentReports.attachReporter(reporter);
        // extentReports.setSystemInfo("Blog Name", "SW Test Academy");
        // extentReports.setSystemInfo("Author", "Onur Baskirt");
        System.out.println("I am here while creating reports");
        return extentReports;
    }

    public static synchronized ExtentTest getTest() {

        return extentTestMap.get((int) Thread.currentThread().getId());

    }

    public static synchronized ExtentTest startTest(String testName, String desc) {
        ExtentTest test = extentReports.createTest(testName, desc);
        extentTestMap.put((int) Thread.currentThread().getId(), test);
        return test;
    }
    public static synchronized void endTest() {
        ExtentTest test = getTest();

        if (test != null) {
            Reporter.info("Ending test: " + test.getModel().getName());
        }
    }

    public static synchronized void endReport() {
        extentReports.flush();

    }
}
