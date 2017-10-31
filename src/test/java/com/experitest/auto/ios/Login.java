package com.experitest.auto.ios;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Optional;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import com.experitest.auto.BaseTest;

public class Login extends BaseTest {


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
