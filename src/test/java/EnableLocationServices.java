//package <set your test package>;
import io.appium.java_client.remote.IOSMobileCapabilityType;
import io.appium.java_client.ios.IOSDriver;
import io.appium.java_client.remote.MobileCapabilityType;
import org.openqa.selenium.ScreenOrientation;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.*;
import org.testng.annotations.*;

import java.io.IOException;
import java.net.URL;
import java.net.MalformedURLException;

public class EnableLocationServices extends BaseTest{
    private String reportDirectory = "reports";
    private String reportFormat = "xml";
    private String testName = "enable_location_services";
    protected IOSDriver driver = null;

    @BeforeMethod
    @Parameters("deviceQuery")
    public void setUp(@Optional("@os='ios'") String deviceQuery) throws Exception{
        init(deviceQuery, "Enable Location \nServices");
    }


    @Test
    public void testMapsAppEnableLocationServices() throws InterruptedException {
        client.launch("com.apple.Maps", false,true);
        client.waitForElement("NATIVE", "xpath=//*[@text='Settings']", 0, 10000);
        client.click("NATIVE", "xpath=//*[@text='Settings' and ./parent::*[./following-sibling::*[@class='UIAView']]]", 0, 1);
        client.waitForElement("NATIVE", "xpath=//*[@class='UIASwitch']", 0, 10000);
        client.click("NATIVE", "xpath=//*[@class='UIASwitch' and @text='Location Services']", 0, 1);
        client.click("NATIVE", "xpath=//*[@text='Maps, Requested your location within the last 24 hours']", 0, 1);
        client.click("NATIVE", "xpath=//*[@text='While Using the App' and @class='UIAView']", 0, 1);
        client.click("NATIVE", "xpath=//*[@text='Return to Maps']", 0, 1);
        client.elementSendText("NATIVE", "xpath=//*[@placeholder='Search for a place or address']", 0, "new york");
        client.waitForElement("NATIVE", "xpath=//*[@text='Search']", 0, 10000);
        client.click("NATIVE", "xpath=//*[@text='Search']", 0, 1);
    }

}
