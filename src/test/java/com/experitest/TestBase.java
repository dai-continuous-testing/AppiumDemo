package com.experitest;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.ios.IOSDriver;
import io.appium.java_client.ios.IOSElement;
import io.appium.java_client.remote.IOSMobileCapabilityType;
import io.appium.java_client.remote.MobileCapabilityType;
import org.openqa.selenium.By;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.ITestContext;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import java.lang.reflect.Method;
import java.net.MalformedURLException;
import java.net.URL;


public class TestBase {

    static final String buildNumber = System.getenv("BUILD_NUMBER");
    static final String accessKey = System.getenv("cloud.accessKey");
    static final String cloudAddress = System.getenv("cloud.address");
    static final String deviceQueryIOS = System.getenv("device.query.ios");
    static final String deviceQueryAndroid = System.getenv("device.query.android");


    protected String reportDirectory = "reports";
    protected String reportFormat = "xml";
    protected String testName = "Untitled";

    protected AppiumDriver driver = null;
    protected DesiredCapabilities dc = new DesiredCapabilities();


    @BeforeTest
    public void setUp(final ITestContext testContext) throws MalformedURLException {

        System.out.println("buildNumber: " + buildNumber);
        System.out.println("Cloud: " + cloudAddress);
        System.out.println("accessKey: " + accessKey);

        dc.setCapability("reportDirectory", reportDirectory);
        dc.setCapability("reportFormat", reportFormat);
        dc.setCapability("accessKey", accessKey);
        dc.setCapability("Build.Number", buildNumber);
    }


    @AfterTest
    public void tearDown() {
        String reportUrl = driver.getCapabilities().getCapability("reportUrl").toString();
        System.out.println(reportUrl);
        driver.quit();

    }
}