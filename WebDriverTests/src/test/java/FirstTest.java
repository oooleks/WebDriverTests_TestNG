import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;


public class FirstTest {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver = new FirefoxDriver();
		
		driver.get("http://www.facebook.com");
		
		WebElement textbox = driver.findElement(By.cssSelector("#email"));
		textbox.sendKeys("wrong@ukr.net");
		
		WebElement forgotLink = driver.findElement(
				By.cssSelector("#login_form tr:nth-child(3)>td:nth-child(2)>a"));
		forgotLink.click();
		
		Thread.sleep(2000L);
		
		driver.get("http://www.amazon.com");
		
		WebElement accountDD = driver.findElement(
				By.cssSelector("#nav-signin-tooltip>.nav-action-button>.nav-action-inner"));
		accountDD.click();
		
		Thread.sleep(2000L);
				
		driver.close();

	}

}
