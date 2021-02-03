package com.Group12.TestBase;

import com.Group12.utility.BrowserUtils;
import com.Group12.utility.ConfigurationReader;
import com.Group12.utility.Driver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public class LoginToTryCrm {

    @BeforeMethod
    public void LogInToCRM() throws InterruptedException {

        String crmUrl = ConfigurationReader.getProperty("crmUrl");
        Driver.getDriver().get(crmUrl);
        Thread.sleep(2000);

        WebElement logIn = Driver.getDriver().findElement(By.name("USER_LOGIN"));
        logIn.sendKeys(ConfigurationReader.getProperty("marketing"));

        Thread.sleep(2000);

        WebElement password = Driver.getDriver().findElement(By.name("USER_PASSWORD"));
        password.sendKeys(ConfigurationReader.getProperty("crmPassword"));

        Thread.sleep(2000);

        WebElement logIn_button  = Driver.getDriver().findElement(By.xpath("//input[@value='Log In']"));
        logIn_button.click();

    }

    @AfterMethod
    public void tearDown(){
        BrowserUtils.sleep(3);
        Driver.closeDriver();
    }

}
