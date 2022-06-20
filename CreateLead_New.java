package week6.Day2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

public class CreateLead_New extends Assignment_BaseClass {
	@Test
	public void CrtLead(){
		
		driver.findElement(By.xpath("//a[text()='Leads']")).click();
		driver.findElement(By.xpath("//a[text()='Create Lead']")).click();
		driver.findElement(By.id("createLeadForm_companyName")).sendKeys("Hp");
		driver.findElement(By.xpath("//input[@id='createLeadForm_firstName']")).sendKeys("Mounika");
		driver.findElement(By.xpath("//input[@id='createLeadForm_lastName']")).sendKeys("E");
		driver.findElement(By.xpath("//input[@id='createLeadForm_departmentName']")).sendKeys("SwQuality");
		driver.findElement(By.xpath("//textarea[@id='createLeadForm_description']")).sendKeys("create contact");
		driver.findElement(By.xpath("//input[@id='createLeadForm_primaryEmail']")).sendKeys("kmounika9618@gmail.com");
		driver.findElement(By.xpath("//input[@id='createLeadForm_primaryPhoneNumber']")).sendKeys("9090909090");

		WebElement eleCountry= driver.findElement(By.xpath("//select[@id='createLeadForm_generalStateProvinceGeoId']"));
		Select country = new Select(eleCountry);
		country.selectByVisibleText("New York");
		
		driver.findElement(By.xpath("//input[@class='smallSubmit']")).click();
		System.out.println("success");	
	}
}
