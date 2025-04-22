package mavenAID;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class salesforce {

	public static void main(String[] args) throws InterruptedException {
		WebDriver savi = new ChromeDriver();
		savi.manage().window().maximize();
		savi.get("https://test.salesforce.com/");
		savi.findElement(By.id("username")).sendKeys("zkesler@aaup.org.aauptest");
		savi.findElement(By.id("password")).sendKeys("Aplusify555");
		savi.findElement(By.id("Login")).click();
		Thread.sleep(15000);
	   WebElement charge=	savi.findElement(By.xpath("(//a[@class='slds-context-bar__label-action dndItem'])[2]"));
	   charge.click();
		JavascriptExecutor js = (JavascriptExecutor) savi;
		Object result = js.executeScript("return document.defaultView;");
		if (result != null) {
		    // Proceed with your logic
		} else {
		    System.out.println("The document's defaultView is not available.");
		}

	}

}
