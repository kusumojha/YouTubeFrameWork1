package org.testing.testScripts;
import org.testing.base.BaseClass;
import org.openqa.selenium.By;
import org.testng.annotations.Test;

public class TC5 extends BaseClass
{
	@Test
	public void History() throws InterruptedException
	{
		Thread.sleep(3000);
		driver.findElement(By.xpath("//yt-formatted-string[@class='style-scope ytd-button-renderer style-suggestive size-small']")).click();//for signin
		driver.findElement(By.xpath("//input[@type='email']")).sendKeys("dummy.java695");
		driver.findElement(By.xpath("//span[@class='RveJvd snByac']")).click();
		
		Thread.sleep(1000);
		driver.findElement(By.xpath("//input[@type='password']")).sendKeys("Dummy@123");
		driver.findElement(By.xpath("//span[@class='RveJvd snByac']")).click();
		
		Thread.sleep(3000);
		driver.findElement(By.xpath("//yt-formatted-string[text()='History']")).click();
	}

}
