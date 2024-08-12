import java.util.Scanner;

public class segundaQuestao {

    public static void main(String[] args) {

        //Scanner
        Scanner sc = new Scanner(System.in);


        System.out.printf("%n%n====== SEGUNDA QUESTAO =======%n%n");
        //variaveis

        int x1;
        int x2;
        String resultadoSegunda;

        //usuario

        System.out.print("Digite o valor do primeiro numero: ");
        x1 = sc.nextInt();

        System.out.print("Digite o valor do segundo numero: ");
        x2 = sc.nextInt();

        //validacao


        if (x1 == 0 || x2 == 0) {
            resultadoSegunda = "Não multiplos, um valor é 0";
        } else if (x1 % x2 == 0 || x2 % x1 == 0) {
            resultadoSegunda = "Multiplos";
        } else {
            resultadoSegunda = "Não multiplos";
        }

        //retorno

        System.out.printf("Numero x1: %d %n", x1);
        System.out.printf("Numero x2: %d %n", x2);
        System.out.printf("Resultado: %s %n", resultadoSegunda);

        sc.close();

    }

}
