package seleniumproject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
//import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Sample {

//public static void main(String args[]) throws InterruptedException
//{
	@Test
	public void mavsel() throws InterruptedException {
		// System.setProperty("webdriver.chrome.driver","C:\\Users\\abishekr\\eclipse-workspace_selenium\\seleniumproject\\drivers\\chromedriver.exe");
		// System.setProperty("webdriver.gecko.driver","C:\\Users\\abishekr\\eclipse-workspace_selenium\\seleniumproject\\drivers\\geckodriver.exe");

		WebDriverManager.chromedriver().setup();
//WebDriver driver = new FirefoxDriver();
		WebDriver driver = new ChromeDriver();
		driver.get("https://opensource-demo.orangehrmlive.com/");
		Thread.sleep(100);
		WebElement element = driver.findElement(By.name("txtUsername"));
		element.sendKeys("Admin");
		Thread.sleep(100);
		driver.findElement(By.name("txtPassword")).sendKeys("admin123");
		Thread.sleep(100);
//pass.sendKeys("admin123");

//driver.findElement(By.className("txtPassword")).sendKeys("admin123");
		driver.findElement(By.name("Submit")).click();
		WebElement wel = driver.findElement(By.id("welcome"));
		wel.click();
//driver.findElement(By.cssSelector())

//driver.quit();

	}

}