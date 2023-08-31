package week4day2;

import java.awt.Desktop.Action;
import java.time.Duration;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class SnapDeal {
	
	public static void main(String[] args) throws InterruptedException {
		ChromeDriver driver = new ChromeDriver();
		
		
		driver.get("https://www.snapdeal.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		WebElement mens = driver.findElement(By.xpath("(//span[@class='catText'])[1]"));
		Actions ac = new Actions(driver);
		ac.moveToElement(mens).perform();
		driver.findElement(By.xpath("(//span[text()='Sports Shoes'])[1]")).click();
		
		
		
		
		
		
	// WebElement count = driver.findElement(By.xpath("//div[@class='comp comp-right-wrapper ref-freeze-reference-point clear']"));
		
List<WebElement> shoes = driver.findElements(By.xpath("//p[@class='product-title']"));
System.out.println("The count of shoes is" +shoes.size());
driver.findElement(By.xpath("(//div[@class='child-cat-name '])[2]")).click();
driver.findElement(By.xpath("//div[@class='sort-drop clearfix']")).click();
Thread.sleep(2000);
driver.findElement(By.xpath("(//ul[@class='sort-value']//li)[2]")).click();		

String sortByGetText = driver.findElement(By.xpath("//div[@class='sort-selected']")).getText();
String sortByGetTextexpe = "Price Low To High";
if (sortByGetText.contains(sortByGetTextexpe)) {
	System.out.println("Sorted Low to High Successfully");
}
else {
	System.out.println("Not Sorted Propelry");
}


WebElement firstValue = driver.findElement(By.xpath("//input[@name='fromVal']"));
firstValue.clear();
firstValue.sendKeys("900");
firstValue.sendKeys(Keys.TAB);


WebElement toValue = driver.findElement(By.xpath("//input[@name='toVal']"));

toValue.clear();
toValue.sendKeys("1200");

Thread.sleep(2000);

//WebElement navy = driver.findElement(By.xpath("//label[@for='Color_s-Navy']/span/following-sibling::a"));
//navy.click();
//JavascriptExecutor executor = (JavascriptExecutor)driver;

//executor.executeScript("argument[0].click();",navy );

WebElement shoee = driver.findElement(By.xpath("//p[contains(text(),'Columbus Rider-D Gray Training Shoes')]"));
Actions act = new Actions(driver);

act.moveToElement(shoee);
String text = shoee.getText();
System.out.println(text);

act.scrollByAmount(0, 300);
Thread.sleep(2000);

driver.findElement(By.xpath("(//div[@class='clearfix row-disc']//div)[9]")).click();




//Set<String> shoee = driver.getWindowHandles();
//ArrayList<String> winHandle = new ArrayList<String>(shoee);		
//driver.switchTo().window(winHandle.get(1));





	}

}
