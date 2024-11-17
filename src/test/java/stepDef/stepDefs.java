package stepDef;

import functions.function;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.ensure.Ensure;
import net.serenitybdd.screenplay.questions.page.TheWebPage;
import pages.rule;

public class stepDefs {
    @Given("{actor} Open google")
    public void openGoogle(Actor actor) {
        actor.wasAbleTo(rule.openWeb());
    }


    @When("{actor} see title must be {string}")
    public void userSeeTitleMustBe(Actor actor, String arg0) {
        actor.attemptsTo(Ensure.that(TheWebPage.title()).containsIgnoringCase(arg0));
    }

    @Then("{actor} search {string}")
    public void userSearch(Actor actor, String arg0) {
        actor.attemptsTo(function.about(arg0));
    }

    @And("{actor} see information about {string}")
    public void userSeeInformationAbout(Actor actor, String arg0) {
        actor.attemptsTo(Ensure.that(TheWebPage.title()).containsIgnoringCase(arg0));
    }
}
