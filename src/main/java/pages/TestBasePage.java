package pages;

import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TestBasePage {
	
	public static WebDriver driver;
	
	public static void initDriver() { 
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\DELL\\Raji_CucumberTest\\CucumberProject\\drivers\\chromedriver102.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
			
	}
	
	public void takeScreenShot(WebDriver driver) { 
		
		TakesScreenshot ts = (TakesScreenshot)driver;
		File sourceFile = ts.getScreenshotAs(OutputType.FILE);
		String currentDirectory = System.getProperty("user.dir");
		SimpleDateFormat formatter = new SimpleDateFormat("MMddyy_HHmmss");
		Date date = new Date(); 
		
		String label = formatter.format(date);
		File destFile = new File(currentDirectory + "/screenshot/" + label + ".png");
		try {
			FileUtils.copyFile(sourceFile, destFile);
		} catch (IOException e) {
			
			e.printStackTrace();
		}
	}

}
