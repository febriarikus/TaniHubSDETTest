package Test;

import Steps.seleniumPlaygroundStep;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.thucydides.core.annotations.Steps;

import java.io.IOException;

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
    @When("i Run JavaScript function as: got_return_from_js_function from your Selenium script, take returned value and place it in answer slot #8")
    public void whenRunJavaScriptFunctionAndTakeValueOfIt(){
        seleniumPlaygroundStep.RunJavaScriptFunctionAndTakeValueOfIt();
    }
    @When("i Mark radio button on form for written book to Yes")
    public void whenMarkRadioButtonOnFormForWrittenBookToYes(){
        seleniumPlaygroundStep.MarkRadioButtonOnFormForWrittenBookToYes();
    }
    @When("i Get the text from the Red Box and place it in answer slot #10")
    public void whenGetTextFromRedBox(){
        seleniumPlaygroundStep.GetTextFromRedBox();
    }
    @When("i guess Which box is on top orange or green -- place correct color in answer slot #11")
    public void whenIGuessWhichBoxIsOnTop(){
        seleniumPlaygroundStep.GuessWhichBoxIsOnTop();
    }
    @When("i Set browser width to 850 and height to 650")
    public void whenSetHightAndWeidthOfBrowser(){
        seleniumPlaygroundStep.SetHightAndWeidthOfBrowser();
    }
    @When("i Type into answer slot 13 yes or no depending on whether item by id of ishere is on the page")
    public void whenAnswerSlot13DependingOnId(){
        seleniumPlaygroundStep.AnswerSlot13DependingOnId();
    }
    @When("i Type into answer slot 14 yes or no depending on whether item with id of purplebox is visible")
    public void whenAnswerSlot14DependingOnIdOnPurpleBoxIsVisibleOrNot(){
        seleniumPlaygroundStep.AnswerSlot14DependingOnIdOnPurpleBoxIsVisibleOrNot();
    }
    @When("waiting game and Click OK on the confirm after completing task 15")
    public void whenWaitingGame(){
        seleniumPlaygroundStep.WaitingGame();
    }
    @When("i click the submit button on the form")
    public void whenIClickSubmitButton(){
        seleniumPlaygroundStep.ClickSubmitButton();
    }
    @Then("i get the result")
    public void thenIGetTheResult()throws IOException {
        seleniumPlaygroundStep.GetTheResult();
    }
}
