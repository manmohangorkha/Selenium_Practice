package mavenAID;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.WebElement;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class listofelements {

	public static void main(String[] args) {
		WebDriver rahi = new ChromeDriver();
		rahi.manage().window().maximize();
		rahi.get("https://test.salesforce.com/");
	    List<WebElement> filterelements=   rahi.findElements(By.tagName("a"));
	 
	    System.out.println(filterelements.size());
	    
	    for(int i=0; i<filterelements.size();i++)
	    {
	    	if(filterelements.get(i).getText().contains("Forgot Your Password?"))
			   {
	    		System.out.println(i + "and" +filterelements.get(i).getText());
		   filterelements.get(i).click();
		   break;  		   
			   }
		
	    }
	    

	}

}
