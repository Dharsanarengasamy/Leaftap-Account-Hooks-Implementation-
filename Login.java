package stepDefinition;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Login extends ProjectSpecificMethod{
	
	//public ChromeDriver driver;
	
	@Given("Launch the browser and load the url")
	public void launchAndLoad()
	{
		driver = new ChromeDriver();
	    driver.manage().window().maximize();
	    driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	    driver.get("http://leaftaps.com/opentaps");
		
	}
	
	@Given("Enter username")
	public void enterUserName()
	{
		driver.findElement(By.id("username")).sendKeys("demosalesmanager");
	}
	
	@Given("Enter password")
	public void enterPassword()
	{
		driver.findElement(By.id("password")).sendKeys("crmsfa");
	}
	
	@When("Click on login button")
	public void clickLogin()
	{
		driver.findElement(By.className("decorativeSubmit")).click();
	}
	
	@Then("Verify sucessful login")
	public void verifyLogin() 
	{
		System.out.println(driver.getTitle());
	}

}
