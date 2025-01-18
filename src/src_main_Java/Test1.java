package src_main_Java;

public class Test1 {

	public static void main(String[] args) {
		System.out.println("This is Ganesh Kuklare");
		System.out.println("This is Ganesh Kuklare");
		System.out.println("This is Ganesh Kuklare");

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
