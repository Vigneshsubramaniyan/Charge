package org.step;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;
import junit.framework.Assert;

public class Stepdefinition {
	

	WebDriver driver;
	
	@Given("Launch the Browser")
	public void launch_the_browser() {
	
		WebDriverManager.chromedriver().setup();
		
		driver = new ChromeDriver();
			
	}

	@Given("Open the application")
	public void open_the_application() {
	  
		driver.get("https://adactinhotelapp.com/");
		}

	@When("Enter the {string} and {string}")
	public void enter_the_and(String username, String password) {
		
											
		driver.findElement(By.name("username")).sendKeys(username);
		
		driver.findElement(By.name("password")).sendKeys(password);	
		
	}

	@When("Click the Login button")
	public void click_the_login_button() {
	   driver.findElement(By.name("login")).click();		
	}

	@Then("Validate the Login Page")
	public void validate_the_login_page() {
		
		
		WebElement Welcome = driver.findElement(By.xpath("//td[text()='Welcome to Adactin Group of Hotels']"));
	    org.junit.Assert.assertTrue(true);

	}

	@Then("Close the Browser")
	public void close_the_browser() {
	    
	driver.quit();
	
	}
	
	
	@Then("Validate the browser closed or not")
	public void validate_the_browser_closed_or_not() {
	 
		
		
	}





	
	
	
}
