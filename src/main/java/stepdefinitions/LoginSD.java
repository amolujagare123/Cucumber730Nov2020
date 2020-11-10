package stepdefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.jupiter.api.DynamicTest;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterTest;

public class LoginSD {
/*
    WebDriver driver;

    @Given("I am on login page")
    public void i_am_on_login_page() {

        System.out.println("I am on login page");

        WebDriverManager.chromedriver().setup();
            driver = new ChromeDriver();
            driver.manage().window().maximize();
            driver.get("http://stock.scriptinglogic.net/");
    }

    @When("I enter correct username and correct password")
    public void i_enter_correct_username_and_correct_password() {

        System.out.println("I enter correct username and correct password");
        driver.findElement(By.xpath("//input[@id='login-username']")).sendKeys("admin");
        driver.findElement(By.xpath("//input[@id='login-password']")).sendKeys("admin");

    }


    @When("I click on login button")
    public void i_click_on_login_button() {
        System.out.println("I click on login button");
        driver.findElement(By.xpath("//input[@value='LOG IN']")).click();
    }


    @Then("I should be land up on the home page")
    public void i_should_be_land_up_on_the_home_page() {
        System.out.println("I should be land up on the home page");

        String expected ="http://stock.scriptinglogic.net/dashboard.php";

        String actual = driver.getCurrentUrl();

        Assert.assertEquals(actual,expected,"wrong url");

   }*/


}
