package homepage;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.is;

import org.junit.Test;

import base.BaseTests;

public class HomePageTeste extends BaseTests {
	
	@Test
	public void contagemProdutos() {
		carregarPaginaInicial();
		//assertThat(homePage.contarProdutos(), is(8));
	}
	
//	@Test
//	public void testValidarCarrinhoZerado_ZeroItensNoCarrinho() {
//		int produtosNoCarrinho = homePage.obterQuantidadeProdutos();
//		System.out.println(produtosNoCarrinho);
//	}

}
