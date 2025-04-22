package mavenAID;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Practice041124 {

	public static void main(String[] args) {
		
		WebDriver sahil = new ChromeDriver();
		
		
//		sahil.get("https://test.salesforce.com");
//		sahil.manage().window().maximize();
//		sahil.findElement(By.id("username")).sendKeys("sysadmin@mdnonprofit.org.manofull");
//		sahil.findElement(By.name("pw")).sendKeys("MANO@21211!");
////		sahil.findElement(By.cssSelector("input[id='Login']")).click();		
//
//		sahil.findElement(By.xpath("//input[@type='submit']")).click();
		
		sahil.get("https://test.salesforce.com");
		sahil.manage().window().maximize();
		sahil.findElement(By.xpath("//input[@name='username']")).sendKeys("sysadmin@mdnonprofit.org.manofull");
		sahil.findElement(By.xpath("//input[@id='password']")).sendKeys("MANO@21211!");
		sahil.findElement(By.xpath("//input[@name='Login']")).click();
		sahil.close();

	}

}
