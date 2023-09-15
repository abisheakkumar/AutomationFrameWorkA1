package practise;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BrowserLaunch {
	public static void main(String[] args) {
//		String key="webdriver.chrome.driver";
//		String value="./src/main/resources/msedgedriver.exe";
//		System.setProperty(key, value);
//		WebDriver driver=new EdgeDriver();
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.manage().window().fullscreen();
		driver.get("https://www.twitter.com/");
		/*String title=driver.getTitle();
		System.out.println(title);
		String url=driver.getCurrentUrl();
		System.out.println(url);
		driver.navigate().to("https://www.facebook.com/");
		driver.navigate().back();
		driver.navigate().forward();
		driver.manage().window().minimize();
		*/
		String title=driver.getTitle();
		System.out.println(title);
		String url=driver.getCurrentUrl();
		System.out.println(url);
		driver.navigate().to("https://www.facebook.com/");
		driver.navigate().back();
		driver.navigate().forward();
		driver.manage().window().minimize();
		driver.quit();
		
		/*
		 * get()
		 * getTitle()
		 * getCurrentUrl()
		 * getPageSource()
		 * getWindowHandle()
		 * getWindowHandles()
		 * close()
		 * quit()
		 * switchTo()
		 * navigate()
		 * manage()
		 * 
		 */
		
		
		
	}
}
