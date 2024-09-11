package app;
import entidades.*;
import java.util.Locale;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        Conta conta;
        ContaEspecial contaEp;

        //conta padrão
        System.out.print("Informe o numero da conta: ");
        int numero = sc.nextInt();

        sc.nextLine();

        System.out.print("Informe o titular da conta: ");
        String titular = sc.nextLine();

        System.out.print("Informe se tem o deposito inicial(s/n)");
        char validacao = sc.next().charAt(0);

        if (validacao == 's'){
            System.out.print("Informe o valor do deposito: R$");
            double deposito = sc.nextDouble();
            conta = new Conta(numero, titular, deposito);
        } else {
            conta = new Conta(numero, titular);
        }

        System.out.println(conta);

        System.out.print("Informe o valor do deposito: R$");
        double deposito = sc.nextDouble();

        conta.deposito(deposito);
        System.out.println(conta);

        System.out.print("Informe o valor do saque: R$");
        double saque = sc.nextDouble();

        conta.saque(saque);
        System.out.println(conta);


        // conta especial

        System.out.print("Informe o numero da conta: ");
        numero = sc.nextInt();

        sc.nextLine();

        System.out.print("Informe o titular da conta: ");
        titular = sc.nextLine();

        System.out.print("Informe o limite de Emprestimo: R$");
        double limite = sc.nextDouble();

        System.out.print("Informe se tem o deposito inicial(s/n)");
        validacao = sc.next().charAt(0);

        if (validacao == 's'){
            System.out.print("Informe o valor do deposito: R$");
            deposito = sc.nextDouble();
            contaEp = new ContaEspecial(numero, titular, deposito, limite);
        } else {
            contaEp = new ContaEspecial(numero, titular, limite);
        }

        System.out.println(contaEp);

        System.out.print("Informe o valor do deposito: R$");
        deposito = sc.nextDouble();
        contaEp.deposito(deposito);
        System.out.println(contaEp);

        System.out.print("Informe o valor do saque: R$");
        saque = sc.nextDouble();
        contaEp.saque(saque);
        System.out.println(contaEp);

        System.out.print("Informe o valor para emprestimo");
        double emprestimo = sc.nextDouble();
        emprestimo += 10.0;

        contaEp.limite(emprestimo);
        System.out.println(contaEp);

    }

}
