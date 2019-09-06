package hellocucumber;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

import static org.junit.Assert.assertEquals;

class IsItFriday {
    public static String IsItFriday(String today) {
        return "Friday".equals(today) ? "TGIF" : "Nope";
    }
}

public class Stepdefs {
    private String today;
    private String actualAnswer;
    
    @Given("^today is \"([^\"]*)\"$")
    public void todayIs(String today) {
        this.today = today;
    }

    @When("^I ask whether it is Friday yet$")
    public void iAskWhetherItIsFridayYet() {
        actualAnswer = IsItFriday.IsItFriday(today);
}

    @Then("^I should be told \"([^\"]*)\"$")
    public void iShouldBeTold(String expectedAnswer) {
        assertEquals(expectedAnswer, actualAnswer);
    }
}
