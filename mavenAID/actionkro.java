package mavenAID;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.WebElement;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;

public class actionkro {

	public static void main(String[] args) throws InterruptedException {
		WebDriver sha = new ChromeDriver();
		sha.manage().window().maximize();
		sha.get("https://www.amazon.in/");

	  WebElement desh = sha.findElement(By.id("twotabsearchtextbox"));
	
		
		Actions rahi = new Actions(sha);
		rahi.click(desh).keyDown(Keys.SHIFT).sendKeys("web").doubleClick().build().perform();
	
		Thread.sleep(3000);
		sha.close();
	}

}
