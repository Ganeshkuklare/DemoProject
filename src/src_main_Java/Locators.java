package src_main_Java;


import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Locators {
	
	public static void main (String [] arg)
	
	{
		
		WebDriver driver = new ChromeDriver ();
		//driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		driver.get("https://www.globalsqa.com/angularJs-protractor/BankingProject/#/manager/list");
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		
		//driver.findElement(By.linkText("Free Access to InterviewQues/ResumeAssistance/Material")).click();
		
		//driver.findElement(By.partialLinkText("ResumeAssistance/Material")).click();
		
		
		//System.out.println(driver.findElement(By.xpath("//td/span[contains(text(),'1004')]/following-sibling::span[contains(text(),'1005')]/following-sibling::span[contains(text(),'1006')]")).getText());
		WebElement name =driver.findElement(By.linkText("First Name"));
		
		Actions actions = new Actions(driver);
		
		actions.contextClick(name).perform();
		
		
	}

}
