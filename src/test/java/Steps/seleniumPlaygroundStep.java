package Steps;

import net.thucydides.core.steps.ScenarioSteps;
import Pages.seleniumPlaygroundPage;

public class seleniumPlaygroundStep extends ScenarioSteps {
    seleniumPlaygroundPage seleniumPlaygroundPage;

    public void OnWebsiteTimvroom(){
        seleniumPlaygroundPage.OnWebsiteTimvroom();
    }

    public void PlaceTheAnswerInAnswerSlotNumber1(){
        seleniumPlaygroundPage.PlaceTheAnswerInAnswerSlotNumber1();
    }

    public void FillOutNameSection(){
        seleniumPlaygroundPage.FillOutNameSection();
    }

    public void SetOccupation(){
        seleniumPlaygroundPage.SetOccupation();
    }
    public void CountSizeOfBlueBox(){
        seleniumPlaygroundPage.CountSizeOfBlueBox();
    }
    public void ClickLinkThatSaysClickMe(){
        seleniumPlaygroundPage.ClickLinkThatSaysClickMe();
    }
    public void FindClassOfRedBox(){
        seleniumPlaygroundPage.FindClassOfRedBox();
    }
    public void RunJavaScriptExecutor(){
        seleniumPlaygroundPage.RunJavaScriptExecutor();
    }
}
