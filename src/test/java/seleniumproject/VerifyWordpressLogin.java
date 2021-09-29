package seleniumproject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import seleniumproject.Loginpage;

/**
 * @author Mukesh_50
 *
 */
public class VerifyWordpressLogin {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver",
				"C:\\\\\\\\Users\\\\\\\\abishekr\\\\\\\\eclipse-workspace_selenium\\\\\\\\seleniumproject\\\\\\\\drivers\\\\\\\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://opensource-demo.orangehrmlive.com/");
		Loginpage login = new Loginpage(driver);
		login.typeUserName("Admin");
		Thread.sleep(2000);
		login.typePassword("admin123");
		Thread.sleep(2000);
		login.clickOnLoginButton();
		driver.quit();
	}
}
