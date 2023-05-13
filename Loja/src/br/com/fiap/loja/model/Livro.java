package br.com.fiap.loja.model;

public class Livro extends Produto {
	private String autor;
	private String editora;
	
	
	
	//construtores
	public Livro(String nome, String descricao, int quantidade, double preco, String autor, String editora) {
		super(nome, descricao, quantidade, preco);
		this.autor = autor;
		this.editora = editora;
	}
	
	//getters and setters 
	public String getAutor() {
		return autor;
	}
	public void setAutor(String autor) {
		this.autor = autor;
	}
	public String getEditora() {
		return editora;
	}
	public void setEditora(String editora) {
		this.editora = editora;
	}
}
