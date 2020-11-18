package Pages;

import net.serenitybdd.core.pages.PageObject;
import org.openqa.selenium.*;
import org.openqa.selenium.io.FileHandler;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.io.File;
import java.io.IOException;
import java.util.Date;
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
    public void SetOccupation(){
        getDriver().findElement(By.xpath("//option[@value='scifiauthor']")).click();
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
            getDriver().findElement(By.id("answer11")).sendKeys("greenbox");
        }
        else {
            getDriver().findElement(By.id("answer11")).sendKeys("orangebox");
        }
    }
    public void SetHightAndWeidthOfBrowser(){
        getDriver().manage().window().setSize(new Dimension(850,650));
    }
    public void AnswerSlot13DependingOnId(){
        List<WebElement> ishere = getDriver().findElements(By.id("ishere"));
        if (ishere.size()==0){
            getDriver().findElement(By.id("answer13")).sendKeys("no");
        }
        else {
            getDriver().findElement(By.id("answer13")).sendKeys("yes");
        }
    }
    public void AnswerSlot14DependingOnIdOnPurpleBoxIsVisibleOrNot(){
        if (getDriver().findElement(By.id("purplebox")).isDisplayed()){
            getDriver().findElement(By.id("answer14")).sendKeys("yes");
        }
        else {
            getDriver().findElement(By.id("answer14")).sendKeys("no");
        }
    }
    public void WaitingGame(){
        getDriver().findElement(By.linkText("click then wait")).click();
        WebDriverWait wait = new WebDriverWait(getDriver(), 10);
        wait.until(ExpectedConditions.presenceOfElementLocated(By.linkText("click after wait")));
        getDriver().findElement(By.linkText("click after wait")).click();
        getDriver().switchTo().alert().accept();
    }
    public void ClickSubmitButton(){
        getDriver().findElement(By.id("submitbutton")).click();
    }
    public void GetTheResult()throws IOException {
        getDriver().findElement(By.id("checkresults")).click();
        String result = getDriver().findElement(By.id("showresults")).getText();
        System.out.println(result);

        Date d = new Date();

        String FileName = d.toString().replace(":", "_").replace(" ", "_") + ".png";
        File screenshot = ((TakesScreenshot) getDriver()).getScreenshotAs(OutputType.FILE);
        FileHandler.copy(screenshot, new File(System.getProperty("user.dir") + "/src/test/resources/file/" + FileName));
    }
}
