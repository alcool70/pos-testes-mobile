package pages;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import org.openqa.selenium.support.PageFactory;

public class CalculatorPage {

	@AndroidFindBy(id = "digit_0") private AndroidElement digit0;
	@AndroidFindBy(id = "digit_1") private AndroidElement digit1;
	@AndroidFindBy(id = "digit_2") private AndroidElement digit2;
	@AndroidFindBy(id = "digit_3") private AndroidElement digit3;
	@AndroidFindBy(id = "digit_4") private AndroidElement digit4;
	@AndroidFindBy(id = "digit_5") private AndroidElement digit5;
	@AndroidFindBy(id = "digit_6") private AndroidElement digit6;
	@AndroidFindBy(id = "digit_7") private AndroidElement digit7;
	@AndroidFindBy(id = "digit_8") private AndroidElement digit8;
	@AndroidFindBy(id = "digit_9") private AndroidElement digit9;
	@AndroidFindBy(id = "dec_point") private AndroidElement point;

	@AndroidFindBy(id = "op_add") private AndroidElement op_add;
	@AndroidFindBy(id = "op_sub") private AndroidElement op_sub;
	@AndroidFindBy(id = "op_mul") private AndroidElement op_mul;
	@AndroidFindBy(id = "op_div") private AndroidElement op_div;
	@AndroidFindBy(id = "eq") private AndroidElement eq;
	@AndroidFindBy(id = "result") private AndroidElement txt_result;


	public CalculatorPage(AppiumDriver<MobileElement> driver) {
		PageFactory.initElements(new AppiumFieldDecorator(driver), this);
	}

	public CalculatorPage clica_0() { digit0.click(); return this; }
	public CalculatorPage clica_1() { digit1.click(); return this; }
	public CalculatorPage clica_2() { digit2.click(); return this; }
	public CalculatorPage clica_3() { digit3.click(); return this; }
	public CalculatorPage clica_4() { digit4.click(); return this; }
	public CalculatorPage clica_5() { digit5.click(); return this; }
	public CalculatorPage clica_6() { digit6.click(); return this; }
	public CalculatorPage clica_7() { digit7.click(); return this; }
	public CalculatorPage clica_8() { digit8.click(); return this; }
	public CalculatorPage clica_9() { digit9.click(); return this; }

	public CalculatorPage clicaPonto() { point.click(); return this; }

	public CalculatorPage clicaMais() { op_add.click(); return this; }
	public CalculatorPage clicaMenos() { op_sub.click(); return this; }
	public CalculatorPage clicaVezes() { op_mul.click(); return this; }
	public CalculatorPage clicaDivide() { op_div.click(); return this; }
	public CalculatorPage clicaIgual() { eq.click(); return this; }

	public MobileElement getResult() { return txt_result; }

}
