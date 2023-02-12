package Steps;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class RegisterStep {
    WebDriver driver;
    @Given("Verify that register contains name, email, telephone, password and submit button")
    public void verify_that_register_contains_name_email_telephone_password_and_submit_button() {
        System.out.println("Step1: Open browser");
        System.out.println("Step2: Open Url");
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://www.tvhut.com.bd/");

    }
    @Given("Clicks on the register button from the right of the corner")
    public void clicks_on_the_register_button_from_the_right_of_the_corner() {

        System.out.println("Step3: Clicks on the register button from the right of the corner");
        driver.findElement(By.xpath("//header/div[1]/div[2]/div[3]/div[1]/div[1]/ul[1]/li[2]/a[1]/span[1]"));

    }
    @When("Fill up the required fields with valid credentials")
    public void fill_up_the_required_fields_with_valid_credentials() {
        System.out.println("Step4: Fill up the required fields with valid credentials");
        driver.findElement(By.xpath("//input[@id='input-firstname']")).sendKeys("Yelias");
        driver.findElement(By.xpath("//input[@id='input-lastname']")).sendKeys("Ahmed");
        driver.findElement(By.xpath("//input[@id='input-email']")).sendKeys("yeliasahmed89@gmail.com");
        driver.findElement(By.xpath("//input[@id='input-telephone']")).sendKeys("123456789");
        driver.findElement(By.xpath("//input[@id='input-password']")).sendKeys("12345");
        driver.findElement(By.xpath("//input[@id='input-confirm']")).sendKeys("12345");
        driver.findElement(By.xpath("//input[@name='agree']")).click();



    }
    @Then("Clicks on the continue button")
    public void clicks_on_the_continue_button() {

        System.out.println("Step5: Clicks on the continue button");
        driver.findElement(By.xpath("//span[contains(text(),'Continue')]")).click();

    }
}
