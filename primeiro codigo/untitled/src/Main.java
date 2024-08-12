import java.util.Scanner;

public class Main {

    public static void main(String[] args){

        //Scanner
        Scanner sc = new Scanner(System.in);

        //Questão 1)
        System.out.printf("--- PRIMEIRA QUESTÃO ---%n");
        //variaveis
        double computador;
        double mesaEscritorio;

        //usuario
        System.out.print("Digite o valor do computador: R$");
        computador = sc.nextDouble();
        System.out.print("Digite o valor da mesa de Escritorio: R$");
        mesaEscritorio = sc.nextDouble();

        //retorno
        System.out.printf("O computador custa R$%.2f %n", computador);
        System.out.printf("A mesa de escritorio custa R$%.2f %n", mesaEscritorio);

        //Questão 2)
        System.out.printf("%n--- SEGUNDA QUESTÃO ---%n");
        //variaveis
        byte idade;
        String codigo;
        char sexo;

        //usuario
        System.out.print("Digite a idade: ");
        idade = sc.nextByte();

        sc.nextLine();//limpar buffer

        System.out.print("Digite o seu codigo: ");
        codigo = sc.nextLine();

        System.out.print("Digite o sexo: ");
        sexo = sc.next().charAt(0);

        //retorno
        System.out.printf("Registro: %d anos de idade, codigo %s e sexo: %s %n", idade, codigo, sexo);


        //Questãoo 3)
        System.out.printf("%n--- TERCEIRA QUESTÃO ---%n");
        //variaveis
        double medida;

        //usuario
        System.out.print("Digite a medida: ");
        medida = sc.nextDouble();

        //retorno
        System.out.printf("Medida com oito casas decimais: %.8f %n", medida);
        System.out.printf("Arredondando(três casas decimais): %.3f %n", medida);
        System.out.printf("Decimal usado nos EUA: %.3f %n", medida);

    }

}
