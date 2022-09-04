package Day2_and_Day_3Assignments;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ActiTime_Validation {

	public static void main(String[] args) throws InterruptedException {
		
		String WorkingDir = System.getProperty("user.dir");
		String Chromepath = WorkingDir + "\\Executables\\chromedriver.exe";
		
		System.setProperty("webdriver.chrome.driver", Chromepath);
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://demo.actitime.com/login.do");
		driver.manage().window().maximize();
		
		System.out.println("Title Validation");
		
		String Title = driver.getTitle();
		String Expected_Title = "actiTIME - Login";
		
		System.out.println("Actual Title is "+Title);
		System.out.println(" Expected Title is "+Expected_Title);
		System.out.println("Actual and Expected Title comparison "+Title.equals(Expected_Title));
		
		System.out.println("URL Validation");
		
		String URL = driver.getCurrentUrl();
		String Expected_URL = "https://demo.actitime.com/login.do";
		System.out.println("Actual link is "+URL);
		System.out.println("Expected link is"+Expected_URL);
		
		System.out.println("Actual and Expected Link comparison "+URL.equals(Expected_URL));
		
		System.out.println("Page Source Started");
		
		String PageSource = driver.getPageSource();
		
		System.out.println("Page source is "+PageSource.length());
		
		Thread.sleep(3000);
		
		driver.close();

	}

}
