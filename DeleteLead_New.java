package week6.Day2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class DeleteLead_New extends Assignment_BaseClass{
	@Test
	public void DeletLead() throws InterruptedException {
		Thread.sleep(500);
		//click on leads
		driver.findElement(By.linkText("Leads")).click();

		//Click on Find leads
		driver.findElement(By.linkText("Find Leads")).click();

		//Click on Phone
		driver.findElement(By.xpath("//span[text()='Phone']")).click();

		//	Enter phone number
		driver.findElement(By.xpath("//input[@name='phoneNumber']")).sendKeys("9090909090");

		//	Click on find leads
		driver.findElement(By.xpath("//button[text()='Find Leads']")).click();
		Thread.sleep(500);
		WebElement eleLeadID = driver.findElement(By.xpath("(//td[@tabindex='0'])[1]//a"));
		String LeadID = eleLeadID.getText();
		System.out.println(LeadID);
		eleLeadID.click();
		//	Click on Delete
		driver.findElement(By.xpath("//a[@class=\"subMenuButtonDangerous\"]")).click();
		//	Click on Find leads
		driver.findElement(By.linkText("Find Leads")).click();
		//	Enter captured lead ID
		driver.findElement(By.name("id")).sendKeys("LeadID");

		//	Click on find leads 
		driver.findElement(By.xpath("//button[text()='Find Leads']")).click();
		Thread.sleep(500);

		//verification and printing results
		WebElement eleNoRecord = driver.findElement(By.xpath("//div[text()='No records to display']"));
		String noRec = eleNoRecord.getText();
		if(noRec.contains("No records"))
		{
			System.out.println("The record Deleted");
		}
		else {
			System.out.println("No Record Deleted");
		}


	}

}
