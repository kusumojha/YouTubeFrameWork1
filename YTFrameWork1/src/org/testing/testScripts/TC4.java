package org.testing.testScripts;
import org.testing.base.BaseClass;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class TC4 extends BaseClass
{
	@Test
	public void videoplay_subscribe() throws InterruptedException
	{
		driver.findElement(By.xpath("//yt-formatted-string[@class='style-scope ytd-button-renderer style-suggestive size-small']")).click();//for signin
		driver.findElement(By.xpath("//input[@type='email']")).sendKeys("dummy.java695");
		driver.findElement(By.xpath("//span[@class='RveJvd snByac']")).click();//username
		
		Thread.sleep(1000);
		driver.findElement(By.xpath("//input[@type='password']")).sendKeys("Dummy@123");
		driver.findElement(By.xpath("//span[@class='RveJvd snByac']")).click();//pwd
		
		Thread.sleep(3000);
		List<WebElement> ls=driver.findElements(By.id("video-title"));//play video
		System.out.println("total video"+ls.size());
		ls.get(6).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//yt-formatted-string[text()='Subscribe']")).click();
	}

}
