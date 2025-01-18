package src_main_Java;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Test1 {

	public static void main(String[] args) {

		
		System.out.println("This is Ganesh Kuklare");
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.worldometers.info/world-population/");
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		WebElement element = driver.findElement(By.xpath("//div[@class='maincounter-number']"));
		String text = element.getText();
		System.out.println("Text: " + text);
		
		
		Actions action = new Actions(driver);
		action.contextClick().perform();
		
		
	}

}
