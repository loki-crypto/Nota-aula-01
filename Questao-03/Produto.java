public class Produto {
    private String nome;
    private double preco;
    private int quantidadeEstoque;

    public Produto(String nome, double preco, int quantidadeEstoque) {
        this.nome = nome;
        this.preco = preco;
        this.quantidadeEstoque = quantidadeEstoque;
    }

    public void adicionarEstoque(int quantidade) {
        if (quantidade > 0) {
            quantidadeEstoque += quantidade;
            System.out.println("Estoque atualizado: " + quantidadeEstoque);
        } else {
            System.out.println("Quantidade inválida!");
        }
    }

    public void vender(int quantidade) {
        if (quantidade > 0 && quantidade <= quantidadeEstoque) {
            quantidadeEstoque -= quantidade;
            System.out.println("Venda realizada. Estoque atual: " + quantidadeEstoque);
        } else {
            System.out.println("Quantidade indisponível ou inválida!");
        }
    }

    public void exibirEstoque() {
        System.out.println("Estoque de " + nome + ": " + quantidadeEstoque);
    }
}
