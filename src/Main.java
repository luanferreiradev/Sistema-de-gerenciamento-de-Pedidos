import models.Produto;
import models.ProdutoNormal;
import models.ProdutoImportado;
import models.ProdutoUsado;
import models.Pedido;
import services.ProdutoService;
import services.PedidoService;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ProdutoService produtoService = new ProdutoService();
        PedidoService pedidoService = new PedidoService();
        Pedido pedidoAtual = null; // Inicializa a referência do pedido atual

        while (true) {
            System.out.println("Sistema de Gerenciamento de Pedidos");
            System.out.println("1. Adicionar Produto Normal");
            System.out.println("2. Adicionar Produto Usado");
            System.out.println("3. Adicionar Produto Importado");
            System.out.println("4. Listar Produtos");
            System.out.println("5. Criar Novo Pedido");
            System.out.println("6. Adicionar Produto ao Pedido");
            System.out.println("7. Remover Produto do Pedido");
            System.out.println("8. Listar Pedidos");
            System.out.println("9. Sair");
            System.out.print("Escolha uma opção: ");
            int opcao = scanner.nextInt();
            scanner.nextLine(); // Consumir nova linha

            switch (opcao) {
                case 1:
                    System.out.print("Nome do Produto Normal: ");
                    String nomeNormal = scanner.nextLine();
                    System.out.print("Preço do Produto Normal: ");
                    double precoNormal = scanner.nextDouble();
                    produtoService.adicionarProduto(new ProdutoNormal(nomeNormal, precoNormal));
                    System.out.println("Produto Normal adicionado com sucesso!");
                    break;
                case 2:
                    System.out.print("Nome do Produto Usado: ");
                    String nomeUsado = scanner.nextLine();
                    System.out.print("Preço do Produto Usado: ");
                    double precoUsado = scanner.nextDouble();
                    produtoService.adicionarProduto(new ProdutoUsado(nomeUsado, precoUsado));
                    System.out.println("Produto Usado adicionado com sucesso!");
                    break;
                case 3:
                    System.out.print("Nome do Produto Importado: ");
                    String nomeImportado = scanner.nextLine();
                    System.out.print("Preço do Produto Importado: ");
                    double precoImportado = scanner.nextDouble();
                    produtoService.adicionarProduto(new ProdutoImportado(nomeImportado, precoImportado));
                    System.out.println("Produto Importado adicionado com sucesso!");
                    break;
                case 4:
                    produtoService.listarProdutos();
                    break;
                case 5:
                    pedidoAtual = new Pedido(); // Inicializa o pedido atual
                    pedidoService.adicionarPedido(pedidoAtual);
                    System.out.println("Novo pedido criado com sucesso! ID: " + pedidoAtual.getId());
                    break;
                case 6:
                    if (pedidoAtual == null) {
                        System.out.println("Nenhum pedido criado. Crie um pedido primeiro.");
                        break;
                    }
                    System.out.print("ID do Produto para adicionar ao Pedido: ");
                    int produtoIdAdicionar = scanner.nextInt();
                    Produto produtoParaAdicionar = produtoService.getProdutoById(produtoIdAdicionar);
                    if (produtoParaAdicionar != null) {
                        pedidoAtual.adicionarProduto(produtoParaAdicionar);
                        System.out.println("Produto adicionado ao pedido com sucesso!");
                    } else {
                        System.out.println("Produto não encontrado!");
                    }
                    break;
                case 7:
                    if (pedidoAtual == null) {
                        System.out.println("Nenhum pedido criado. Crie um pedido primeiro.");
                        break;
                    }
                    System.out.print("ID do Produto para remover do Pedido: ");
                    int produtoIdRemover = scanner.nextInt();
                    Produto produtoParaRemover = produtoService.getProdutoById(produtoIdRemover);
                    if (produtoParaRemover != null) {
                        pedidoAtual.removerProduto(produtoParaRemover);
                        System.out.println("Produto removido do pedido com sucesso!");
                    } else {
                        System.out.println("Produto não encontrado!");
                    }
                    break;
                case 8:
                    pedidoService.listarPedidos();
                    break;
                case 9:
                    System.out.println("Saindo...");
                    return;
                default:
                    System.out.println("Opção inválida. Tente novamente.");
            }
        }
    }
}
