@flowpurchase
Feature: Fluxo Compra
	
	Background: Abrir site
	Given usario abrir site "http://automationpractice.com/index.php"
	
 	Scenario: Validar compra 
	And usuario clica no link SignIn
	And preenche campo email "ana.mariamorais@gmail.com" e campo senha com "12345"
	When clicar no botao Sign In para logar
	And clique no link Dresses
 	And selecionar o checkbox Filter Size
 	And selecionar no produto desejado
 	And clica no botao ADD TO CART
 	And clica no botao PROCEED TO CHECKOUT
 	And clica no botao proceed to checkout do summary
	And confirmar Adresses 	
	And selecionar checkbox de Terms of Service
	And clica no botao proceed to checkout do shipping	
	And sera direcionado para etapa de opcao de pagamento onde seleciona o Pay By Check
	And o site apresenta uma tela de resumo da compra onde o usuario clica no botao CONFIRM MY ORDER
	Then sera exibida uma mensagem de confimacao "Your order on My Store is complete."