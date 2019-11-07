package seleniumSrc;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class seleniumEasy {

	public static void main(String[] args) throws Throwable {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "D:\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.seleniumeasy.com/test/basic-checkbox-demo.html");
		/*List<WebElement> checkBox = driver.findElements(By.xpath("//div[@class='checkbox']"));
		System.out.println(checkBox.size());*/
		List<WebElement> ele = driver.findElements(By.xpath("//input[@type='checkbox']"));
		System.out.println(ele.size());
		//driver.findElement(By.xpath("//input[@type='checkbox']")).click();
		for(int i=1; i<ele.size(); i++) {
			System.out.println(ele.get(i));
			ele.get(i).click();
		}
		
		System.out.println("sssssssss");
//		driver.quit();
	}

}
