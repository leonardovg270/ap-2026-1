public class Aluno {

    String nome;
    double nota1;
    double nota2;

    double calcularMedia() {
        return (nota1 + nota2) / 2;
    }

    void verificarSituacao() {

        double media = calcularMedia();

        System.out.println("Média: " + media);

        if (media >= 6) {
            System.out.println("Aprovado");
        } else {
            System.out.println("Reprovado");
        }
    }
}