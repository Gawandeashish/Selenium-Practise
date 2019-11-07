package seleniumSrc;

import java.util.Arrays;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AddToCart {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "D:\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://rahulshettyacademy.com/seleniumPractise/#/");
		
		String[] itemnames = {"Cucumber","Brocolli","Beetroot"};
		
		List<WebElement> products = driver.findElements(By.cssSelector("h4.product-name"));
		Thread.sleep(3000);
		for(int i=0; i<products.size(); i++) {
			
			List items = Arrays.asList(itemnames);
			
			String[] name = products.get(i).getText().split("-");
			String formattedName = name[0].trim();
			
			int j=0;
			if(items.contains(formattedName)) {
				j++;
				List<WebElement> addproduct = driver.findElements(By.xpath("//div[@class='product-action']"));
				addproduct.get(i).click();
				if(j==3) {
					break;
				}
				
			}
		}
		//driver.close();
	}

}
