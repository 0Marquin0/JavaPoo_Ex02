package Ex02;

import java.util.ArrayList;
import java.util.List;

public class Pedido {
    private int numeroPedido;
    private String status;
    private List<MenuItem> itens;

    public Pedido(int numeroPedido) {
        this.numeroPedido = numeroPedido;
        this.status = "Em andamento";
        this.itens = new ArrayList<>();
    }

    public void adicionarItem(MenuItem item) {
        itens.add(item);
        System.out.println("Item adicionado: " + item.getNome());
    }

    public void calcularTotal() {
        double total = 0;
        for (MenuItem item : itens) {
            total += item.getPreco();
        }
        System.out.println("Total do pedido #" + numeroPedido + ": R$ " + total);
    }

    public void cancelar() {
        this.status = "Cancelado";
        System.out.println("Pedido #" + numeroPedido + " cancelado.");
    }

    public String getStatus() {
        return status;
    }
}
