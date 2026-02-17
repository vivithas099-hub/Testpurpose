package com.test.tancem.Test;

// import org.testng.Assert;
import org.testng.annotations.Test;

import com.test.tancem.Base.Basepage;
import com.test.tancem.Pages.LabRelated;
import com.test.tancem.Pages.Loginpage;


public class Testpage extends Basepage {
   
   @Test
   public void validLoginTest() {
    Loginpage loginPage = new Loginpage(driver);

    loginPage.enterUsername();
    loginPage.enterPassword();
    loginPage.clickLogin();
    loginPage.clickPis();
    //Lab related
    LabRelated lab = new LabRelated(driver);
    lab.clickLabrel();
    lab.clickAnalysis();
    lab.clickcreate();
    lab.Clickcalendarfield();

   }
    


 

}
// @Test(priority = 2)
// public void invalidLoginTest() {
//     LoginPage loginPage = new LoginPage(driver);
//     loginPage.clickLogin();

//     // String errorMessage = loginPage.getErrorMessage();
//     // Assert.assertEquals(errorMessage, "Invalid credentials", "Error message mismatch.");
// loginPage.clickCreate();
//     loginPage.fillAllProductionFormFields();
// }



