package Day2_and_Day_3Assignments;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class Vtiger_Validation {

	public static void main(String[] args) throws InterruptedException {
		
		String WorkingDir = System.getProperty("user.dir");
		
		String ChromePath = WorkingDir + "\\Executables\\chromedriver.exe";
		
		System.setProperty("webdriver.chrome.driver", ChromePath);
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://demo.vtiger.com/vtigercrm/index.php");
		
		System.out.println("Title validation");
		
		String Title = driver.getTitle();
		String Expected_Title = "Vtiger";
		
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
	     
	     Thread.sleep(3000);
	     driver.close();
	
	}

}
