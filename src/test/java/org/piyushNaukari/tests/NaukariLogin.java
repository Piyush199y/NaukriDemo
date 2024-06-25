package org.piyushNaukari.tests;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeOptions;
import org.testng.annotations.Test;

public class NaukariLogin {


    @Test
    public void PositiveTest() throws InterruptedException {

        EdgeOptions edgeOptions = new EdgeOptions();
        edgeOptions.addArguments("--start-maximized");
        edgeOptions.addArguments("--guest");
        WebDriver driver = new EdgeDriver(edgeOptions);

        driver.get("https://www.naukri.com/nlogin/login?URL=https://www.naukri.com/mnjuser/homepage");

        Thread.sleep(3000);

        WebElement loginField = driver.findElement(By.id("usernameField"));
        WebElement passField = driver.findElement(By.id("passwordField"));

        loginField.sendKeys("piyusha.bansod@gmail.com");
        passField.sendKeys("January@2024#");

        driver.findElement(By.xpath("//button[@data-ga-track=\"spa-event|login|login|Save||||true\"]")).click();


        Thread.sleep(5000);

        driver.quit();


    }

}
