package stepDef.api;

import functions.functionApi;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;

public class apiStepDefs {
    @Given("User get endpoint {string} with parameter {int}")
    public void getSingleUser(String arg0, int arg1){
        functionApi.getSingleUser(arg0,arg1);
    }

    @Then("User get response {string} OK")
    public void userGetResponse(String  arg0) {
        functionApi.getTheRespons(arg0);
    }
}
