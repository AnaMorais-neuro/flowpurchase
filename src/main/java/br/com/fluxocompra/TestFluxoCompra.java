package br.com.fluxocompra;

import java.util.concurrent.TimeUnit;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import br.com.fluxocompra.action.PurchaseFlowAction;
import br.com.fluxocompra.utils.Constants;
import br.com.fluxocompra.utils.DriverContext;

public class TestFluxoCompra {

	WebDriver driver;
	PurchaseFlowAction flowAction;

	@BeforeEach
	void steUp() throws Exception {

		System.setProperty("webdriver.chrome.driver", Constants.PATH_CHROMEDRIVER);
		driver = new ChromeDriver();
		driver.get("http://automationpractice.com/index.php");
		driver.manage().window().maximize();
		DriverContext.setDriver(driver);
		flowAction = new PurchaseFlowAction();

	}

	@Test
	void tests() {

		flowAction.clickSignIn();
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		flowAction.enterEmail("ana.mariamorais@gmail.com");
		flowAction.enterpasswd("12345");
		flowAction.btnSubmitLogin();
		flowAction.clickDresses();
		flowAction.checkboxfilterSize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		flowAction.clickProduct();
		flowAction.clickAddToCart();
		flowAction.clickProceedCheckout();
		flowAction.proceedCheckoutSummary();
		flowAction.proceedToCheckoutAddress();
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		flowAction.checkTermsService();
		flowAction.proceedToCheckoutShipping();
		flowAction.payment();
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		flowAction.btnConfirmMyOrder();
	}

	@AfterEach
	void tearDown() throws Exception {
//		driver.close();
//		driver.quit();
	}
}