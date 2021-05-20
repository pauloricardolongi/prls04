package entidades;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import entidades.enums.StatusPedido;


public class Pedido {
	private static SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy  HH:mm:ss ");
	private Date momento;
	private StatusPedido status;
	
	private Cliente cliente;
	private List<ItemPedido>itens= new ArrayList<ItemPedido>();
	
	public Pedido() {
		
	}

	public Pedido(Date momento, StatusPedido status, Cliente cliente) {
		
		this.momento = momento;
		this.status = status;
		this.cliente = cliente;
	}

	public Date getMomento() {
		return momento;
	}

	public void setMomento(Date momento) {
		this.momento = momento;
	}

	public StatusPedido getStatus() {
		return status;
	}

	public void setStatus(StatusPedido status) {
		this.status = status;
	}

	public Cliente getCliente() {
		return cliente;
	}

	public void setCliente(Cliente cliente) {
		this.cliente = cliente;
	}
	public void addItem(ItemPedido item) {
		itens.add(item);
	}
	public void removeItem(ItemPedido item) {
		itens.remove(item);
		
	}
	public double total() {
		double soma= 0.0;
		for (ItemPedido ip : itens) {
			soma= soma + ip.subTotal();
		}
		return soma;
	}

	@Override
	public String toString() {
		StringBuilder sb= new 	StringBuilder();
		sb.append("Order moment: ");
		sb.append(sdf.format(momento) + "\n");
		sb.append("status do Pedido: ");
		sb.append(status + "\n");
		sb.append("Cliente: ");
		sb.append(cliente + "n");
		sb.append("Item do Pedido: \n");
		for (ItemPedido item : itens) {
			sb.append(item + "\n");
		}
		sb.append("Total priço: $");
		sb.append(String.format("%.2f",total()));
		return sb.toString();
				 
		
			
	}
	

	

}
