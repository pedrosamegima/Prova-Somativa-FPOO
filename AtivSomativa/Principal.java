package AtivSomativa;

public class Principal {

	public static void main(String[] args) {
		Pedido pedido = new Pedido(1,"iphone 11", 100);
		System.out.println("\nPedido");
		System.out.println("Id:" +pedido.getId());
		System.out.println("Produto:" +pedido.getProduto());
		System.out.println("Quantidade:" +pedido.getQuantidade());
	}

}
