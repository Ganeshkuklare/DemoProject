package src_main_Java;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.locators.RelativeLocator;

public class RelativeLocators {

	public static void main(String[] args) {
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.worldometers.info/world-population/#google_vignette");

		driver.manage().window().maximize();
		
		
		
		WebElement refrenceElement = driver.findElement(By.xpath("//h1[text()=' Current World Population']"));
		
        WebElement populationCounter = driver.findElement(RelativeLocator.with(By.tagName("span")).below(refrenceElement));
        System.out.println("Population Counter: " + populationCounter.getText());



	}

}
