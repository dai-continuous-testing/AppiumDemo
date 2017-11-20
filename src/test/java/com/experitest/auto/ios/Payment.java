package com.experitest.auto.ios;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Optional;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import com.experitest.auto.BaseTest;

import io.appium.java_client.ios.IOSDriver;
import io.appium.java_client.ios.IOSElement;

public class Payment extends BaseTest {

	@BeforeMethod
	@Parameters("deviceQuery")
	public void setUp(@Optional("@os='ios'") String deviceQuery) throws Exception {
		init(deviceQuery);
	}

	@Test
	public void basic() {
		shouldFailTest(driver);
		testLogic(driver);
	}
	@Test
	public void noBalance() {
		shouldFailTest(driver);
		testLogic(driver);
	}
	@Test
	public void unauthorized() {
		shouldFailTest(driver);
		testLogic(driver);
	}
	@Test
	public void transactionCancel() {
		shouldFailTest(driver);
		testLogic(driver);
	}
	@Test
	public void maxAmount() {
		shouldFailTest(driver);
		testLogic(driver);
	}
	@Test
	public void minimumAmount() {
		shouldFailTest(driver);
		testLogic(driver);
	}

	@Test
	public void historyView() {
		shouldFailTest(driver);
		testLogic(driver);
	}

	@Test
	public void transferRejection() {
		shouldFailTest(driver);
		testLogic(driver);
	}

	
	@AfterMethod
	public void tearDown() {
		driver.quit();
	}

}
