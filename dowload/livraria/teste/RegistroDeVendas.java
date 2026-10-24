package br.com.codigodacasa.livraria.teste;

import java.util.List;

import br.com.codigodacasa.livraria.Autor;
import br.com.codigodacasa.livraria.produtos.CarrinhoDeCompras;
import br.com.codigodacasa.livraria.produtos.Ebook;
import br.com.codigodacasa.livraria.produtos.LivroFisico;
import br.com.codigodacasa.livraria.produtos.Produto;

public class RegistroDeVendas {
	public static void main(String[] args) {
		
		Autor autor = new Autor();
		autor.setNome("Mauricio Aniche");
		
		LivroFisico fisico = new LivroFisico(autor);
		fisico.setNome("Test-Driven Development");
		fisico.setValor(59.90);
		
		Ebook ebook = new Ebook(autor);
		ebook.setNome("Test-Driven Development");
		ebook.setValor(29.90);
		
		CarrinhoDeCompras carrinho = new CarrinhoDeCompras();
		
		carrinho.adiciona(fisico);
		carrinho.adiciona(ebook);
		
		System.out.println("Total " + carrinho.getTotal());
		
		List<Produto> produtos = carrinho.getProdutos();
		
		for (Produto produto : produtos) {
			System.out.println(produto);
		}
	}
}


