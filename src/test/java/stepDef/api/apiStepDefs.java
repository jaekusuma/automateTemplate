package stepDef.api;

import functions.functionApi;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import java.io.File;

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
        File json = new File(functionApi.JSON_SCHEME + "/getSingleUser.json");
        functionApi.assertJsonSchema(json);
    }

    @Given("Post user login with request body {string} to endpoint {string}")
    public void postUserLoginWithValidJsonToEndpoint(String arg0, String arg1) {
        functionApi.postFunction(arg0, arg1);
    }

    @Then("Status code should be {int} OK")
    public void statusCodeShouldBeOK(int arg0) {
        functionApi.getTheRespons(arg0);
    }

    @And("Response body contain token {string}")
    public void responseBodyContainToken(String arg0) {
        functionApi.assertToken(arg0);
    }

    @And("Validate valid login user schema")
    public void validateValidLoginUserSchema() {
        File json = new File(functionApi.JSON_SCHEME + "/postLogin.json");
        functionApi.assertJsonSchema(json);
    }

    @Given("Post create user with request body {string} to endpoint {string}")
    public void postCreateUserWithRequestBodyToEndpoint(String arg0, String arg1) {
        functionApi.postFunction(arg0, arg1);
    }

    @Then("Status code should be {int} created")
    public void statusCodeShouldBeCreated(int arg0) {
        functionApi.getTheRespons(arg0);
    }

    @And("Response body contain name {string} job {string}")
    public void responseBodyContainNameJob(String arg0, String arg1) {
        functionApi.assertName(arg0);
        functionApi.assertJob(arg1);
    }

    @And("Validate create user json schema")
    public void validateCreateUserJsonSchema() {
        File json = new File(functionApi.JSON_SCHEME + "/postCreateUser.json");
        functionApi.assertJsonSchema(json);
    }

    @Given("Patch update user with id {int} with request body {string} to endpoint {string}")
    public void patchUpdateUserWithIdWithRequestBodyToEndpoint(int arg0, String arg1, String arg2) {
        functionApi.updateUser(String.valueOf(arg0),arg1,arg2);
    }

    @And("Response body should contain name {string} and job {string}")
    public void responseBodyShouldContainNameAndJob(String arg0, String arg1) {
        functionApi.assertName(arg0);
        functionApi.assertJob(arg1);
    }

    @And("Validate patch update json scheme")
    public void validatePatchUpdateJsonScheme() {
        File json = new File(functionApi.JSON_SCHEME + "/updateUser.json");
        functionApi.assertJsonSchema(json);
    }
}
