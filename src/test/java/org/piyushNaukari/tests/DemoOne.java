package org.piyushNaukari.tests;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeOptions;
import org.testng.Assert;
import org.testng.annotations.Test;

public class DemoOne {


    @Test
    public void loginTest() throws InterruptedException {

        EdgeOptions edgeOptions = new EdgeOptions();
        edgeOptions.addArguments("--guest");
        edgeOptions.addArguments("--start-maximized");
        WebDriver driver = new EdgeDriver(edgeOptions);

        driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");

        Thread.sleep(2000);

        driver.findElement(By.name("username")).sendKeys("Admin");
        driver.findElement(By.name("password")).sendKeys("admin123");

        driver.findElement(By.xpath("//button[@data-v-10d463b7=\"\"]")).click();

        Thread.sleep(3000);

        String s = driver.getCurrentUrl();
        System.out.println( "The current URL is : " + s);

        Assert.assertEquals(s,"https://opensource-demo.orangehrmlive.com/web/index.php/dashboard/index");

        driver.quit();




    }

}
