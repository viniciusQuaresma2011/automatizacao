package testes;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class HomePage {
	
	
	private WebDriver driver;
	
	List<WebElement> listaProdutos = new ArrayList();
	
	private By textoProdutosNoCarrinho = By.className("cart-products-count");
	private By produtos = By.className("product-description");
	
	public HomePage(WebDriver driver) {
		this.driver = driver;
	}

	public int contarProdutos() {
		carregarProdutos();
		return listaProdutos.size();
	}
	
	private void carregarProdutos() {
		listaProdutos = driver.findElements(produtos);
	}
	
	public int obterQuantidadeProdutos() {
		String quantidadeProdutosNoCarrinho = driver.findElement(textoProdutosNoCarrinho).getText();
		
		quantidadeProdutosNoCarrinho = quantidadeProdutosNoCarrinho.replace("(", "");
		quantidadeProdutosNoCarrinho = quantidadeProdutosNoCarrinho.replace(")", "");
		
		int qtdProdutosNoCarrinho = Integer.parseInt(quantidadeProdutosNoCarrinho);
		return qtdProdutosNoCarrinho;
	}
	//min 30:26
}
