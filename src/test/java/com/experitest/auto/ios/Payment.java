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

public class Payment extends BaseTest {
	protected IOSDriver<IOSElement> driver = null;

	@BeforeMethod
	@Parameters("deviceQuery")
	public void setUp(@Optional("@os='ios'") String deviceQuery) throws Exception {
		init(deviceQuery);
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
	public void noBalance() {
		shouldFailTest(driver);
		driver.findElement(in.Repo.obj("login_ios.usernameTextField")).sendKeys("company");
		driver.findElement(in.Repo.obj("login_ios.passwordTextField")).sendKeys("company");
		driver.findElement(in.Repo.obj("login_ios.loginButton")).click();
		driver.findElement(in.Repo.obj("main_ios.Logout")).click();
	}
	@Test
	public void unauthorized() {
		shouldFailTest(driver);
		driver.findElement(in.Repo.obj("login_ios.usernameTextField")).sendKeys("company");
		driver.findElement(in.Repo.obj("login_ios.passwordTextField")).sendKeys("company");
		driver.findElement(in.Repo.obj("login_ios.loginButton")).click();
		driver.findElement(in.Repo.obj("main_ios.Logout")).click();
	}
	@Test
	public void transactionCancel() {
		shouldFailTest(driver);
		driver.findElement(in.Repo.obj("login_ios.usernameTextField")).sendKeys("company");
		driver.findElement(in.Repo.obj("login_ios.passwordTextField")).sendKeys("company");
		driver.findElement(in.Repo.obj("login_ios.loginButton")).click();
		driver.findElement(in.Repo.obj("main_ios.Logout")).click();
	}
	@Test
	public void maxAmount() {
		shouldFailTest(driver);
		driver.findElement(in.Repo.obj("login_ios.usernameTextField")).sendKeys("company");
		driver.findElement(in.Repo.obj("login_ios.passwordTextField")).sendKeys("company");
		driver.findElement(in.Repo.obj("login_ios.loginButton")).click();
		driver.findElement(in.Repo.obj("main_ios.Logout")).click();
	}
	@Test
	public void minimumAmount() {
		driver.findElement(in.Repo.obj("login_ios.usernameTextField")).sendKeys("company");
		driver.findElement(in.Repo.obj("login_ios.passwordTextField")).sendKeys("company");
		driver.findElement(in.Repo.obj("login_ios.loginButton")).click();
		driver.findElement(in.Repo.obj("main_ios.Logout")).click();
	}

	@Test
	public void historyView() {
		shouldFailTest(driver);
		driver.findElement(in.Repo.obj("login_ios.usernameTextField")).sendKeys("company");
		driver.findElement(in.Repo.obj("login_ios.passwordTextField")).sendKeys("company");
		driver.findElement(in.Repo.obj("login_ios.loginButton")).click();
		driver.findElement(in.Repo.obj("main_ios.Logout")).click();
	}

	@Test
	public void transferRejection() {
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
