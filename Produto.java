public class Produto {

    String nome;
    double preco;
    int quantidade;

    double calcularValorTotal() {
        return preco * quantidade;
    }

    void exibirProduto() {

        System.out.println("Nome: " + nome);
        System.out.println("Preço: R$ " + preco);
        System.out.println("Quantidade: " + quantidade);
        System.out.println("Valor Total: R$ " + calcularValorTotal());
    }
}