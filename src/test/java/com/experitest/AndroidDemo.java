package com.experitest;

/**
 * Created by yotam.gamliel on 10/29/2017.
 */
//package <set your test package>;

import io.appium.java_client.ios.IOSDriver;
import io.appium.java_client.ios.IOSElement;
import io.appium.java_client.remote.IOSMobileCapabilityType;
import io.appium.java_client.remote.MobileCapabilityType;
import org.openqa.selenium.By;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.ITestContext;
import org.testng.annotations.*;

import java.lang.reflect.Method;
import java.net.MalformedURLException;
import java.net.URL;


public class AndroidDemo {

    static String buildNumber = System.getenv("build.number");
    static final String accessKey = System.getenv("cloud.accessKey");
    static String cloudAddress = System.getenv("cloud.address");


    private String reportDirectory = "reports";
    private String reportFormat = "xml";
    private String testName = "Untitled";
    //private String accessKey = "eyJ4cC51IjoxLCJ4cC5wIjoyLCJ4cC5tIjoiTVRVd056UTJPVEV5T0RneU1RIiwiYWxnIjoiSFMyNTYifQ.eyJleHAiOjE4MjQzMTM4ODYsImlzcyI6ImNvbS5leHBlcml0ZXN0In0.dCZtEBwaHTUN10Y6uV4d1RblcDAXtgX7Mwbj2A8s_OM";

    protected IOSDriver<IOSElement> driver = null;

    DesiredCapabilities dc = new DesiredCapabilities();


    @BeforeTest
    public void setUp(final ITestContext testContext) throws MalformedURLException {

        dc.setCapability("reportDirectory", reportDirectory);
        dc.setCapability("reportFormat", reportFormat);
        dc.setCapability("accessKey", accessKey);
        dc.setCapability(MobileCapabilityType.UDID, "2d522e08c4694484718d46ee55afefcc8bf41d7e");
        dc.setCapability(MobileCapabilityType.APP, "cloud:com.experitest.ExperiBank");
        dc.setCapability(IOSMobileCapabilityType.BUNDLE_ID, "com.experitest.ExperiBank");
        dc.setCapability("Build.Number", buildNumber);
        //driver = new IOSDriver<IOSElement>(new URL("http://192.168.1.60:8080/wd/hub"), dc);
    }

    @BeforeMethod
    public void handleTestMethodName(Method method) throws MalformedURLException
    {
        String testName = method.getName();
        System.out.println("Test Name: " + testName);
        dc.setCapability("testName", testName);
        driver = new IOSDriver<IOSElement>(new URL(cloudAddress+"/wd/hub"), dc);
    }


    @Test
    public void Login1() {
        driver.findElement(By.xpath("//*[@accessibilityLabel='usernameTextField' and @value='Username']")).sendKeys("company");
        driver.findElement(By.xpath("//*[@accessibilityLabel='passwordTextField' and @value='Password']")).sendKeys("compant");
        driver.findElement(By.xpath("//*[@name='loginButton']")).click();
    }

    @AfterTest
    public void tearDown() {
        String reportUrl = driver.getCapabilities().getCapability("reportUrl").toString();
        System.out.println(reportUrl);
        driver.quit();

    }
}