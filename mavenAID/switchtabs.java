package mavenAID;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class switchtabs {

	public static void main(String[] args) throws AWTException, InterruptedException {
	WebDriver rana = new ChromeDriver();
	rana.manage().window().maximize();
	rana.get("https://www.amazon.in/");
//	Thread.sleep(4000);
	WebElement mx =  rana.findElement(By.linkText("MX Player"));
	Actions dev = new Actions(rana);
	dev.moveToElement(mx).contextClick().build().perform();
	Robot rb = new Robot();
	rb.keyPress(KeyEvent.VK_DOWN);
	rb.keyPress(KeyEvent.VK_ENTER);
	Thread.sleep(7000);
	
     Set<String>  handleslist =  	rana.getWindowHandles();
      Iterator<String>  it= handleslist.iterator();
      String handle1=  it.next();
      String handle2= it.next();
      System.out.println(handle2);
      Thread.sleep(6000);
      rana.switchTo().window(handle2);
      Thread.sleep(6000);

    rana.switchTo().window(handle1);
     
     
     
     
     
	
	

	}

}
