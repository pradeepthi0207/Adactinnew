package com.TestNG.TestNGProject;

import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Ignore;
import org.testng.annotations.Test;

public class Annotations {
	
	

	@Test (dependsOnMethods="test3")
	private void test1()
	{
		System.out.println("Test1");
	}
	@Test (enabled=false)
	private void test2()
	{
		System.out.println("Test2");
	}
	
	@Test (priority=1)
	private void test3()
	{
		System.out.println("Test3");
	}
	
	@Test (priority=-1)
	private void test4()
	{
		System.out.println("Test4");
	}
	
	@Test (groups="spi")
	private void test5()
	{
		System.out.println("spi");
	}
	
	@Test (groups= "inox")
	private void test6()
	{
		System.out.println("inox");
	}
	
}
