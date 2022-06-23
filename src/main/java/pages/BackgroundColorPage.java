package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class BackgroundColorPage {
	
	WebDriver driver; 
	
	public BackgroundColorPage(WebDriver driver) { 
		this.driver = driver;
			
	}
	
	//Element List 
	@FindBy(css ="button[onclick='myFunctionSky()']") WebElement SKYBLUEBUTTON;
	
	@FindBy(css= "button[onclick='myFunctionWhite()']") WebElement WHITEBUTTON;
	
	@FindBy(css="body[style='background-color: skyblue;']")
	public WebElement BackgroundSkyBlue;
	@FindBy(css = "body[style='background-color: white;']")
	public WebElement BackgroundWhite;
	
	public void clickSetSkyBlueBackground() { 
		WebDriverWait wait = new WebDriverWait(driver,10);
		wait.until(ExpectedConditions.visibilityOf(SKYBLUEBUTTON));
		SKYBLUEBUTTON.click();
		System.out.println("Set Sky Blue Background Button is clicked.");
	}
	
	public void clickSetWhiteBackground() { 
		WebDriverWait wait = new WebDriverWait(driver,10);
		wait.until(ExpectedConditions.visibilityOf(WHITEBUTTON));
		WHITEBUTTON.click();
		System.out.println("Set White Background Button is clicked.");
		
	}
	

}
