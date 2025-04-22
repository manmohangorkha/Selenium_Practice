package mavenAID;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import java.util.List;

public class ActionClass {
    public static void main(String[] args) throws InterruptedException {
        
        // Initialize the ChromeDriver
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();

        // Open Google
        String url = "https://www.wikipedia.org	";
        driver.get(url);

        // Find the wikki search box
        WebElement searchBox = driver.findElement(By.id("searchInput"));

        // Use Actions class to type "flip"
        Actions actions = new Actions(driver);
        actions.moveToElement(searchBox).click().sendKeys("flip").build().perform();

        // Wait for suggestions to load
        Thread.sleep(2000);
       List<WebElement>     list1=   searchBox.findElements(By.xpath("//a[@class='suggestion-link']"));
       for( WebElement listfake : list1)
        System.out.println(listfake.getText());
        
       
		Thread.sleep(3000);

        // Close the browser
        driver.quit();
    }
}
