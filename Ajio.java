package week3.home_assignment;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;



public class Ajio {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ChromeDriver driver=new ChromeDriver();
		
		driver.get("https://www.ajio.com/");
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//input[@class='react-autosuggest__input react-autosuggest__input--open']")).sendKeys("bags", Keys.ENTER);
		driver.findElement(By.xpath("//li[@class='rilrtl-list-item']//label[contains(text(),'Men')]")).click();
				
		//implicitlywait
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(120));
		WebElement element = driver.findElement(By.xpath("//label[contains(text(),'Fashion Bags')]"));
		//implicitlywait
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		
		element.click();
		//implicitlywait
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(60));
		
		WebElement itemsFound = driver.findElement(By.xpath("//div[@class=' filter-container']//strong"));
		System.out.println("TOTAL NO. OF ITEMS FOUND: " + itemsFound.getText());
		
		List<WebElement> brandName = driver.findElements(By.xpath("//div[@class='contentHolder']/div[@class='brand']/strong"));
		for (WebElement each : brandName) {
			String brand = each.getText();
			System.out.println(brand);
			
		}
		
		List<WebElement> productName = driver.findElements(By.xpath("//div[@class='contentHolder']/div[@class='nameCls']"));
		for (WebElement each : productName) {
			String product = each.getText();
			System.out.println(product);
		}
		

	}

}
