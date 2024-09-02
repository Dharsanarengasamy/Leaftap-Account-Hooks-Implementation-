package stepDefinition;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;

public class EditAccount extends ProjectSpecificMethod {
	
	//public ChromeDriver driver;
	
	@When("Click on Find Accounts tab")
	public void clickFindAccTab()
	{
		driver.findElement(By.linkText("Find Accounts")).click();
	}
	
	@Given("Enter the name to  as {string}")
	public void enterEditName(String ename) 
	{
		driver.findElement(By.xpath("(//input[@name='accountName'])[2]")).sendKeys(ename);
	}
	
	@When("Click on Find accounts button")
	public void clickFindAccBtn() throws InterruptedException
	{
		driver.findElement(By.xpath("//button[text()='Find Accounts']")).click();
		Thread.sleep(3000);
	}
	
	@When("Click on edit name")
	public void clickEditName() 
	{
		driver.findElement(By.xpath("//div[@class='x-grid3-cell-inner x-grid3-col-partyId']/a")).click();
		//driver.findElement(By.xpath("(//a[@class='linktext'])[5]")).click();
	}
	
	@When("Click edit tab")
	public void clickEditTab()
	{
		driver.findElement(By.xpath("//a[text()='Edit']")).click();
	}
	
	@Given("Select Industry")
	public void selectIndustry()
	{
		WebElement industryWE = driver.findElement(By.name("industryEnumId"));
	    Select industryDD = new Select(industryWE);
        industryDD.selectByVisibleText("Computer Software");
	}
	
	@Given("Select Ownership")
	public void selectOwnership()
	{
		WebElement ownershipWE = driver.findElement(By.name("ownershipEnumId"));
        Select ownershipDD = new Select(ownershipWE);
        ownershipDD.selectByVisibleText("S-Corporation");
	}
	
	@Given("Select Currency")
	public void selectCurrency()
	{
		WebElement ownershipWE = driver.findElement(By.name("currencyUomId"));
        Select ownershipDD = new Select(ownershipWE);
        ownershipDD.selectByVisibleText("AED - United Arab Emirates Dirham");
	}
	
	@When("Click save button")
	public void clickEditbtn()
	{
		driver.findElement(By.xpath("//input[@value='Save']")).click();
	}

}
