import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o nome do produto: ");
        String nome = scanner.nextLine();

        System.out.print("Digite o preço do produto: ");
        double preco = scanner.nextDouble();

        System.out.print("Digite a quantidade em estoque: ");
        int estoque = scanner.nextInt();

        Produto produto = new Produto(nome, preco, estoque);

        System.out.print("Quantidade a adicionar ao estoque: ");
        int quantidadeAdicionar = scanner.nextInt();
        produto.adicionarEstoque(quantidadeAdicionar);

        System.out.print("Quantidade a vender: ");
        int quantidadeVender = scanner.nextInt();
        produto.vender(quantidadeVender);

        produto.exibirEstoque();

        scanner.close();
    }
}
