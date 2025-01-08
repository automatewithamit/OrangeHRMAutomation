package TestBase;

import com.framework.core.BrowserManager;
import com.framework.reporting.ExtentHelper;
import io.cucumber.java.*;
import org.openqa.selenium.remote.Browser;
import org.testng.annotations.*;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Hooks {
    BrowserManager browserManager = new BrowserManager();

    @BeforeAll
    public static void setUpTest(){
        // Get the current timestamp
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyyMMdd_HHmmss");
        String timestamp = LocalDateTime.now().format(formatter);
        String dir = System.getProperty("user.dir");
        String reportName = dir+"/Reports/Report_" + timestamp;
        System.out.println("Report Name : "+ reportName);
        //ExtentHelper.createExtentReports(dir+"/Reports","Report_"+timestamp);

    }
    @Before
    public void before(){
        browserManager.startBrowser();
        ExtentHelper.getTest();
    }
    @After
    public void after(){
        browserManager.quitBrowser();
        ExtentHelper.endTest();
    }

    @AfterAll
    public static void tearDown(){
        ExtentHelper.endReport();
    }
    }
    //BeforeSuite
    //BeforeTest
    //BeforeClass
    //BeforeMethod


