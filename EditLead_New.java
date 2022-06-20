package week6.Day2;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

public class EditLead_New extends Assignment_BaseClass{
	@Test
	public void EditLead() throws InterruptedException {
		Thread.sleep(500);
		//	Click on Leads
		driver.findElement(By.linkText("Leads")).click();

		//	Click on Find leads
		driver.findElement(By.linkText("Find Leads")).click();
		
		// Enter on first name
		driver.findElement(By.xpath("(//input[@name='firstName'])[3]")).sendKeys("Mounika");

		
		//	Click pn Find leads button
		driver.findElement(By.xpath("//button[text()='Find Leads']")).click();
		Thread.sleep(500);
		
		driver.findElement(By.xpath("//div[@class='x-grid3-cell-inner x-grid3-col-partyId']/a")).click();
		Thread.sleep(500);
		
		System.out.println("Page Title: " +driver.getTitle());
		
		// Click on Edit
		driver.findElement(By.linkText("Edit")).click();
		
		//edit by new name
		driver.findElement(By.id("updateLeadForm_companyName")).clear();
		driver.findElement(By.id("updateLeadForm_companyName")).sendKeys("Modified Mounika");
			
		//14 Update
		driver.findElement(By.xpath("//input[@value='Update']")).click();
		
		String newName = driver.findElement(By.id("viewLead_companyName_sp")).getText();
		System.out.println("Updated Co. Name: " +newName);
		
	}

}
