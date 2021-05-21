package aplicacao;

import java.util.Locale;

import java.util.Scanner;

import entidades.ItemPedido;
import entidades.Produto;

public class Ap_itemPedido {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		Produto p= new Produto("Radio",1000.0);
		
		ItemPedido ip= new ItemPedido(1,100.0, p);
		System.out.println(ip);
		
		
		sc.close();

	}

}
