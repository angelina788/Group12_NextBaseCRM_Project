package com.Group12.tests.Muhammad;

import com.Group12.utility.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class Test01 {
    /*
    WebDriver driver;

    @BeforeMethod
    public void setupMethod() {

        //1.Open Chrome browser.
        driver = WebDriverFactory.getDriver("chrome");
        //maximize
        driver.manage().window().maximize();
        // implicitly wait
        driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
        // 2. go to ("http://login.nextbasecrm.com")
        driver.get("http://login.nextbasecrm.com");

        // Verify you can loggIn

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
        Thread.sleep(3000);


        // first find the message
        WebElement message1 = driver.findElement(By.id("feed-add-post-form-tab-message"));
        message1.click();
        Thread.sleep(3000);
        // find a button CANCEL
        WebElement cancelMessage = driver.findElement(By.id("blog-submit-button-cancel"));
        cancelMessage.click();
        Thread.sleep(3000);

        // kink by clicking
        WebElement message3 = driver.findElement(By.id("feed-add-post-form-tab-message"));
        message3.click();
        WebElement link = driver.findElement(By.xpath("//*[@id=\"bx-b-link-blogPostForm\"]/span/i"));
        link.click();
        Thread.sleep((3000));
        driver.close();
    }


     */
}
