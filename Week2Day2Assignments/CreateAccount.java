package week2.day2assignments;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.Select;

public class CreateAccount {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ChromeOptions options = new ChromeOptions();
		options.addArguments("guest");
		
		//Initialize the WebDriver (ChromeDriver). 
		ChromeDriver driver=new ChromeDriver(options);
		//Load the URL
		driver.get("http://leaftaps.com/opentaps/.");
		//Maximize the browser window. 
		driver.manage().window().maximize();
		//Enter a username and password. 
		driver.findElement(By.id("username")).sendKeys("Demosalesmanager");
		driver.findElement(By.id("password")).sendKeys("crmsfa");
		driver.findElement(By.className("decorativeSubmit")).click();
		//Click on the "CRM/SFA" link. 
		driver.findElement(By.partialLinkText("CRM")).click();
		//Click on the "Accounts" tab. 
		driver.findElement(By.linkText("Accounts")).click();
		//Click on the "Create Account" button.
		driver.findElement(By.linkText("Create Account")).click();
		//Enter an account name. 
		driver.findElement(By.id("accountName")).sendKeys("Test Account112");
		//Enter a description as "Selenium Automation Tester." 
		driver.findElement(By.name("description")).sendKeys("Selenium Automation Tester");
		//Select "ComputerSoftware" as the industry. 
		WebElement industryDropdown = driver.findElement(By.name("industryEnumId"));
		Select industryDropdownOptions=new  Select(industryDropdown);
		industryDropdownOptions.selectByValue("IND_SOFTWARE");
		//Select "S-Corporation" as ownership using SelectByVisibleText. 
		WebElement ownershipDropdown = driver.findElement(By.name("ownershipEnumId"));
		Select ownershipDropdownOptions=new Select(ownershipDropdown);
		ownershipDropdownOptions.selectByVisibleText("S-Corporation");
		//Select "Employee" as the source using SelectByValue. 
		WebElement sourceDropdown = driver.findElement(By.id("dataSourceId"));
		Select sourceDropdownOptions = new Select(sourceDropdown);
		sourceDropdownOptions.selectByValue("LEAD_EMPLOYEE");
		//Select "eCommerce Site Internal Campaign" as the marketing campaign using SelectByIndex. 
		WebElement marketingCampaignDropdown = driver.findElement(By.id("marketingCampaignId"));
		Select marketingCampaignDropdownOptions=new Select(marketingCampaignDropdown);
		marketingCampaignDropdownOptions.selectByIndex(6);
		//Select "Texas" as the state/province using SelectByValue. 
		WebElement stateOrProvinceDropdown = driver.findElement(By.id("generalStateProvinceGeoId"));
		Select stateOrProvinceDropdownOptions=new Select(stateOrProvinceDropdown);
		stateOrProvinceDropdownOptions.selectByValue("TX");
		//Click the "Create Account" button. 
		driver.findElement(By.className("smallSubmit")).click();
		//Verify that the account name is displayed correctly. 
		
		//Close the browser window. 
		driver.close();
	}

}
