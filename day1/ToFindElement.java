package week2.day1;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class ToFindElement {

	public static void main(String[] args) throws InterruptedException {
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://leaftaps.com/opentaps/control/main");
		
        driver.findElement(By.id("username")).sendKeys("DemoSalesManager");
        Thread.sleep(3000);
        
        driver.findElement(By.id("password")).sendKeys("crmsfa");
        Thread.sleep(3000);
        
        driver.findElement(By.className("decorativeSubmit")).click();
        Thread.sleep(3000);
        //driver.close();
		

	}

}
