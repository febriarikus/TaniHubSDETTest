package Steps;

import Pages.UIAutomationPage;
import net.thucydides.core.steps.ScenarioSteps;

public class UIAutomationStep extends ScenarioSteps {
    UIAutomationPage uiAutomationPage;

    public void LoginAsTestingUser()throws InterruptedException{
        uiAutomationPage.OpenTanihubWebsiteURL();
        Thread.sleep(2000);
        uiAutomationPage.ChooseRegional();
        uiAutomationPage.ClickSignInIcon();
        Thread.sleep(3000);
        uiAutomationPage.InputEmail();
        Thread.sleep(5000);
        uiAutomationPage.InputPassword();
        uiAutomationPage.ClickSignIn();
    }

    public void SearchMinyakGorengInSearchBox(){
        uiAutomationPage.SearchMinyakGorengInSearchBox();
    }

    public void AddThisItemToCart()throws InterruptedException{
        uiAutomationPage.AddThisItemToCart();
        Thread.sleep(3000);
        uiAutomationPage.AssertItemHasBeenAddedToCart();
    }

    public void CheckoutTheItem()throws InterruptedException{
        uiAutomationPage.CheckoutTheItem();
        Thread.sleep(3000);
        uiAutomationPage.AssertItemHasBeenCheckoutSuccessfully();
    }
}
