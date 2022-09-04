package Day1_Assignments;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Launch_firefoxDriver {

	public static void main(String[] args) {
		
		String workingdir =System.getProperty("user.dir");
		String Firefoxpath = workingdir + "\\Executables\\geckodriver.exe";
		System.setProperty("webdriver.gecko.driver",Firefoxpath);
		WebDriver driver = new FirefoxDriver();
		
		driver.get("https://www.google.com/");
		
		

	}

}
