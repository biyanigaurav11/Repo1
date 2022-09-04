package Day5_Assignments;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Browser_Operation {

	public static void main(String[] args)  throws InterruptedException {
		
		String CurrentWorkDir = System.getProperty("user.dir");
		String ChromePath = CurrentWorkDir + "\\Executables\\chromedriver.exe";
		
		System.setProperty("webdriver.chrome.driver", ChromePath);
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://opensource-demo.orangehrmlive.com/");
		
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		//driver.manage().window().setPosition(arg0);
	//	driver.manage().window().setSize(new Dimension(5000,6000));
    Thread.sleep(2000);
	driver.navigate().refresh();
	
	driver.findElement(By.name("username")).sendKeys("Admin");
	driver.findElement(By.name("password")).sendKeys("admin123");
	
	driver.findElement(By.tagName("button")).click();
		
		driver.navigate().back();
		
		driver.navigate().to("https://demo.actitime.com/login.do");
		
		driver.navigate().refresh();
		
		driver.navigate().back();
		
		driver.navigate().refresh();
		
		driver.navigate().forward();
		
		driver.navigate().refresh();
		
		
	}

}
