package stepDefinition;

import junit.framework.Assert;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class LoginStepDefinition {

	WebDriver driver;
	
//	@Given("^User is already on login page$")
//	
//	public void User_is_already_on_login_page(){
//		
		
	@Given("^User is already on login page$")
	public void user_is_already_on_login_page() {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Sony\\git\\actitime\\Driver\\chromedriver.exe");
		driver=new ChromeDriver();
		driver.get("https://www.freecrm.com");
	}
	

	@When("^title of loginpage is Free CRM$")
	public void title_of_loginpage_is_Free_CRM() {
		
		String title=driver.getTitle();
		System.out.println(title);
		Assert.assertEquals("#1 Free CRM for Any Business: Online Customer Relationship Software", title);
		
	}
	

	@Then("^user enter username and password$")
	public void user_enter_username_and_password(){
		
		driver.findElement(By.name("username")).sendKeys("ravikumar");
		driver.findElement(By.name("password")).sendKeys("ravi9122");
		
	}
	

	@Then("^user clicks on login button$")
	public void user_clicks_on_login_button() {
		
		WebElement loginbtn= driver.findElement(By.xpath("//input[@type='submit' and @value='Login']"));
		JavascriptExecutor js=(JavascriptExecutor)driver;
		js.executeScript("arguments[0].click()", loginbtn);
		
	}
	

	@Then("^user is on home page$")
	public void user_is_on_home_page() {
		
	String	title=driver.getTitle();
	System.out.println( title);
	Assert.assertEquals("CRMPRO", title);
		
	
	}
		
		
	}
	
	
	
	
	
	
	
	
	
	
	
	

