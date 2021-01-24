package com.Group12.tests.Mustafa.UserStory_9;

import com.Group12.utility.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.annotations.*;

import java.util.concurrent.TimeUnit;

public class TestCase_G12_106 {

    //Acceptance Criteria:
    //1. Verify users can send events by clicking "EVENT" tab with at least an event name.
    //2. Verify users can cancel events.
    //3. Verify users can check timers
    //4. Verify users can choose all day for the event time

    WebDriver driver;

    @BeforeClass
    public void setupClass(){

        driver =  WebDriverFactory.getDriver("chrome");

        driver.get("https://login.nextbasecrm.com");

    }

    @BeforeMethod
    public void log_in() throws InterruptedException {

        Thread.sleep(2000);

        WebElement logIn = driver.findElement(By.name("USER_LOGIN"));
        logIn.sendKeys("helpdesk22@cybertekschool.com");

        Thread.sleep(2000);

        WebElement password = driver.findElement(By.name("USER_PASSWORD"));
        password.sendKeys("UserUser");

        Thread.sleep(2000);

        WebElement logIn_button  = driver.findElement(By.xpath("//input[@value='Log In']"));
        logIn_button.click();

    }

    @Test
    public void As_a_user_I_should_be_able_to_send_an_event() throws InterruptedException {

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




}
