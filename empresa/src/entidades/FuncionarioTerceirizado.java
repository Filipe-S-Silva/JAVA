package entidades;

public class FuncionarioTerceirizado extends Funcionario{

    Funcionario fc;
    private float despesa;

    public float getDespesa() {
        return despesa;
    }


    public FuncionarioTerceirizado(String nome, float horasTrabalhadas, float valorHora, float despesa){
        super(nome, horasTrabalhadas, valorHora);
        this.despesa = despesa;

    }
    @Override
    public String toString() {
        return "Nome funcionario: " + nome +
                "\nHoras trabalhadas: " + String.format("%.1f", horasTrabalhadas) +
                "\nValor da hora: R$" + String.format("%.2f", valorHora) +
                "\nValor despesas adicionais: R$" + String.format("%.2f", getDespesa()) +
                "\nValor para receber: R$" + String.format("%.2f",(pagamentoHora(valorHora, horasTrabalhadas) + (despesa * 1.1)))
                + "\n";
    }
}
