package com.experitest.auto;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.lang.reflect.Method;
import java.net.URL;
import java.util.Properties;

import org.openqa.selenium.Capabilities;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.ios.IOSDriver;
import io.appium.java_client.ios.IOSElement;
import io.appium.java_client.remote.IOSMobileCapabilityType;
import io.appium.java_client.remote.MobileCapabilityType;

public class BaseTest {
	public static String buildId = System.getenv("BUILD_NUMBER");
	public static String accessKey = System.getenv("access.key");
	public static String deviceQuery = System.getenv("device.query");
	
	protected IOSDriver<IOSElement> driver = null;

	protected DesiredCapabilities dc = new DesiredCapabilities();
	public void init(String deviceQuery) throws Exception {
		initCloudProperties();
		dc.setCapability("deviceQuery", adhocDevice(deviceQuery));
		
		String cname = className.split("\\.")[className.split("\\.").length - 1];
		dc.setCapability("testName", cname + "." + testName);
		dc.setCapability("build", String.valueOf(getBuild()));
		dc.setCapability(MobileCapabilityType.ORIENTATION, "portrait");
		
		dc.setCapability(MobileCapabilityType.APP, "cloud:com.experitest.ExperiBank");
		dc.setCapability(IOSMobileCapabilityType.BUNDLE_ID, "com.experitest.ExperiBank");
		dc.setCapability("accessKey", accessKey);
		
		dc.setCapability("stream", "demo4");
		
		dc.setCapability("reportDirectory", "reports");
		dc.setCapability("reportFormat", "xml");
		dc.setCapability("project", getProperty("project", cloudProperties));

		dc.setCapability("instrumentApp", true);
		driver = new IOSDriver<>(new URL(getProperty("url", cloudProperties) + "/wd/hub"), dc);


	}

	protected String getProperty(String property, Properties props) throws FileNotFoundException, IOException {
		if (System.getProperty(property) != null) {
			return System.getProperty(property);
		} else if (System.getenv().containsKey(property)) {
			return System.getenv(property);
		} else if (props != null) {
			return props.getProperty(property);
		}
		return null;
	}
	protected Properties cloudProperties = new Properties();
	String testName = "unknown";
	String className = "unknown";
    @BeforeMethod
    public void handleTestMethodName(Method method)
    {
        testName = method.getName(); 
        
    }
    @BeforeClass
    public void beforeClass() {
        className = this.getClass().getName();
    }

	private void initCloudProperties() throws FileNotFoundException, IOException {
		FileReader fr = new FileReader("cloud.properties");
		cloudProperties.load(fr);
		fr.close();
	}

	private static synchronized String adhocDevice(String deviceQuery) {
		try {
			File jarLocation = (System.getProperty("os.name").toUpperCase().contains("WIN"))
					? new File(System.getenv("APPDATA"), ".mobiledata")
					: new File(System.getProperty("user.home") + "/Library/Application " + "Support", ".mobiledata");
			File adhocProperties = new File(jarLocation, "adhoc.properties");
			if (adhocProperties.exists()) {
				Properties prop = new Properties();
				FileReader reader = new FileReader(adhocProperties);
				try {
					prop.load(reader);
				} finally {
					reader.close();
				}
				adhocProperties.delete();
				return "@serialnumber='" + prop.getProperty("serial") + "'";
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		return deviceQuery;
	}
	
	public synchronized static String getBuild() {
		if(buildId == null) {
			buildId = "-1";
		}
		return buildId;
	}
	public void shouldFailTest(AppiumDriver<?> driver) {
		Capabilities c = driver.getCapabilities();
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
//		if("11.x".equals(c.getCapability("device.majorVersion"))) {
//			driver.findElement(By.xpath("//*[@aaa='bbbb'"));
//		}
	}

}
