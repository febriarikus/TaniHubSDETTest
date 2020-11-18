package Test;

import Steps.seleniumPlaygroundStep;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.When;
import net.thucydides.core.annotations.Steps;

public class seleniumPlayground {
    @Steps
    seleniumPlaygroundStep seleniumPlaygroundStep;

    @Given("on timvroom website")
    public void givenOnWebsiteTimvroom(){
        seleniumPlaygroundStep.OnWebsiteTimvroom();
    }
    @When("i place the title page in answer slot #1")
    public void thenPlaceTheAnswerInAnswerSlotNumber1(){
        seleniumPlaygroundStep.PlaceTheAnswerInAnswerSlotNumber1();
    }
    @When("i fill out name section of form to be Kilgore Trout")
    public void thenFillOutNameSection(){
        seleniumPlaygroundStep.FillOutNameSection();
    }
    @When("i set occupation on form to Sci-Fi Author")
    public void thenSetOccupation(){
        seleniumPlaygroundStep.SetOccupation();
    }
}
