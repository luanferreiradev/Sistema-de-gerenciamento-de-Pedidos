package models;

public class ProdutoImportado extends Produto {
    public ProdutoImportado(String nome, double preco) {
        super(nome, preco);
    }

    @Override
    public String obterDescricao() {
        return "Produto Importado{" +
                "id=" + getId() +
                ", nome='" + getNome() + '\'' +
                ", preço=" + getPreco() +
                " (Importado)}";
    }
}
