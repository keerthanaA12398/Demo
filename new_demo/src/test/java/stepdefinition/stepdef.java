package stepdefinition;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.When;

public class stepdef {
	WebDriver driver;
	@Given("user launches chrome browser")
	public void user_launches_chrome_browser() {
	    System.setProperty("webdriver.chrome.driver", "C:\\Users\\User\\Downloads\\chromedriver.exe");
	    //driver=new ChromeDriver();
	    driver.get("https://lkmdemoaut.accenture.com/TestMeApp/fetchcat.htm");
	}
	@When("user tes to signup page")
	public void user_tes_to_signup_page() {
	    driver.findElement(By.xpath("//*[@id=\"header\"]/div[1]/div/div/div[2]/div/ul/li[2]/a")).click();
	}

	@When("user enters with user name as {string}")
	public void user_enters_with_user_name_as(String string) {
	    driver.findElement(By.name("userName")).sendKeys("gopikashree");
	}

	@When("user enters with first name as {string}")
	public void user_enters_with_first_name_as(String string) {
	    driver.findElement(By.name("firstName")).sendKeys("gopika");
	   
	    
	}

	@When("user enters with last name as {string}")
	public void user_enters_with_last_name_as(String string) {
	    driver.findElement(By.name("lastName")).sendKeys("shree");
	}
	@When("user enter the password as {string}")
	public void user_enter_the_password_as(String string) {
	  driver.findElement(By.name("password")).sendKeys("password@1");
	}

	@When("user enters the confirm password as {string}")
	public void user_enters_the_confirm_password_as(String string) {
	    driver.findElement(By.name("confirmPassword")).sendKeys("password@1");
	}
	@When("user enters the gender as {string}")
	public void user_enters_the_gender_as(String string) {
	    driver.findElement(By.name("gender")).click();
	}
	@When("user enters the email as {string}")
	public void user_enters_the_email_as(String string) {
	    driver.findElement(By.name("emailAddress")).sendKeys("rthigopika@gmail.com");
	}

	@When("user enters the mobile number as {string}")
	public void user_enters_the_mobile_number_as(String string) {
	    driver.findElement(By.name("mobileNumber")).sendKeys("9840692787");
	}

	@When("user enters the DOB as {string}")
	public void user_enters_the_DOB_as(String string) {
	   driver.findElement(By.name("dob")).sendKeys("30/07/1997");
	}
	@When("user enters the Address as {string}")
	public void user_enters_the_Address_as(String string) {
	    driver.findElement(By.id("address")).sendKeys("chennai");
	}

	@When("user enters the Security Question as {string}")
	public void user_enters_the_Security_Question_as(String string) {
	   driver.findElement(By.name("securityQuestion")).sendKeys("what is your birth place");
	}

	@When("user enters the Answer as {string}")
	public void user_enters_the_Answer_as(String string) {
	    driver.findElement(By.name("answer")).sendKeys("chennai");
	    driver.findElement(By.name("Submit")).click();
	    driver.close();
	    
	   /* driver.findElement(By.id("myInput")).sendKeys("Head");
	    driver.findElement(By.xpath("//div[text()='Headphone']")).sendKeys(Keys.DOWN);
	    driver.findElement(By.xpath("//div[text()='Headphone']")).sendKeys(Keys.ENTER); 
*/
	}


}
