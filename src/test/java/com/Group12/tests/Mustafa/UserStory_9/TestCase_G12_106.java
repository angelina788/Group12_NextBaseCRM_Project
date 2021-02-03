package com.Group12.tests.Mustafa.UserStory_9;

import com.Group12.TestBase.LoginToTryCrm;
import com.Group12.utility.Driver;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.*;

public class TestCase_G12_106 extends LoginToTryCrm {

    //Acceptance Criteria:
    //1. Verify users can send events by clicking "EVENT" tab with at least an event name.
    //2. Verify users can cancel events.
    //3. Verify users can check timers
    //4. Verify users can choose all day for the event time

    @Test
    public void As_a_user_I_should_be_able_to_send_an_event() throws InterruptedException {

        //Acceptance Criteria
        //1. Verify users can send events by clicking "EVENT" tab with at least an event name.

        WebElement eventButton = Driver.getDriver().findElement(By.id("feed-add-post-form-tab-calendar"));

        eventButton.click();

        Thread.sleep(2000);


        WebElement eventNameText = Driver.getDriver().findElement(By.id("feed-cal-event-namecal_3Jcl"));

        eventNameText.sendKeys("TEST EVENT");

        Thread.sleep(2000);


        WebElement sendButton = Driver.getDriver().findElement(By.id("blog-submit-button-save"));

        sendButton.click();

    }



}