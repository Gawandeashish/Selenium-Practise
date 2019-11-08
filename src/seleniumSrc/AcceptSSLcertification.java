package seleniumSrc;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.CapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;

public class AcceptSSLcertification {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Desired capabilities, desired capabilities is the class which can help to customize our chrome browser
		//by providing proper knowledge to browser
		
		//general chrome profile
		
		DesiredCapabilities ch= DesiredCapabilities.chrome();
		ch.setCapability(CapabilityType.ACCEPT_SSL_CERTS, true);
		
		//Below to your local browser
		ChromeOptions c =new ChromeOptions();
		c.merge(ch);
		System.setProperty("webdriver.chrome.driver", "D:\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver(c);
		driver.get("https://www.google.com");

	}

}
