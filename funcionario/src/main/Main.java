package main;
import funcionarioLeitura.Funcionario;
import java.util.Locale;

public class Main {
    public static void main(String[] args) {

    Funcionario fc = new Funcionario();
    Locale.setDefault(Locale.US);

    String nome = fc.nome();
    double salarioBruto = fc.salarioBruto();
    double imposto = fc.imposto();
    double salarioLiquido = fc.salarioLiquido(salarioBruto, imposto);

    System.out.printf("Nome do funcionario: %s %n", nome);
    System.out.printf("Salario bruto: R$%.2f %n", salarioBruto);
    System.out.printf("Imposto: R$%.2f %n", imposto);
    System.out.printf("Salario Liquido: R$%.2f %n", salarioLiquido);

    fc.aumetarSalario(salarioLiquido, salarioBruto);





    }
}