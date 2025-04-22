package mavenAID;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class JavaScript {

	public static void main(String[] args) throws InterruptedException {
		WebDriver ajio = new ChromeDriver();
	//	ajio.manage().window().maximize();
		ajio.get("https://www.ajio.com/");	
		Thread.sleep(2000);		
		JavascriptExecutor js = (JavascriptExecutor)ajio;
		js.executeScript("window.scrollBy(0,document.body.scrollHeight)","");

	}

}
