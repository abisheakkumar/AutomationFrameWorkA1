package practise;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

public class LaunchingBrowser {
	@Test
	public void launchingBrowser() throws Throwable{
		
		
//		String key="webdriver.chrome.driver";
//		String value="src/main/resources/chromedriver.exe";
//		System.setProperty(key, value);
		
		WebDriver driver=new ChromeDriver();
		driver.get("http:localhost:8888/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.findElement(By.name("user_name")).sendKeys("admin");
		driver.findElement(By.name("user_password")).sendKeys("admin");
		driver.findElement(By.id("submitButton")).click();
		driver.findElement(By.linkText("Organizations")).click();
		driver.findElement(By.xpath("//img[@alt='Create Organization...']")).click();
		driver.findElement(By.name("accountname")).sendKeys("saraswathiAbisheak");
		
		WebElement ele1=driver.findElement(By.name("industry"));
		
		Select sel1=new Select(ele1);
		sel1.selectByValue("Communications");
		
		driver.findElement(By.id("phone")).sendKeys("654654654");
		driver.findElement(By.id("email1")).sendKeys("abc@gmail.com");
		
		WebElement ele2=driver.findElement(By.xpath("(//input[@title='Save [Alt+S]'])[2]"));
		
		JavascriptExecutor js=(JavascriptExecutor)driver;
		js.executeScript("arguments[0].scrollIntoView()", ele2);
		
		ele2.click();
		
		Thread.sleep(3000);
		WebElement ele3=driver.findElement(By.xpath("//img[@src='themes/softed/images/user.PNG']"));
		
		WebDriverWait wait=new WebDriverWait(driver,Duration.ofSeconds(10));
		wait.until(ExpectedConditions.elementToBeClickable(ele3));
		ele3.click();
		driver.findElement(By.xpath("//a[text()='Sign Out']")).click();
		
		driver.quit();
		
	}
	
	@Test
	public void abisaras()
	{
		System.out.println("saraswathi loves abisheak");
	}
}
