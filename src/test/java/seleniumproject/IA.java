package seleniumproject;

import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
//import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
//import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class IA {
	WebDriver driver;

	/**
	* This function will execute before each Test tag in testng.xml
	* @param browser
	* @throws Exception
	*/
	@BeforeTest
	@Parameters("browser")
	public void setup(String browser) throws Exception{
	//Check if parameter passed from TestNG is 'firefox'
	if(browser.equalsIgnoreCase("firefox")){
	//create firefox instance
	System.setProperty("webdriver.gecko.driver","C:\\\\Users\\\\abishekr\\\\eclipse-workspace_selenium\\\\seleniumproject\\\\drivers\\\\geckodriver.exe");
	driver = new FirefoxDriver();
	}

	//Check if parameter passed as 'chrome'
	else if (browser.equalsIgnoreCase("chrome")){
	//set path to chromedriver.exe
	System.setProperty("webdriver.chrome.driver","C:\\\\Users\\\\abishekr\\\\eclipse-workspace_selenium\\\\seleniumproject\\\\drivers\\\\chromedriver.exe");
	driver = new ChromeDriver();

	}
	else{
	//If no browser passed throw exception
	throw new Exception("Browser is not correct");
	}
	driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	}

	@Test
	public void testParameterWithXML() throws InterruptedException{
	driver.get("https://www.saucedemo.com/");
	
	if(driver.findElement(By.xpath("//body/div[@id='wrapper']/div[@id='content']/div[@id='divLogin']/div[@id='divLogo']/img[1]")).isDisplayed())
	{
	System.out.println("Image is present");
	}
	else {
	System.out.println("Image is not present");
	}
	
	WebElement uname = driver.findElement(By.id("User-name"));
	uname.sendKeys("standard_user");
	Thread.sleep(2000);
	WebElement passwd = driver.findElement(By.id("Password"));
	passwd.sendKeys("secret_sauce");
	WebElement submit = driver.findElement(By.id("login-button"));
	submit.click();
	
	WebElement Hclass = driver.findElement(By.cssSelector("div.page_wrapper div:nth-child(1) div.header_container:nth-child(1) div.primary_header div.header_label:nth-child(2) > div.app_logo"));
	Hclass.click();
	Thread.sleep(2000);
	driver.findElement(By.xpath("//div[@id='']")).click();
	Thread.sleep(2000);
	
	driver.findElement(By.xpath("//button[@id='add-to-cart-sauce-labs-backpack']")).click();
	Thread.sleep(2000);
	
	driver.findElement(By.cssSelector("div.page_wrapper div:nth-child(1) div.header_container:nth-child(1) div.primary_header div.shopping_cart_container:nth-child(3) > a.shopping_cart_link")).click();
	Thread.sleep(2000);
	
	driver.findElement(By.xpath("//button[@id='checkout']")).click();
	Thread.sleep(2000);
	
	WebElement Fclass = driver.findElement(By.id("first-name"));
	Fclass.sendKeys("Abi");
	Thread.sleep(2000);

	WebElement Lclass = driver.findElement(By.id("last-name"));
	Lclass.sendKeys("R");
	Thread.sleep(2000);

	WebElement Zcode = driver.findElement(By.id("postal-code"));
	Zcode.sendKeys("600080");
	Thread.sleep(2000);

	driver.findElement(By.id("continue")).click();
	Thread.sleep(2000);
	
	driver.findElement(By.xpath("//button[@id='finish']")).click();
	Thread.sleep(2000);
	
	driver.findElement(By.id("back-to-products")).click();
	Thread.sleep(2000);
	
	driver.findElement(By.xpath("//a[@id='logout_sidebar_link']")).click();
	Thread.sleep(2000);
	
	
	}

}
