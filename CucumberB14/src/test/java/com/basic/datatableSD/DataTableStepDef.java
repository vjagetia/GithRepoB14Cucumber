package com.basic.datatableSD;

import java.util.List;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.DataTable;
import cucumber.api.java.en.And;
import cucumber.api.java.en.But;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;


public class DataTableStepDef {
	
	
	WebDriver driver =null;
	
	@Given("^User need to be on Facebook login page$")
	public void user_need_to_be_on_Facebook_login_page(){
		System.setProperty("webdriver.chrome.driver", "C:\\java\\redicalclass\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("https://www.facebook.com/");
	}
	
//	@When("^User enters user \"([^\"]*)\" first name$")
//	public void user_enters_user_first_name(String userName) throws InterruptedException{
//		driver.findElement(By.xpath("//input[@id='u_0_h']")).sendKeys(userName);
//		Thread.sleep(1000);
//	}
//	
//	@Then("^User checks user \"([^\"]*)\" first name is present$")
//	public void user_checks_user_first_name_is_present(String userName) throws InterruptedException{
//		String userNameActual =driver.findElement(By.xpath("//input[@id='u_0_h']")).getAttribute("value");
//		Assert.assertEquals(userName, userNameActual);
//		Thread.sleep(1000);
//	}
//	
//	
//	@And("User enters user \"([^\"]*)\" surname")
//	public void user_enters_user_surname(String surName) throws InterruptedException{
//		driver.findElement(By.xpath("//input[@id='j']")).sendKeys(surName);
//		Thread.sleep(1000);
//	}
//	
//	@But("User Mobile field should be blank")
//	public void user_Mobile_field_should_be_blank() throws InterruptedException{
//		String mobileActual =driver.findElement(By.xpath("//input[@id='u_0_m']")).getAttribute("value");
//		Assert.assertEquals("", mobileActual);
//		Thread.sleep(1000);
//	}
//	
//	
//	@Then("close browser")
//	public void close_browser(){
//		driver.quit();
//		driver =null;
//	}
//	
	@When("Enter followind data")
	public void enter_followind_data(DataTable table) throws InterruptedException{
		
		List<List<String>> data = table.raw();
		
		String values1 = data.get(0).get(0);
		String values2 = data.get(0).get(1);
		String values3 = data.get(0).get(2);
		
		
		String values4 = data.get(1).get(0);
		String values5 = data.get(1).get(1);
		String values6 = data.get(1).get(2);
		
		driver.findElement(By.name("firstname")).sendKeys(values4);
		driver.findElement(By.name("lastname")).sendKeys(values5);
		Thread.sleep(2000);
		
		
		
	}
	
	
}
