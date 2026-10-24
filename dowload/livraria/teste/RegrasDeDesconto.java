package br.com.codigodacasa.livraria.teste;

import br.com.codigodacasa.livraria.Autor;

import br.com.codigodacasa.livraria.produtos.Ebook;

public class RegrasDeDesconto {
	public static void main(String[] args) {
		
		Autor autor = new Autor();
		autor.setNome("Rodrigo Turini");
		
		Ebook ebook = new Ebook(autor);
		ebook.setValor(29.90);
		
		if (!ebook.aplicaDescontoDe(0.15)) {
			System.out.println("Desconto no ebook não pode ser maior que 15%");
		} else {
			System.out.println("Valor do ebook com desconto: " + ebook.getValor());
		}
	}
}
