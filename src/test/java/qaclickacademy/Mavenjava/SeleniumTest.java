package qaclickacademy.Mavenjava;

import org.testng.annotations.Test;

public class SeleniumTest {

	@Test(groups= {"Smoke"})
	public void BrowserAutomation()
	{
		System.out.println("Browser Automation");
	}
	@Test
	public void ElementsUI()
	{
		System.out.println("Elements UI");
	}
}
