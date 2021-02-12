package StepDefenition;
import java.io.FileInputStream;
import java.io.FilterInputStream;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;


public class implementation {
	
	static	Properties prop;
	static WebDriver driver;
	static	Properties prop1;


	@Given("^open the browser$")
	public void open_the_browser() throws Throwable {
	
		
		FileInputStream fis=new FileInputStream("C:\\Users\\Admin\\eclipse-workspace\\com.automationCucumber\\src\\test\\java\\configuration\\objectRepositories.properties");
		 prop=new Properties(); 
		prop.load(fis);// inbuilt class in java
		System.setProperty("webdriver.chrome.driver","E:\\chromedriver.exe");
		driver = new ChromeDriver();
	}
	
	@Given("^navigate the URL$")
	public void navigate_the_URL() throws Throwable {
	   
		driver.get(prop.getProperty("url"));    
		
	}

	@When("^enter the username$")
	public void enter_the_username() throws Throwable {
	 
		WebElement username = driver.findElement(By.xpath(prop.getProperty("loginpage.username")));
		username.sendKeys("tester");
		  
		
	}

	@When("^enter the password$")
	public void enter_the_password() throws Throwable {
	  
		
		WebElement password = driver.findElement(By.xpath(prop.getProperty("loginpage.password")));
		password.sendKeys("test");
	}

	@When("^click the login$")
	public void click_the_login() throws Throwable {
	   
		
		WebElement login = driver.findElement(By.xpath(prop.getProperty("loginpage.login")));
		login.click();   // Write code here that turns the phrase above into concrete actions
	    
	}

	@Then("^verify login is success$")
	public void verify_login_is_success() throws Throwable {
	   
		
		 System.out.println("SmartBear Login Successfully... ");
	}

		
	//;;;;;;;;;;;;;;;;;;;;;;;;;;;;

	   
@Given("^open chromebrowser$")
public void open_chromebrowser() throws Throwable {
	FileInputStream fis1=new FileInputStream("C:\\Users\\Admin\\eclipse-workspace\\com.automationCucumber\\src\\test\\java\\configuration\\objectRepositories.properties");
	 prop1=new Properties(); 
	prop1.load(fis1);      //(load)inbuilt class in java
	System.setProperty("webdriver.chrome.driver","E:\\chromedriver.exe");
	driver = new ChromeDriver();   
}

@Given("^navigate the url$")
public void navigate_the_url() throws Throwable {
	driver.get(prop1.getProperty("rediffurl"));
}

@When("^enter userName$")
public void enter_username() throws Throwable {
	WebElement username = driver.findElement(By.xpath(prop1.getProperty("userName")));
	username.sendKeys("santhiveeman@rediffmail.com");
}



@When("^enter passWord$")
public void enter_password() throws Throwable {
	WebElement pwd= driver.findElement(By.xpath(prop1.getProperty("passWord")));
	pwd.sendKeys("Harshad@123");
	Thread.sleep(3000);
}

@When("^enter click$")
public void enter_click() throws Throwable {
 
		WebElement login1 = driver.findElement(By.xpath(prop1.getProperty("signin")));
		login1.click();   
    
}


@Then("^loginInbox successfully$")
public void logininbox_successfully() throws Throwable {
	 System.out.println("Successfully Login Rediffmail");
}}


