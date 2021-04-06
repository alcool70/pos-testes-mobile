package pages;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import org.openqa.selenium.support.PageFactory;

public class HackerNewsPage {

	@AndroidFindBy(accessibility = "Navigate up")
	private AndroidElement navigate_up;

	@AndroidFindBy(xpath = "//android.support.v7.widget.RecyclerView/android.widget.RelativeLayout[1]/android.widget.RelativeLayout/android.widget.TextView[4]")
	private AndroidElement el2;

	@AndroidFindBy(xpath = "//android.support.v7.widget.RecyclerView/android.widget.RelativeLayout[2]/android.widget.RelativeLayout/android.widget.TextView[3]")
	private AndroidElement el3;

	@AndroidFindBy(id = "et_user_name")
	private AndroidElement et_user_name;

	@AndroidFindBy(id = "et_password")
	private AndroidElement et_password;

	@AndroidFindBy(xpath = "/hierarchy/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.LinearLayout")
	private AndroidElement el6;

	@AndroidFindBy(id = "android:id/button1")
	private AndroidElement androidButton;

	@AndroidFindBy(accessibility = "More options")
	private AndroidElement moreOptions;

	@AndroidFindBy(xpath = "/hierarchy/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.ListView/android.widget.LinearLayout[1]/android.widget.RelativeLayout/android.widget.TextView")
	private AndroidElement el8;

	@AndroidFindBy(accessibility = "Search")
	private AndroidElement search;

	@AndroidFindBy(id = "search_src_text")
	private AndroidElement search_src_text;

	@AndroidFindBy(xpath = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.support.v4.widget.DrawerLayout/android.widget.RelativeLayout/android.view.ViewGroup/android.widget.LinearLayout/android.widget.RelativeLayout/android.widget.Spinner[1]/android.widget.TextView")
	private AndroidElement el9;

	@AndroidFindBy(xpath = "/hierarchy/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.ListView/android.widget.CheckedTextView[3]")
	private AndroidElement el10;

	@AndroidFindBy(id = "drawer_layout")
	private AndroidElement drawer_layout;

	@AndroidFindBy(id = "tv_prompt")
	private AndroidElement tv_prompt;

	@AndroidFindBy(id = "iv_expander")
	private AndroidElement iv_expander;

	@AndroidFindBy(id = "design_menu_item_text")
	private AndroidElement design_menu_item_text;

	@AndroidFindBy(id = "android:id/summary")
	private AndroidElement androidSummary;

	@AndroidFindBy(id = "fce3fdeb-b82d-44c9-89e7-ac4575964934")
	private AndroidElement el11;


	public HackerNewsPage(AppiumDriver<MobileElement> driver) {
		PageFactory.initElements(new AppiumFieldDecorator(driver), this);
	}

	public HackerNewsPage navigateUp() {
		navigate_up.click();

		el2.click();
		el3.click();

		et_user_name.click();
		et_user_name.sendKeys("victor");

		et_password.click();
		et_password.sendKeys("12345");

		el6.click();

		androidButton.click();

		return this;
	}

	public HackerNewsPage doSearch() {
		moreOptions.click();
		el8.click();
		search.click();
		search_src_text.sendKeys("microsoft");
		el9.click();
		el10.click();
		drawer_layout.click();

		return this;
	}

	public HackerNewsPage doLogin() {
		navigate_up.click();


		iv_expander.click();
		design_menu_item_text.click();

		androidButton.click();

		return this;
	}

	public HackerNewsPage doLoginInvalido() {
		navigate_up.click();
		iv_expander.click();
		design_menu_item_text.click();
		et_user_name.sendKeys("teste01");
		et_password.sendKeys("1233");
		androidButton.click();
		return this;
	}

	public HackerNewsPage alterar_tema() {
		navigate_up.click();
		design_menu_item_text.click();
		androidSummary.click();
		el11.click();
		return this;
	}

	public AndroidElement getTv_prompt() {
		return tv_prompt;
	}

	public AndroidElement getAndroidSummary() {
		return androidSummary;
	}

}
