public class ContaBancaria {

    String titular;
    double saldo;

    void depositar(double valor) {
        saldo += valor;
    }

    void sacar(double valor) {

        if (valor <= saldo) {
            saldo -= valor;
            System.out.println("Saque realizado");
        } else {
            System.out.println("Saldo insuficiente");
        }
    }

    void mostrarSaldo() {
        System.out.println("Saldo: R$ " + saldo);
    }
}