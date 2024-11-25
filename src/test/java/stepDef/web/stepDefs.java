package stepDef.web;

import functions.functionWeb;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.serenitybdd.screenplay.Actor;

public class stepDefs {
    @Given("{actor} Open google")
    public void openGoogle(Actor actor) {
        functionWeb.maximized();
        actor.attemptsTo(functionWeb.openBrowser("page.google"));
    }


    @When("{actor} see title must be {string}")
    public void userSeeTitleMustBe(Actor actor, String arg0) {
        actor.attemptsTo(functionWeb.assertTittle(arg0));
    }

    @Then("{actor} search {string}")
    public void userSearch(Actor actor, String arg0) {
        actor.attemptsTo(functionWeb.about(arg0));
    }

    @And("{actor} see information about {string}")
    public void userSeeInformationAbout(Actor actor, String arg0) {
        actor.attemptsTo(functionWeb.assertContent(arg0));
    }

    @Given("{actor} open duckduckGo")
    public void userOpenDuckduckGo(Actor actor) {
        functionWeb.maximized();
        actor.attemptsTo(functionWeb.openBrowser("page.duckDuckGo"));
    }

    @Then("{actor} search {string} on duckduckGo")
    public void userSearchOnDuckduckGo(Actor actor, String arg0) {
        actor.attemptsTo(functionWeb.searchDuck(arg0));
    }

    @And("{actor} see information about {string} on result")
    public void userSeeInformationAboutOnResult(Actor actor, String arg0) {
        actor.attemptsTo(functionWeb.searchContentDuck(arg0));
    }
}
