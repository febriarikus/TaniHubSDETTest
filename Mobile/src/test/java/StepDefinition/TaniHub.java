package StepDefinition;

import Utils.Base;
import cucumber.api.Scenario;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidKeyCode;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class TaniHub extends Base {
    AndroidDriver driver;
    Scenario scenario;

    @Before
    public void before(Scenario scenario){
        this.scenario = scenario;} //take a screenshot

    @Given("on tanihub homescreen")
    public void givenOnTaniHubHomeScreen()throws Throwable{
        driver = capabilities();
        takeStepScreenShot(scenario, driver);
        WebDriverWait wait = new WebDriverWait(driver, 8);
        wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//android.view.ViewGroup[@content-desc='bt_explore']")));
        driver.findElement(By.xpath("//android.view.ViewGroup[@content-desc='bt_explore']")).click();
    }

    @When("I select area jabodetabek")
    public void whenSelectAreaJabodetabek(){
        takeStepScreenShot(scenario, driver);
        driver.findElement(By.xpath("//android.view.ViewGroup[@content-desc='bt_region_id_1']")).click();
        takeStepScreenShot(scenario,driver);
    }

    @When("I search product : ([^\"]*)")
    public void whenSearchProduct(String product){
        driver.findElement(By.xpath("//android.widget.TextView[@text='Cari buah, sayur, beras...']")).click();
        driver.findElement(By.xpath("//android.widget.TextView[@text='Cari buah, sayur, beras...']")).sendKeys(product);
        WebDriverWait wait = new WebDriverWait(driver, 8);
        wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//android.widget.TextView[@text='Lihat Semua Produk']")));
        driver.findElement(By.xpath("//android.widget.TextView[@text='Lihat Semua Produk']")).click();
        takeStepScreenShot(scenario,driver);
    }

    @Then("I got the detail of ([^\"]*)")
    public void thenGetTheDetailOfProduct(String product){
        takeStepScreenShot(scenario,driver);
        Assert.assertEquals(product,driver.findElement(By.xpath("(//android.widget.TextView[@index='2'])[position()=1]")).getText());
    }
}
