package functions;

import io.restassured.http.ContentType;
import io.restassured.module.jsv.JsonSchemaValidator;
import net.serenitybdd.rest.SerenityRest;
import java.io.File;

import static org.hamcrest.Matchers.equalTo;

public class functionApi {
    public static final String URL = "https://reqres.in";
    public static final String JSON_SCHEME = "src/test/resources/features/api/jSon/scheme";
    public static final String JSON_REQUEST = "src/test/resources/features/api/jSon/requestBody/";

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

    public static void postFunction(String arg0, String arg1){
        File jsonFile = new File(JSON_REQUEST + arg0);
        SerenityRest.given().contentType(ContentType.JSON).body(jsonFile).post(URL + arg1);
    }

    public static void assertToken(String token){
        SerenityRest.then().body("token", equalTo(token));
    }

    public static void assertJsonSchema(File json){
        SerenityRest.then().assertThat().body(JsonSchemaValidator.matchesJsonSchema(json));
    }

    public static void assertName(String arg0){
        SerenityRest.then().assertThat().body("name", equalTo(arg0));
    }

    public static void assertJob(String arg0){
        SerenityRest.then().assertThat().body("job", equalTo(arg0));
    }

}
