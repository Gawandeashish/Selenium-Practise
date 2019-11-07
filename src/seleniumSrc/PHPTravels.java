package seleniumSrc;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class PHPTravels {
	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "D:\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://phptravels.com/demo/");
		//WebElement header = driver.findElement(By.id("ShopifyMainNav"));
//		WebElement header =driver.findElement(By.xpath("//ul[@class='marketing-nav__items marketing-nav__user display--expanded-nav'][2]"));
		List<WebElement> header1 = driver.findElements(By.xpath("//div[@class='resource-box']"));
		for(int i=0; i<header1.size(); i++) {
		System.out.println(header1.get(i).getAttribute("class"));
		}
		driver.close();

}
}
