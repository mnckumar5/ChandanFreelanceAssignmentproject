package testcases;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

import Browserfactory.Browserfactory;
import Helper.Utility;
import base.Baseclass;
import dataprovider.CustomDataProvider;

import pages.loginpage;
import pages.logoutpage;

public class Logintest extends Baseclass

{
	@Test(dataProvider = "Logindetails", dataProviderClass = CustomDataProvider.class)
	public void logintoapplication(String uname, String pwd) {

		loginpage login = new loginpage(driver);
		login.logintoapplication(uname, pwd);
		Utility.waitforseconds(4);
		login.clickonlogin();
		
		
        logoutpage logout=new logoutpage(driver);
		
		Assert.assertTrue(logout.getWelcomeMsg().contains("Automation"));
		Utility.waitforseconds(4);
		
		logout.Logout();
		
		Assert.assertTrue(login.isSignInPresent());

	}
}
