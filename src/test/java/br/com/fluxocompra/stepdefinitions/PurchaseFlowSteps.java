package br.com.fluxocompra.stepdefinitions;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

import br.com.fluxocompra.action.PurchaseFlowAction;
import br.com.fluxocompra.utils.DriverManager;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class PurchaseFlowSteps {
	
	DriverManager manager = new DriverManager();
	WebDriver driver = manager.AbrirUrl();
	PurchaseFlowAction action = PageFactory.initElements(driver, PurchaseFlowAction.class);  
	
	public PurchaseFlowSteps() throws Exception {
		
	}
	
	@Given("usario abrir site {string}")
	public void usario_abrir_site(String url) {
		driver.get(url);
		assertEquals("http://automationpractice.com/index.php", url);
	}

	@And("usuario clica no link SignIn")
	public void usuario_clica_no_link_sign_in() {
		action.clickSignIn();
	}

	@And("preenche campo email {string} e campo senha com {string}")
	public void preenche_campo_email_e_campo_senha_com(String email, String senha) {
		action.enterEmail(email);
		action.enterpasswd(senha);
		
		assertEquals("ana.mariamorais@gmail.com", email);
		assertEquals("12345", senha);
	}

	@When("clicar no botao Sign In para logar")
	public void clicar_no_botao_sign_in_para_logar() {
		action.btnSubmitLogin();
	}

	@And("clique no link Dresses")
	public void clique_no_link_dresses() {
		action.clickDresses();
	}

	@And("selecionar o checkbox Filter Size")
	public void selecionar_o_checkbox_filter_size() {
		action.checkboxfilterSize();
	}

	@And("selecionar no produto desejado")
	public void selecionar_no_produto_desejado() {
		action.clickProduct();
	}

	@And("clica no botao ADD TO CART")
	public void clica_no_botao_add_to_cart() {
		action.clickAddToCart();
	}

	@And("clica no botao PROCEED TO CHECKOUT")
	public void clica_no_botao_proceed_to_checkout() {
		action.clickProceedCheckout();
	}

	@And("clica no botao proceed to checkout do summary")
	public void clica_no_botao_proceed_to_checkout_do_summary() {
		action.proceedCheckoutSummary();
	}

	@And("confirmar Adresses")
	public void confirmar_adresses() {
		action.proceedToCheckoutAddress();
	}

	@And("selecionar checkbox de Terms of Service")
	public void selecionar_checkbox_de_terms_of_service() {
		action.checkTermsService();
	}

	@And("clica no botao proceed to checkout do shipping")
	public void clica_no_botao_proceed_to_checkout_do_shipping() {
		action.proceedToCheckoutShipping();
	}

	@And("sera direcionado para etapa de opcao de pagamento onde seleciona o Pay By Check")
	public void sera_direcionado_para_etapa_de_opcao_de_pagamento_onde_seleciona_o_pay_by_check() {
		action.payment();
	}

	@And("o site apresenta uma tela de resumo da compra onde o usuario clica no botao CONFIRM MY ORDER")
	public void o_site_apresenta_uma_tela_de_resumo_da_compra_onde_o_usuario_clica_no_botao_confirm_my_order() {
		action.btnConfirmMyOrder();
	}

	@Then("sera exibida uma mensagem de confimacao {string}")
	public void sera_exibida_uma_mensagem_de_confimacao(String message) {
		assertEquals("Your order on My Store is complete.", message);
	}
}
