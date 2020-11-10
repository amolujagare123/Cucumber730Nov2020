package stepdefinitions;

import io.cucumber.java.After;
import io.cucumber.java.Before;

public class Hooks {

    @Before("@userReg")
    public void beforeScenario()
    {
        System.out.println("========@Before===>>>");
    }

    @After("@userReg")
    public void afterScenario()
    {
        System.out.println("========@After===>>>");
    }
}
