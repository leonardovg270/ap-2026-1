public class MainAluno {

    public static void main(String[] args) {

        Aluno aluno = new Aluno();

        aluno.nome = "Leonardo";
        aluno.nota1 = 7.5;
        aluno.nota2 = 8.0;

        System.out.println("Aluno: " + aluno.nome);

        aluno.verificarSituacao();
    }
}