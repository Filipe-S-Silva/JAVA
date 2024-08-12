import java.util.Scanner;

public class quartaQuestao {

    public static void main(String[] args) {

        // Scanner
        Scanner sc = new Scanner(System.in);

        System.out.printf("%n%n====== QUARTA QUESTAO =======%n%n");
        //variaveis
        double renda;
        double valorPagar = 0;

        //usuario
        System.out.print("Digite o valor da renda: ");
        renda = sc.nextFloat();

        //validações e retorno

        if (renda < 0) {
            System.out.println("Valor inserido invalido para calculo");
        } else {
            if (renda <= 2000 && renda >= 0) {
                System.out.println("Isento de imposto de renda");
            } else {
                if (renda <= 3000 && renda > 2000) {
                    valorPagar = (renda - 2000.00) * 0.08;
                } else if (renda <= 4500 && renda > 3000) {
                    valorPagar = ((renda - 3000.00) * 0.18) + 80;
                } else {
                    valorPagar = ((renda - 4500.00) * 0.28) + 350;
                }
                System.out.printf("Valor para pagar: R$ %.2f", valorPagar);
            }
        }

        sc.close();
    }
}
