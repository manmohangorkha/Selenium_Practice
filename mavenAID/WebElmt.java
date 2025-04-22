package mavenAID;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class WebElmt {

	public static void main(String[] args) throws InterruptedException {
		
		
		//manage Chrome
		WebDriver save = new ChromeDriver();
		save.manage().window().maximize();
		String link= "https://test.salesforce.com/";
		save.get(link);
		
		//Declaration of webelements
		WebElement f1= save.findElement(By.xpath("//input[@id= 'username']"));
		WebElement f2= save.findElement(By.xpath("//input[@type='password']"));
		WebElement f3= save.findElement(By.xpath("//input[@id='Login']"));
		
		//
		f1.sendKeys("sa.makersdf@gmail.com");
		f2.sendKeys("234@sse");
		f3.click();
		Thread.sleep(3000);		
		
//	    save.findElement(By.xpath("//div[@id='error']")).getText();
	    System.out.println(save.findElement(By.xpath("//div[@id='error']")).getText());
		
//		WebElement err = save.findElement(By.xpath("//div[@id='error']"));
//		String errtext = err.getText();
//		
//		
//		
//		System.out.println(errtext);
		
		Thread.sleep(4000);
		save.close();
		
		
		

	}

}
