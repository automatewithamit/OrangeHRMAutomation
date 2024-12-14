package com.orange.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class RecruitmentPage {

    private WebDriver driver;

    // Constructor to initialize WebDriver
    public RecruitmentPage(WebDriver driver) {
        this.driver = driver;
    }

    // Method to click the Recruitment Menu
    public void clickRecruitmentMenu() {
        WebElement recruitmentMenu = driver.findElement(By.cssSelector("a[href='/web/index.php/recruitment/viewRecruitmentModule']"));
        recruitmentMenu.click();
    }

    // Method to click the Candidates Menu
    public void clickCandidatesMenu() {
        WebElement candidatesMenu = driver.findElement(By.cssSelector("a[href='/web/index.php/recruitment/viewCandidates']"));
        candidatesMenu.click();
    }

    // Method to click the Vacancies Menu
    public void clickVacanciesMenu() {
        WebElement vacanciesMenu = driver.findElement(By.cssSelector("a[href='/web/index.php/recruitment/viewJobVacancy']"));
        vacanciesMenu.click();
    }
}


