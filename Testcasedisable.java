package tesngselenium;
import org.testng.annotations.Test;
public class Testcasedisable {
@Test(enabled=false)
public void logout_from_amazon()
{
	System.out.println("logout");
}
@Test(priority=1)
public void login_from_amazon()
{
	System.out.println("logout");
}
@Test(priority=-1)
public void launch_browser()
{
	System.out.println("logout");
}
@Test(priority=0)
public void launch_chrome()
{
	System.out.println("launch_chrome");
}
@Test(timeOut=2000)
public void add_to_wishlist()
{
	System.out.println("add_to_wishlist");
}
}