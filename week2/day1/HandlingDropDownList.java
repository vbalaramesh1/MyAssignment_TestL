package week2.day1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class HandlingDropDownList {

	public static void main(String[] args) throws InterruptedException {
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://leaftaps.com/opentaps/control/main");

		driver.findElement(By.id("username")).sendKeys("DemoSalesManager");
		Thread.sleep(1000);

		driver.findElement(By.id("password")).sendKeys("crmsfa");
		Thread.sleep(1000);

		driver.findElement(By.className("decorativeSubmit")).click();
		Thread.sleep(1000);

		//driver.findElement(By.linkText("CRM/SFA")).click();

		driver.findElement(By.partialLinkText("CRM")).click(); //CRM/SFA
		
		Thread.sleep(2000);
		
		driver.findElement(By.linkText("Create Lead")).click(); // all <a href .... tags, we can go with linkText() locator
		Thread.sleep(1000);

		driver.findElement(By.id("createLeadForm_companyName")).sendKeys("Cognizant");
		driver.findElement(By.id("createLeadForm_firstName")).sendKeys("Ramesh");
		
		//To handled dropdown options
		
		WebElement sourceDropDown = driver.findElement(By.id("createLeadForm_dataSourceId"));
		
		Select select_sourceDropDown = new Select(sourceDropDown);
		select_sourceDropDown.selectByIndex(1); // By Index
		Thread.sleep(100);
		select_sourceDropDown.selectByValue("LEAD_EXISTCUST"); // By Value
		Thread.sleep(100);
		select_sourceDropDown.selectByVisibleText("Word of Mouth"); // By visible Text
		
		
		WebElement industryDropDown = driver.findElement(By.id("createLeadForm_industryEnumId"));
		Select select_industryDropDown = new Select(industryDropDown);
		select_industryDropDown.selectByIndex(4);
		
		driver.findElement(By.id("createLeadForm_lastName")).sendKeys("Bala");
		
		WebElement marketingCampaignDropdown = driver.findElement(By.id("createLeadForm_marketingCampaignId"));
		Select select_marketingCampaignDropdown = new Select(marketingCampaignDropdown);
		select_marketingCampaignDropdown.selectByValue("CATRQ_CAMPAIGNS");
		Thread.sleep(1000);
		
		driver.findElement(By.name("submitButton")).click();
		Thread.sleep(3000);
		
		System.out.println("Working successfully");
		driver.close();

	}

}
