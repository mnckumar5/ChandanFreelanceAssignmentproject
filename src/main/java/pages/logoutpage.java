package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class logoutpage 

{
	WebDriver driver;

	public logoutpage(WebDriver driver) {
		this.driver = driver;
	}
	
	By welcomeMsg=By.xpath("//h1[contains(.,'Learn Automation Courses')]");
	
	By Signout =By.xpath("//button[@class='nav-menu-item']");
	
	By toglericon =By.xpath("//span[@class='navbar-toggler-icon']");
	
	public String getWelcomeMsg()
	{
		return driver.findElement(welcomeMsg).getText();
	}
	
	public void Logout()
	{
		driver.findElement(toglericon).click();
		driver.findElement(Signout).click();
	}


}
