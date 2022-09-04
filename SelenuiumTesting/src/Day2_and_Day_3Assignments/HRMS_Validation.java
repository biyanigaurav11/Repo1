package Day2_and_Day_3Assignments;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class HRMS_Validation {

	public static void main(String[] args) throws InterruptedException {
		
		String CurrentWorkDir = System.getProperty("user.dir");
		String Chromepath = CurrentWorkDir + "Executables\\chromedriver.exe";
		
		System.setProperty("Webdriver.chrome.driver", Chromepath);
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://opensource-demo.orangehrmlive.com/");
		
		System.out.println("Title validation");
		
		String Actual_Title = driver.getTitle();
		String Expected_Title = "OrangeHRM";
		System.out.println("Actual Title is"+Actual_Title);
		System.out.println("Expected Title is "+Expected_Title);
		System.out.println("Actual and Expected Title comparison  "+Actual_Title.equals(Expected_Title));
		
        System.out.println("URL validation");
		
		String Actual_URL = driver.getCurrentUrl();
		String Expected_URL = "https://opensource-demo.orangehrmlive.com/";
		System.out.println("Actual Title is "+Actual_URL);
		System.out.println("Expected Title is "+Expected_URL);
		System.out.println("Actual and Expected Title comparison "+Actual_URL.equals(Expected_URL));
		
		
		Thread.sleep(3000);
		
		String PageSource = driver.getPageSource();
		System.out.println("page length is "+PageSource.length());
		
		driver.close();
		
	}

}
