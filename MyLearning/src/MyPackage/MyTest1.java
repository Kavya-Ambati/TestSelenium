package MyPackage;

import org.openqa.selenium.*;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class MyTest1
{
	WebDriver driver;

	public void learn() throws InterruptedException
	{
		System.setProperty("webdriver.gecko.driver","C:\\Users\\KavyaAmbatiKavya\\eclipse-workspace\\MyLearning\\driver\\geckodriver.exe");
		driver = new FirefoxDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.get("http://newtours.demoaut.com/");
		Thread.sleep(3000);
		Actions act=new Actions(driver);
		act.sendKeys(Keys.TAB,Keys.TAB,Keys.ENTER).perform();	



	}
	public static void main(String[] args) throws InterruptedException {
		MyTest1 obj=new MyTest1();
		obj.learn();
	}
	

	
	

}
