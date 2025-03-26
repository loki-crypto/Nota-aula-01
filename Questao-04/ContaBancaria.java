public class ContaBancaria {
    private double saldo;

    public ContaBancaria() {
        this.saldo = 0;
    }

    public double consultarSaldo() {
        return saldo;
    }

    public void depositar(double valor) {
        if (valor > 0) {
            saldo += valor;
            System.out.println("Depósito de R$" + valor + " realizado com sucesso.");
        } else {
            System.out.println("Valor de depósito inválido!");
        }
    }

    public void sacar(double valor) {
        if (valor > 0) {
            if (saldo >= valor) {
                saldo -= valor;
                System.out.println("Saque de R$" + valor + " realizado com sucesso.");
            } else {
                System.out.println("Saldo insuficiente para saque!");
            }
        } else {
            System.out.println("Valor de saque inválido!");
        }
    }

    public void transferir(double valor, ContaBancaria destino) {
        if (valor > 0) {
            if (saldo >= valor) {
                saldo -= valor;
                destino.depositar(valor);
                System.out.println("Transferência de R$" + valor + " realizada com sucesso.");
            } else {
                System.out.println("Saldo insuficiente para transferência!");
            }
        } else {
            System.out.println("Valor de transferência inválido!");
        }
    }
}
