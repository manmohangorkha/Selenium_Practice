package mavenAID;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.WebElement;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class robopractice {

	public static void main(String[] args) throws InterruptedException, AWTException {
		WebDriver sha = new ChromeDriver();
		sha.manage().window().maximize();
		sha.get("https://test.salesforce.com/");
		WebElement mau = sha.findElement(By.linkText("Forgot Your Password?"));
		Actions wau = new Actions(sha);
		wau.moveToElement(mau).contextClick().build().perform();
		
		Robot sa = new Robot();
		sa.keyPress(KeyEvent.VK_DOWN);
		sa.keyRelease(KeyEvent.VK_DOWN);
		sa.keyPress(KeyEvent.VK_DOWN);
		sa.keyRelease(KeyEvent.VK_DOWN);
		
		
		
		Thread.sleep(6000);
		sha.close();
		
		
		
		
		
		
		
		
	
	


	}

}
