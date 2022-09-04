package Day5_Assignments;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ActiTime_Assignments_2 {

	public static void main(String[] args) throws InterruptedException {
		
		String CurrentWorkDir = System.getProperty("user.dir") ;
		String ChromePath = CurrentWorkDir + "\\Executables\\chromedriver.exe";
		
		System.setProperty("webdriver.chrome.driver", ChromePath);
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://demo.actitime.com/login.do");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		WebElement UserNameField = driver.findElement(By.id("username"));
		System.out.println("Is Username Field is Enabled: "+UserNameField.isEnabled());
		System.out.println("Is Username Field is Displayed: "+UserNameField.isDisplayed());
		System.out.println("Value in the username field is "+UserNameField.getAttribute("placeholder"));
		
		System.out.println("Is Password Field is Enabled: "+driver.findElement(By.name("pwd")).isEnabled());
		System.out.println("Is Password Field is Displayed: "+driver.findElement(By.name("pwd")).isDisplayed());
		
        System.out.println("Is keep me  loggged in check box displayed "+ driver.findElement(By.id("keepLoggedInLabel")).isDisplayed());
        System.out.println("Is keep me  loggged in check box enabled "+ driver.findElement(By.id("keepLoggedInLabel")).isEnabled());
        driver.findElement(By.id("keepLoggedInLabel")).click();
       // System.out.println("Is keep me  loggged in check box selectable  " + driver.findElement(By.id("keepLoggedInLabel")).isSelected());
        
        Thread.sleep(5000);
        
        driver.close();
        
        
	}

}
