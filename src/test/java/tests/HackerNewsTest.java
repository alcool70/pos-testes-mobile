package tests;

import base.BaseTest;
import org.junit.Before;
import org.junit.Test;
import pages.HackerNewsPage;

import static org.junit.Assert.assertEquals;

public class HackerNewsTest extends BaseTest {

	HackerNewsPage hn_page;

	@Before
	public void setUp() {
		driver = BaseTest.getDriver("caps/hackernews.yaml");
		hn_page = new HackerNewsPage(driver);
	}

	@Test
	public void test_login_false() {
		hn_page.navigateUp();
	}

	@Test
	public void test_Pesquisa() {
		hn_page.doSearch();

	}

	@Test
	public void LoginVazio() {
		hn_page.doLogin();
		assertEquals("Não é possivel realizar login",
				"Catch you, anonymous!",
				hn_page.getTv_prompt().getText());
	}

	@Test
	public void LoginInvalido() {
		hn_page.doLoginInvalido();
		assertEquals("Login Invalido",
				"You got a short…password",
				hn_page.getTv_prompt().getText());
	}

	@Test
	public void AlterarTema() {
		hn_page.alterar_tema();
		assertEquals("Tema Escuro Aplicado", "Dark", hn_page.getAndroidSummary().getText());
	}

}
