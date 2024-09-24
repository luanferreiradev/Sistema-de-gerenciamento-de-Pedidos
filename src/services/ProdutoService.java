package services;

import models.Produto;

import java.util.ArrayList;
import java.util.List;

public class ProdutoService {
    private List<Produto> produtos = new ArrayList<>();

    public void adicionarProduto(Produto produto) {
        produtos.add(produto);
    }

    public void listarProdutos() {
        System.out.println("Lista de Produtos:");
        for (Produto produto : produtos) {
            System.out.println(produto);
        }
    }

    public Produto getProdutoById(int id) {
        for (Produto produto : produtos) {
            if (produto.getId() == id) {
                return produto;
            }
        }
        return null; // Retorna null se o produto não for encontrado
    }

    public boolean excluirProduto(int id) {
        for (Produto produto : produtos) {
            if (produto.getId() == id) {
                produtos.remove(produto);
                return true; // Retorna true se o produto foi removido
            }
        }
        return false; // Retorna false se o produto não foi encontrado
    }
}
