public class MainPessoa {

    public static void main(String[] args) {

        Pessoa pessoa = new Pessoa();

        pessoa.nome = "Leonardo";
        pessoa.idade = 20;

        pessoa.apresentar();

        pessoa.fazerAniversario();

        System.out.println("Após aniversário:");
        pessoa.apresentar();
    }
}