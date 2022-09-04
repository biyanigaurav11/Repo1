package Day7_Assignment;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class Assignment1_PropertyfileReading {

	public static void main(String[] args) throws IOException, InterruptedException {
		
		FileInputStream fis = new FileInputStream(".\\TestData\\AppData.properties");
		Properties prop = new Properties();
        prop.load(fis);	
        
        String driverkey = prop.getProperty("driverKey");
        String driverExecutablePath = prop.getProperty("driverExecutablePath");
        String appurl = prop.getProperty("appurl");
        String username = prop.getProperty("username");
        String password = prop.getProperty("password");
        String loginpageTitle = prop.getProperty("loginpageTitle");
        String buttonName = prop.getProperty("buttonName");
      //  System.out.println(driverkey +"\n"+ driverExecutablePath +"\n"+appurl+ "\n"
        //		+username +"\n"+password+"\n"+loginpageTitle+"\n"+buttonName);
        
        String CurrentWorkDir = System.getProperty("user.dir") ;
		String ChromePath = CurrentWorkDir + driverExecutablePath;
		
		System.setProperty(driverkey, ChromePath);
		
		WebDriver driver = new ChromeDriver();
		driver.get(appurl);
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		WebElement UserNameField = driver.findElement(By.id("username"));
		System.out.println("Is Username Field is Enabled: "+UserNameField.isEnabled());
		System.out.println("Is Username Field is Displayed: "+UserNameField.isDisplayed());
		System.out.println("Value in the username field is "+UserNameField.getAttribute("placeholder"));
		UserNameField.sendKeys(username);
		System.out.println("Is Password Field is Enabled: "+driver.findElement(By.name("pwd")).isEnabled());
		System.out.println("Is Password Field is Displayed: "+driver.findElement(By.name("pwd")).isDisplayed());
		WebElement Password = driver.findElement(By.name("pwd"));
		Password.sendKeys(password);
        System.out.println("Is keep me  loggged in check box displayed "+ driver.findElement(By.id("keepLoggedInLabel")).isDisplayed());
        System.out.println("Is keep me  loggged in check box enabled "+ driver.findElement(By.id("keepLoggedInLabel")).isEnabled());
        driver.findElement(By.id("keepLoggedInLabel")).click();
       // System.out.println("Is keep me  loggged in check box selectable  " + driver.findElement(By.id("keepLoggedInLabel")).isSelected());
        driver.findElement(By.id("loginButton")).click();
        Thread.sleep(5000);
        
        driver.close();
        
        
        
        
        
        
	}

}
