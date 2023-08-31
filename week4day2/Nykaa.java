package week4day2;

import java.awt.List;
import java.lang.reflect.Array;
import java.time.Duration;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Nykaa {
	
	
	public static void main(String[] args) throws InterruptedException {
		
		ChromeDriver driver = new ChromeDriver();
		
		driver.get("https://www.nykaa.com/");
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		
		
		WebElement Brands = driver.findElement(By.xpath("//a[text() ='brands']"));
		Actions a = new Actions(driver);
		
	a.moveToElement(Brands).perform();	
	
	Thread.sleep(2000);
		
	WebElement search = driver.findElement(By.xpath("//input[@placeholder='search brands']"));
	search.sendKeys("L'Oreal Paris");
	search.sendKeys(Keys.ENTER);
		System.out.println(driver.getTitle());	
		Thread.sleep(2000);	
	driver.findElement(By.xpath("(//a[contains(text(),'Paris')])[1]")).click();
		System.out.println(driver.getTitle());

		
		Actions ac = new Actions(driver);
		
		
	ac.scrollByAmount(0, 500).perform();
	
	Thread.sleep(2000);	

		driver.findElement(By.xpath("(//button[@class=' css-1aucgde'])[1]")).click();
		Thread.sleep(2000);	

			driver.findElement(By.xpath("(//div[@class='control-box css-9rrbqm'])[4]")).click();
			Thread.sleep(2000);	

			ac.scrollByAmount(0, 700).perform();
			Thread.sleep(2000);	

		driver.findElement(By.xpath("(//div[@class='filter-open css-1gdff5r'])[2]")).click();	
		Thread.sleep(2000);	

	driver.findElement(By.xpath("(//div[@class=' css-1nozswx'])[1]")).click();
	Thread.sleep(2000);	

			driver.findElement(By.xpath("(//div[@class=' css-1nozswx'])[1]")).click();
			Thread.sleep(3000);	

		driver.findElement(By.xpath("//span[text()='Shampoo']")).click();
		Thread.sleep(2000);	

		driver.findElement(By.xpath("(//div[@class='filter-open css-1gdff5r'])[6]")).click();
		Thread.sleep(2000);	

//driver.findElement(By.xpath("//input[@placeholder='Search']")).sendKeys("Color");
//Thread.sleep(2000);	
//driver.findElement(By.xpath("(//label[@class='control control-checkbox'])[3]")).click();
//Thread.sleep(2000);
		driver.findElement(By.xpath("//div[@class='css-1ago99h']//span[text()='Color Protection']")).click();
		Thread.sleep(2000);
//		WebElement Shampoo = driver.findElement(By.xpath("//div[@class='c']//div//span[text()='Shampoo']"));
	//	if(Shampoo.getText().contains("Shampoo")) {
		//	System.out.println("Shampoo");
	//	}else {
		//	System.out.println("No items");
		//}

//WebElement color = driver.findElement(By.xpath("//div[@class='c']//div//span[text()='Color Protection']"));
//if(color.getText().contains("Color")) {
	//System.out.println("Color");
//}else {
//	System.out.println("No items");
//}
		driver.findElement(By.xpath("//div[contains(text(),'Paris Colour Protect Shampoo With UVA & UVB For Colo...')]")).click();

		Set<String> windowHandles = driver.getWindowHandles();
		ArrayList<String> winHandle = new ArrayList<String>(windowHandles);		
		WebDriver window = driver.switchTo().window(winHandle.get(1));
		System.out.println(window +driver.getTitle());
		
driver.findElement(By.xpath("(//button[@class=' css-1r0ze8m'])[1]")).click();

WebElement mrp = driver.findElement(By.xpath("(//div[@class='css-1d0jf8e'])[1]//span[@class='css-u05rr']"));
String text = mrp.getText();
System.out.println(text);




	WebElement price = driver.findElement(By.xpath("(//div[@class='css-1d0jf8e'])[1]//span[@class='css-1jczs19']"));
		String text2 = price.getText();
		System.out.println(text2);
		
		
//	driver.findElement(By.xpath("(//div[@class='css-1d0jf8e'])[1]")).getText();	
		
driver.findElement(By.xpath("(//button[@class=' css-13zjqg6'])[1]")).click();		
		
		driver.findElement(By.xpath("//button[@class='css-aesrxy']")).click();
		
		
	WebElement frame = driver.findElement(By.xpath("//iframe[@class='css-acpm4k']"));
	driver.switchTo().frame(frame);
	
	
	WebElement total = driver.findElement(By.xpath("//div[@class='footer-layout css-2vxg6l e25lf6d0']//span[@class='css-1um1mkq e171rb9k3']"));
		String text3 = total.getText();
		System.out.println(text3);	
		Thread.sleep(2000);
	driver.findElement(By.xpath("//div[@class='css-ltzjhp e25lf6d7']")).click();
driver.findElement(By.xpath("(//button[@class='css-tzuruw e8tshxd1'])[2]")).click();
//driver.close();
	
		
		ArrayList<String> winHandl = new ArrayList<String>(windowHandles);	
		for (int i = 0; i<winHandl.size(); i++) {
	driver.switchTo().window(winHandl.get(i));
	driver.close();
	
	
	
	
	
	
	
	
	
	
	
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	}
	
	
	
	

}
