package newpackage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;



public class MyClass5 {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.Сhrome.driver","/Users/maximfrolov/‎⁨chromedriver");
		WebDriver driver = new ChromeDriver();
		
		
		driver.get("https://www.google.com/");
		driver.findElement(By.name("q")).click();
		Thread.sleep(1000);
		driver.findElement(By.name("q")).clear();
		driver.findElement(By.name("q")).sendKeys("Фролов");
		driver.findElement(By.name("q")).sendKeys(Keys.ENTER);
		String actualTitle = "";
		
		WebElement mytitle = driver.findElement(By.xpath("//*[@id=\"rso\"]/div[2]/div/div[1]/div/div/div[1]/a/h3"));
		actualTitle = mytitle.getText();
		String expectedTitle = "Фролов, Александр Александрович (хоккеист) — Википедия";
		
		/*sdfsdfdsfsdf*/
        
		
		if(actualTitle.contentEquals(expectedTitle)) {
			System.out.println("Test Passed!");
		} else {
			System.out.println("Test Failed!");
		}
		
		driver.quit();
		
	}
	
	
	
	
}
