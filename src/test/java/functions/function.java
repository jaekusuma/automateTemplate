package functions;

import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.actions.Open;
import net.serenitybdd.screenplay.ensure.Ensure;
import net.serenitybdd.screenplay.questions.page.TheWebPage;
import net.thucydides.core.webdriver.WebDriverFacade;
import org.openqa.selenium.Keys;
import pages.pageLocator;

import static net.serenitybdd.core.Serenity.getDriver;

public class function {
    public static Performable about(String search){
        return Task.where("{0} search '" + search + "'",
                Enter.theValue(search)
                        .into(pageLocator.SEARCH_BOX)
                        .thenHit(Keys.ENTER));
    }

    public static void maximized(){
        WebDriverFacade driverFacade = (WebDriverFacade) getDriver();
        driverFacade.manage().window().maximize();
    }

    public static Performable openBrowser(String url){
        return Open.browserOn().thePageNamed(url);
    }

    public static Performable assertTittle(String arg0){
        return Ensure.that(TheWebPage.title()).containsIgnoringCase(arg0);
    }
}
