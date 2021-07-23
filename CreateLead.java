package seleniumweek2;


import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class CreateLead {

	public static void main(String[] args) {
		
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver=new ChromeDriver();
		
		 driver.get("http://leaftaps.com/opentaps/control/login"); 
		 driver.findElementById("username").sendKeys("demosalesmanager");
		 driver.findElementById("password").sendKeys("crmsfa");
		 driver.findElementByClassName("decorativeSubmit").click();
		 driver.findElementByLinkText("CRM/SFA").click();
		 driver.findElementByLinkText("Leads").click();
		 driver.findElementByLinkText("Create Lead").click();
		 driver.findElementById("createLeadForm_companyName").sendKeys("tcs");
		 WebElement firstname=driver.findElementById("createLeadForm_firstName");
		 String s1="baristo";
		 firstname.sendKeys(s1);
		 driver.findElementById("createLeadForm_lastName").sendKeys("england");
		 driver.findElementById("createLeadForm_firstNameLocal").sendKeys("bo");
		 driver.findElementById("createLeadForm_lastNameLocal").sendKeys("eng");
		driver.findElementById("createLeadForm_personalTitle").sendKeys("tc");
		driver.findElementById("createLeadForm_birthDate").sendKeys("06/29/21");
		 driver.findElementById("createLeadForm_generalProfTitle").sendKeys("gps");
		 driver.findElementById("createLeadForm_departmentName").sendKeys("deep");
			driver.findElementById("createLeadForm_annualRevenue").sendKeys("12345");
			driver.findElementById("createLeadForm_numberEmployees").sendKeys("10");
			 driver.findElementById("createLeadForm_sicCode").sendKeys("gpscode");
			 driver.findElementById("createLeadForm_tickerSymbol").sendKeys("symbolcs");
			 driver.findElementById("createLeadForm_description").sendKeys("description");
			 driver.findElementById("createLeadForm_importantNote").sendKeys("note");
			 //contact
			 driver.findElementById("createLeadForm_primaryPhoneAreaCode").sendKeys("345345");
			 driver.findElementById("createLeadForm_primaryPhoneNumber").sendKeys("8056432456");
			 driver.findElementById("createLeadForm_primaryPhoneExtension").sendKeys("567");
			 driver.findElementById("createLeadForm_primaryPhoneAskForName").sendKeys("bom");
			 driver.findElementById("createLeadForm_primaryEmail").sendKeys("bo@gmail.com");
			driver.findElementById("createLeadForm_primaryWebUrl").sendKeys("https://be.cog.com");
			//Address
			 driver.findElementById("createLeadForm_generalToName").sendKeys("try");
			 driver.findElementById("createLeadForm_generalAttnName").sendKeys("nsszfdsf");
			 driver.findElementById("createLeadForm_generalAddress1").sendKeys("567 ok street");
			 driver.findElementById("createLeadForm_generalCity").sendKeys("bombay");
			 driver.findElementById("createLeadForm_generalPostalCode").sendKeys("630345");
			driver.findElementById("createLeadForm_generalPostalCodeExt").sendKeys("675");
			System.out.println(s1);
			driver.findElementByClassName("smallSubmit").click();
			String title=driver.getTitle();
			if(title.equals("View Lead"))
			{
				System.out.println("right page");
			}
		 
		 
		 
		 
		 
		
	  
		
		

	}

}
