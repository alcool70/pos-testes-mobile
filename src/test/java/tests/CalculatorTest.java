package tests;

import base.BaseTest;
import org.junit.Before;
import org.junit.Ignore;
import org.junit.Test;
import pages.CalculatorPage;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotEquals;

public class CalculatorTest extends BaseTest {

	CalculatorPage calcPage;

	@Before
	public void setUp() {
		driver = BaseTest.getDriver("caps/calculator.yaml");
		calcPage = new CalculatorPage(driver);
	}

	@Test
	public void test_plus() {
		calcPage
				.clica_1().clica_2()
				.clicaMais()
				.clica_2().clica_4()
				.clicaIgual();

		assertEquals(calcPage.getResult().getText(), "36");
	}

	@Test
	public void test_mult() {
		calcPage
				.clica_5().clicaPonto().clica_5()
				.clicaVezes()
				.clica_2()
				.clicaIgual();

		assertEquals(calcPage.getResult().getText(), "11");
	}

	@Test
	public void test_minus() {
		calcPage
				.clica_6()
				.clicaMenos()
				.clica_2()
				.clicaIgual();

		assertEquals(calcPage.getResult().getText(), "4");
	}

	@Test
	public void test_div() {
		calcPage
				.clica_6()
				.clicaDivide()
				.clica_2()
				.clicaIgual();

		assertEquals(calcPage.getResult().getText(), "3");
	}

	@Test
	public void test_negative_result() {
		calcPage
				.clica_2()
				.clicaMenos()
				.clica_3()
				.clicaIgual();

		assertNotEquals(calcPage.getResult().getText(), "-1");
		assertEquals(calcPage.getResult().getText(), "−1");

	}

}
