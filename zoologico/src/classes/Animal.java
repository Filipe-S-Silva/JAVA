package classes;

public abstract class Animal {

    protected String nome;
    protected String tipo;

    public String getNome() {
        return nome;
    }

    public Animal(String nome, String tipo){
        this.nome = nome;
        this.tipo = tipo;
    }

    public abstract String emitirSom();

    public String detalheAnimal(){
        return "Nome do animal: " + nome + "\nSom animal: " + emitirSom() + "\nTipo: " + tipo;
    }
}
