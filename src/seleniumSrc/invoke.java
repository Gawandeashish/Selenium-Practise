package seleniumSrc;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class invoke {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "D:\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.caktusgroup.com/blog/2017/03/01/opening-external-links-same-tab-or-new/");
		driver.findElement(By.linkText("External links: Open them in a new tab or in the same tab? Why? Any data?")).click();
		Thread.sleep(8000);
		driver.close();

	}

}
