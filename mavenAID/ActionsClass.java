package mavenAID;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class ActionsClass {

	public static void main(String[] args) throws InterruptedException {
		WebDriver rahul = new ChromeDriver();
		rahul.manage().window().maximize();
		rahul.get("https://www.amazon.in/");
		
		WebElement  srch = rahul.findElement(By.className("icp-nav-link-inner"));		
		Actions val = new Actions(rahul); 
		val.moveToElement(srch).build().perform();
		Thread.sleep(2000);
		
		
//	WebElement dbba	   = rahul.findElement(By.id("twotabsearchtextbox"));
//	Actions dbba1 = new Actions(rahul);
//	 dbba1.moveToElement(dbba).click().keyDown(Keys.SHIFT).sendKeys("bag").build().perform();
//	 Thread.sleep(2000);
//	 dbba1.moveToElement(dbba).click().keyDown(Keys.SHIFT).sendKeys("bag").doubleClick().build().perform();
//	 
//	 Thread.sleep(2000);
//	WebElement desh    =  rahul.findElement(By.className("nav-line-1-container"));
//	Actions desh1 = new Actions(rahul);
//	desh1.moveToElement(desh).contextClick().build().perform();
	 		
		WebElement raj = rahul.findElement(By.id("twotabsearchtextbox"));
		Actions face = new Actions(rahul);
	face.moveToElement(raj).click().keyDown(Keys.SHIFT).sendKeys("bar").build().perform();
	 
				
		Thread.sleep(2000);
		rahul.close();
		

	}

}
