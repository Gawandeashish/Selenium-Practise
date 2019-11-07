package seleniumSrc;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class actionDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver", "D:\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.amazon.in");
		Actions a = new Actions(driver);
		WebElement mouseHover = driver.findElement(By.id("nav-link-accountList"));
		
		//enter shift characters in Search field
		a.moveToElement(driver.findElement(By.id("twotabsearchtextbox"))).click().keyDown(Keys.SHIFT).sendKeys("ashish").doubleClick().build().perform();
		
		//mouse hover
		a.moveToElement(mouseHover).contextClick().build().perform();
		System.out.println("success");

	}

}
