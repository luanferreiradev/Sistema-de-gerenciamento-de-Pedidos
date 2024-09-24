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

        while (true) {
            System.out.println("Sistema de Gerenciamento de Pedidos");
            System.out.println("1. Adicionar Produto Normal");
            System.out.println("2. Adicionar Produto Usado");
            System.out.println("3. Adicionar Produto Importado");
            System.out.println("4. Listar Produtos");
            System.out.println("5. Excluir Produto");
            System.out.println("6. Adicionar Pedido");
            System.out.println("7. Listar Pedidos");
            System.out.println("8. Sair");
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
                    System.out.print("ID do Produto a ser excluído: ");
                    int idExcluir = scanner.nextInt();
                    if (produtoService.excluirProduto(idExcluir)) {
                        System.out.println("Produto excluído com sucesso!");
                    } else {
                        System.out.println("Produto não encontrado!");
                    }
                    break;
                case 6:
                    System.out.print("ID do Produto: ");
                    int produtoId = scanner.nextInt();
                    System.out.print("Quantidade: ");
                    int quantidade = scanner.nextInt();
                    pedidoService.adicionarPedido(new Pedido(produtoId, quantidade));
                    System.out.println("Pedido adicionado com sucesso!");
                    break;
                case 7:
                    pedidoService.listarPedidos();
                    break;
                case 8:
                    System.out.println("Saindo...");
                    return;
                default:
                    System.out.println("Opção inválida. Tente novamente.");
            }
        }
    }
}
