package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import static com.framework.core.BrowserManager.getDriver;

public class RecruitmentPage extends Header{


    // Method to click the Recruitment Menu
    public void clickRecruitmentMenu() {
        WebElement recruitmentMenu = getDriver().findElement(By.cssSelector("a[href='/web/index.php/recruitment/viewRecruitmentModule']"));
        recruitmentMenu.click();
    }

    // Method to click the Candidates Menu
    public void clickCandidatesMenu() {
        WebElement candidatesMenu = getDriver().findElement(By.cssSelector("a[href='/web/index.php/recruitment/viewCandidates']"));
        candidatesMenu.click();
    }

    // Method to click the Vacancies Menu
    public void clickVacanciesMenu() {
        WebElement vacanciesMenu = getDriver().findElement(By.cssSelector("a[href='/web/index.php/recruitment/viewJobVacancy']"));
        vacanciesMenu.click();
    }
}


