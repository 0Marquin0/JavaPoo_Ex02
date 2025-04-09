package Ex02;

public class Main {
    public static void main(String[] args) {
        MenuItem item1 = new MenuItem("Pastel", 15.0);
        MenuItem item2 = new MenuItem("Caldo de cana", 5.0);

        Pedido pedido = new Pedido(1);
        pedido.adicionarItem(item1);
        pedido.adicionarItem(item2);
        pedido.calcularTotal();

        Cliente cliente = new Cliente("João", "(62) 4002-8922");
        cliente.fazerPedido(pedido);
        cliente.cancelarPedido();
    }
}
