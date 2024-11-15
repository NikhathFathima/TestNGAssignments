package tesngselenium;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class Assignment53_GoogleSearch_DataProvider {
	@DataProvider(name="Set1")
	public Object[][] method1()
	{
		return new Object[][] {{"Inida"},{"Shrilanka"},{"USA"},{"Africa"} };
	}
	
	@Test(dataProvider="Set1")
	public void googleSearch(String input)
	{
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.google.com");
		driver.manage().window().maximize();
		driver.findElement(By.name("q")).sendKeys(input);
		driver.findElement(By.name("q")).sendKeys(Keys.ENTER);
	}
}
