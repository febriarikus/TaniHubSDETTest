package Pages;

import net.serenitybdd.core.pages.PageObject;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class seleniumPlaygroundPage extends PageObject {
    public void OnWebsiteTimvroom(){
        getDriver().navigate().to("http://timvroom.com/selenium/playground/");
    }

    @FindBy(id = "answer1")
    WebElement answer1;
    public void PlaceTheAnswerInAnswerSlotNumber1(){
        answer1.sendKeys(getDriver().getTitle());
    }

    @FindBy(id = "name")
    WebElement answer2;
    public void FillOutNameSection(){
        answer2.sendKeys("Kilgore Trout");
    }

    @FindBy(id = "occupation")
    WebElement answer3;
    @FindBy(xpath = "//option[@value='scifiauthor']")
    WebElement scifiauthor;
    public void SetOccupation(){
        answer3.click();
        scifiauthor.click();
    }
}
