import java.util.Scanner;
import aluno.Aluno;

public class Main {

    public static void main(String[] args) {

        Aluno aluno = new Aluno();
        Scanner sc = new Scanner(System.in);


        System.out.print("Informe o nome do aluno: ");
        aluno.nome = sc.nextLine();

        for (byte i = 0; i < 3; i++){
            if (i == 0){
                System.out.printf("Informe a %d° nota: ", i + 1);
                aluno.notas[i] = sc.nextDouble();

                while (aluno.notas[i] > 30 || aluno.notas[i] < 0){
                System.out.println("Nota invalida");
                System.out.printf("Informe a %d° nota: ", i + 1);
                aluno.notas[i] = sc.nextDouble();
                }

            } else {
                System.out.printf("Informe a %d° nota: ", i + 1);
                aluno.notas[i] = sc.nextDouble();
                while (aluno.notas[i] > 35 || aluno.notas[i] < 0){
                    System.out.println("Nota invalida");
                    System.out.printf("Informe a %d° nota: ", i + 1);
                    aluno.notas[i] = sc.nextDouble();
                }
            }

            aluno.soma += aluno.notas[i];
        }

        aluno.conseguirResultado(aluno.soma);

        System.out.printf("Nome aluno: %s %n", aluno.nome);
        for (byte i = 0; i < 3; i++) {
            System.out.printf("%d° nota: %.2f %n", i + 1, aluno.notas[i]);
        }

        if (aluno.soma >= 60){
            System.out.printf("Situação: %s %n", aluno.resultado);
        } else {
            System.out.printf("Situação: %s %n", aluno.resultado);
            System.out.printf("Pontos faltante: %.2f %n", aluno.faltaPonto);
        }

    }

}
