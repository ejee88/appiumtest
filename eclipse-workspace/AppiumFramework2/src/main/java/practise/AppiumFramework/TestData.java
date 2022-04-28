package practise.AppiumFramework;

import org.testng.annotations.DataProvider;

public class TestData {
	@DataProvider(name="InputData")
	public Object[][] getDataforEditField()
		{
			//2sets of data, "hello" , "!@#$"
			Object[][] obj = new Object[][]
					{
						{"Hello"}, {"!@#$"}
					};
				return obj;
		}
}
