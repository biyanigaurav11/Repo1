package Day_4_Assignments;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ActiTime_LoginValidation {

	public static void main(String[] args) throws InterruptedException {
		
        String CurrentWorkDir = System.getProperty("user.dir");
		
		String ChromePath = CurrentWorkDir + "\\Executables\\chromedriver.exe";
		System.setProperty("webdriver.chrome.driver", ChromePath);
        
		WebDriver driver = new ChromeDriver();
		driver.get("https://demo.actitime.com/login.do");
		//driver.manage().window().maximize();
		
		WebElement username = driver.findElement(By.id("username"));
		username.sendKeys("admin");
		
		
		WebElement password = driver.findElement(By.name("pwd"));
		password.sendKeys("manager");
		
		WebElement LoginButton = driver.findElement(By.id("loginButton"));
        LoginButton.click();
        
        Thread.sleep(3000);
        
        driver.close();
        
		
	}

}
