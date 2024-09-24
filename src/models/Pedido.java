package models;

import java.util.ArrayList;
import java.util.List;

public class Pedido {
    private static int contador = 1;
    private int id;
    private List<Produto> produtos = new ArrayList<>();
    private double valorTotal;

    public Pedido() {
        this.id = contador++;
        this.valorTotal = 0.0;
    }

    public int getId() {
        return id;
    }

    public double getValorTotal() {
        return valorTotal;
    }

    public void adicionarProduto(Produto produto) {
        produtos.add(produto);
        valorTotal += produto.getPreco();
        aplicarDesconto(); // Atualiza o valor total com desconto se aplicável
    }

    public void removerProduto(Produto produto) {
        if (produtos.remove(produto)) {
            valorTotal -= produto.getPreco();
            aplicarDesconto(); // Atualiza o valor total com desconto se aplicável
        }
    }

    private void aplicarDesconto() {
        if (valorTotal > 100.0) { // Exemplo: desconto para pedidos acima de R$100
            valorTotal *= 0.9; // Aplica 10% de desconto
        }
    }

    @Override
    public String toString() {
        return "Pedido{" +
                "id=" + id +
                ", valorTotal=" + valorTotal +
                ", produtos=" + produtos +
                '}';
    }
}
