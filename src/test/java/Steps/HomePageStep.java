package Steps;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class HomePageStep {

    WebDriver driver;
    @Given("Verify that home page is displayed register or login options")
    public void verify_that_home_page_is_displayed_register_or_login_options() {
        System.out.println("Step1: Open Browser");


    }

    @Then("Website should be displayed")
    public void website_should_be_displayed() {
        System.out.println("Step2: Open Url");
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://www.tvhut.com.bd/");

    }

}
