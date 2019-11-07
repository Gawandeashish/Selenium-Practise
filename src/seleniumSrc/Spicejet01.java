package seleniumSrc;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class Spicejet01 {
	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "D:\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		//driver.manage().window().maximize();
		driver.get("https://www.spicejet.com");
		
		//Select starting journey
		WebElement from =driver.findElement(By.id("ctl00_mainContent_ddl_originStation1_CTXT"));
		from.clear();
		from.sendKeys("Pune");
		
		//Destination
		WebElement to = driver.findElement(By.id("ctl00_mainContent_ddl_destinationStation1_CTXT"));
		Thread.sleep(1000);
		to.sendKeys("mumb");
		
		
		//Get count of all check boxes
		//System.out.println(" Total check boxes are "+driver.findElements(By.xpath("//input[@type='checkbox']")).size());
		
		List<WebElement> pq = driver.findElements(By.cssSelector(".book"));
		System.out.println(pq.size());
		
		/*for (int i=0; i<=pq.size(); i++) {
			System.out.println(pq.get(i));
		}
		*/
		/*//Check default state of single checkbox
		
		WebElement checkbox = driver.findElement(By.cssSelector("input[id*=friendsandfamily]"));
		Assert.assertFalse(checkbox.isSelected());
		
		//Select the checkbox and check status
		checkbox.click();
		Assert.assertTrue(checkbox.isSelected());*/
		
		
		

		/*//Get count of all radio buttons
		System.out.println(" Total radio button are "+driver.findElements(By.xpath("//input[@type='radio']")).size());
		
		// Check default state of 2nd radio button
		WebElement radiobutton = driver.findElement(By.xpath("//input[@id='ctl00_mainContent_rbtnl_Trip_1']"));
		Assert.assertFalse(radiobutton.isSelected());
		
		// Select the single radio button and check its state
		radiobutton.click();
		Assert.assertTrue(radiobutton.isSelected());*/
		
		//Select current date from calendar
		/*driver.findElement(By.cssSelector("input[id*='mainContent_view_date1']")).click();
		driver.findElement(By.cssSelector("ui-state-default ui-state-highlight ui-state-active")).click();*/
		
		

}
}
