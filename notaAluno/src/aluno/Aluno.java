package aluno;

public class Aluno {

    public double soma;
    public String nome;
    public double[] notas = new double[3];
    public String resultado;
    public double faltaPonto;
    public void conseguirResultado(double soma){
        if (soma >= 60){
            resultado = "Aprovado";
        } else {
            resultado = "Reprovado";
            faltaPonto = 60 - soma;

        }
    };

}
