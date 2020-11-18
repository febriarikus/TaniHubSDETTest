package Pages;

import net.serenitybdd.core.pages.PageObject;
import org.openqa.selenium.By;
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
        js.executeScript("ran_this_js_function()");
    }
}
