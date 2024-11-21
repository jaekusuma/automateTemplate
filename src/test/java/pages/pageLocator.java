package pages;

import net.serenitybdd.screenplay.targets.Target;

public class pageLocator {
    public static Target SEARCH_BOX = Target.the("Search").locatedBy("#APjFqb");
    public static Target CONTENT_JAKARTA = Target.the("Jakarta").locatedBy(".PZPZlf.ssJ7i.B5dxMb");
    public static Target SEARCH_DUCK = Target.the("searchbox_input").locatedBy("//input[@id='searchbox_input']");
    public static Target CONTENT_DUCK_JAKARTA = Target.the("Jakarta").locatedBy("//p[@class='related-searches__title-long']//b[contains(text(),'Jakarta')]");
}
