package com.orange.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class RecruitmentPage {

    WebElement recruitmentMenu = driver.findElement(By.cssSelector("a[href='/web/index.php/recruitment/viewRecruitmentModule']"));
recruitmentMenu.click();

    WebElement candidatesMenu = driver.findElement(By.cssSelector("a[href='/web/index.php/recruitment/viewCandidates']"));
candidatesMenu.click();

    WebElement vacanciesMenu = driver.findElement(By.cssSelector("a[href='/web/index.php/recruitment/viewJobVacancy']"));
vacanciesMenu.click();

}


