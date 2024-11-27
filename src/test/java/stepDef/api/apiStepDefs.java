package stepDef.api;

import functions.functionApi;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;

public class apiStepDefs {
    @Given("User get endpoint {string} with parameter {int}")
    public void getSingleUser(String arg0, int arg1){
        functionApi.getSingleUser(arg0,arg1);
    }

    @Then("User get response {int} OK")
    public void userGetResponse(int  arg0) {
        functionApi.getTheRespons(arg0);
    }

    @And("Body contain id = {int} first_name = {string} and last_name = {string}")
    public void bodyContainIdFirst_nameGeorgeAndLast_nameBluth(int arg0, String arg1, String arg2) {
        functionApi.assertBodyId(arg0);
        functionApi.assertBodyFName(arg1);
        functionApi.assertBodyLName(arg2);
    }

    @And("Assert JSon Body Scheme")
    public void assertJSonBodyScheme() {
    }
}
