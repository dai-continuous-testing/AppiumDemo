package com.experitest.auto.ios;

import java.net.URL;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Optional;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import com.experitest.auto.BaseTest;

import io.appium.java_client.ios.IOSDriver;
import io.appium.java_client.ios.IOSElement;
import io.appium.java_client.remote.IOSMobileCapabilityType;
import io.appium.java_client.remote.MobileCapabilityType;

public class Login extends BaseTest {

	protected IOSDriver<IOSElement> driver = null;

	@BeforeMethod
	@Parameters("deviceQuery")
	public void setUp(@Optional("@os='ios'") String deviceQuery) throws Exception {
		init(deviceQuery);
		// Init application / device capabilities
		
		driver = new IOSDriver<>(new URL(getProperty("url",cloudProperties) + "/wd/hub"), dc);
	}

	@Test
	public void basic() {
		shouldFailTest(driver);
		driver.findElement(in.Repo.obj("login_ios.usernameTextField")).sendKeys("company");
		driver.findElement(in.Repo.obj("login_ios.passwordTextField")).sendKeys("company");
		driver.findElement(in.Repo.obj("login_ios.loginButton")).click();
		driver.findElement(in.Repo.obj("main_ios.Logout")).click();
	}
	@Test
	public void failLogin() {
		shouldFailTest(driver);
		driver.findElement(in.Repo.obj("login_ios.usernameTextField")).sendKeys("company");
		driver.findElement(in.Repo.obj("login_ios.passwordTextField")).sendKeys("company");
		driver.findElement(in.Repo.obj("login_ios.loginButton")).click();
		driver.findElement(in.Repo.obj("main_ios.Logout")).click();
	}
	@Test
	public void withMultipleSession() {
		shouldFailTest(driver);
		driver.findElement(in.Repo.obj("login_ios.usernameTextField")).sendKeys("company");
		driver.findElement(in.Repo.obj("login_ios.passwordTextField")).sendKeys("company");
		driver.findElement(in.Repo.obj("login_ios.loginButton")).click();
		driver.findElement(in.Repo.obj("main_ios.Logout")).click();
	}
	@Test
	public void retryFail() {
		shouldFailTest(driver);
		driver.findElement(in.Repo.obj("login_ios.usernameTextField")).sendKeys("company");
		driver.findElement(in.Repo.obj("login_ios.passwordTextField")).sendKeys("company");
		driver.findElement(in.Repo.obj("login_ios.loginButton")).click();
		driver.findElement(in.Repo.obj("main_ios.Logout")).click();
	}
	@Test
	public void blockUser() {
		shouldFailTest(driver);
		driver.findElement(in.Repo.obj("login_ios.usernameTextField")).sendKeys("company");
		driver.findElement(in.Repo.obj("login_ios.passwordTextField")).sendKeys("company");
		driver.findElement(in.Repo.obj("login_ios.loginButton")).click();
		driver.findElement(in.Repo.obj("main_ios.Logout")).click();
	}
	@Test
	public void sessionTimeout() {
		shouldFailTest(driver);
		driver.findElement(in.Repo.obj("login_ios.usernameTextField")).sendKeys("company");
		driver.findElement(in.Repo.obj("login_ios.passwordTextField")).sendKeys("company");
		driver.findElement(in.Repo.obj("login_ios.loginButton")).click();
		driver.findElement(in.Repo.obj("main_ios.Logout")).click();
	}

	@Test
	public void retypePassword() {
		shouldFailTest(driver);
		driver.findElement(in.Repo.obj("login_ios.usernameTextField")).sendKeys("company");
		driver.findElement(in.Repo.obj("login_ios.passwordTextField")).sendKeys("company");
		driver.findElement(in.Repo.obj("login_ios.loginButton")).click();
		driver.findElement(in.Repo.obj("main_ios.Logout")).click();
	}

	@Test
	public void stability() {
		shouldFailTest(driver);
		driver.findElement(in.Repo.obj("login_ios.usernameTextField")).sendKeys("company");
		driver.findElement(in.Repo.obj("login_ios.passwordTextField")).sendKeys("company");
		driver.findElement(in.Repo.obj("login_ios.loginButton")).click();
		driver.findElement(in.Repo.obj("main_ios.Logout")).click();
	}

	
	@AfterMethod
	public void tearDown() {
		driver.quit();
	}

}
