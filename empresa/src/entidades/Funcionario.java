package entidades;

public abstract class Funcionario {

    String nome;
    float horasTrabalhadas;
    float valorHora;



    public Funcionario(String nome, float horasTrabalhadas, float valorHora){
        this.nome = nome;
        this.horasTrabalhadas = horasTrabalhadas;
        this.valorHora = valorHora;
    }

    public float pagamentoHora(float valorHora, float horasTrabalhadas){
        return valorHora * horasTrabalhadas;
    }

    public abstract String toString();

}
