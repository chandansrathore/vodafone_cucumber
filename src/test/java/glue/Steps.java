package glue;

import java.util.concurrent.TimeUnit;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;


public class Steps {
	WebDriver driver;
	
	@Given("^I am able to access magento Web page$")
	public void i_am_able_to_access_magento_Web_page()  {
	    // Write code here that turns the phrase above into concrete actions
		//System.setProperty("webdriver.chrome.driver", "drivers/chromedriver.exe");
		driver =new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.get("http://magento.com");
		driver.findElement(By.className("fa-user")).click();

	}

	@When("^I update teh user name as \"([^\"]*)\"$")
	public void i_update_teh_user_name_as(String arg1){
	    // Write code here that turns the phrase above into concrete actions
		driver.findElement(By.id("email")).sendKeys(arg1);

	}

	@When("^I update the password as \"([^\"]*)\"$")
	public void i_update_the_password_as(String arg1) {
	    // Write code here that turns the phrase above into concrete actions
		driver.findElement(By.id("pass")).sendKeys(arg1);

	}

	@When("^I click on the login botton$")
	public void i_click_on_the_login_botton() {
	    // Write code here that turns the phrase above into concrete actions
		driver.findElement(By.id("send2")).click();

	}

	@Then("^I should find the magento id as \"([^\"]*)\"$")
	public void i_should_find_the_magento_id_as(String arg1)  {
	    // Write code here that turns the phrase above into concrete actions
		Assert.assertEquals(arg1, driver.findElement(By.xpath("//div[@class='account-help']/span")).getText());
	driver.quit();
	}
	@Then("^I should see the error message as \"([^\"]*)\"$")
	public void i_should_see_the_error_message_as(String arg1)  {
	    // Write code here that turns the phrase above into concrete actions
		Assert.assertEquals(arg1,driver.findElement(By.className("error-msg")).getText());
		driver.quit();
	}
	
} 
