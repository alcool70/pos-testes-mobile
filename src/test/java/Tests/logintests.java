package Tests;
import Drive.SampleTest;
import org.junit.Assert;
import org.junit.Test;
import org.springframework.core.annotation.Order;

import java.util.concurrent.TimeUnit;

public class logintests extends SampleTest {
    @Order(1)
    @Test
    public void LoginVazio() {
        driver.findElementByAccessibilityId("Navigate up").click();
        driver.findElementById("com.leavjenn.hews:id/iv_expander").click();
        driver.findElementById("com.leavjenn.hews:id/design_menu_item_text").click();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.findElementById("android:id/button1").click();
        Assert.assertEquals("Não é possivel realizar login","Catch you, anonymous!",driver.findElementById("com.leavjenn.hews:id/tv_prompt").getText());
    }
    @Order(2)
    @Test
    public void LoginInvalido(){
        driver.findElementByAccessibilityId("Navigate up").click();
        driver.findElementById("com.leavjenn.hews:id/iv_expander").click();
        driver.findElementById("com.leavjenn.hews:id/design_menu_item_text").click();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.findElementById("com.leavjenn.hews:id/et_user_name").sendKeys("teste01");
        driver.findElementById("com.leavjenn.hews:id/et_password").sendKeys("1233");
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.findElementById("android:id/button1").click();
        Assert.assertEquals("Login Invalido","You got a short…password",driver.findElementById("com.leavjenn.hews:id/tv_prompt").getText());
    }

}
