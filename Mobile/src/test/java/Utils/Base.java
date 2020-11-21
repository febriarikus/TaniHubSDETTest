package Utils;

import cucumber.api.Scenario;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.remote.AutomationName;
import io.appium.java_client.remote.MobileCapabilityType;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.Platform;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.remote.DesiredCapabilities;

import java.io.File;
import java.net.MalformedURLException;
import java.net.URL;

public class Base {
    public static AndroidDriver capabilities() throws MalformedURLException {
        File f = new File(System.getProperty("user.dir")+"/app/");
        File fs = new File(f, "TaniHub_base.apk");
        // appium config
        DesiredCapabilities caps = new DesiredCapabilities();
        caps.setCapability(MobileCapabilityType.AUTOMATION_NAME, AutomationName.APPIUM);
        caps.setCapability(MobileCapabilityType.DEVICE_NAME, "Galaxy A10s");
        caps.setCapability(MobileCapabilityType.UDID, "R9CM9004FBJ");
        caps.setCapability("appPackage", "com.tanihub.vaesdothrak");
        caps.setCapability("appActivity", "com.tanihub.vaesdothrak.MainActivity");
        caps.setCapability(MobileCapabilityType.PLATFORM_NAME, Platform.ANDROID);
        caps.setCapability(MobileCapabilityType.PLATFORM_VERSION, "10.0");
        caps.setCapability("unicodeKeyboard", "true");
        caps.setCapability("resetKeyboard", "true");
        AndroidDriver driver = new AndroidDriver(new URL("http://0.0.0.0:4723/wd/hub"), caps);
        return driver;
    }

    public static void takeStepScreenShot(Scenario s, AndroidDriver driver) {
        final byte[] screenshot = ((TakesScreenshot) driver).getScreenshotAs(OutputType.BYTES);
        s.embed(screenshot, "image/png");
    }
}
