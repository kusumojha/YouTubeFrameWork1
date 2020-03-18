package org.testing.base;




import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;



public class BaseClass 
{
	public ChromeDriver driver;
	@BeforeMethod
	public void browseLaunch()
	{ 
		
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\admin\\Desktop\\java\\chromedriver.exe");
        driver=new ChromeDriver();
		driver.get("https://www.youtube.com");
		driver.manage().window().maximize();
	}
	@AfterMethod
	public void logout() throws InterruptedException
	{
		
		Thread.sleep(3000);
		driver.findElement(By.xpath("//img[@id='img']")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//yt-formatted-string[text()='Sign out']")).click();
	    driver.quit();
	}

}
