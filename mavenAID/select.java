package mavenAID;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class select {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriver jony= new ChromeDriver();
		jony.manage().window().maximize();
		jony.get("https://www.passportindia.gov.in/AppOnlineProject/welcomeLink#");
		WebElement f1 = jony.findElement(By.cssSelector("select[name='dcdrLocation']"));
		WebElement f2 = jony.findElement(By.cssSelector("select[name='country']"));
		WebElement f3 = jony.findElement(By.id("officeUsersLogin"));
		Select r1 = new Select(f1);
		r1.selectByIndex(3);
		Thread.sleep(4000);
		Select r2 = new Select(f2);
		r2.selectByVisibleText("Iran");
		Thread.sleep(4000);
		Select r3 = new Select(f3);
		r3.selectByIndex(1);
		
		
		

	}

}
