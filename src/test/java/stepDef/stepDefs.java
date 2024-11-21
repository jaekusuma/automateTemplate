package stepDef;

import functions.function;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.serenitybdd.screenplay.Actor;

public class stepDefs {
    @Given("{actor} Open google")
    public void openGoogle(Actor actor) {
        function.maximized();
        actor.attemptsTo(function.openBrowser("page.google"));
    }


    @When("{actor} see title must be {string}")
    public void userSeeTitleMustBe(Actor actor, String arg0) {
        actor.attemptsTo(function.assertTittle(arg0));
    }

    @Then("{actor} search {string}")
    public void userSearch(Actor actor, String arg0) {
        actor.attemptsTo(function.about(arg0));
    }

    @And("{actor} see information about {string}")
    public void userSeeInformationAbout(Actor actor, String arg0) {
        actor.attemptsTo(function.assertContent(arg0));
    }

    @Given("{actor} open duckduckGo")
    public void userOpenDuckduckGo(Actor actor) {
        function.maximized();
        actor.attemptsTo(function.openBrowser("page.duckDuckGo"));
    }

    @Then("{actor} search {string} on duckduckGo")
    public void userSearchOnDuckduckGo(Actor actor, String arg0) {
        actor.attemptsTo(function.searchDuck(arg0));
    }

    @And("{actor} see information about {string} on result")
    public void userSeeInformationAboutOnResult(Actor actor, String arg0) {
        actor.attemptsTo(function.searchContentDuck(arg0));
    }
}
