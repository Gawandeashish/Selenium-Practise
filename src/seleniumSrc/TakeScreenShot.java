package seleniumSrc;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.apache.commons.io.FileUtils;
import org.apache.commons.io.FilenameUtils;

public class TakeScreenShot {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver", "D:\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.google.com");
		
		// to take the screenshot we need to change the behaviour of driver by casting the driver with a method called TakeScreenShot
		
		File src = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		// now the screenshot is successfully stored in src, we need to copy this into our system directry
		
		FileUtils.copyFile(src,new File("E://ashish.png"));

	}

}
