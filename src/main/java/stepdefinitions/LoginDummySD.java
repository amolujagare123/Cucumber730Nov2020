package stepdefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class LoginDummySD {


    @Given("I am on login page")
    public void i_am_on_login_page() {

        System.out.println("I am on login page");


    }

    @When("I enter correct username and correct password")
    public void i_enter_correct_username_and_correct_password() {

        System.out.println("I enter correct username and correct password");

    }


    @When("I click on login button")
    public void i_click_on_login_button() {
        System.out.println("I click on login button");

    }


    @Then("I should be land up on the home page")
    public void i_should_be_land_up_on_the_home_page() {
        System.out.println("I should be land up on the home page");

    }

    @When("I enter username as {string} password as {string}")
    public void i_enter_username_as_password_as(String username, String password) {

        System.out.println("username:"+username);
        System.out.println("password:"+password);

    }


    @When("^we username as (.+) password as (.+)$")
    public void we_username_as_password_as(String username, String password)
            {
                System.out.println("username:"+username);
                System.out.println("password:"+password);
    }

    @Given("^I open browser and maximize$")
    public void i_open_browser_and_maximize() throws Throwable {

        System.out.println("-----------------I open browser and maximize");

    }
}
