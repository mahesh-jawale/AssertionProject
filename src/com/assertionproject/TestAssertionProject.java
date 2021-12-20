package com.assertionproject;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class TestAssertionProject extends AssertionProject {
	
	@BeforeClass
	public void beforeTest()
	{
		System.out.println(System.getProperty("user.dir"));
		this.initializeWebEnvironment();
	}
	
	@Test(priority=1) 
	public void assertEqualsTest()
	{
		String strExpected="MEN";
		assertEqualsMethod(strExpected);
		
	}
	
	@Test(priority=2) 
	public void assertNotEqualsTest()
	{
		String strExpected="Men";
		assertNotEqualsMethod(strExpected);
		
	}
	
	@Test(priority=3) 
	public void assertNullTest()
	{
		String strNull=null;
		assertNullMethod(strNull);
		
	}
	
	@Test(priority=4) 
	public void assertNotNullTest()
	{
		String strValue="mahesh";
		assertNotNullMethod(strValue);
		
	}
	
	@Test(priority=5) 
	public void assertTrueTest()
	{
		String strValue="MEN";
		assertTrueMethod(strValue);
		
	}
	@Test(priority=6) 
	public void assertFalseTest()
	{
		String strValue="Men";
		assertFalseMethod(strValue);
		
	}
	
	

}
