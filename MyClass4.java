package newpackage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;



@SuppressWarnings("unused")
public class MyClass4 {
	public static void main(String[] args) {
		System.setProperty("webdriver.Сhrome.driver","/Users/maximfrolov/‎⁨chromedriver");
		WebDriver driver = new ChromeDriver();
		String alertMessage = "";
		
		driver.get("http://jsbin.com/usidix/1");
		driver.findElement(By.cssSelector("input[value=\"Go!\"]")).click();
		alertMessage = driver.switchTo().alert().getText();
		driver.switchTo().alert().accept();
		
		System.out.println(alertMessage);
		driver.quit();
		
	}
	
	
	/*sdfsdfsdf
	 * 
	 */
}
