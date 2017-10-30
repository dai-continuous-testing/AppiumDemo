package com.experitest;

/**
 * Created by yotam.gamliel on 10/29/2017.
 */
import io.appium.java_client.ios.IOSDriver;
import io.appium.java_client.ios.IOSElement;
import io.appium.java_client.remote.IOSMobileCapabilityType;
import io.appium.java_client.remote.MobileCapabilityType;
import org.openqa.selenium.By;
import org.testng.annotations.*;
import java.lang.reflect.Method;
import java.net.MalformedURLException;
import java.net.URL;


public class IosDemo extends TestBase {

    @BeforeTest
    public void setUp() {
        dc.setCapability("deviceQuery", deviceQueryIOS);
        dc.setCapability(MobileCapabilityType.APP, "cloud:com.experitest.ExperiBank");
        dc.setCapability(IOSMobileCapabilityType.BUNDLE_ID, "com.experitest.ExperiBank");
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
        System.out.println("Running LoginTest...");
        driver.findElement(By.xpath("//*[@accessibilityLabel='usernameTextField' and @value='Username']")).sendKeys("company");
        driver.findElement(By.xpath("//*[@accessibilityLabel='passwordTextField' and @value='Password']")).sendKeys("compant");
        driver.findElement(By.xpath("//*[@name='loginButton']")).click();
    }

}