package practise;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class XpathPractise {
	public static void main(String[] args) throws Throwable{
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.goibibo.com/");
		Thread.sleep(3000);
		driver.findElement(By.xpath("//span[@class='logSprite icClose']")).click();
		driver.findElement(By.xpath("//span[.='Departure']")).click();
		driver.findElement(By.xpath("//div[@class='DayPicker-Caption']/div[.='September 2023']/ancestor::div[@class='DayPicker-Month']/div[@class='DayPicker-Body']//p[.='25']")).click();
		
	}
}
