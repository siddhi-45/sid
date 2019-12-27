package definitions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class examclass {
	
            WebDriver driver;
            
  @Given("User is on homepage")
  public void user_is_on_homepage() 
  {
	  System.setProperty("webdriver.chrome.driver", "MyResources\\chromedriver.exe");
	  driver = new ChromeDriver();
	  driver.get("http://10.232.237.143:443/TestMeApp/fetchcat.htm");
	  driver.findElement(By.xpath("//*[@id=\"header\"]/div[1]/div/div/div[2]/div/ul/li[1]/a")).click();
	  driver.findElement(By.xpath("//*[@id=\"username\"]")).sendKeys("Lalitha");
	  driver.findElement(By.xpath("//*[@id=\"password\"]")).sendKeys("password123");
	  driver.manage().window().maximize();
	  
	  throw new cucumber.api.PendingException();
  }
  
  @When("User enters username and password and click on login button")
  public void user_enters_username_and_password_and_click_on_login_button() 
  {
	  //driver.findElement(By.xpath("//*[@id=\"header\"]/div[1]/div/div/div[2]/div/ul/li[1]/a")).click();
	  driver.findElement(By.xpath("//*[@id=\"username\"]")).sendKeys("Lalitha");
	  driver.findElement(By.xpath("//*[@id=\"password\"]")).sendKeys("password123");
	  driver.findElement(By.xpath("/html/body/main/div/div/div/form/fieldset/div[4]/div/input[1]")).click();
	  throw new cucumber.api.PendingException();
  }
  
 
  
  @Given("Navigate to all categories electronic and headphone")
  public void navigate_to_all_categories_electronic_and_headphone()
  {
	  driver.findElement(By.xpath("//*[@id=\"myInput\"]")).click();
	  driver.findElement(By.xpath("//*[@id=\"myInputautocomplete-list\"]/div")).click();
	  throw new cucumber.api.PendingException();
  }
  
  @Given("Add product into shopping cart")
  public void add_product_into_shopping_cart() 
  {
	  
	  throw new cucumber.api.PendingException();
  }
  
  @When("proceed to checkout")
  public void proceed_to_checkout()
  {
	  
	  throw new cucumber.api.PendingException();
  }
  
  @When("select bank and add credentials")
  public void select_bank_and_add_credentials()
  {
	  
	  throw new cucumber.api.PendingException();
  }
  
  @Then("redirect to the thankyou page")
  public void redirect_to_the_thankyou_page() 
  {
	  
	  throw new cucumber.api.PendingException();
  }
            
          
}
