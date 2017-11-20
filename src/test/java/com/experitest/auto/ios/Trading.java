package com.experitest.auto.ios;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Optional;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import com.experitest.auto.BaseTest;

import io.appium.java_client.ios.IOSDriver;
import io.appium.java_client.ios.IOSElement;

public class Trading extends BaseTest {

	@BeforeMethod
	@Parameters("deviceQuery")
	public void setUp(@Optional("@os='ios'") String deviceQuery) throws Exception {
		init(deviceQuery);
	}

	@Test
	public void buy() {
		shouldFailTest(driver);
		testLogic(driver);
	}
	@Test
	public void buyWithMax() {
		shouldFailTest(driver);
		testLogic(driver);
	}
	@Test
	public void buyWithTimeLimit() {
		shouldFailTest(driver);
		testLogic(driver);
	}
	@Test
	public void buyFail() {
		shouldFailTest(driver);
		testLogic(driver);
	}
	@Test
	public void buyNoBalance() {
		shouldFailTest(driver);
		testLogic(driver);
	}
	@Test
	public void multipleBuy() {
		shouldFailTest(driver);
		testLogic(driver);
	}

	@Test
	public void buyCancel() {
		shouldFailTest(driver);
		testLogic(driver);
	}


	@Test
	public void sale() {
		shouldFailTest(driver);
		testLogic(driver);
	}
	@Test
	public void saleWithMin() {
		shouldFailTest(driver);
		testLogic(driver);
	}
	@Test
	public void saleWithTimeLimit() {
		shouldFailTest(driver);
		testLogic(driver);
	}
	@Test
	public void saleFail() {
		shouldFailTest(driver);
		testLogic(driver);
	}
	@Test
	public void multipleSale() {
		shouldFailTest(driver);
		testLogic(driver);
	}

	@Test
	public void saleCancel() {
		shouldFailTest(driver);
		testLogic(driver);
	}
	@Test
	public void buySaleCondition() {
		shouldFailTest(driver);
		testLogic(driver);
	}
	
	@AfterMethod
	public void tearDown() {
		driver.quit();
	}

}
