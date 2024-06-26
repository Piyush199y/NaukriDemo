package org.piyushNaukari.baseTest;

import org.piyushNaukari.driver.DriverManager;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public class CommonToAllTest {

@BeforeMethod
    public void setUp(){
    DriverManager.inIt();

}

@AfterMethod
    public void tearDown(){
    DriverManager.down();
}

}
