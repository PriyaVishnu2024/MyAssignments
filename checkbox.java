package week2.day2;



import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;









public class checkbox {
	public static void main(String[] args) {
		ChromeDriver driver2 = new ChromeDriver();
		driver2.get("https://leafground.com/checkbox.xhtml");
		driver2.manage().window().maximize();
		driver2.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		driver2.findElement(By.xpath("//span[text()='Basic']")).click();
		driver2.findElement(By.xpath("//span[text()='Ajax']")).click();
		driver2.findElement(By.xpath("//label[text()='Java']")).click();  
		driver2.findElement(By.xpath("(//div[@class='col-12']//div)[24]")).click();
		driver2.findElement(By.xpath("//div[@class='ui-toggleswitch-slider']")).click();
	
	}

}
