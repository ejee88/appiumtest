package test;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class day3 {
@BeforeClass
public void beforeclass() 
{
	System.out.println("Before executing any methods in the class");
}
	
	@Parameters({"URL", "APIKey/usrname"})
	@Test
	public void WebloginCarLoan(String urlname, String key)
	{
		//selinium
		System.out.println("Web Login Car");
		System.out.println(urlname);
		System.out.println(key);
	}
	
	@BeforeMethod
	public void beforeevery () 
	{
		System.out.println("I will execute before every test method in day 3 class.");
	}
	
	@AfterMethod
	public void afterevery () 
	{
		System.out.println("I will execute after every test method in day 3 class.");
	}
	
	@AfterClass
	public void afterclass() 
	{
		System.out.println("After executing all methods in the class");
	}
		
	
	@Test(groups= {"Smoke"})
	public void MobileloginCarLoan()
	{
		//appium
		System.out.println("Mobile Login Car");
	}

	@BeforeSuite
	public void Bfsuite() 
	{
		System.out.println("I am no 1. ");
	}
	
	
	@Test(enabled = false)
	public void MobilesigninCarLoan()
	{
		//appium
		System.out.println("Mobile Sign in Car");
	}
	
	@Test(dataProvider="getData")
	public void MobilesignoutCarLoan(String username, String password)
	{
		//appium
		System.out.println("Mobile Sign Out Car");
		System.out.println(username);
		System.out.println(password);
	}
	
	
	@Test(dependsOnMethods= {"WebloginCarLoan"})
	public void LoginAPICarLoan()
	{
		//Rest API automation
		System.out.println("API Login Car");
	}
	@DataProvider
	public Object[][] getData()
	{
		//1st combination - username, password - good credit history
		//2nd - username password - no credit history
		// 3rd -  fraudelent credit history 
		Object[][] data = new Object[3][2];
		//1st set
		data[0][0] = "firstSetUsername";
		data[0][1] = "password";
		//columns in the row are nothing but values for that particular combination(row)
		
		//2nd set
		data[1][0] = "secondSetUsername";
		data[1][1] = "secondPassword";
		
		//3rd set
		data[2][0] = "thirdSetUsername";
		data[2][1] = "thirdPassword";
		return data;

	}
	
}
