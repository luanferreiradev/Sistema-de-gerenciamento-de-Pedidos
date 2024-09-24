package models;

public class Pedido {
    private static int contador = 1;
    private int id;
    private int produtoId;
    private int quantidade;

    public Pedido(int produtoId, int quantidade) {
        this.id = contador++;
        this.produtoId = produtoId;
        this.quantidade = quantidade;
    }

    public int getId() {
        return id;
    }

    public int getProdutoId() {
        return produtoId;
    }

    public int getQuantidade() {
        return quantidade;
    }

    @Override
    public String toString() {
        return "Pedido{" +
                "id=" + id +
                ", produtoId=" + produtoId +
                ", quantidade=" + quantidade +
                '}';
    }
}
