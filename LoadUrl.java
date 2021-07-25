package seleniumweek2;

import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class LoadUrl {

	public static void main(String[] args) {
		//setup driver
	WebDriverManager.chromedriver().setup();
	//instance creation
	ChromeDriver driver=new ChromeDriver();
	driver.get("https://acme-test.uipath.com/login");
	driver.findElementById("email").sendKeys("kumar.testleaf@gmail.com");
	driver.findElementById("password").sendKeys("leaf@12");
	driver.findElementByXPath("//button[@type='submit']").click();
	String title=driver.getTitle();
	System.out.println(title);
	driver.findElementByLinkText("Log Out");
	driver.close();
	}

}
