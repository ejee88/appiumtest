package test;

import org.testng.Assert;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.Test;

public class day1 {

	@AfterTest
	public void lastexecute()
	{
		System.out.println("I will execute last");
	
	}
	
	@Test
	public void Demo() {
		System.out.println("hello"); //automation 
		Assert.assertTrue(false); //리스너 실패 메시지 확인용
	}

	@AfterSuite
	public void Afsuite() 
	{
		System.out.println("I am the  no 1 from last" );
	}
	
	@Test
	public void SecondTest() {
		System.out.println("Bye");
	}
}
