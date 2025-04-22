package mavenAID;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;


public class paytmiframe {

	public static void main(String[] args) throws InterruptedException {
		WebDriver paytm = new ChromeDriver();
		paytm.manage().window().maximize();
		paytm.get("https://paytm.com/");
		WebElement signin = paytm.findElement(By.xpath("//img[@src='https://pwebassets.paytm.com/commonwebassets/paytmweb/header/images/loginImg.svg']"));
		signin.click();
		Thread.sleep(10000);
		WebElement ifrm = paytm.findElement(By.xpath("//iframe[@id='oauth-iframe']"));
		paytm.switchTo().frame(ifrm);		
		paytm.findElement(By.linkText("privacy policy")).click();
		System.out.println("privacy policy is accessible without iframe");
		
		

	}

}
