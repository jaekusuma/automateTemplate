package functions;

import net.serenitybdd.rest.SerenityRest;

public class functionApi {
    public static final String URL = "https://reqres.in";

    public static void getSingleUser(String arg0, int arg1){
        SerenityRest.get(URL + arg0 + arg1);
    }

    public static void getTheRespons(String arg0){
        SerenityRest.then().statusCode(Integer.parseInt(arg0));
    }

}
