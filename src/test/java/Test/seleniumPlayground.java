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
    @When("i count number of blue_boxes on page after form and enter into answer box #4")
    public void whenCountSizeOfBlueBox(){
        seleniumPlaygroundStep.CountSizeOfBlueBox();
    }
    @When("i click link that says click me")
    public void whenClickLinkThatSaysClickMe(){
        seleniumPlaygroundStep.ClickLinkThatSaysClickMe();
    }
    @When("i Find red box on its page find class applied to it, and enter into answer box #6")
    public void whenFindClassOfRedBox(){
        seleniumPlaygroundStep.FindClassOfRedBox();
    }
    @When("i Run JavaScript function as: ran_this_js_function from your Selenium script")
    public void whenRunJavaScriptExecutor(){
        seleniumPlaygroundStep.RunJavaScriptExecutor();
    }
}
