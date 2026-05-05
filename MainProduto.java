public class MainProduto {

    public static void main(String[] args) {

        Produto produto1 = new Produto();
        Produto produto2 = new Produto();

        produto1.nome = "Mouse";
        produto1.preco = 80;
        produto1.quantidade = 2;

        produto2.nome = "Teclado";
        produto2.preco = 150;
        produto2.quantidade = 1;

        produto1.exibirProduto();

        System.out.println();

        produto2.exibirProduto();
    }
}