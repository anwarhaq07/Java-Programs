package Selenium1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class facebookSignup {
	
	public static void main(String[] args) {
		// System.setProperty("webdriver.gecko.driver","/Users/anwarulhaqmohammed/Downloads/geckodriver");
		WebDriver driver;
		System.setProperty("webdriver.chrome.driver","/Users/anwarulhaqmohammed/Desktop/chromedriver");
		
		
		
		driver = new ChromeDriver();
		driver.get("https://www.facebook.com/");
		driver.findElement(By.name("firstname")).sendKeys("Anwar");
		driver.findElement(By.name("lastname")).sendKeys("Mohammed");
		driver.findElement(By.name("reg_email__")).sendKeys("5103962459");
		driver.findElement(By.name("reg_passwd__")).sendKeys("Anwar@123");
		Select dropdown = new Select(driver.findElement(By.name("birthday_month")));
		dropdown.selectByVisibleText("Jun");
		Select date = new Select(driver.findElement(By.name("birthday_day")));
		date.selectByIndex(11);
		Select year = new Select(driver.findElement(By.name("birthday_year")));
		year.selectByVisibleText("1991");
		WebElement radio1 = driver.findElement(By.xpath("//*[@id=\"u_0_a\"]"));
		radio1.click();
		driver.findElement(By.name("websubmit")).click();
		

	}
}