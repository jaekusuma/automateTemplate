package functions;

import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Enter;
import org.openqa.selenium.Keys;
import pages.pageLocator;

public class function {
    public static Performable about(String search){
        return Task.where("{0} search '" + search + "'",
                Enter.theValue(search)
                        .into(pageLocator.SEARCH_BOX)
                        .thenHit(Keys.ENTER));
    }
}
