package mavenAID;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class sendandsearch {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriver jony= new ChromeDriver();
		jony.manage().window().maximize();
		jony.get("https://www.amazon.in/");
		WebElement f1 = jony.findElement(By.id("twotabsearchtextbox"));
		f1.sendKeys("mob");
		Thread.sleep(2000);
		List<WebElement> moblist   =   jony.findElements(By.className("s-heavy"));
		System.out.println(moblist.size());
		
			
		for(int i=0;i<moblist.size();i++)
		{
//			  System.out.println(moblist.get(i).getText());		  
			  
				if(moblist.get(i).getText().contains("ile stand for study"))
				{
					moblist.get(i).click();				
				}
					
		}	
		
	
			

	
			
		

		
}
	}

