package Main;
import entidades.Funcionario;
import entidades.FuncionarioProprio;
import entidades.FuncionarioTerceirizado;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        //scanner e variaveis
        Scanner sc = new Scanner(System.in);
        Funcionario fc;
        List<Funcionario> funcionarios = new ArrayList<>();
        int quantidade = 0;

        //input para o for
        System.out.print("Informe a quantidade de funcionarios para adicionar: ");
        quantidade = sc.nextInt();


        //cadastro de funcionarios
        for (int i = 0; i < quantidade; i++) {

            sc.nextLine();

            System.out.print("Informe o nome do funcionario: ");
            String nome = sc.nextLine();

            System.out.print("Informe as horas Trabalhadas: ");
            float horasTrabalhadas = sc.nextFloat();

            System.out.print("Informe o valor da hora: R$");
            float valorHora = sc.nextFloat();

            sc.nextLine();

            System.out.print("Informe o tipo de funcionario, terceirizado(t)/proprio(p): ");
            String tipoFuncionario = sc.nextLine().toLowerCase();

            if (tipoFuncionario.equals("terceirizado") || tipoFuncionario.equals("t")){

                System.out.print("Informe o valor das despezas: ");
                float despeza = sc.nextFloat();

                fc = new FuncionarioTerceirizado(nome, horasTrabalhadas, valorHora, despeza);
                funcionarios.add(fc);


            } else if (tipoFuncionario.equals("proprio") || tipoFuncionario.equals("p")) {

                fc = new FuncionarioProprio(nome, horasTrabalhadas, valorHora);
                funcionarios.add(fc);

            } else {

                System.out.println("Tipo inválido funcionario não cadastrado!!!");
                i--;

            }

            System.out.println("");

        }


        //amostrar funcionarios

        for (Funcionario funcionario : funcionarios) {
            System.out.println(funcionario.toString());
        }
    }
}