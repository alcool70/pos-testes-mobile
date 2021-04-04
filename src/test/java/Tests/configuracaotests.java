package Tests;

import Drive.BaseTest;
import org.junit.Assert;
import org.junit.Test;

import java.util.concurrent.TimeUnit;

public class configuracaotests extends BaseTest {

    @Test
    public void AlterarTema(){
        driver.findElementByAccessibilityId("Navigate up").click();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.findElementById("com.leavjenn.hews:id/design_menu_item_text").click();
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        driver.findElementById("android:id/summary").click();
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);

        driver.findElementById("fce3fdeb-b82d-44c9-89e7-ac4575964934").click();
        Assert.assertEquals("Tema Escuro Aplicado","Dark",driver.findElementById("android:id/summary").getText());
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
    }
}
