package seleniumSrc;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class spiceJet {
	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "D:\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		//driver.manage().window().maximize();
		driver.get("https://www.spicejet.com");
		
		// Entering pune location
		WebElement from =driver.findElement(By.id("ctl00_mainContent_ddl_originStation1_CTXT"));
		from.clear();
		from.sendKeys("Pune");
		from.sendKeys(Keys.ENTER);
		
		//Entering Munmbai as Destination
		WebElement to = driver.findElement(By.id("ctl00_mainContent_ddl_destinationStation1_CTXT"));
		Thread.sleep(1000);
		to.sendKeys("mumb");
		
		//Verify if the user is able to select single Checkbox or not
		WebElement checkbox1 = driver.findElement(By.cssSelector("input[id*='friendsandfamily']"));
		//System.out.println("Default status of check box is "+checkbox1.isSelected());
		checkbox1.click();
		Assert.assertTrue(checkbox1.isSelected());
		
		//Verify if the user is able to select multiple checkbox or not
		List<WebElement> checkbox = driver.findElements(By.xpath("//input[@type='checkbox']"));
		
		for(int i=0; i<checkbox.size();i++) {
			System.out.println(checkbox.size());
			Thread.sleep(2000);
			checkbox.get(i).click();
			Assert.assertTrue(checkbox.get(i).isSelected());
		}
		/*//System.out.println("After selecting checkbox "+checkbox1.isSelected());
		System.out.println(" Total check boxes are "+driver.findElements(By.xpath("//input[@type='checkbox']")).size());
		System.out.println(" Total radio button are "+driver.findElements(By.xpath("//input[@type='radio']")).size());
		
		//System.out.println(driver.findElement(By.xpath("//input[@type='radio']")).getAttribute("name").valueOf());
*/		

		driver.close();
}
}
