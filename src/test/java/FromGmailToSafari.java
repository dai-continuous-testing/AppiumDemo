//package <set your test package>;

import io.appium.java_client.ios.IOSDriver;
import io.appium.java_client.remote.IOSMobileCapabilityType;
import io.appium.java_client.remote.MobileCapabilityType;
import org.openqa.selenium.By;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.*;

import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;

public class FromGmailToSafari extends BaseTest{
    private String reportDirectory = "reports";
    private String reportFormat = "xml";
    private String testName = "enable_location_services";
    protected IOSDriver driver = null;

    @BeforeMethod
    @Parameters("deviceQuery")
    public void setUp(@Optional("@os='ios'") String deviceQuery) throws Exception{
        init(deviceQuery, "From App to \nSafari");
    }

    @Test
    public void testGmailAppToSafari() {
        client.launch("com.google.Gmail", false, true);
        client.waitForElement("NATIVE", "xpath=//*[@text='Sign in']", 0, 3000);
        client.click("NATIVE", "xpath=//*[@text='Sign in']", 0, 1);
        client.click("NATIVE", "xpath=//*[@text='Open in Safari']", 0, 1);
        client.waitForElement("WEB", "xpath=//*[@text='More options']", 0, 3000);
        client.click("WEB", "xpath=//*[@text='More options']", 0, 1);
        client.waitForElement("WEB", "xpath=//*[@text='Create account']", 0, 3000);
        client.click("WEB", "xpath=//*[@text='Create account']", 0, 1);
        client.elementSendText("WEB", "xpath=//*[@id='firstName']", 0, "Test");
        client.elementSendText("WEB", "xpath=//*[@id='lastName']", 0, "Test");
        client.click("WEB", "xpath=//*[@text='Next']", 0, 1);
    }

}