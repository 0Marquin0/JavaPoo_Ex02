package Ex02;

public class Cliente {
    private String nome;
    private String contato;
    private Pedido pedidoAtual;

    public Cliente(String nome, String contato) {
        this.nome = nome;
        this.contato = contato;
    }

    public void fazerPedido(Pedido pedido) {
        this.pedidoAtual = pedido;
        System.out.println(nome + " fez o pedido #" + pedidoAtual);
    }

    public void cancelarPedido() {
        if (pedidoAtual != null) {
            pedidoAtual.cancelar();
        } else {
            System.out.println("Nenhum pedido para cancelar.");
        }
    }
}
