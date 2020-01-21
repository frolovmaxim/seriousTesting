package newpackage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class MyClass2 {
	public static void main(String[] args) {
		System.setProperty("webdriver.Сhrome.driver","/Users/maximfrolov/‎⁨chromedriver");
		WebDriver driver = new ChromeDriver();
		driver.get("http://www.popuptest.com/popuptest2.html");
		driver.quit();
	}
}
