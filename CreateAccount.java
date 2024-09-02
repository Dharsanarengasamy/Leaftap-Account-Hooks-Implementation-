package stepDefinition;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class CreateAccount extends ProjectSpecificMethod{
	
	//public ChromeDriver driver;
	
	@When("Click crmsfa link")
	public void clickCrmsfa()
	{
		driver.findElement(By.partialLinkText("CRM/SFA")).click();
	}
	
	@When("Click Accounts tab")
	public void clickAccTab()
	{
		driver.findElement(By.linkText("Accounts")).click();
	}
	
	@When("Click create account tab")
	public void createAcctab()
	{
		driver.findElement(By.linkText("Create Account")).click();
	}
	
	@Given("Enter account name {string}")
	public void enterAccName(String aname)
	{
		driver.findElement(By.id("accountName")).sendKeys(aname);
	}
	
	@Given("Enter description {string}")
	public void enterDes(String des)
	{
		driver.findElement(By.xpath("//textarea[@name='description']")).sendKeys(des);
	}
	
	@When("Click create account button")
	public void clickCreateAccBtn()
	{
		driver.findElement(By.className("smallSubmit")).click();
	}
	
	@Then("Get account ID")
	public void getID()
	{
		WebElement ID = driver.findElement(By.xpath("(//span[@class='tabletext'])[3]"));
		System.out.println("Account Name and ID: "+ID);
	}

}
