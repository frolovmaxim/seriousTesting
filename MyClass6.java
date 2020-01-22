package newpackage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;



public class MyClass6 {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.Сhrome.driver","/Users/maximfrolov/‎⁨chromedriver");
		WebDriver driver = new ChromeDriver();
		
		
		driver.get("https://www.onliner.by/");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//*[@id=\"userbar\"]/div[2]/div/div/div[1]")).click();
		WebElement nickName = driver.findElement(By.xpath("//input[@placeholder='Ник или e-mail']"));
		nickName.sendKeys("frolic666");
		WebElement pwd = driver.findElement(By.xpath("//input[@placeholder='Пароль']"));
		pwd.sendKeys("101323");
		WebElement enterButton = driver.findElement(By.xpath("//button[@class='auth-button auth-button_primary auth-button_middle auth-form__button auth-form__button_width_full']"));
		enterButton.click();
		Thread.sleep(2000);
		if(driver.findElement(By.xpath("//img[@class='onliner_logo']")).isDisplayed()) {
			System.out.println("Test Passed!");
		} else {
			System.out.println("Test Failed!");
		}
		/*
		if(actualTitle.contentEquals(expectedTitle)) {
			System.out.println("Test Passed!");
		} else {
			System.out.println("Test Failed!");
		}
		*/
		driver.quit();
		
	}
	
	
	
	
	
	
}
