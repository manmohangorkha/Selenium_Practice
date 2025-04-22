package mavenAID;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import java.util.Iterator;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
public class Windowhandle {

	public static void main(String[] args) throws InterruptedException {
		WebDriver ajio = new ChromeDriver();
		ajio.manage().window().maximize();
		ajio.get("https://www.ajio.com/");	
				ajio.findElement(By.xpath("//input[@placeholder='Search AJIO']")).sendKeys("shir");
				Thread.sleep(2000);
		List<WebElement> list1 = ajio.findElements(By.xpath("//li[@class='rilrtl-list-item']"));
		System.out.println(list1.size());
		list1.get(0).click();
		Thread.sleep(2000);
		ajio.findElement(By.xpath("//img[@src='https://assets.ajio.com/medias/sys_master/root/20241109/0tsd/672e8ecbf9b8ef490b10254d/ikon_fashion_brown_solid_regular_fit_shirt.jpg']")).click();
	     Set<String> st1 = ajio.getWindowHandles();
	     Iterator<String>  it1   =  st1.iterator();
	       String ph= it1.next();
	       String ch= it1.next();
	       System.out.println(ph +"\n"+ch);
	       ajio.switchTo().window(ch);
	 //      Thread.sleep(2000);
	       ajio.findElement(By.xpath("//img[@title='beige']")).click();
	       System.out.println("beige shirt is select");
//	       Thread.sleep(3000);
	      
	       ajio.findElement(By.xpath("//div[@class='circle size-variant-item size-instock'][2]")).click();
	       ajio.findElement(By.xpath("//span[@aria-label='ADD TO BAG']")).click();
	       
	       Actions cart =  new Actions(ajio);
	       cart.moveToElement(ajio.findElement(By.xpath("//div[@class='ic-cart']"))).build().perform();	       
	       
	       WebElement ifrm = ajio.findElement(By.xpath("//iframe[@class='join-ad-interest-group']"));
	       ajio.switchTo().frame(ifrm);
	       
	       
	       
	       
	       System.out.println("added to cart");
	     
	       
	       	}

}
