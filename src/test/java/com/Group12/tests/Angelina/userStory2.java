package com.Group12.tests.Angelina;

import com.Group12.TestBase.LoginToTryCrm;
import com.Group12.utility.Driver;
import com.Group12.utility.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;


import java.util.concurrent.TimeUnit;

public class userStory2 extends LoginToTryCrm {

        @Test
        public void send_message_by_clicking_button() throws InterruptedException{
            //3. verify as user able to send message by clicking "MESSAGE"
            // find a button MESSAGE
            WebElement message = Driver.getDriver().findElement(By.id("feed-add-post-form-tab-message"));
            message.click();
            // put text inside the window

            WebElement frame=Driver.getDriver().findElement(By.xpath("//iframe[@class='bx-editor-iframe']"));
            Driver.getDriver().switchTo().frame(frame);
            Driver.getDriver().findElement(By.xpath("/html/body")).sendKeys("HI");
            Driver.getDriver().switchTo().parentFrame();


             //click button send
            WebElement button = Driver.getDriver().findElement(By.id("blog-submit-button-save"));
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