package newpackage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

@SuppressWarnings("unused")
public class MyClass1 {

	public static void main(String[] args) {
		System.setProperty("webdriver.Сhrome.driver","/Users/maximfrolov/‎⁨chromedriver");
		WebDriver driver = new ChromeDriver();
		String baseUrl = "http://www.facebook.com";
		String tagName = "";
		
		driver.get(baseUrl);
		tagName = driver.findElement(By.id("email")).getTagName();
		System.out.println(tagName);
		driver.close();
		System.exit(0);
		
		/*
		 findElement(By.className("someClassName"))
		 findElement(By.cssSelector("input#email"))
		 findElement(By.id("someId"))  
		 findElement(By.linkText("REGISTRATION"))
		 findElement(By.name("someName"))  
		 findElement(By.partialLinkText("REG"))
		 findElement(By.tagName("div"))  
		 findElement(By.xpath("//html/body/div/table/tbody/tr/td[2]/table/ tbody/tr[4]/td/table/tbody/tr/td[2]/table/tbody/tr[2]/td[3]/ form/table/tbody/tr[5]"))
		 get()
		 getTitle()
		 getPageSource()
		 getCurrentUrl()
		 getText() 
		 navigate().to()
		 navigate().refresh()
		 navigate().back()
		 navigate().forward()
		 close() 
		 quit()
		 */
	}
	
	
}
