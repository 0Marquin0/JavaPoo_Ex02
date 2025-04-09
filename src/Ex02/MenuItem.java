package Ex02;

public class MenuItem {
    private String nome;
    private double preco;

    public MenuItem(String nome, double preco) {
        this.nome = nome;
        this.preco = preco;
    }

    public void exibirDetalhes() {
        System.out.println("Item: " + nome + " - Preço: R$ " + preco);
    }

    public double getPreco() {
        return preco;
    }

    public String getNome() {
        return nome;
    }
}
