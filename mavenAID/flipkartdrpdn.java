package mavenAID;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
public class flipkartdrpdn {

	public static void main(String[] args) {
		WebDriver aditi = new ChromeDriver();
		aditi.manage().window().maximize();
		String flipkart = "https://www.flipkart.com/";
		aditi.get(flipkart);
	 WebElement desu =	aditi.findElement(By.xpath("//input[@title='Search for Products, Brands and More\']"));
	 Actions big = new Actions(aditi);
	 big.moveToElement(desu).click().keyDown(Keys.SHIFT).sendKeys("mob").contextClick().build().perform();
	 
	 
	 
	}

}
