package classes;

public class Alimento {
    
    protected String nome;
    protected String tipo;
    protected float valor;

    public float getValor() {
        return valor;
    }

    public String getNome() {
        return nome;
    }

    public String getTipo() {
        return tipo;
    }  
    
    public Alimento(String nome, String tipo, float valor){
        this.nome = nome;
        this.tipo = tipo;
        this.valor = valor;
    }   
    
    public String AlimentoPedido(){
        return nome + "(" + tipo + ")" + " - " + "R$ " + valor;
    }
}
