package org.piyushNaukari.tests;

import org.openqa.selenium.*;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeOptions;
import org.openqa.selenium.interactions.Actions;
import org.piyushNaukari.baseTest.CommonToAllTest;
import org.testng.annotations.Test;
import java.time.Duration;
import static org.piyushNaukari.driver.DriverManager.driver;
import static org.piyushNaukari.driver.DriverManager.getDriver;

public class NaukariLogin extends CommonToAllTest {


    @Test(invocationCount = 1)
    public void PositiveTest() throws InterruptedException {

//        EdgeOptions edgeOptions = new EdgeOptions();
//        edgeOptions.addArguments("--start-maximized");
//        edgeOptions.addArguments("--guest");
//        WebDriver driver = new EdgeDriver(edgeOptions);   // Driver & CommonToAllTest

        getDriver().get("https://www.naukri.com/");

        getDriver().manage().timeouts().implicitlyWait(Duration.ofSeconds(3));



        WebElement gotItBut = getDriver().findElement(By.xpath("//span[@class=\"acceptance-btn-text\"]"));
        gotItBut.click();



        WebElement loginButton = getDriver().findElement(By.id("login_Layer"));
        loginButton.click();



        WebElement loginField = getDriver().findElement(By.xpath("//input[@placeholder=\"Enter your active Email ID / Username\" ]"));
        WebElement passField = getDriver().findElement(By.xpath("//input[@placeholder=\"Enter your password\"]"));


        loginField.sendKeys("piyusha.bansod@gmail.com");
        passField.sendKeys("January@2024#");

        getDriver().findElement(By.xpath("//button[@class=\"btn-primary loginButton\"]")).click();

        Thread.sleep(2000);

        WebElement viewProfile = driver.findElement(By.xpath("//div[@class=\"view-profile-wrapper\"]/a"));
        Actions action = new Actions(getDriver());
        action.moveToElement(viewProfile).click().build().perform();

//
//        try{
//            WebElement deleteBut = driver.findElement(By.xpath("//i[@data-title=\"delete-resume\"]"));
//            deleteBut.click();
//        }catch (NoSuchElementException exception){
//            System.out.println(" No delete button found ");
//
//        }
//
//
//        try
//        {
//            WebElement popUp = driver.findElement(By.xpath("//div[@class=\"action right-align\"]/button"));
//            popUp.click();
//        }catch(ElementNotInteractableException exception){
//            System.out.println(" No delete pop up ");
//        }
//
//
//
//        WebElement upload = driver.findElement(By.xpath("//input[@id=\"attachCV\"]"));
////        JavascriptExecutor js = (JavascriptExecutor)getDriver();
////        js.executeScript("arguments[0].scrollIntoView();", upload);
//        action.moveToElement(upload).sendKeys("C:\\Users\\piyus\\Desktop\\Resumes Piyush\\Automation resumes of 2024\\Piyush_Bansod_CV (3).pdf").build().perform();

        WebElement editBut = getDriver().findElement(By.xpath("//div[@id=\"lazyResumeHead\"]/div/div/div/span[2]"));
        editBut.click();

        WebElement textBox = getDriver().findElement(By.id("resumeHeadlineTxt"));
        textBox.click();
        textBox.sendKeys(Keys.BACK_SPACE);
        textBox.sendKeys(".");
        textBox.sendKeys(Keys.BACK_SPACE);

        WebElement savebutton = getDriver().findElement(By.xpath("/html/body/div[6]/div[8]/div[2]/form/div[3]/div/button"));
        action.moveToElement(savebutton).click().build().perform();


        WebElement dropdown = getDriver().findElement(By.xpath("//div[@id=\"ni-gnb-header-section\"]/div/div/div[4]"));

        action.moveToElement(dropdown).click().build().perform();

        Thread.sleep(2000);

        WebElement logout = driver.findElement(By.xpath("//a[@data-type=\"logoutLink\"]"));

        action.moveToElement(logout).click().build().perform();


    }

}
