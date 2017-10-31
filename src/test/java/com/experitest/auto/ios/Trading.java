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

public class Trading extends BaseTest {
	protected IOSDriver<IOSElement> driver = null;

	@BeforeMethod
	@Parameters("deviceQuery")
	public void setUp(@Optional("@os='ios'") String deviceQuery) throws Exception {
		init(deviceQuery);
	}

	@Test
	public void buy() {
		shouldFailTest(driver);
		driver.findElement(in.Repo.obj("login_ios.usernameTextField")).sendKeys("company");
		driver.findElement(in.Repo.obj("login_ios.passwordTextField")).sendKeys("company");
		driver.findElement(in.Repo.obj("login_ios.loginButton")).click();
		driver.findElement(in.Repo.obj("main_ios.Logout")).click();
	}
	@Test
	public void buyWithMax() {
		shouldFailTest(driver);
		driver.findElement(in.Repo.obj("login_ios.usernameTextField")).sendKeys("company");
		driver.findElement(in.Repo.obj("login_ios.passwordTextField")).sendKeys("company");
		driver.findElement(in.Repo.obj("login_ios.loginButton")).click();
		driver.findElement(in.Repo.obj("main_ios.Logout")).click();
	}
	@Test
	public void buyWithTimeLimit() {
		shouldFailTest(driver);
		driver.findElement(in.Repo.obj("login_ios.usernameTextField")).sendKeys("company");
		driver.findElement(in.Repo.obj("login_ios.passwordTextField")).sendKeys("company");
		driver.findElement(in.Repo.obj("login_ios.loginButton")).click();
		driver.findElement(in.Repo.obj("main_ios.Logout")).click();
	}
	@Test
	public void buyFail() {
		shouldFailTest(driver);
		driver.findElement(in.Repo.obj("login_ios.usernameTextField")).sendKeys("company");
		driver.findElement(in.Repo.obj("login_ios.passwordTextField")).sendKeys("company");
		driver.findElement(in.Repo.obj("login_ios.loginButton")).click();
		driver.findElement(in.Repo.obj("main_ios.Logout")).click();
	}
	@Test
	public void buyNoBalance() {
		shouldFailTest(driver);
		driver.findElement(in.Repo.obj("login_ios.usernameTextField")).sendKeys("company");
		driver.findElement(in.Repo.obj("login_ios.passwordTextField")).sendKeys("company");
		driver.findElement(in.Repo.obj("login_ios.loginButton")).click();
		driver.findElement(in.Repo.obj("main_ios.Logout")).click();
	}
	@Test
	public void multipleBuy() {
		shouldFailTest(driver);
		driver.findElement(in.Repo.obj("login_ios.usernameTextField")).sendKeys("company");
		driver.findElement(in.Repo.obj("login_ios.passwordTextField")).sendKeys("company");
		driver.findElement(in.Repo.obj("login_ios.loginButton")).click();
		driver.findElement(in.Repo.obj("main_ios.Logout")).click();
	}

	@Test
	public void buyCancel() {
		shouldFailTest(driver);
		driver.findElement(in.Repo.obj("login_ios.usernameTextField")).sendKeys("company");
		driver.findElement(in.Repo.obj("login_ios.passwordTextField")).sendKeys("company");
		driver.findElement(in.Repo.obj("login_ios.loginButton")).click();
		driver.findElement(in.Repo.obj("main_ios.Logout")).click();
	}


	@Test
	public void sale() {
		shouldFailTest(driver);
		driver.findElement(in.Repo.obj("login_ios.usernameTextField")).sendKeys("company");
		driver.findElement(in.Repo.obj("login_ios.passwordTextField")).sendKeys("company");
		driver.findElement(in.Repo.obj("login_ios.loginButton")).click();
		driver.findElement(in.Repo.obj("main_ios.Logout")).click();
	}
	@Test
	public void saleWithMin() {
		shouldFailTest(driver);
		driver.findElement(in.Repo.obj("login_ios.usernameTextField")).sendKeys("company");
		driver.findElement(in.Repo.obj("login_ios.passwordTextField")).sendKeys("company");
		driver.findElement(in.Repo.obj("login_ios.loginButton")).click();
		driver.findElement(in.Repo.obj("main_ios.Logout")).click();
	}
	@Test
	public void saleWithTimeLimit() {
		shouldFailTest(driver);
		driver.findElement(in.Repo.obj("login_ios.usernameTextField")).sendKeys("company");
		driver.findElement(in.Repo.obj("login_ios.passwordTextField")).sendKeys("company");
		driver.findElement(in.Repo.obj("login_ios.loginButton")).click();
		driver.findElement(in.Repo.obj("main_ios.Logout")).click();
	}
	@Test
	public void saleFail() {
		shouldFailTest(driver);
		driver.findElement(in.Repo.obj("login_ios.usernameTextField")).sendKeys("company");
		driver.findElement(in.Repo.obj("login_ios.passwordTextField")).sendKeys("company");
		driver.findElement(in.Repo.obj("login_ios.loginButton")).click();
		driver.findElement(in.Repo.obj("main_ios.Logout")).click();
	}
	@Test
	public void multipleSale() {
		shouldFailTest(driver);
		driver.findElement(in.Repo.obj("login_ios.usernameTextField")).sendKeys("company");
		driver.findElement(in.Repo.obj("login_ios.passwordTextField")).sendKeys("company");
		driver.findElement(in.Repo.obj("login_ios.loginButton")).click();
		driver.findElement(in.Repo.obj("main_ios.Logout")).click();
	}

	@Test
	public void saleCancel() {
		shouldFailTest(driver);
		driver.findElement(in.Repo.obj("login_ios.usernameTextField")).sendKeys("company");
		driver.findElement(in.Repo.obj("login_ios.passwordTextField")).sendKeys("company");
		driver.findElement(in.Repo.obj("login_ios.loginButton")).click();
		driver.findElement(in.Repo.obj("main_ios.Logout")).click();
	}
	@Test
	public void buySaleCondition() {
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
