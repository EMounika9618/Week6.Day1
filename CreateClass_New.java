package week6.Day2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

public class CreateClass_New extends Assignment_BaseClass {
	@Test
	public void CreateContact(){
	
		driver.findElement(By.linkText("Contacts")).click(); 
			//Click on Create Contact
		driver.findElement(By.linkText("Create Contact")).click();

		//Enter FirstName 
		driver.findElement(By.id("firstNameField")).sendKeys("Mounika");

		// Enter LastName 
		driver.findElement(By.id("lastNameField")).sendKeys("E");

		// Enter FirstName(Local) 
		driver.findElement(By.id("createContactForm_firstNameLocal")).sendKeys("Mounikaa");

		//  Enter LastName(Local) 
		driver.findElement(By.id("createContactForm_lastNameLocal")).sendKeys("EK");

		//  Enter Department Field 
		driver.findElement(By.id("createContactForm_departmentName")).sendKeys("Quality Testing");

		// Enter Description 
		driver.findElement(By.id("createContactForm_description")).sendKeys("Create my Contact");

		// 1Enter mailid
		driver.findElement(By.id("createContactForm_primaryEmail")).sendKeys("kmounika9618@gmail.com");

		WebElement eleCountry = driver.findElement(By.name("generalStateProvinceGeoId"));
		Select country = new Select(eleCountry);
		country.selectByVisibleText("New York");

		//  Click on Create Contact
		driver.findElement(By.name("submitButton")).click();  

		// Click on edit 
		driver.findElement(By.linkText("Edit")).click(); 

		// Clearing
		driver.findElement(By.id("updateContactForm_description")).clear();

		//filling AGAIN
		driver.findElement(By.id("updateContactForm_importantNote")).sendKeys("created contact");

		// updating
		driver.findElement(By.xpath("//input [@value='Update']")).click(); 

		// title
		System.out.println("Page Title :" +driver.getTitle());
	
	}
}
