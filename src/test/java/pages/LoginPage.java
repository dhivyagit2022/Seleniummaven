package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;

import testcases.BaseClass;

public class LoginPage {
	WebDriver driver = BaseClass.driver;
	
	
	ExtentTest test = BaseClass.test;
	
	@FindBy(className = "login")
	WebElement LoginLink;
	
	
	@FindBy(name ="user_login")
	WebElement UserName;
	
	@FindBy(id = "password")
	WebElement Password;
	
	@FindBy(name = "btn_login")
	WebElement btn_login;
	
	@FindBy(className = "rememberMe")
	WebElement RememberMe;
	
	public LoginPage() {
		PageFactory.initElements(driver, this);
	}
	
	//------------------Functions---------------------------//
	
	public void  LoginFunction(String UserNameVal,String PasswordVal) {
		
		LoginLink.click();
		test.log(LogStatus.PASS, "Click on Login Link", "Login link clicked successfully");
	
	    UserName.sendKeys(UserNameVal);
	    test.log(LogStatus.PASS, "Enter Email Address", "Email Enered Successfully");
	    
	    Password.sendKeys(PasswordVal);
	    test.log(LogStatus.PASS, "Enter PAssword", "Password entered successfully");
	    
	    RememberMe.click();
	    test.log(LogStatus.PASS, "Click on RememberMe", "clicked successfully");
	    
	    btn_login.click();
	    test.log(LogStatus.PASS, "Click on btn_login", "Login button clicked successfully");
	 
	  }
	 

}
