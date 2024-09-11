package entidades;

import entidades.Conta;

public class ContaEspecial extends Conta {

    private double limiteEmprestimo;

    public double getLimiteEmprestimo() {
        return limiteEmprestimo;
    }

    @Override
    public double getSaldo() {
        return super.getSaldo();
    }

    public ContaEspecial(int numero, String titular, double depInicial, double limiteEmprestimo) {
        super(numero, titular, depInicial);
        this.limiteEmprestimo = limiteEmprestimo;
    }

    public ContaEspecial(int numero, String titular, double limiteEmprestimo) {
        super(numero, titular);
        this.limiteEmprestimo = limiteEmprestimo;
    }

    public void limite(double quantia) {

        double saldo = getSaldo();

        if ((saldo + limiteEmprestimo) >= quantia) {
            System.out.println("Limite disponivel");
        } else {
            System.out.println("Limite indisponivel");
        }

    }

    @Override
    public String toString() {
        return super.toString()
                + ", Limite emprestimo: " + String.format("%.2f", limiteEmprestimo);
    }
}
