package TestBase;

import com.framework.core.BrowserManager;
import org.openqa.selenium.remote.Browser;
import org.testng.annotations.AfterSuite;

public class Hooks {

    @AfterSuite
    public void setUpTest(){
        BrowserManager browserManager = new BrowserManager();
        browserManager.startBrowser();
    }
}
