import java.util.Scanner;

public class primeiraQuestao {

    public static void main(String[] args) {

        //Scanner
        Scanner sc = new Scanner(System.in);

        System.out.println("====== PRIMEIRA QUESTAO =======");
        //variaveis

        int numero;
        String resultadoPrimeira;

        //usuario

        System.out.print("Digite o numero: ");
        numero = sc.nextInt();

        //validação

        if (numero % 2 == 0) {
            resultadoPrimeira = "par";
        } else {
            resultadoPrimeira = "impar";
        }

        //retorno

        System.out.printf("Numero: %d %n", numero);
        System.out.printf("Resultado: %s %n", resultadoPrimeira);


        sc.close();
    }

}
