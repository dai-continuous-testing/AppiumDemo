//package <set your test package>;
import io.appium.java_client.remote.IOSMobileCapabilityType;
import io.appium.java_client.ios.IOSDriver;
import io.appium.java_client.remote.MobileCapabilityType;
import org.openqa.selenium.ScreenOrientation;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.By;
import org.testng.*;
import org.testng.annotations.*;

import java.io.File;
import java.io.IOException;
import java.net.URL;
import java.net.MalformedURLException;

public class EribankLogin extends BaseTest{
    private String reportDirectory = "reports";
    private String reportFormat = "xml";
    private String testName = "eribank_instrumented_login_pay_balance";
    protected IOSDriver driver = null;

    @BeforeMethod
    @Parameters("deviceQuery")
    public void setUp(@Optional("@os='ios'") String deviceQuery) throws Exception{
        init(deviceQuery, "EriBank - Login and \nPay");
    }

    @Test
    public void testeribank_instrumented_login_pay_balance() {

        client.launch("com.experitest.ExperiBank", false, true);
        client.elementSendText("NATIVE", "xpath=//*[@accessibilityLabel='Username']", 0, "company");
        client.elementSendText("NATIVE", "xpath=//*[@accessibilityLabel='Password']", 0, "company");
        client.click("NATIVE", "xpath=//*[@accessibilityLabel='loginButton']", 0, 1);
        client.click("NATIVE", "xpath=//*[@accessibilityLabel='makePaymentButton']", 0, 1);
        client.elementSendText("NATIVE", "xpath=//*[@accessibilityLabel='Phone']", 0, "123456");
        client.elementSendText("NATIVE", "xpath=//*[@accessibilityLabel='Name']", 0, "Test");
        client.elementSendText("NATIVE", "xpath=//*[@accessibilityLabel='Amount']", 0, "2");
        client.click("NATIVE", "xpath=//*[@accessibilityLabel='Select']", 0, 1);
        client.click("NATIVE", "xpath=//*[@accessibilityLabel='USA']", 0, 1);
        client.click("NATIVE", "xpath=//*[@accessibilityLabel='sendPaymentButton']", 0, 1);
        client.click("NATIVE", "xpath=//*[@text='Yes']", 0, 1);
        String text1 = client.elementGetText("WEB", "xpath=//*[@nodeName='H1']",0);



    }
}