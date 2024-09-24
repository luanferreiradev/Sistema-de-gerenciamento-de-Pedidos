# Sistema de Gerenciamento de Pedidos

Este é um sistema simples de gerenciamento de pedidos que permite criar pedidos, adicionar e remover produtos. O sistema suporta produtos normais, usados e importados, e calcula o valor total automaticamente.

## Funcionalidades

- Adicionar produtos normais, usados e importados.
- Criar novos pedidos.
- Adicionar e remover produtos de pedidos.
- Listar produtos e pedidos.
- Cálculo automático do valor total dos pedidos, com opções de desconto.

## Estrutura do Projeto

O projeto contém as seguintes classes:

- **models/Pedido**: Representa um pedido com atributos como ID, produtos e valor total.
- **models/Produto**: Classe abstrata para produtos com subclasses para diferentes tipos de produtos.
- **models/ProdutoNormal**: Representa um produto normal.
- **models/ProdutoUsado**: Representa um produto usado.
- **models/ProdutoImportado**: Representa um produto importado.
- **services/ProdutoService**: Gerencia as operações relacionadas aos produtos.
- **services/PedidoService**: Gerencia as operações relacionadas aos pedidos.
- **Main**: Classe principal para execução do programa.

## Pré-requisitos

- JDK 8 ou superior.
- IDE de sua escolha (por exemplo, IntelliJ IDEA, Eclipse).

## Como Executar

1. Clone o repositório:
   ```bash
   git clone https://github.com/seu-usuario/seu-repositorio.git
   cd seu-repositorio
2. Compile o projeto:
    ```bash
    javac -d out src/models/*.java src/services/*.java src/Main.java
3. Execute o programa:
    ```bash
    java -cp out Main

## Contribuição

Sinta-se à vontade para contribuir com melhorias. Crie um fork do projeto, faça suas alterações e envie um pull request.

## Licença

Este projeto está licenciado sob a [MIT License.](https://opensource.org/license/mit)

