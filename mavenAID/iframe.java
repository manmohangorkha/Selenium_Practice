package mavenAID;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;


public class iframe {

	public static void main(String[] args) throws InterruptedException {
		WebDriver shar = new ChromeDriver();
		shar.manage().window().maximize();
		shar.get("https://www.zomato.com/");
		shar.findElement(By.xpath("(//a[@tabindex='-1'])[3]")).click();
		Thread.sleep(2000);
		shar.switchTo().frame("auth-login-ui");
		shar.findElement(By.xpath("//input[@placeholder='phone']")).sendKeys("8293244");
		
	}

}
