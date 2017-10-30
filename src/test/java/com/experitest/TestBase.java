package com.experitest;

import io.appium.java_client.AppiumDriver;

import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.ITestContext;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import java.net.MalformedURLException;


public class TestBase {

    static final String buildNumber = System.getenv("BUILD_NUMBER");
    static final String accessKey = System.getenv("cloud.accessKey");
    static final String cloudAddress = System.getenv("cloud.address");
    static final String deviceQueryIOS = System.getenv("device.query.ios");
    static final String deviceQueryAndroid = System.getenv("device.query.android");

    protected String cloudURI;
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

        cloudURI = cloudAddress + "/wd/hub";
        System.out.println("cloud address: " + cloudURI );


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