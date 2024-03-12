package steps;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class CucumbertestNGsteps {
	WebDriver d;
	@Given("user open chrome and enter url")
	public void user_open_chrome_and_enter_url() {
	    // Write code here that turns the phrase above into concrete actions
		 System.setProperty("webdriver.chrome.driver", "C:\\Users\\user\\Documents\\seleniumGrid\\chromedriver-win64\\chromedriver.exe");
		  d=new ChromeDriver();
		  d.get("https://v1.training-support.net/selenium/login-form");
		  d.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
	}

	@When("user enter username")
	public void user_enter_username() {
	    // Write code here that turns the phrase above into concrete actions
	   d.findElement(By.id("username")).sendKeys("Admin");
	}

	@When("user enter password")
	public void user_enter_password() {
	    // Write code here that turns the phrase above into concrete actions
		 d.findElement(By.id("password")).sendKeys("password");
	}

	@When("click on login")
	public void click_on_login() {
	    // Write code here that turns the phrase above into concrete actions
	    d.findElement(By.xpath("//button[@onclick='signIn()']")).click();
	}

	@Then("welcome back message is displayed")
	public void welcome_back_message_is_displayed() throws InterruptedException {
	    // Write code here that turns the phrase above into concrete actions
	    System.out.println("login successful");
	    Thread.sleep(2000);
	}

}
