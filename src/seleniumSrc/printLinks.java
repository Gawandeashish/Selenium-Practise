package seleniumSrc;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class printLinks {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "D:\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://www.qaclickacademy.com/practice.php");
		
		// Print all links present on the page
		System.out.println(driver.findElements(By.tagName("a")).size());
		
		//Print all links present in footer section only
		
		WebElement footer = driver.findElement(By.id("gf-BIG"));
		System.out.println(footer.findElements(By.tagName("a")).size());
		
		// get the link count of first column only
		
		WebElement column = driver.findElement(By.xpath("//table/tbody/tr/td[1]/ul"));
		System.out.println(column.findElements(By.tagName("a")).size());
		
		// click on each link in the column and check if the pages are opening
		for(int i=1; i<column.findElements(By.tagName("a")).size(); i++) {
			String openNew = Keys.chord(Keys.CONTROL, Keys.ENTER);
			column.findElements(By.tagName("a")).get(i).sendKeys(openNew);
			}
		Set<String> ids = driver.getWindowHandles();
		Iterator<String> it =ids.iterator();
		 while(it.hasNext()) {
			 driver.switchTo().window(it.next());
			 System.out.println(driver.getTitle());
		 }
		
		

	}

}
