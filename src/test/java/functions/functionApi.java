package functions;

import io.cucumber.java.Before;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.rest.abilities.CallAnApi;
import net.serenitybdd.screenplay.rest.interactions.Get;
import net.serenitybdd.screenplay.rest.questions.ResponseConsequence;
import net.thucydides.model.util.EnvironmentVariables;

import static net.serenitybdd.screenplay.rest.questions.ResponseConsequence.seeThatResponse;

public class functionApi {
    public static String apiBaseUrl;
    public static EnvironmentVariables environmentVariables;
    public static Actor apiTest;

    @Before
    public void configBaseApi(){
        apiBaseUrl = environmentVariables.optionalProperty("api.reqress").orElse("https://reqres.in/api");
        apiTest = Actor.named("User").whoCan(CallAnApi.at(apiBaseUrl));
    }

    public static Get getSingleUser(String arg0, int arg1){
        return Get.resource(arg0 + arg1);
    }

    public static ResponseConsequence getTheRespons(String arg0){
        return seeThatResponse("User details should be correct",
                response -> response.statusCode(200).equals(arg0));
    }

}
