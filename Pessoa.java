public class Pessoa {

    String nome;
    int idade;

    void apresentar() {
        System.out.println("Nome: " + nome);
        System.out.println("Idade: " + idade);
    }

    void fazerAniversario() {
        idade++;
    }
}