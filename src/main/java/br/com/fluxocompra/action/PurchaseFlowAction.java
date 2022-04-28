package br.com.fluxocompra.action;

import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import br.com.fluxocompra.pages.PurchaseFlowPages;
import br.com.fluxocompra.utils.DriverContext;

public class PurchaseFlowAction extends PurchaseFlowPages {
	
	protected WebDriverWait wait;
	
	public PurchaseFlowAction() {
		wait = new WebDriverWait(DriverContext.getDriver(), 20, 1000);
	}
	
	public void clickSignIn() {
		wait.until(ExpectedConditions.elementToBeClickable(clickSignIn));
		clickSignIn.click();
	}

	public void enterEmail(String email) {
		enterEmail.sendKeys(email);
	}

	public void enterpasswd(String senha) {
		enterpasswd.sendKeys(senha);
	}

	public void btnSubmitLogin() {
		btnSignIn.click();
	}

	public void clickDresses() {
		wait.until(ExpectedConditions.elementToBeClickable(clickDresses));
		clickDresses.click();
	}

	public void checkboxfilterSize() {
		wait.until(ExpectedConditions.elementToBeClickable(checkboxfilterSize));
		checkboxfilterSize.click();
	}

	public void clickProduct() {
		wait.until(ExpectedConditions.elementToBeClickable(clickProduct));
		clickProduct.click();
	}

	public void clickAddToCart() {
		wait.until(ExpectedConditions.elementToBeClickable(clickAddToCart));
		clickAddToCart.click();
	}

	public void clickProceedCheckout() {
		wait.until(ExpectedConditions.elementToBeClickable(clickProceedCheckout));
		clickProceedCheckout.click();
	}
	
	public void proceedCheckoutSummary() {
		wait.until(ExpectedConditions.elementToBeClickable(proceedCheckoutSummary));
		proceedCheckoutSummary.click();
	}

	public void proceedToCheckoutAddress() {
		wait.until(ExpectedConditions.elementToBeClickable(proceedToCheckoutAddress));
		proceedToCheckoutAddress.click();
	}

	public void checkTermsService() {
		checkTermsService.click();
	}

	public void proceedToCheckoutShipping() {
		wait.until(ExpectedConditions.elementToBeClickable(proceedToCheckoutShipping));
		proceedToCheckoutShipping.click();
	}

	public void payment() {
		wait.until(ExpectedConditions.elementToBeClickable(payment));
		payment.click();
	}

	public void btnConfirmMyOrder() {
		wait.until(ExpectedConditions.elementToBeClickable(btnConfirmMyOrder));
		btnConfirmMyOrder.click();
	}
	
}
