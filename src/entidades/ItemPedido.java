package entidades;

public class ItemPedido {
	private Integer quantidade;
	private Double pre�o;
	
	private Produto produto;//composi��o

	public ItemPedido() {
	
	}

	public ItemPedido(Integer quantidade, Double pre�o, Produto produto) {
		
		this.quantidade = quantidade;
		this.pre�o = pre�o;
		this.produto = produto;
	}

	public Integer getQuantidade() {
		return quantidade;
	}

	public void setQuantidade(Integer quantidade) {
		this.quantidade = quantidade;
	}

	public Double getPre�o() {
		return pre�o;
	}

	public void setPre�o(Double pre�o) {
		this.pre�o = pre�o;
	}

	public Produto getProduto() {
		return produto;
	}

	public void setProduto(Produto produto) {
		this.produto = produto;
	}
	public double subTotal() {
		return pre�o * quantidade;
	}

	@Override
	public String toString() {
		return getProduto().getNome()
				+ ", $"
				+ String.format("%.2f",pre�o)
				+ ", Quantidade:"
				+  quantidade
				+ ", Subtotal: $"
				+ String.format("%.2f", subTotal());
	}
	
	
	

}
