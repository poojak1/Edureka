package co.sigmacare.selenium.webdriver.basic;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;// is a library package which contains the required class to initiate the browser loaded with a specific driver.
import org.openqa.selenium.chrome.ChromeDriver;

public class Sigma {


	WebDriver driver;
	
	public void invokeBrowser(){
		
	try {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Pooja.Kasture\\Documents\\Automation\\chromedriver_win32\\chromedriver.exe");	
		  driver= new ChromeDriver();
		  driver.manage().deleteAllCookies();//delete all browsercookie
		  driver.manage().window().maximize();// maximize the window
		  driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);//page synchronization
		  driver.manage().timeouts().pageLoadTimeout(30,TimeUnit.SECONDS);//pageload time
		  
		  
		  driver.get("https://lab03-login.lab.sigmacare.com/Login/LoginForm.aspx");
		  
		 
		  
		     driver.findElement(By.id("accountID")).sendKeys("");
			 driver.findElement(By.id("usersID")).sendKeys("");
			 driver.findElement(By.id("usersPassword")).sendKeys("");
			 driver.findElement(By.id("submitButton")).click();
			 //driver.wait(3000);
			 searchResident();
			
		
			 //driver.quit();
			 
	} catch (Exception e) {
		e.printStackTrace();
	}
	
	
}
	
	
	 public void searchResident(){
		try {
	
		{
			driver.findElement(By.tagName("/ToggleMenu")).click();
			driver.findElement(By.tagName("Select_Resident")).click();
			
		}
	} 
		catch (Exception e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
}	
	
	public static void main(String[] args) {
		
		Sigma myObj= new Sigma();
		myObj.invokeBrowser();
		
		
				

	}

}
