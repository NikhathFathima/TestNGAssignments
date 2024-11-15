package tesngselenium;

import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Assignment53_Test_TimeOut {
	@Test(timeOut = 200)
	public void googleLaunch()
	{
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.google.com");
	}

}
