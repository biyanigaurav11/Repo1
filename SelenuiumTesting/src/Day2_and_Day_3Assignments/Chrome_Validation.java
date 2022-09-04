package Day2_and_Day_3Assignments;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Chrome_Validation {

	public static void main(String[] args) {
		
    String currentWorkDir = System.getProperty("user.dir");
    String ChromePath = currentWorkDir + "\\Executables\\chromedriver.exe";
    System.setProperty("webdriver.chrome.driver", ChromePath);
    
    WebDriver driver = new ChromeDriver();
    
    driver.get("https://www.google.com");
    driver.manage().window().maximize();
    
    System.out.println("Title validation");
    String Title = driver.getTitle();
    System.out.println("Actual title is "+Title);
    String Expected_Title = "Google";
    System.out.println("Expected Title is "+Expected_Title);
    System.out.println("Expected and Actual Title validation "+Title.equals(Expected_Title));
  //  System.out.println("Expected Title is ");
    
    System.out.println("URL Validation");
    String url = driver.getCurrentUrl();
    String Expected_Url = "https://www.google.com/";
    System.out.println("Actual url is "+url);
    System.out.println("Expected url is "+Expected_Url);
    System.out.println("Url validation is "+url.equals(Expected_Url));
    
    //page source
    System.out.println("Page Source started");
    String pageSource = driver.getPageSource();
    System.out.println("page legth is "+pageSource.length());
  //  System.out.println("page source containing "+pageSource);
    
    
    driver.close();
    
    
	}

}
