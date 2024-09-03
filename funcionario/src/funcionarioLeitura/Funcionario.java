package funcionarioLeitura;
import java.util.Scanner;
public class Funcionario {

    Scanner sc = new Scanner(System.in);
    public String nome() {
        String nome;

        System.out.print("Informe o nome: ");
        nome = sc.nextLine();

        return nome;
    }

    public double salarioBruto() {
        double salarioBruto;

        System.out.print("Informe o salario bruto: R$");
        salarioBruto = sc.nextDouble();

        return salarioBruto;
    }

    public double imposto() {
        double imposto;

        System.out.print("Informe o imposto desejado: ");
        imposto = sc.nextDouble();

        return imposto;
    }

    public double salarioLiquido(double salarioBruto, double imposto){

        double salarioLiquido = salarioBruto - imposto;
        return salarioLiquido;
    }

    public void aumetarSalario(double salarioLiquido, double salarioBruto){


        double imposto;
        double acrescimoValor;

        System.out.print("Informe o imposto para o aumento: ");
        imposto = sc.nextDouble();

        acrescimoValor = salarioBruto * (imposto / 100);

        System.out.printf("Novo valor: R$ %.2f %n", salarioLiquido + acrescimoValor);

    }

}
