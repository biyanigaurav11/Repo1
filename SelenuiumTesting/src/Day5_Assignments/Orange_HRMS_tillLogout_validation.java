package Day5_Assignments;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Orange_HRMS_tillLogout_validation {

	public static void main(String[] args) throws InterruptedException {
		
		String CurrentWorkDir = System.getProperty("user.dir");
		String ChromePath = CurrentWorkDir + "\\Executables\\chromedriver.exe";
		
		System.setProperty("webdriver.chrome.driver", ChromePath );
		
		WebDriver driver =  new ChromeDriver();
		
		driver.get("https://opensource-demo.orangehrmlive.com/");
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		System.out.println("Title validation");
		
		String Actual_title = driver.getTitle();
		String 	Expected_title = "OrangeHRM";
		System.out.println("Expected title is "+Expected_title);
		System.out.println("Actual title is "+Actual_title);
        System.out.println("Title validation is "+Actual_title.equals(Expected_title));
         
        System.out.println("Login page validation");
        String Actual_url = driver.getCurrentUrl();
        String Expected_url = "https://opensource-demo.orangehrmlive.com/web/index.php/auth/login";
        System.out.println("Actual Url is "+ Actual_url);
        System.out.println("url validation is "+Actual_url.equals(Expected_url));
        
        String pageSource = driver.getPageSource();
        System.out.println("page source length is "+pageSource.length());
        
        System.out.println("Entering Data on login page ");
        	driver.findElement(By.name("username")).sendKeys("Admin");
        	driver.findElement(By.name("password")).sendKeys("admin123");
        	driver.findElement(By.tagName("button")).click();
        
        System.out.println("Home page validation");
        Thread.sleep(10000);
        String Actual_Home_Title = driver.getTitle();
        System.out.println("Actual home title page is: "+Actual_Home_Title);
        String Expected_Home_Title = "OrangeHRM";
        System.out.println("Validation of home page is "+Actual_Home_Title.equals(Expected_Home_Title));
        
        String Actual_Home_Url = driver.getCurrentUrl();
        System.out.println("Home page url is "+Actual_Home_Url);
        String Expected_Home_Url = "https://opensource-demo.orangehrmlive.com/web/index.php/pim/viewEmployeeList";
        System.out.println("Home page validation url: "+Actual_Home_Url.equals(Expected_Home_Url));
        
        driver.findElement(By.className("oxd-userdropdown-name")).click();
        driver.findElement(By.partialLinkText("Logout")).click();
        
        System.out.println("After logout validating the login page ");
        
        String After_logout_Actual_HomePage_Title = driver.getTitle();
        System.out.println("Actual title after logut is "+After_logout_Actual_HomePage_Title);
        String Expected_Title_AfterLogout = "OrangeHRM";
        System.out.println("Login page validation after logout is "+After_logout_Actual_HomePage_Title.equals(Expected_Title_AfterLogout));
        
        String Actual_URL_AfterLogout = driver.getCurrentUrl();
        System.out.println("Actual url after logout is "+Actual_URL_AfterLogout);
        String Expected_URL_After_Logout ="https://opensource-demo.orangehrmlive.com/web/index.php/auth/login";
        System.out.println("Login page url validation after logout is "+Actual_URL_AfterLogout.equals(Expected_URL_After_Logout));
        
        Thread.sleep(5000);
        
        driver.close();
        

	}

}
