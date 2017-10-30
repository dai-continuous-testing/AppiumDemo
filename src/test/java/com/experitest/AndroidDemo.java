package com.experitest;

/**
 * Created by yotam.gamliel on 10/29/2017.
 */
import io.appium.java_client.ios.IOSDriver;
import io.appium.java_client.ios.IOSElement;
import io.appium.java_client.remote.AndroidMobileCapabilityType;
import org.openqa.selenium.By;
import org.testng.annotations.*;
import java.lang.reflect.Method;
import java.net.MalformedURLException;
import java.net.URL;


public class AndroidDemo extends TestBase {

    @BeforeTest
    public void setUp() {
        dc.setCapability("deviceQuery", deviceQueryAndroid);
        dc.setCapability(AndroidMobileCapabilityType.APP_PACKAGE, "cloud:com.experitest.ExperiBank");
        dc.setCapability(AndroidMobileCapabilityType.APP_ACTIVITY, ".LoginActivity");

    }

    @BeforeMethod
    public void handleTestMethodName(Method method) throws MalformedURLException {
        testName = method.getName();
        System.out.println("Test Name: " + testName);
        dc.setCapability("testName", testName);
        driver = new IOSDriver<IOSElement>(new URL(cloudAddress+"/wd/hub"), dc);
    }


    @Test
    public void Login1() {
        System.out.println("Running Login Test...");
        driver.findElement(By.xpath("//*[@id='usernameTextField']")).sendKeys("company");
        driver.findElement(By.xpath("//*[@id='passwordTextField']")).sendKeys("company");
        driver.findElement(By.xpath("//*[@id='loginButton']")).click();
        driver.findElement(By.xpath("//*[@id='logoutButton']")).click();
    }

}