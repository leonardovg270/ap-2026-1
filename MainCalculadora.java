public class MainCalculadora {

    public static void main(String[] args) {

        Calculadora calc = new Calculadora();

        int soma = calc.somar(10, 5);
        int multiplicacao = calc.multiplicar(4, 3);

        System.out.println("Soma: " + soma);
        System.out.println("Multiplicação: " + multiplicacao);
    }
}