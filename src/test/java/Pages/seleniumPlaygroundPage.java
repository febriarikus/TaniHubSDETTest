package Pages;

import net.serenitybdd.core.pages.PageObject;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.util.List;

public class seleniumPlaygroundPage extends PageObject {
    public void OnWebsiteTimvroom(){
        getDriver().navigate().to("http://timvroom.com/selenium/playground/");
    }
    public void PlaceTheAnswerInAnswerSlotNumber1(){
        getDriver().findElement(By.id("answer1")).sendKeys(getDriver().getTitle());
    }
    public void FillOutNameSection(){
        getDriver().findElement(By.id("name")).sendKeys("Kilgore Trout");
    }
    @FindBy(xpath = "//option[@value='scifiauthor']")
    WebElement scifiauthor;
    public void SetOccupation(){
        getDriver().findElement(By.id("occupation")).click();
        scifiauthor.click();
    }
    public void CountSizeOfBlueBox(){
        List<WebElement> BlueBox = getDriver().findElements(By.className("bluebox"));
        String TotalBlueBox = Integer.toString(BlueBox.size());
        getDriver().findElement(By.id("answer4")).sendKeys(TotalBlueBox);
    }
    public void ClickLinkThatSaysClickMe(){
        getDriver().findElement(By.linkText("click me")).click();
    }
    public void FindClassOfRedBox(){
        getDriver().findElement(By.id("answer6")).sendKeys(getDriver().findElement(By.id("redbox")).getAttribute("class"));
    }
    public void RunJavaScriptExecutor(){
        JavascriptExecutor js = (JavascriptExecutor) getDriver();
        js.executeScript("ran_this_js_function();");
    }
    public void RunJavaScriptFunctionAndTakeValueOfIt(){
        JavascriptExecutor js = (JavascriptExecutor) getDriver();
        getDriver().findElement(By.id("answer8")).sendKeys(js.executeScript("return got_return_from_js_function();").toString());
    }
    public void MarkRadioButtonOnFormForWrittenBookToYes(){
        getDriver().findElement(By.cssSelector("input[name=\"wrotebook\"][value=\"wrotebook\"]")).click();
    }
    public void GetTextFromRedBox(){
        getDriver().findElement(By.id("answer10")).sendKeys(getDriver().findElement(By.id("redbox")).getText());
    }
    public void GuessWhichBoxIsOnTop(){
        if (getDriver().findElement(By.id("orangebox")).getLocation().y>getDriver().findElement(By.id("greenbox")).getLocation().y){
            getDriver().findElement(By.id("answer11")).sendKeys("orangebox");
        }
        else {
            getDriver().findElement(By.id("answer11")).sendKeys("greenbox");
        }
    }
    public void SetHightAndWeidthOfBrowser(){
        getDriver().manage().window().setSize(new Dimension(850,650));
    }
    public void AnswerSlot13DependingOnId(){
        if (getDriver().findElement(By.id("ishere")).isDisplayed()){
            getDriver().findElement(By.id("answer13")).sendKeys("no");
        }
        else {
            getDriver().findElement(By.id("answer13")).sendKeys("yes");
        }
    }
}
