package br.com.fiap.loja.model;

public class Eletronicos extends Produto {
	private String categoria;
	private String fabricante;
	
	
	
	
	//construtores
	public Eletronicos(String nome, String descricao, int quantidade, double preco, String categoria,
			String fabricante) {
		super(nome, descricao, quantidade, preco);
		this.categoria = categoria;
		this.fabricante = fabricante;
	}
	
	//getters and setters 
	public String getCategoria() {
		return categoria;
	}
	public void setCategoria(String categoria) {
		this.categoria = categoria;
	}
	public String getFabricante() {
		return fabricante;
	}
	public void setFabricante(String fabricante) {
		this.fabricante = fabricante;
	}
}
