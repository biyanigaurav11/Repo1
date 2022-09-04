package Day5_Assignments;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ActiTime_Assignments_1 {

	public static void main(String[] args) throws InterruptedException {
		
		String currentworkDir = System.getProperty("user.dir");
		String chromePath = currentworkDir + "\\Executables\\chromedriver.exe";
		
		System.setProperty("webdriver.chrome.driver", chromePath);
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
		driver.get("https://demo.actitime.com/login.do");
		
		System.out.println("login page validation");
		String Expected_url = "https://demo.actitime.com/login.do";
		String Actual_url = driver.getCurrentUrl();
		System.out.println("login page validation is "+Expected_url.equals(Actual_url));
		
		driver.findElement(By.id("username")).sendKeys("admin");
		driver.findElement(By.name("pwd")).sendKeys("manager");
		
		driver.findElement(By.id("loginButton")).click();
		
		Thread.sleep(10000);
		System.out.println("Home page Validation");
		String Expected_home_url ="https://demo.actitime.com/user/submit_tt.do";
		String Actual_home_url = driver.getCurrentUrl();
		System.out.println("Actual home page url is "+Actual_home_url);
		System.out.println("Expected home page url is "+Expected_home_url);
		
		System.out.println("Home page Validation "+Expected_home_url.equals(Actual_home_url));
		
		System.out.println("Logout from home page");
		driver.findElement(By.partialLinkText("Logout")).click();
		
		System.out.println("Again validating the login page after logout from home page");
		
		String Actual_urllink = "https://demo.actitime.com/login.do";
		String Expected_urllink = driver.getCurrentUrl();
		
		System.out.println("Validating the login page after logout from home page "+Actual_urllink.equals(Expected_urllink));
		
		Thread.sleep(2000);
		
		driver.close();
		
		
		
		
		
		

	}

}
