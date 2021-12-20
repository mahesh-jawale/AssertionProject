package com.assertionproject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class AssertionProject {
	WebDriver driver=null;
	public void assertEqualsMethod(String strExpected)
	{
		
		String strActual=getDriver().findElement(By.xpath("//div[@class='desktop-navLink']/a")).getText();
		Assert.assertEquals(strActual,strExpected);
	}
	
	public void assertNotEqualsMethod(String strExpected)
	{
		
		String strActual=getDriver().findElement(By.xpath("//div[@class='desktop-navLink']/a")).getText();
		Assert.assertNotEquals(strActual,strExpected);
	}
	
	public void assertNullMethod(String strNull)
	{
		Assert.assertNull(strNull);
	}
	public void assertNotNullMethod(String strValue)
	{
		Assert.assertNotNull(strValue);
	}
	public void assertTrueMethod(String strValue)
	{
		String strActual=getDriver().findElement(By.xpath("//div[@class='desktop-navLink']/a")).getText();
		Assert.assertTrue(strActual.equals(strValue));
	}
	public void assertFalseMethod(String strValue)
	{
		String strActual=getDriver().findElement(By.xpath("//div[@class='desktop-navLink']/a")).getText();
		Assert.assertFalse(strActual.equals(strValue));
	}
	
	
	
	public void initializeWebEnvironment()
	{
		System.setProperty("webdriver.chrome.driver",System.getProperty("user.dir")+"/ExternalResources/Drivers/chromedriver.exe");
		driver=new ChromeDriver();
		getDriver().get("https://www.myntra.com/");
	}
	
	public WebDriver getDriver()
	{
		return driver;
	}
	
	

}
