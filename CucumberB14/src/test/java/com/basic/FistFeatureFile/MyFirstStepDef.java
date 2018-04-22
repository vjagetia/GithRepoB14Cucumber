package com.basic.FistFeatureFile;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;


public class MyFirstStepDef {
	
	WebDriver driver;
	
	@Given("^User needs to be on Facebook login page$")
	public void User_needs_to_be_on_Facebook_login_page()
	{
	//	System.setProperty("webdriver.gecko.driver","C:\\java\\redicalclass\\geckodriver_64\\geckodriver.exe");
		//WebDriver driver = new FirefoxDriver();
		System.setProperty("webdriver.chrome.driver","C:\\java\\redicalclass\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("https://www.facebook.com/");
	}
	//Thread.Sleep(3000)
	@When("^User enters user \"([^\"]*)\" first name$")
	public void User_enters_user_first_name(String uname)
			{
		driver.findElement(By.name("firstname")).sendKeys(uname);
			}
	
	@Then("User checks user \"([^\"]*)\" first name is present")
	public void User_checks_user_first_name_is_present(String s)
	{
		String userNameActual= driver.findElement(By.name("firstname")).getAttribute("value");
				Assert.assertEquals(s,userNameActual);
	}
			

}
