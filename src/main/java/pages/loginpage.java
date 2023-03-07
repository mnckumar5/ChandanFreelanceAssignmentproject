package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class loginpage

{
	WebDriver driver;

	public loginpage(WebDriver driver) {
		this.driver = driver;
	}

	By un = By.xpath("//input[@id='email1']");

	By pwd = By.xpath("//input[@id='password1']");

	By Signin3 = By.xpath("//button[text()='Sign in']");
	
	
	
	By loginHeader=By.xpath("//h2[contains(.,'Sign In')]");
	
	

	public void logintoapplication(String usern, String passwd) 
	{
		driver.findElement(un).sendKeys(usern);
		driver.findElement(pwd).sendKeys(passwd);
		
	}
		
		
		public boolean isSignInPresent()
		{
			return driver.findElement(loginHeader).isDisplayed();
		}
		
		public void clickonlogin()
		{
			driver.findElement(Signin3).click();
		}
		
	
		
	}


