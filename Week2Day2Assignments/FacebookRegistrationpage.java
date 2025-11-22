package week2.day2assignments;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class FacebookRegistrationpage {

	public static void main(String[] args) {

		// Step1 - Initializing Chrome Driver
		ChromeDriver driver = new ChromeDriver();
		// Step2 - Loading the Facebook URL
		driver.get("https://en-gb.facebook.com/");
		// Step2 - maximize the Browser
		driver.manage().window().maximize();
		// Step 3 - Add Implicit wait to ensure the web page elements are fully loaded
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		// Click on Create New account button
		driver.findElement(By.partialLinkText("Create new account")).click();
		// Enter the First Name
		driver.findElement(By.name("firstname")).sendKeys("Testuser");
		// Enter the Surname
		driver.findElement(By.name("lastname")).sendKeys("User");
		
		//Select the value from Day dropDown
		//Find the Element		
		WebElement dayDropdown = driver.findElement(By.id("day"));
		//Create an object for the select class
		Select dayDropdownOptions = new Select(dayDropdown);
		//use method to select
		dayDropdownOptions.selectByIndex(9); // Index will start from 0. so Day 10 will be selected)

		
		//Select the value from Month dropDown
		
		WebElement monthDropdown = driver.findElement(By.id("month"));
		Select monthDropdownOptions=new Select(monthDropdown);
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		monthDropdownOptions.selectByValue("4");
		
		//Select the value from Month dropDown
		
		WebElement yearDropdown = driver.findElement(By.id("year"));
		Select yearDropdownOption=new Select(yearDropdown);
		yearDropdownOption.selectByVisibleText("1989");
		}

}
