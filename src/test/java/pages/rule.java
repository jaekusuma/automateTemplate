package pages;

import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Open;

public class rule {
    public static Performable openWeb(){
        return Task.where("Open The Web", Open.browserOn().the(urlLinkSite.class));
    }
}
