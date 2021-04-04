import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
import junit.framework.TestCase;
import org.junit.After;
import org.junit.Before;
import org.junit.Ignore;
import org.junit.Test;
import java.net.MalformedURLException;
import java.net.URL;
import org.openqa.selenium.remote.DesiredCapabilities;

public class SampleTest {

    private AndroidDriver driver;

    @Before
    public void setUp() throws MalformedURLException {
        DesiredCapabilities desiredCapabilities = new DesiredCapabilities();
        desiredCapabilities.setCapability("platformName", "Android");
        desiredCapabilities.setCapability("deviceName", "emulator-5554");
        desiredCapabilities.setCapability("appPackage", "com.android.calculator2");
        desiredCapabilities.setCapability("appActivity", "com.android.calculator2.Calculator");
        desiredCapabilities.setCapability("ensureWebviewsHavePages", true);

        //desiredCapabilities.setCapability("app", "src/test/resources/hews-for-hacker-news_1.9.1.apk");

        URL remoteUrl = new URL("http://localhost:4723/wd/hub");

        driver = new AndroidDriver(remoteUrl, desiredCapabilities);


    }

    @Ignore
    public void sampleTest_2e2_4() {
        MobileElement el1 = (MobileElement) driver.findElementById("com.android.calculator2:id/digit_2");
        el1.click();
        MobileElement el2 = (MobileElement) driver.findElementByAccessibilityId("plus");
        el2.click();
        MobileElement el3 = (MobileElement) driver.findElementById("com.android.calculator2:id/digit_2");
        el3.click();
        MobileElement el4 = (MobileElement) driver.findElementByAccessibilityId("equals");
        el4.click();
    }
    @Test
    public void test_plus() {
        MobileElement el1 = (MobileElement) driver.findElementById("com.android.calculator2:id/digit_1");
        el1.click();
        MobileElement el2 = (MobileElement) driver.findElementById("com.android.calculator2:id/digit_2");
        el2.click();
        MobileElement el3 = (MobileElement) driver.findElementByAccessibilityId("plus");
        el3.click();
        MobileElement el4 = (MobileElement) driver.findElementById("com.android.calculator2:id/digit_2");
        el4.click();
        MobileElement el5 = (MobileElement) driver.findElementById("com.android.calculator2:id/digit_4");
        el5.click();
        MobileElement el6 = (MobileElement) driver.findElementByAccessibilityId("equals");
        el6.click();
    }
    @Test
    public void test_mult(){
        MobileElement el1 = (MobileElement) driver.findElementById("com.android.calculator2:id/digit_5");
        el1.click();
        MobileElement el2 = (MobileElement) driver.findElementByAccessibilityId("point");
        el2.click();
        MobileElement el3 = (MobileElement) driver.findElementById("com.android.calculator2:id/digit_5");
        el3.click();
        MobileElement el4 = (MobileElement) driver.findElementByAccessibilityId("multiply");
        el4.click();
        MobileElement el5 = (MobileElement) driver.findElementById("com.android.calculator2:id/digit_2");
        el5.click();
        MobileElement el6 = (MobileElement) driver.findElementByAccessibilityId("equals");
        el6.click();
    }
    @Test
    public void test_div(){
        MobileElement el1 = (MobileElement) driver.findElementById("com.android.calculator2:id/digit_6");
        el1.click();
        MobileElement el10 = (MobileElement) driver.findElementByAccessibilityId("minus");
        el10.click();
        MobileElement el5 = (MobileElement) driver.findElementById("com.android.calculator2:id/digit_2");
        el5.click();
        MobileElement el6 = (MobileElement) driver.findElementByAccessibilityId("equals");
        el6.click();
    }
    @Test
    public void test_minus(){
        MobileElement el1 = (MobileElement) driver.findElementById("com.android.calculator2:id/digit_6");
        el1.click();
        MobileElement el4 = (MobileElement) driver.findElementByAccessibilityId("divide");
        el4.click();
        MobileElement el5 = (MobileElement) driver.findElementById("com.android.calculator2:id/digit_2");
        el5.click();
        MobileElement el6 = (MobileElement) driver.findElementByAccessibilityId("equals");
        el6.click();
    }

    @After
    public void tearDown() {
        driver.quit();
    }
}
