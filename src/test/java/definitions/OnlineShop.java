package definitions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class OnlineShop {
	

	WebDriver driver;
//-----------------------------------------------------BACKGROUND--------------------------------------------------------------------------
	
	@Given("TestMeApp is launched")
	public void testmeapp_is_launched() {
	    // Write code here that turns the phrase above into concrete actions
	   // throw new cucumber.api.PendingException();
		System.setProperty("webdriver.chrome.driver", "MyResources\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("http://10.232.237.143:443/TestMeApp/fetchcat.htm");
		driver.manage().window().maximize();
	}

	@Given("user logs in using his credentials")
	public void user_logs_in_using_his_credentials() {
	    // Write code here that turns the phrase above into concrete actions
	    //throw new cucumber.api.PendingException();
		driver.findElement(By.xpath("//*[@id=\"header\"]/div[1]/div/div/div[2]/div/ul/li[1]/a")).click();
		driver.findElement(By.xpath("//*[@id=\"userName\"]")).sendKeys("lalitha");
		driver.findElement(By.xpath("//*[@id=\"password\"]")).sendKeys("password123");
		driver.findElement(By.xpath("/html/body/main/div/div/div/form/fieldset/div[4]/div/input[1]")).click();
	}
	
//----------------------------------------------------CASESTUDY1-------------------------------------------------------------------------------
	@Given("TestmeApp website is launched")
	public void testmeapp_website_is_launched() {
	    // Write code here that turns the phrase above into concrete actions
	    //throw new cucumber.api.PendingException();
	
		System.setProperty("webdriver.chrome.driver", "MyResources\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("http://10.232.237.143:443/TestMeApp/fetchcat.htm");
		driver.manage().window().maximize();
	}

	@Given("User clicks on register link")
	public void user_clicks_on_register_link() {
	    // Write code here that turns the phrase above into concrete actions
	   // throw new cucumber.api.PendingException();
		driver.findElement(By.xpath("//*[@id=\"header\"]/div[1]/div/div/div[2]/div/ul/li[2]/a")).click();
	}

	@When("User enters the details")
	public void user_enters_the_details() throws InterruptedException {
	    // Write code here that turns the phrase above into concrete actions
	   // throw new cucumber.api.PendingException();
		driver.findElement(By.xpath("//*[@id=\"userName\"]")).sendKeys("Megan");
		driver.findElement(By.xpath("//*[@id=\"firstName\"]")).sendKeys("Megan");
		driver.findElement(By.xpath("//*[@id=\"lastName\"]")).sendKeys("Markle");
		driver.findElement(By.xpath("//*[@id=\"password\"]")).sendKeys("meghan45");
		driver.findElement(By.xpath("//*[@id=\"pass_confirmation\"]")).sendKeys("meghan45");
		driver.findElement(By.xpath("//*[@id=\"gender\"]")).click();
		driver.findElement(By.xpath("//*[@id=\"emailAddress\"]")).sendKeys("meghan0@gmail.com");
		driver.findElement(By.xpath("//*[@id=\"mobileNumber\"]")).sendKeys("1111122222");
		driver.findElement(By.xpath("//*[@id=\"dob\"]")).sendKeys("10/12/1997");
		driver.findElement(By.xpath("//*[@id=\"address\"]")).sendKeys("Hinjewadi,Pune");
		Select question = new Select(driver.findElement(By.name("securityQuestion")));
		question.selectByIndex(0);
		driver.findElement(By.xpath("//*[@id=\"answer\"]")).sendKeys("Pune");
		Thread.sleep(3000);
		
	}

	@Then("Clicks on register button for account creation")
	public void clicks_on_register_button_for_account_creation() {
	    // Write code here that turns the phrase above into concrete actions
	    //throw new cucumber.api.PendingException();
		driver.findElement(By.xpath("/html/body/main/div/div/form/fieldset/div/div[13]/div/input[1]")).click();
		driver.close();
	}
	
//------------------------------------------------CASESTUDY2-------------------------------------------------------------------------------------
	@Given("Registered user clicks on Login Link")
	public void registered_user_clicks_on_Login_Link() {
	    // Write code here that turns the phrase above into concrete actions
	   // throw new cucumber.api.PendingException();
		System.setProperty("webdriver.chrome.driver", "MyResources\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("http://10.232.237.143:443/TestMeApp/fetchcat.htm");
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//*[@id=\"header\"]/div[1]/div/div/div[2]/div/ul/li[1]/a")).click();
		
	}

	@When("User enters the username {string}")
	public void user_enters_the_username(String string1) {
	    // Write code here that turns the phrase above into concrete actions
	   // throw new cucumber.api.PendingException();
		driver.findElement(By.xpath("//*[@id=\"userName\"]")).sendKeys(string1);
	}

	@When("User enters the password {string}")
	public void user_enters_the_password(String string2) {
	    // Write code here that turns the phrase above into concrete actions
	   // throw new cucumber.api.PendingException();
		driver.findElement(By.xpath("//*[@id=\"password\"]")).sendKeys(string2);
	}

	@Then("Clicks on Login button to access the website")
	public void clicks_on_Login_button_to_access_the_website() {
	    // Write code here that turns the phrase above into concrete actions
	   // throw new cucumber.api.PendingException();
		driver.findElement(By.xpath("/html/body/main/div/div/div/form/fieldset/div[4]/div/input[1]")).click();
	}
	
//---------------------------------------------------------CASESTUDY3-----------------------------------------------------------------------------
	@When("user searches for the desired product")
	public void user_searches_for_the_desired_product() {
	    // Write code here that turns the phrase above into concrete actions
	   // throw new cucumber.api.PendingException();
		driver.findElement(By.xpath("//*[@id=\"myInput\"]")).sendKeys("Head");
		driver.findElement(By.xpath("//*[@id=\"myInputautocomplete-list\"]/div")).click();
		
	}

	@When("search leads to the desired product details")
	public void search_leads_to_the_desired_product_details() {
	    // Write code here that turns the phrase above into concrete actions
	  //  throw new cucumber.api.PendingException();
		driver.findElement(By.xpath("/html/body/div[1]/form/input")).click();
		
	}

	@Then("user adds the product to the cart and proceeds for the payment")
	public void user_adds_the_product_to_the_cart_and_proceeds_for_the_payment() throws InterruptedException {
	    // Write code here that turns the phrase above into concrete actions
	   // throw new cucumber.api.PendingException();
		driver.findElement(By.xpath("/html/body/section/div/div/div[2]/div/div/div/div[2]/center/a")).click();
		driver.findElement(By.xpath("//*[@id=\"header\"]/div[1]/div/div/div[2]/div/a[2]")).click();
		driver.findElement(By.xpath("//*[@id=\"cart\"]/tfoot/tr[2]/td[5]/a")).click();
		driver.findElement(By.xpath("/html/body/b/div/div/div[1]/div/div[2]/div[3]/div/form[2]/input")).click();
		Thread.sleep(4000);
		
		driver.findElement(By.xpath("//*[@id=\"swit\"]/div[1]/div/label/i")).click();
		driver.findElement(By.xpath("//*[@id=\"btn\"]")).click();
		
		driver.findElement(By.xpath("//*[@id=\"horizontalTab\"]/div[2]/div/div/div/div/form/input[1]")).sendKeys("123456");
		driver.findElement(By.xpath("//*[@id=\"horizontalTab\"]/div[2]/div/div/div/div/form/input[2]")).sendKeys("Pass@456");
		
		
		
		
	}







}
