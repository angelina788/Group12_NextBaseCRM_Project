package com.Group12.tests.Mustafa.Utilities;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class WebOrderUtils {

    public static void logInToCRM(WebDriver driver) throws InterruptedException {

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

}
