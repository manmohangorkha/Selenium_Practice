package mavenAID;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;


public class absolutexpath {

	public static void main(String[] args) throws InterruptedException {
		WebDriver sham = new ChromeDriver();
		sham.get("https://test.salesforce.com/");
		sham.findElement(By.cssSelector("input[class='input r4 wide mb16 mt8 username']")).sendKeys("sfsdf");
		sham.findElement(By.xpath("//input[@class='input r4 wide mb16 mt8 username']")).sendKeys("----testessss");
		}
}
