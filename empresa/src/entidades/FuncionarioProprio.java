package entidades;
public class FuncionarioProprio extends Funcionario{

     Funcionario fc;

    public FuncionarioProprio(String nome, float horasTrabalhadas,float valorHora){
        super(nome, horasTrabalhadas, valorHora);
    }
    @Override
    public String toString() {
        return "Nome funcionario: " + nome +
                "\nHoras trabalhadas: " + String.format("%.1f", horasTrabalhadas) +
                "\nValor da hora: R$" + String.format("%.2f", valorHora) +
                "\nValor para receber: R$" + String.format("%.2f",(pagamentoHora(valorHora, horasTrabalhadas)))
                + "\n";
    }
}
