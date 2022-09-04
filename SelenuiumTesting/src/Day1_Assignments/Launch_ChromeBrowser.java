package Day1_Assignments;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Launch_ChromeBrowser {

	public static void main(String[] args) {
		
	String workdir = System.getProperty("user.dir");
  // System.out.println(workdir);
	String ChromePath = workdir + "\\Executables\\chromedriver.exe";
	System.setProperty("webdriver.chrome.driver",ChromePath);
	WebDriver driver = new ChromeDriver();
	driver.get("https://erail.in/");
	
	}

}
