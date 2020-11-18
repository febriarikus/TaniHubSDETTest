package Pages;

import net.serenitybdd.core.pages.PageObject;
import org.junit.Assert;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class UIAutomationPage extends PageObject {

    public void OpenTanihubWebsiteURL(){
        getDriver().navigate().to("https://tanihub.com/");
    }

    // choose regional
    @FindBy(xpath = "(//div[starts-with(@class,'button radiobutton   ')])[position()=4]")
    WebElement RegionalSurabaya;
    public void ChooseRegional(){
        RegionalSurabaya.click();
    }

    //login as testing user process
    @FindBy(xpath = "//img[@alt='profile']")
    WebElement SignInIcon;
    @FindBy(xpath = "//form[starts-with(@class,'formLogin-')]")
    WebElement FormLogin;
    public void ClickSignInIcon(){
        SignInIcon.click();
        Assert.assertTrue(FormLogin.isDisplayed());
    }
    @FindBy(xpath = "//input[@type='email']")
    WebElement EmailField;
    @FindBy(xpath = "//button[@type='submit']")
    WebElement SubmitButton;
    public void InputEmail(){
        EmailField.sendKeys("testinguser@mailinator.com");
        SubmitButton.click();
    }
    @FindBy(id = "input-password-3")
    WebElement PasswordField;
    public void InputPassword(){
        PasswordField.sendKeys("admin123");
    }
    public void ClickSignIn(){
        SubmitButton.click();
    }

    //search an item
    @FindBy(xpath = "//input[@id='input-icon-2' and @type='text']")
    WebElement SearchBox;
    public void SearchMinyakGorengInSearchBox(){
        SearchBox.click();
        SearchBox.sendKeys("Minyak Goreng Rose Brand 2 L Karton", Keys.ENTER);
    }

    // add to cart process
    @FindBy(xpath = "(//div[starts-with(@class,'cardProduct-')])[position()=2]")
    WebElement Product;
    @FindBy(xpath = "(//button[text()='+ Keranjang'])[position()=2]")
    WebElement AddToCart;
    public void AddThisItemToCart(){
        Product.click();
        AddToCart.click();
    }
    @FindBy(xpath = "//div[starts-with(@class,'inputQuantity-')]")
    WebElement InputQuantity;
    @FindBy(xpath = "//img[@alt='Chat']")
    WebElement Keranjang;
    @FindBy(xpath = "//p[@class='text-component product-name is-regular  is-small']")
    WebElement Item;
    public void AssertItemHasBeenAddedToCart(){
        Assert.assertTrue(InputQuantity.isDisplayed());
        Keranjang.click();
        Assert.assertEquals("Rose Brand Minyak Goreng 2 L Karton",Item.getText());
    }

    // checkout item process
    @FindBy(xpath = "//button[text()='Checkout']")
    WebElement checkout;
    public void CheckoutTheItem(){
        checkout.click();
    }
    @FindBy(className = "checkout-content")
    WebElement CheckoutPage;
    public void AssertItemHasBeenCheckoutSuccessfully(){
        Assert.assertTrue(CheckoutPage.isDisplayed());
    }
}