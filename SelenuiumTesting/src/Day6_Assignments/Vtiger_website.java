package Day6_Assignments;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Vtiger_website {

public static void main(String[] args) throws InterruptedException {
				
				String WorkingDir = System.getProperty("user.dir");
				
				String ChromePath = WorkingDir + "\\Executables\\chromedriver.exe";
				
				System.setProperty("webdriver.chrome.driver", ChromePath);
				
				WebDriver driver = new ChromeDriver();
				
				driver.get("https://demo.vtiger.com/vtigercrm/index.php");
				
				driver.manage().window().maximize();
				driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
				
				
				System.out.println("Title validation");
				
				String Title = driver.getTitle();
				String Expected_Title = "vtiger";
				
				System.out.println("Actual Title is "+Title);
				System.out.println("Expected Title is "+Expected_Title);
				System.out.println("Actual Title and Expected comparison is "+Title.equals(Expected_Title));
				
				System.out.println("URL Validation ");
				
				String URL = driver.getCurrentUrl();
			     String Expected_URL = "https://demo.vtiger.com/vtigercrm/index.php";
			     
			     System.out.println("Actual URL is "+URL);
			     System.out.println("Expected URL is "+Expected_URL);
			     
			     System.out.println("Actual and Expected URL Comparison is "+URL.equals(Expected_URL));
			     
			     System.out.println("Page source is");
			     String PageSource = driver.getPageSource();
			     
			     System.out.println("page length is "+PageSource.length());
			    
		WebElement inputUsername = driver.findElement(By.cssSelector("input[id='username']"));
		inputUsername.clear();
		inputUsername.sendKeys("admin");
		WebElement inputPassword = driver.findElement(By.cssSelector("input[id='password']"));
		inputPassword.clear();
		inputPassword.sendKeys("Test@123");
			    
	    driver.findElement(By.cssSelector("button.button.buttonBlue")).submit();
	/*	driver.findElement(By.cssSelector("button.btn.btn-default.addButton.dropdown-toggle")).click();
		Thread.sleep(4000);
		driver.findElement(By.cssSelector("a[data-name='History']")).click();
		Thread.sleep(4000);
		driver.findElement(By.cssSelector("button.btn.btn-default.addButton.dropdown-toggle")).click();
		Thread.sleep(4000);
		driver.findElement(By.cssSelector("a[data-name='GroupedBySalesPerson']")).click();
		Thread.sleep(4000);
		driver.findElement(By.cssSelector("button.btn.btn-default.addButton.dropdown-toggle")).click();
		Thread.sleep(4000);
		driver.findElement(By.cssSelector("a[data-name='CalendarActivities']")).click();
		Thread.sleep(4000);
		driver.findElement(By.cssSelector("button.btn.btn-default.addButton.dropdown-toggle")).click();
		Thread.sleep(4000);
		driver.findElement(By.cssSelector("a[data-name='GroupedBySalesStage']")).click();*/
	   /* driver.findElement(By.cssSelector("i.fa.fa-remove")).click();
	   Thread.sleep(2000);
	    driver.switchTo().alert().accept();
	    driver.findElement(By.cssSelector("i.fa.fa-remove")).click();
	    Thread.sleep(2000);
	    driver.switchTo().alert().accept();
	    driver.findElement(By.cssSelector("i.fa.fa-remove")).click();
	    Thread.sleep(2000);
	  driver.switchTo().alert().accept();
	    driver.findElement(By.cssSelector("i.fa.fa-remove")).click();
	    Alert obj1 = driver.switchTo().alert();
		Thread.sleep(1000);
		obj1.accept();
	    
			  */
		driver.findElement(By.cssSelector("span.fa.fa-user")).click();
		driver.findElement(By.cssSelector("a[id='menubar_item_right_LBL_SIGN_OUT']")).click();
		Thread.sleep(3000);
			   driver.close();
			
			}

		

      
	}


