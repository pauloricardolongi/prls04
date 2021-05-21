package aplicacao;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import java.util.Scanner;

import entidades.Cliente;
import entidades.ItemPedido;
import entidades.Pedido;
import entidades.Produto;
import entidades.enums.StatusPedido;

public class Programa {

	public static void main(String[] args) throws ParseException {
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
		Locale.setDefault(Locale.US);
		Scanner sc= new Scanner(System.in);
		
		System.out.println("Entre com os dados do cliente");
		System.out.print("Nome");
		String nome = sc.nextLine();
		System.out.print("Email:");
		String email = sc.nextLine();
		System.out.print("data nascimento (DD/MM/YYYY)");
		Date dataNascimento = sdf.parse(sc.next());
		
		Cliente cliente = new Cliente(nome, email, dataNascimento);
        System.out.println("Entre com STATUS do pedido:");
        System.out.print("Status");
        StatusPedido status= StatusPedido.valueOf(sc.next());
        
        Pedido pedido= new Pedido(new Date(), status, cliente);
        
        
        System.out.println("Quantos itens o pedido vai ter");
        int N = sc.nextInt();
        for( int i=0; i<N; i++) {
        	System.out.println("Entre com item #" + (i+1) );        	
        	System.out.print("Nome do produto");
        	sc.nextLine();
        	String nomeProduto= sc.nextLine();
        	System.out.print("preço do produto");
        	double preçoProduto= sc.nextDouble();
        	System.out.print("Quantidade");
        	int quantidade= sc.nextInt();
        	Produto produto= new Produto(nomeProduto, preçoProduto);
        	ItemPedido ip = new ItemPedido(quantidade,preçoProduto, produto);
        	
        	pedido.addItem(ip);
        	
        }
        System.out.println();
        System.out.println(pedido);
		sc.close();

	}

}
