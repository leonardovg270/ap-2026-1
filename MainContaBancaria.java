public class MainContaBancaria {

    public static void main(String[] args) {

        ContaBancaria conta = new ContaBancaria();

        conta.titular = "Leonardo";
        conta.saldo = 1000;

        conta.mostrarSaldo();

        conta.depositar(500);

        conta.mostrarSaldo();

        conta.sacar(300);

        conta.mostrarSaldo();
    }
}