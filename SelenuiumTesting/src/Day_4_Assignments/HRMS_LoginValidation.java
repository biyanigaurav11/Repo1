package Day_4_Assignments;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;


public class HRMS_LoginValidation {

	public static void main(String[] args) throws InterruptedException {
		
		String CurrentWorkDir = System.getProperty("user.dir");
		String ChromePath = CurrentWorkDir +"\\Executables\\chromedriver.exe";
		
		System.setProperty("webdriver.chrome.driver", ChromePath);
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(59,TimeUnit.SECONDS);
		driver.get("https://opensource-demo.orangehrmlive.com/");
		
		WebElement username = driver.findElement(By.name("username"));
		username.sendKeys("Admin");
		
		WebElement pwd = driver.findElement(By.name("password"));
		pwd.sendKeys("admin123");
		
		WebElement Loginbutton = driver.findElement(By.tagName("button"));
		Loginbutton.click();
		
	//	Thread.sleep(3000);
		System.out.println("done the testing completely");
		driver.close();
		
	}

}
