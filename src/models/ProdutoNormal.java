package models;

public class ProdutoNormal extends Produto {
    public ProdutoNormal(String nome, double preco) {
        super(nome, preco);
    }

    @Override
    public String obterDescricao() {
        return "Produto Normal{" +
                "id=" + getId() +
                ", nome='" + getNome() + '\'' +
                ", preço=" + getPreco() +
                '}';
    }
}
