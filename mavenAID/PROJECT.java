package mavenAID;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import java.io.File;
import java.io.IOException;
import java.util.Iterator;
import java.util.Set;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class PROJECT {

	public static void main(String[] args) throws InterruptedException, IOException {
		WebDriver ajio = new ChromeDriver();
		ajio.manage().window().maximize();
		   Thread.sleep(2000);
		ajio.get("https://www.ajio.com/");
		   Thread.sleep(2000);
		WebElement searchbox = ajio.findElement(By.xpath("//input[@placeholder='Search AJIO']"));
		searchbox.sendKeys("shirts");
		   Thread.sleep(2000);
	    WebElement SearchIcon =	ajio.findElement(By.xpath("//span[@class='ic-search']"));
	    SearchIcon.click();
	    Thread.sleep(2000);
	    WebElement Pricebox = ajio.findElement(By.xpath("//span[@aria-label='price']"));
	    Pricebox.click();
	    Thread.sleep(2000);
//	    WebElement PriceSelect = ajio.findElement(By.xpath("//input[@id='Below Rs.500']"));
	    WebElement PriceSelect = ajio.findElement(By.xpath("//label[@class='facet-linkname facet-linkname-pricerange facet-linkname-Below Rs.500']"));
	    PriceSelect.click();
	    
	    Thread.sleep(2000);
	    WebElement ShirtSelect = ajio.findElement(By.xpath("//img[@src='https://assets.ajio.com/medias/sys_master/root/20241109/0tsd/672e8ecbf9b8ef490b10254d/ikon_fashion_brown_solid_regular_fit_shirt.jpg']"));
	    ShirtSelect.click();
	    Thread.sleep(2000);
	    Thread.sleep(4000);
	      Set<String> HandlesList =  ajio.getWindowHandles();
	      Iterator<String> Itworks =  HandlesList.iterator();
	      String Handle1= Itworks.next();
	      String Handle2= Itworks.next();
	      System.out.println(Handle1+"\n"+Handle2);	      
	      ajio.switchTo().window(Handle2);
	      Thread.sleep(2000);
	     
	    WebElement ShirtColor = ajio.findElement(By.xpath("//img[@title='green']"));
	    ShirtColor.click();
	    WebElement ShirtSize = ajio.findElement(By.xpath("(//div[@class='circle size-variant-item size-instock '])[3]"));
	    ShirtSize.click();
	    WebElement AddToBag = ajio.findElement(By.xpath("//span[@aria-label='ADD TO BAG']"));
	    AddToBag.click();
	    Thread.sleep(4000);
	    WebElement bag = ajio.findElement(By.xpath("//div[@class='popup-blk cart-blk']"));
	    bag.click();
	    Thread.sleep(2000);
	    TakesScreenshot ss = (TakesScreenshot)ajio;
	      File Place1 = ss.getScreenshotAs(OutputType.FILE);
	      File Place2 =  new File("C:\\Users\\manmohang\\Downloads/ajioscreenshot.jpg");
	    FileUtils.copyFile(Place1, Place2);
	    
	    
	    
	    
		
	}

}
