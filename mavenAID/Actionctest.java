package mavenAID;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
 
import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Actionctest{

	public static void main(String[] args) throws AWTException, InterruptedException {
		WebDriver act = new ChromeDriver();
		act.manage().window().maximize();

		act.get("https://test.salesforce.com/");

		WebElement fp = act.findElement(By.linkText("Forgot Your Password?"));

		Actions mv = new Actions(act);
		mv.moveToElement(fp).contextClick().build().perform();

	//OPENING INSPECT ELEMENT OF FORGET PASSWORD LINK
		Robot rb = new Robot();
		
		for(int i=0; i<=5;i++)
		{
		rb.keyPress(KeyEvent.VK_DOWN);
		rb.keyRelease(KeyEvent.VK_DOWN);
		Thread.sleep(500);
		}
		rb.keyPress(KeyEvent.VK_ENTER);
//		
//		for(int i=0; i<=6;i++)
//			
//		{
//		rb.keyPress(KeyEvent.VK_ENTER);
//		
//		rb.keyPress(KeyEvent.VK_I);
//		rb.keyRelease(KeyEvent.VK_SPACE);
//
//		rb.keyPress(KeyEvent.VK_M);
//		rb.keyPress(KeyEvent.VK_S);
//		rb.keyPress(KeyEvent.VK_S);
//		rb.keyPress(KeyEvent.VK_M);
//		rb.keyPress(KeyEvent.VK_SPACE);
//		rb.keyPress(KeyEvent.VK_U);
//			}
				
		

	}

}
