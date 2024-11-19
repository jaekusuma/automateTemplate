package pages;

import net.serenitybdd.screenplay.targets.Target;

public class pageLocator {
    public static Target SEARCH_BOX = Target.the("Search").locatedBy("#APjFqb");
    public static Target CONTENT_JAKARTA = Target.the("Jakarta").locatedBy("//div[@role='heading'][normalize-space()='Jakarta']");
}
