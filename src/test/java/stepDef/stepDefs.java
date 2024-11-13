package stepDef;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.ensure.Ensure;
import net.serenitybdd.screenplay.questions.page.TheWebPage;
import pages.rule;

public class stepDefs {
    @Given("{actor} Open google")
    public void openGoogle(Actor actor) {
        actor.wasAbleTo(rule.openWeb());
    }


    @Then("{actor} see title must be {string}")
    public void userSeeTitleMustBe(Actor actor, String arg0) {
        actor.attemptsTo(Ensure.that(TheWebPage.title()).containsIgnoringCase(arg0));
    }
}
