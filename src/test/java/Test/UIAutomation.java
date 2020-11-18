package Test;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.thucydides.core.annotations.Steps;
import Steps.UIAutomationStep;

public class UIAutomation {
    @Steps
    UIAutomationStep uiAutomationStep;

    @Given("login as testing user")
    public void givenLoginAsTestingUser()throws InterruptedException{
        uiAutomationStep.LoginAsTestingUser();
    }

    @When("user search minyak goreng in search box")
    public void whenUserSearchMinyakGorengInSearchBox()throws InterruptedException{
        Thread.sleep(3000);
        uiAutomationStep.SearchMinyakGorengInSearchBox();
    }

    @When("user add this item to cart")
    public void whenUserAddThisItemToCart()throws InterruptedException{
        uiAutomationStep.AddThisItemToCart();
    }

    @Then("user checkout the item")
    public void thenUserCheckoutTheItem()throws InterruptedException{
        uiAutomationStep.CheckoutTheItem();
    }
}