package stepDefination;

import java.sql.DriverManager;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.*;
import io.github.bonigarcia.wdm.WebDriverManager;
import pageObject.LoginPage;

public class StepDef_001 {
	WebDriver driver;
	LoginPage lp;
	Logger logger = LogManager.getLogger(StepDef_001.class);
	
	
	
	@Given("lunch chrome Browser")
	public void lunch_chrome_browser() {
		WebDriverManager.chromedriver().setup();
		driver=new ChromeDriver();
		
		logger.info("chrome driver lunched");
		lp=new LoginPage(driver);
	}

	@When("url provided is {string}")
	public void url_provided_is(String url) {
		driver.get(url);
		driver.manage().window().maximize();
		logger.info("chrome driver lunched and url given");
		
	    
	}

	@When("User enters username {string} and Password {string}")
	public void user_enters_username_and_password(String username, String password) {
		
		lp.setUsername(username);
		lp.setUserpassword(password);
		logger.info("login info provided");
	}

	@When("Click submit button")
	public void click_submit_button() {
		lp.clickSignin();
	    
	}

	@Then("login successful to intrapage")
	public void login_successful_to_intrapage() {
		
		 String str2 =driver.findElement(By.xpath("//tr/td[@class='worldcup_msg_title']")).getText();
		    System.out.println(str2);
			
			if(str2.equalsIgnoreCase("Public Notice")){
				Assert.assertTrue(true);
			}
	}

	@Then("close popup")
	public void close_popup() {
		lp.closePopupMsg();
	   
	}

	@When("clicked on logout")
	public void clicked_on_logout() {
		lp.logout();
		
	    	}

	@Then("close Browser")
	public void close_browser() {
		
		driver.quit();
	    
	}


}
