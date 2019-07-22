package modelo;

public class ContaCorrente extends Conta {

    private double chequeEspecial;

    public void depositarCheque(Cheque cheque) {
        super.saldo += cheque.getValor();
    }

    @Override
    public double sacar(double valor) {

        if (valor > super.saldo && valor <= super.saldo + this.chequeEspecial) {
            return super.saldo -= valor;
        } else {
            return super.saldo -= valor;
        }

        /*
        if (valor > super.saldo && valor <= super.saldo + this.chequeEspecial) {
            this.chequeEspecial = (super.saldo + this.chequeEspecial) - valor;
        } else if (valor > super.saldo && valor > super.saldo + this.chequeEspecial) {
            System.out.println("Não pode sacar!");
        } else {
            super.saldo -= valor;
        }
        */

        /*
        if (super.saldo >= valor) {
            super.saldo -= valor;
        } else if (valor > super.saldo) {
            super.saldo -= valor;
            this.chequeEspecial += super.saldo;
        }
        */

    }

}