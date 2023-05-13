package br.com.fiap.loja.model;

public class Produto {
	private String nome;
	private String descricao; 
	private int quantidade;
	private double preco;
	
	
	//metodos
	public void descontoPadrao(String tipo) {
		if(quantidade > 10 && quantidade <= 50) {
			preco -= preco * 0.05;
			System.out.println(preco);
		} else if(tipo == "Livro" && quantidade > 50) {
			preco -= preco * 0.1;
			System.out.println(preco);
		} else {
			System.out.println(preco);
		}
	}
	public void descontoInfo(int porcentagem) {
		preco -= (preco*porcentagem) / 100;
		System.out.println(preco);
	}
	public void descontoCupom(String cupom) {
		if(cupom == "BEMVINDO") {
			preco -= preco * 0.4;
			System.out.println(preco);
		} else if(cupom == "NERD") {
			preco -= preco * 0.2;
			System.out.println(preco);
		} else {
			System.out.println("Esse cupom não existe.");
		}
	}
	public String exibirInfoP(String categoria, String fabricante) {
		return "Nome: " + nome + "\nDescrição: " + descricao + "\nQuantidade: " + quantidade + "\nPreço: " + preco +
				"\nCategoria: " + categoria + "\nFabricante: " + fabricante;
	}
	public String exibirInfoL(String autor, String editora) {
		return "Nome: " + nome + "\nDescrição: " + descricao + "\nQuantidade: " + quantidade + "\nPreço: " + preco +
				"\nAutor: " + autor + "\nEditora: " + editora;
	}
	
	
	//construtores
	public Produto(String nome, String descricao, int quantidade, double preco) {
		super();
		this.nome = nome;
		this.descricao = descricao;
		this.quantidade = quantidade;
		this.preco = preco;
	}
	
	//getters and setters
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getDescricao() {
		return descricao;
	}
	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}
	public int getQuantidade() {
		return quantidade;
	}
	public void setQuantidade(int quantidade) {
		this.quantidade = quantidade;
	}
	public double getPreco() {
		return preco;
	}
	public void setPreco(double preco) {
		this.preco = preco;
	}
}
