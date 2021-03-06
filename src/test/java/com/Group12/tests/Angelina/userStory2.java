package com.Group12.tests.Angelina;

import com.Group12.utility.WebDriverFactory;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class userStory2 {

    WebDriver driver;
    @BeforeClass
    public void setupMethod() {

        //1.Open Chrome browser.
        driver = WebDriverFactory.getDriver("chrome");
        //maximize
        driver.manage().window().maximize();
        // implicitly wait
        driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
        // 2. go to ("http://login.nextbasecrm.com")
        driver.get("http://login.nextbasecrm.com");
    }
    @BeforeMethod
    // Verify you can loggIn
    public void logg_in (){
        WebElement logIn = driver.findElement(By.name("USER_LOGIN"));
        logIn.sendKeys("helpdesk22@cybertekschool.com");
        WebElement password = driver.findElement(By.name("USER_PASSWORD"));
        password.sendKeys("UserUser");
        WebElement button  = driver.findElement(By.xpath("//input[@value='Log In']"));
        button.click();
    }
        @Test
        public void send_message_by_clicking_button() throws InterruptedException{
            //3. verify as user able to send message by clicking "MESSAGE"
            // find a button MESSAGE
            WebElement message = driver.findElement(By.id("feed-add-post-form-tab-message"));
            message.click();
            // put text inside the window

            WebElement frame=driver.findElement(By.xpath("//iframe[@class='bx-editor-iframe']"));
            driver.switchTo().frame(frame);
            driver.findElement(By.xpath("/html/body")).sendKeys("HI");
            driver.switchTo().parentFrame();


             //click button send
            WebElement button = driver.findElement(By.id("blog-submit-button-save"));
            button.click();
             Thread.sleep(2000);

        }



}
/*
Acceptance criteria:

Verify users can send message by clicking "MESSAGE" tab
2. Verify users can cancel message.
3. Verify users can attach link by clicking on the link icon.
 */