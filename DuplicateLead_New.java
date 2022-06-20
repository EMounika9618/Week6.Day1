package week6.Day2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class DuplicateLead_New extends Assignment_BaseClass {
	@Test
	public void DupliLead() throws InterruptedException {
		Thread.sleep(500);
		//	Click Leads
		driver.findElement(By.linkText("Leads")).click();

		//Click Find leads
		driver.findElement(By.linkText("Find Leads")).click();

		// Click on Email
		driver.findElement(By.xpath("//span[text()='Email']")).click();
		driver.findElement(By.name("emailAddress")).sendKeys("kmounika9618@gmail.com");

		driver.findElement(By.xpath("//button[text()='Find Leads']")).click();
		Thread.sleep(500);

		//Capture name of First Resulting lead
		WebElement eleName = driver.findElement(By.xpath("//a[text()='Mounika']"));
		String name = eleName.getText();
		System.out.println("Captured Name: " +name);

		//	Click First Resulting lead
		driver.findElement(By.xpath("//a[text()='Mounika']")).click();

		driver.findElement(By.linkText("Duplicate Lead")).click();

		System.out.println("Page Title: " +driver.getTitle());

		//Click Create Lead
		driver.findElement(By.name("submitButton")).click();

		//verifyig
		WebElement eleDupLead =driver.findElement(By.id("viewLead_firstName_sp"));
		String dupLead = eleDupLead.getText();
		System.out.println("Captured Duplicated Lead: " +dupLead);

		if (dupLead.equals(name)){
			System.out.println("Duplicate Lead is created successfully");
		}
		else {
			System.out.println("Not a Duplicate Lead");	
		}

	}


}
