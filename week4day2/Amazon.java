package week4day2;

import java.io.File;
import java.io.IOException;
import java.time.Duration;
import java.util.ArrayList;
import java.util.Set;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Amazon {
	public static void main(String[] args) throws IOException, InterruptedException {
		
		ChromeDriver driver = new ChromeDriver();
		
		driver.get("https://www.amazon.in");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		
		
		driver.findElement(By.id("twotabsearchtextbox")).sendKeys("oneplus 9 pro");
		
		driver.findElement(By.xpath("//input[@id='nav-search-submit-button']")).click();
		
		
		WebElement price = driver.findElement(By.xpath("(//span[@class='a-price-whole'])[1]"));
		String text = price.getText();
		System.out.println(text);
		
		WebElement star = driver.findElement(By.xpath("(//a[@role='button'])[2]"));
		Actions ac=new Actions(driver);
		ac.moveToElement(star);
		Thread.sleep(2000);
		WebElement rating = driver.findElement(By.xpath("//span[@class='a-size-base a-color-secondary totalRatingCount']"));
		String text2 = rating.getText();
		System.out.println(text2);
		
driver.findElement(By.xpath("(//span[@class='a-size-medium a-color-base a-text-normal'])[1]")).click();	
		
		Set<String> product = driver.getWindowHandles();
		ArrayList<String> winHandle = new ArrayList<String>(product);		
driver.switchTo().window(winHandle.get(1));
		
		
		 File screenshotAs = driver.getScreenshotAs(OutputType.FILE);
		
		 //to set the pat to store the image file 
		 File destn = new File("./snap/pic.jpg");
		
		FileUtils.copyFile(screenshotAs, destn);
		driver.findElement(By.id("add-to-cart-button")).click();
	
		
	WebElement total = driver.findElement(By.xpath("//span[@id='attach-accessory-cart-subtotal']"));	
		String text3 = total.getText();
		System.out.println(text3);
		
		
	if(price.equals(total)) {
		System.out.println("The price is verified");
	}else {
		System.out.println("The price is not verified");
	}
	
	
		
		
		driver.close();
		
		
		
		
		
		
		
		
		
		
		
	}

}
