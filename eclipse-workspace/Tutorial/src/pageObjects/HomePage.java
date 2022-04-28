package pageObjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;

public class HomePage {
	//1. Is to call the driver object from testcase to pageObject file
	//�μ��� �����ڸ� ���� - concatenate driver
	public HomePage(AppiumDriver driver)
	{
		PageFactory.initElements(new AppiumFieldDecorator(driver), this);
	}
	@AndroidFindBy(xpath="//android.widget.TextView[@text= 'Preference']")
	public WebElement Preference;
	//findElementByXpath("//android.widget.TextView[@text= 'Preference']"); �� ����
	
}
