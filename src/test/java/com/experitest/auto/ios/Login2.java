package com.experitest.auto.ios;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Optional;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import com.experitest.auto.BaseTest;

public class Login2 extends BaseTest {


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
	public void failLogin() {
		shouldFailTest(driver);
		testLogic(driver);
	}
	@Test
	public void withMultipleSession() {
		shouldFailTest(driver);
		testLogic(driver);
	}
	@Test
	public void retryFail() {
		shouldFailTest(driver);
		testLogic(driver);
	}
	@Test
	public void blockUser() {
		shouldFailTest(driver);
		testLogic(driver);
	}
	@Test
	public void sessionTimeout() {
		shouldFailTest(driver);
		testLogic(driver);
	}

	@Test
	public void retypePassword() {
		shouldFailTest(driver);
		testLogic(driver);
	}

	@Test
	public void stability() {
		shouldFailTest(driver);
		testLogic(driver);
	}

	
	@AfterMethod
	public void tearDown() {
		driver.quit();
	}

}
