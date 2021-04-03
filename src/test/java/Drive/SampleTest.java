package Drive;

import io.appium.java_client.android.AndroidDriver;
import org.junit.After;
import org.junit.Before;

import java.io.File;
import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.remote.DesiredCapabilities;

import static org.junit.Assert.assertEquals;

public class SampleTest {

    public AndroidDriver driver;

    @Before
    public void setUp() throws MalformedURLException {
        DesiredCapabilities desiredCapabilities = new DesiredCapabilities();
        desiredCapabilities.setCapability("platformName", "Android");
        desiredCapabilities.setCapability("deviceName", "emulator-5554");
        desiredCapabilities.setCapability("appPackage", "com.leavjenn.hews");
        desiredCapabilities.setCapability("appActivity", "com.leavjenn.hews.ui.MainActivity");
        //desiredCapabilities.setCapability("app",new File("C:\\Users\\deam.ramos\\Desktop\\pos-testes-mobile\\src\\test\\java\\apk").getAbsolutePath();
        URL remoteUrl = new URL("http://localhost:4723/wd/hub");

        driver = new AndroidDriver(remoteUrl, desiredCapabilities);
    }

    @After
    public void tearDown() {
        driver.quit();
    }
}
