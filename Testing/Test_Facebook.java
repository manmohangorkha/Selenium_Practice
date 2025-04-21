package Testing;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Test_Facebook {

	public static void main(String[] args) {
		
		WebDriver fc = new ChromeDriver();
		fc.get("https://www.facebook.com/");
		fc.manage().window().maximize();
		fc.findElement(By.name("email")).sendKeys("admin@gmail.com");
		fc.findElement(By.name("pass")).sendKeys("admin@123");
		fc.findElement(By.name("login")).click();
		
	}
}
