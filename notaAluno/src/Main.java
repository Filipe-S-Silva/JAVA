import java.util.Scanner;
import aluno.Aluno;

public class Main {

    public static void main(String[] args) {

        Aluno aluno = new Aluno();
        Scanner sc = new Scanner(System.in);
        double soma = 0;

        System.out.print("Informe o nome do aluno: ");
        aluno.nome = sc.nextLine();

        for (byte i = 0; i < 3; i++){
            if (i == 0){
                System.out.printf("Informe a %d° nota: ", i + 1);
                aluno.notas[i] = sc.nextDouble();

                while (aluno.notas[i] > 30){
                System.out.println("Nota invalida");
                System.out.printf("Informe a %d° nota: ", i + 1);
                aluno.notas[i] = sc.nextDouble();
                }

            } else {
                System.out.printf("Informe a %d° nota: ", i + 1);
                aluno.notas[i] = sc.nextDouble();
                while (aluno.notas[i] > 35){
                    System.out.println("Nota invalida");
                    System.out.printf("Informe a %d° nota: ", i + 1);
                    aluno.notas[i] = sc.nextDouble();
                }
            }

            soma += aluno.notas[i];
        }

        aluno.media = aluno.calcularMedia(soma);




    }

}