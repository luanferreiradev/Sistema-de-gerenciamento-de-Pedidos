package models;

public class ProdutoUsado extends Produto {
    public ProdutoUsado(String nome, double preco) {
        super(nome, preco);
    }

    @Override
    public String obterDescricao() {
        return "Produto Usado{" +
                "id=" + getId() +
                ", nome='" + getNome() + '\'' +
                ", preço=" + getPreco() +
                " (Usado)}";
    }
}
