package test;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class day4 {

	@Parameters({"URL"})
	@Test
	public void WebloginHomeLoan(String uname)
	{
		//selinium
		System.out.println("Web Login Home Personal loan ");
		System.out.println(uname);
	}
	
	@Test(groups= {"Smoke"})
	public void MobileloginHomeLoan()
	{
		//appium
		System.out.println("Mobile Login Home");
	}
	
	@Test
	public void LoginAPIHomeLoan()
	{
		//Rest API automation
		System.out.println("API Login Home");
	}
}
