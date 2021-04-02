import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
import org.junit.After;
import org.junit.Before;
import org.junit.Ignore;
import org.junit.Test;
import org.openqa.selenium.remote.DesiredCapabilities;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.List;

public class SampleTestHN {

    private AndroidDriver driver;

    @Before
    public void setUp() throws MalformedURLException {
        DesiredCapabilities desiredCapabilities = new DesiredCapabilities();
        desiredCapabilities.setCapability("platformName", "Android");
        desiredCapabilities.setCapability("deviceName", "emulator-5554");
        desiredCapabilities.setCapability("appPackage", "com.leavjenn.hews");//pacote
        desiredCapabilities.setCapability("appActivity", "com.leavjenn.hews.ui.MainActivity");//app
        //desiredCapabilities.setCapability("app", "C:\\Users\\Victor Hugo\\Documents\\GitHub\\pos-testes-mobile\\src\\test\\resources\\hews-for-hacker-news_1.9.1.apk");// instalar
        //desiredCapabilities.setCapability("app", new File("src/test/resources/hews-for-hacker-news_1.9.1.apk").getAbsolutePath());// instalar
        desiredCapabilities.setCapability("ensureWebviewsHavePages", true);
        URL remoteUrl = new URL("http://localhost:4723/wd/hub");
        driver = new AndroidDriver(remoteUrl, desiredCapabilities);
    }

    @Test
    public void test_login_false() {
        MobileElement el1 = (MobileElement) driver.findElementByAccessibilityId("Navigate up");
        el1.click();
        MobileElement el2 = (MobileElement) driver.findElementByXPath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.support.v4.widget.DrawerLayout/android.widget.RelativeLayout/android.view.ViewGroup/android.widget.FrameLayout/android.widget.RelativeLayout/android.view.ViewGroup/android.support.v7.widget.RecyclerView/android.widget.RelativeLayout[1]/android.widget.RelativeLayout/android.widget.TextView[4]");
        el2.click();
        MobileElement el3 = (MobileElement) driver.findElementByXPath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.support.v4.widget.DrawerLayout/android.widget.RelativeLayout/android.view.ViewGroup/android.widget.FrameLayout/android.widget.RelativeLayout/android.view.ViewGroup/android.support.v7.widget.RecyclerView/android.widget.RelativeLayout[2]/android.widget.RelativeLayout/android.widget.TextView[3]");
        el3.click();
        MobileElement el4 = (MobileElement) driver.findElementById("com.leavjenn.hews:id/et_user_name");
        el4.click();
        el4.sendKeys("victor");
        MobileElement el5 = (MobileElement) driver.findElementById("com.leavjenn.hews:id/et_password");
        el5.click();
        el5.sendKeys("12345");
        MobileElement el6 = (MobileElement) driver.findElementByXPath("/hierarchy/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.LinearLayout");
        el6.click();
        MobileElement el7 = (MobileElement) driver.findElementById("android:id/button1");
        el7.click();

    }
    @Test
    public void test_Pesquisa(){
        MobileElement el1 = (MobileElement) driver.findElementByAccessibilityId("More options");
        el1.click();
        MobileElement el2 = (MobileElement) driver.findElementByXPath("/hierarchy/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.ListView/android.widget.LinearLayout[1]/android.widget.RelativeLayout/android.widget.TextView");
        el2.click();
        MobileElement el3 = (MobileElement) driver.findElementByAccessibilityId("Search");
        el3.click();
        MobileElement el4 = (MobileElement) driver.findElementById("com.leavjenn.hews:id/search_src_text");
        el4.sendKeys("microsoft");
        MobileElement el5 = (MobileElement) driver.findElementByXPath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.support.v4.widget.DrawerLayout/android.widget.RelativeLayout/android.view.ViewGroup/android.widget.LinearLayout/android.widget.RelativeLayout/android.widget.Spinner[1]/android.widget.TextView");
        el5.click();
        MobileElement el6 = (MobileElement) driver.findElementByXPath("/hierarchy/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.ListView/android.widget.CheckedTextView[3]");
        el6.click();
        MobileElement el7 = (MobileElement) driver.findElementById("com.leavjenn.hews:id/drawer_layout");
        el7.click();
        MobileElement el8 = (MobileElement) driver.findElementById("com.leavjenn.hews:id/drawer_layout");
        el8.click();

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
