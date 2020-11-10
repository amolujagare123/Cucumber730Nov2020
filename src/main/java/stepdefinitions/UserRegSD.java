package stepdefinitions;

import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.testng.Assert;

import java.util.List;

public class UserRegSD {


    @Given("I am on user registration page")
    public void i_am_on_user_registration_page() {
        System.out.println("I am on user registration page");
    }




    @When("I enter following data")
    public void i_enter_following_data(DataTable dataTable) {

          List<String> data   =  dataTable.asList();

        System.out.println("name:"+data.get(0));
        System.out.println("email:"+data.get(1));
        System.out.println("phone:"+data.get(2));
        System.out.println("city:"+data.get(3));



    }

    @Then("user equiry should be added")
    public void user_equiry_should_be_added() {
        System.out.println("user equiry should be added");

        Assert.assertEquals(true,false,"this test is failed");
    }
}
