package tesngselenium;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Testcase4 {
	@Test
	public void testcase5()
	{
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.youtube.com/");
		driver.manage().window().maximize();
		WebElement txtBoxSearch = driver.findElement(By.name("search_query")); 
		// Que - not able to send text using id locator
//		WebElement txtBoxSearch = driver.findElement(By.id("search")); 
		txtBoxSearch.sendKeys("Growtech Minds");
		txtBoxSearch.sendKeys(Keys.ENTER);
		System.out.println("login to amazon-->searching a product==adding it to wishlist");
	}
	
	
@BeforeMethod
public void prerequisites()//precondition
{
	ChromeDriver driver = new ChromeDriver();
	driver.get("https://www.amazon.in");
    driver.manage().window().maximize();
  WebElement e1=  driver.findElement(By.xpath("//a[.='About Amazon']"));
Point p1=   e1.getLocation();
int x= p1.getX();
int y=p1.getY();
System.out.println(x);
System.out.println(y);
	JavascriptExecutor js=driver;
	js.executeScript("window.scrollBy(0,"+y+")");
	
	System.out.println("launching the browser");
}
@Test
public void testcase6()
{
	ChromeDriver driver = new ChromeDriver();
	driver.manage().window().maximize();
	
	driver.get("https://www.amezon.in");
	WebElement txtBox_search = driver.findElement(By.id("twotabsearchtextbox"));
	txtBox_search.sendKeys("Shoes"+Keys.ENTER);
	WebElement shoe1st = driver.findElement(By.xpath("(//div[@class='a-section aok-relative s-image-tall-aspect'])[1]"));
	shoe1st.click();
	Set<String> s1 = driver.getWindowHandles();
	Iterator<String> is1 = s1.iterator();
	String parentID = is1.next();
	String childID = is1.next();
	
	driver.switchTo().window(childID);
	
	WebElement btn_wishList = driver.findElement(By.id("wishListMainButton"));
	btn_wishList.click();
	System.out.println("login to amazon--->searching a product");
}
@AfterMethod
public void closingbrowser() throws InterruptedException
{
	ChromeDriver driver=new ChromeDriver();
	driver.get("https://www.google.co.in/");
	Thread.sleep(5000);
	//driver.manage().window().maximize();
	driver.manage().window().minimize();
	//Thread.sleep(2000);
	//driver.close();
	System.out.println(driver.getWindowHandle());
	System.out.println(driver.getWindowHandles());
	System.out.println("closing my browser");
}
}
