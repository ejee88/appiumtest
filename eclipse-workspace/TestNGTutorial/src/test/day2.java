package test;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class day2 {
	@Test(groups= {"Smoke"})
	public void Demo() 
	{
		System.out.println("Good"); //automation 
	}
	
	@BeforeTest
	public void prerequiste() 
	{
		System.out.println("I will execute first.");
	}
}
