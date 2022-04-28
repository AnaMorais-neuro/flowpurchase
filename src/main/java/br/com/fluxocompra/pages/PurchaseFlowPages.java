package br.com.fluxocompra.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import br.com.fluxocompra.utils.DriverContext;

public class PurchaseFlowPages {

	public PurchaseFlowPages() {
		PageFactory.initElements(DriverContext.getDriver(), this);
	}
	
	@FindBy(how=How.CLASS_NAME, using="login")
	protected WebElement clickSignIn;
		
	@FindBy(how=How.ID, using="email")
	protected WebElement enterEmail;
	
	@FindBy(how=How.ID, using="passwd")
	protected WebElement enterpasswd;
	
	@FindBy(how=How.ID, using="SubmitLogin")
	protected WebElement btnSignIn;
	
	@FindBy(how = How.XPATH, using = "//*[@id=\"block_top_menu\"]/ul/li[2]/a")
	protected WebElement clickDresses;
	
	@FindBy(how = How.ID, using = "uniform-layered_id_attribute_group_2")
	protected WebElement checkboxfilterSize;
	
	@FindBy(how = How.XPATH, using = "//*[@id=\"center_column\"]/ul/li[2]/div")
	protected WebElement clickProduct;
	
	@FindBy(how = How.LINK_TEXT, using = "Add to cart")
	protected WebElement clickAddToCart;
	
	@FindBy(how = How.LINK_TEXT, using = "Proceed to checkout")
	public WebElement clickProceedCheckout;
	
	@FindBy(how = How.XPATH, using = "//*[@id=\"center_column\"]/p[2]/a[1]")
	protected WebElement proceedCheckoutSummary;

	@FindBy(how = How.XPATH, using = "//*[@id=\"center_column\"]/form/p/button")
	protected WebElement proceedToCheckoutAddress;

	@FindBy(how = How.XPATH, using = "//*[@id=\"cgv\"]")
	protected WebElement checkTermsService;

	@FindBy(how = How.XPATH, using = "//*[@id=\"form\"]/p/button")
	protected WebElement proceedToCheckoutShipping;

	@FindBy(how = How.XPATH, using = "//*[@id=\"HOOK_PAYMENT\"]/div[2]/div/p/a")
	protected WebElement payment;

	@FindBy(how = How.XPATH, using = "//*[@id=\"cart_navigation\"]/button")
	protected WebElement btnConfirmMyOrder;
	
}
