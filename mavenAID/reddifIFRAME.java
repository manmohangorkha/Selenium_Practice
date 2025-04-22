package mavenAID;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class reddifIFRAME {

	public static void main(String[] args) {
		WebDriver safe = new ChromeDriver();
		safe.manage().window().maximize();
		safe.get("https://m.rediff.com/");
		

	}

}
