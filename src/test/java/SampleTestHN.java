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

public class SampleTestHN {

    private AndroidDriver driver;

    @Before
    public void setUp() throws MalformedURLException {
        DesiredCapabilities desiredCapabilities = new DesiredCapabilities();
        desiredCapabilities.setCapability("platformName", "Android");
        desiredCapabilities.setCapability("deviceName", "emulator-5554");
        //desiredCapabilities.setCapability("appPackage", "com.android.calculator2");
        //desiredCapabilities.setCapability("appActivity", "com.android.calculator2.Calculator");
        desiredCapabilities.setCapability("app", "src/test/resources/hews-for-hacker-news_1.9.1.apk");
        desiredCapabilities.setCapability("ensureWebviewsHavePages", true);



        URL remoteUrl = new URL("http://localhost:4723/wd/hub");

        driver = new AndroidDriver(remoteUrl, desiredCapabilities);


    }

    @Test
    public void test_a() {

    }
    @Ignore
    public void test_b(){

    }
    @Ignore
    public void test_c(){

    }
    @Ignore
    public void test_d(){

    }

    @After
    public void tearDown() {
        driver.quit();
    }
}
