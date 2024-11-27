package functions;

import net.serenitybdd.rest.SerenityRest;
import java.io.File;
import io.restassured.module.jsv.JsonSchemaValidator;

import static org.hamcrest.Matchers.equalTo;

public class functionApi {
    public static final String URL = "https://reqres.in";
    public static final String JSON_SCHEME = "src/test/resources/features/api/jSon/scheme";

    public static void getSingleUser(String arg0, int arg1){
        SerenityRest.get(URL + arg0 + arg1);
    }

    public static void getTheRespons(int arg0){
        SerenityRest.then().statusCode(arg0);
    }

    public static void assertBodyId(int id){
        SerenityRest.then().body("data.id", equalTo(id));
    }

    public static void assertBodyFName(String fName){
        SerenityRest.then().body("data.first_name", equalTo(fName));
    }

    public static void assertBodyLName(String lName){
        SerenityRest.then().body("data.last_name", equalTo(lName));
    }

    public static void assertJsonScheme(){
        File json = new File(JSON_SCHEME+"getSingleUser.json");
        SerenityRest.then().assertThat().body(JsonSchemaValidator.matchesJsonSchema(json));
    }

}
