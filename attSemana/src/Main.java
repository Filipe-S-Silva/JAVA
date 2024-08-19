
import java.util.Scanner;

public class Main {
    public static void main(String[] args){

        //Scanner
        Scanner sc = new Scanner(System.in);

        //variaveis
        byte codigoDiaSemana;
        String diaSemana = "";

        //usuario
        System.out.print("Informe o codigo desejado: ");
        codigoDiaSemana = sc.nextByte();

        //validação
        switch (codigoDiaSemana) {

            case 1 -> diaSemana = "Domingo";
            case 2 -> diaSemana = "Segunda";
            case 3 -> diaSemana = "Terça";
            case 4 -> diaSemana = "Quarta";
            case 5 -> diaSemana = "Quinta";
            case 6 -> diaSemana = "Sexta";
            case 7 -> diaSemana = "Sabado";
            default -> diaSemana = "valor inválido";
        }

        //retorno
        System.out.printf("Dia da semana: %s", diaSemana);


    }
}