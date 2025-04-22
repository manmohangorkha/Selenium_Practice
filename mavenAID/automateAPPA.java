package mavenAID;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import java.time.Duration;

public class automateAPPA {

    public static void main(String[] args) throws InterruptedException {

       
        WebDriver varun = new ChromeDriver();
        varun.get("https://test.salesforce.com/");
        varun.manage().window().maximize();

       
        Thread.sleep(2000);

        // Enter login credentials
        varun.findElement(By.id("username")).sendKeys("manabendra.appa@hytechpro.com.appafull");
        varun.findElement(By.id("password")).sendKeys("Htp@ppa4321");
        varun.findElement(By.id("Login")).click();

        // Wait for Salesforce to load after login
        WebDriverWait wait = new WebDriverWait(varun, Duration.ofSeconds(20));
        wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//a[@title='Accounts']")));

        // Click the Contacts tab using JavaScript (in case normal click fails)
        JavascriptExecutor js = (JavascriptExecutor) varun;
        WebElement Accounts = varun.findElement(By.xpath("//a[@title='Accounts']"));
        js.executeScript("arguments[0].click();", Accounts);

        // Close browser after execution (Optional)
        Thread.sleep(5000);
        WebElement Accounts1 = varun.findElement(By.xpath("//a[@title='Test pujara']"));
        js.executeScript("arguments[0].click();", Accounts1);
        Thread.sleep(5000);
        WebElement Accounts2 = varun.findElement(By.xpath("//a[@href='/lightning/r/Account/001cW0000099zOuQAI/related/Contacts/view']"));
        js.executeScript("arguments[0].click();", Accounts2);
        Thread.sleep(2000);

        
    }
}
