package com.test.tancem.Pages;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class LabRelated{

    WebDriver driver;
    WebDriverWait wait;
    
    public LabRelated(WebDriver driver) {
        this.driver = driver;
        this.wait = new WebDriverWait(driver, Duration.ofSeconds(50));
    }

    By labRel = By.xpath("//i[@class='icon mdi mdi-flask nav-icon']");
    By Analysis = By.xpath("//div[@class='collapse menu-dropdown ng-star-inserted show']//li[1]//a[1]");
    By create = By. xpath("//button[normalize-space()='Create']");
    By calenderfield= By.xpath("//button[@aria-label='Choose Date']");
    public void clickLabrel(){
       WebElement labrelatedOption = wait.until(ExpectedConditions.elementToBeClickable(labRel));
        labrelatedOption.click();
    }
    public void clickAnalysis(){
        WebElement analysisOption = wait.until(ExpectedConditions.elementToBeClickable(Analysis));
        analysisOption.click();      
    } 
    public void clickcreate()
    {
        WebElement createbutton = wait.until(ExpectedConditions.elementToBeClickable(create));
        createbutton.click();
    }
     public void Clickcalendarfield()
    {
        WebElement createbutton = wait.until(ExpectedConditions.elementToBeClickable(create));
        createbutton.click();

        
    }


        }
    
    

