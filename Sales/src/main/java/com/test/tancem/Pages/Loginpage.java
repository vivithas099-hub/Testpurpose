package com.test.tancem.Pages;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Loginpage {
    WebDriver driver;
    WebDriverWait wait;

    // Updated locators based on actual HTML
     By usernameField = By.xpath("(//input[@placeholder='Enter username'])[1]");
     By passwordField = By.xpath("(//input[@placeholder='Enter password'])[1]");
     By loginButton = By.xpath("//button[normalize-space()='Log In']");
     By PisLogo = By.xpath("//img[@src='assets/images/brands/app.png']");
    // //  By ProductionMenu = By.xpath("//a[@href='#/pis/production-related/productionList']");
    // By ProductionMenu = By.xpath("//a[@href='#/pis/production-related/productionList']");

    //  By CreateButton = By.xpath("//button[normalize-space()='Create']");
    //  By ProductionForm = By.xpath("//*[@id='layout-wrapper']/div/div/div/app-production/div/div/div/div/form");
    //  By SubmitButton = By.xpath("//button[normalize-space()='Submit']");

    public Loginpage(WebDriver driver) {
        this.driver = driver;
        this.wait = new WebDriverWait(driver, Duration.ofSeconds(50));
    }

    public void enterUsername() {
        wait.until(ExpectedConditions.visibilityOfElementLocated(usernameField)).sendKeys("qualityuser00001");
    }

    public void enterPassword() {
        wait.until(ExpectedConditions.visibilityOfElementLocated(passwordField)).sendKeys("Tancem@123");
    }

    public void clickLogin() {
        wait.until(ExpectedConditions.elementToBeClickable(loginButton)).click();
    }
    public void clickPis() {
        wait.until(ExpectedConditions.elementToBeClickable(PisLogo)).click();
    }
}
        
    // public void clickProdutcion(){
    //    wait.until(ExpectedConditions.elementToBeClickable(ProductionMenu)).click();
    //     }
        
    //  public void clickCreate(){
    //    wait.until(ExpectedConditions.elementToBeClickable(CreateButton)).click();
    // }
    // public void clickForm(String date, String equipment, String material,
    //                                String hours, String quantity, String fuel, String remark){
    //    wait.until(ExpectedConditions.elementToBeClickable(ProductionForm)).click();
    //  }
   
  




