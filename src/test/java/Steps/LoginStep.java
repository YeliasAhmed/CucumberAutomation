package Steps;
import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class LoginStep {

    WebDriver driver;
    @Given("user is on login page")
    public void user_is_on_login_page() {
        System.out.println("Step1: User is on login page");
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("");


    }

   /* @When("big discount page is shown")
    public void big_discount_page_is_shown() {
        System.out.println("Step2: big discount page is shown");
        driver.findElement(By.xpath("(//span[contains(text(), \"No, I do not feel lucky X\")])[1]")).click();



    }
*/
    @When("user click on login button")
    public void user_click_on_login_button(){

        System.out.println("Step2: User clicks on login button");
        driver.findElement(By.xpath("(//span[contains(text(), \"Login\")])[1]")).click();

        driver.switchTo().frame(0);


    }

    @And("user enters username and password")
    public void user_enters_username_and_password(){
        System.out.println("Step3: User enters username and password");

       driver.findElement(By.xpath("//input[@id='input-email']")).sendKeys("yeliasahmed89@gmail.com");
       driver.findElement(By.xpath("//input[@id='input-password']")).sendKeys("12345");

    }

    @When("click on login button")
    public void click_on_login_button(){
        System.out.println("Step4: click on login button");
        driver.findElement(By.xpath("//span[contains(text(),'Login')]")).click();


    }

    @Then("user should land on homepage")
    public void user_should_land_on_homepage(){
        System.out.println("Step6:User logged in successfully");


    }

}
