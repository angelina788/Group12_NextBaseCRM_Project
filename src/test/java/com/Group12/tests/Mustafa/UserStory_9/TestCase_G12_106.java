package com.Group12.tests.Mustafa.UserStory_9;

import com.Group12.tests.Mustafa.Base.TestBase;
import com.Group12.tests.Mustafa.Utilities.WebOrderUtils;
import com.Group12.utility.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.annotations.*;

import java.util.concurrent.TimeUnit;

public class TestCase_G12_106 extends TestBase {

    //Acceptance Criteria:
    //1. Verify users can send events by clicking "EVENT" tab with at least an event name.
    //2. Verify users can cancel events.
    //3. Verify users can check timers
    //4. Verify users can choose all day for the event time

    @Test
    public void As_a_user_I_should_be_able_to_send_an_event() throws InterruptedException {

        driver.get("https://login.nextbasecrm.com");

        WebOrderUtils.logInToCRM(driver);


        //Acceptance Criteria
        //1. Verify users can send events by clicking "EVENT" tab with at least an event name.

        WebElement eventButton = driver.findElement(By.id("feed-add-post-form-tab-calendar"));

        eventButton.click();

        Thread.sleep(2000);


        WebElement eventNameText = driver.findElement(By.id("feed-cal-event-namecal_3Jcl"));

        eventNameText.sendKeys("TEST EVENT");

        Thread.sleep(2000);


        WebElement sendButton = driver.findElement(By.id("blog-submit-button-save"));

        sendButton.click();

    }

    @AfterMethod
    public void tearDownMethod(){
        driver.close();
    }




}