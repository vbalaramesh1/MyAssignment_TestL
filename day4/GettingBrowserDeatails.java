package week1.day4;

import org.openqa.selenium.chrome.ChromeDriver;

public class GettingBrowserDeatails {

	public static void main(String[] args) throws InterruptedException {
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://leaftaps.com/opentaps/control/main");
		Thread.sleep(3000);
		
		String title = driver.getTitle();
		String url = driver.getCurrentUrl();
		System.out.println("Browser Title: "+title);
		System.out.println("Application URL: "+url);
		Thread.sleep(3000);
		driver.close();

	}

}
