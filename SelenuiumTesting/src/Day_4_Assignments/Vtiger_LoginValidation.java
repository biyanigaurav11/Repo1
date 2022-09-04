package Day_4_Assignments;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Vtiger_LoginValidation {

	public static void main(String[] args) throws InterruptedException {
		
		String CurrentWorkDir = System.getProperty("user.dir");
		
		String ChromePath = CurrentWorkDir + "\\Executables\\chromedriver.exe";
		System.setProperty("webdriver.chrome.driver", ChromePath);
        
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://demo.vtiger.com/vtigercrm/index.php");
		
		driver.manage().window().maximize();
		
		WebElement username = driver.findElement(By.id("username"));
		username.clear();
		username.sendKeys("admin");
		
		WebElement password = driver.findElement(By.id("password"));
		password.clear();
		password.sendKeys("Test@123");
		
		WebElement SignInButton = driver.findElement(By.tagName("button"));
		SignInButton.click();
		
		Thread.sleep(3000);

		driver.close();

	}

}
