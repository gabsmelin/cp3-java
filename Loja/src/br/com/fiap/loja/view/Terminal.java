package br.com.fiap.loja.view;
import br.com.fiap.loja.model.*;

public class Terminal {
	public static void main(String[] args) {
		Livro db = new Livro("Diário de um banana", "Livro do DB, um mlk esquisito", 51, 100.0, "Kley", "BananaKong");
		//db.descontoPadrao("Livro");
		//db.descontoInfo(20);
		//db.descontoCupom("BEMVINDO");
		//db.descontoCupom("NERD");
		System.out.println(db.exibirInfoL(db.getAutor(), db.getEditora()));;
		
		System.out.println("--------------------------------------------");
		
		Eletronicos iphone = new Eletronicos("Iphone 11", "Iphone 11 com 128gb de memória", 15, 3000.0, "Celulares", "Aplle");
		//iphone.descontoPadrao("Eletronicos");
		//iphone.descontoInfo(20);
		//iphone.descontoCupom("BEMVINDO");
		//iphone.descontoCupom("NERD");
		System.out.println(iphone.exibirInfoL(iphone.getCategoria(), iphone.getFabricante()));;
	}
}
