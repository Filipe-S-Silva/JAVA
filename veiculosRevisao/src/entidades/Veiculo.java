package entidades;

public abstract class Veiculo {

    protected String marca;
    protected String modelo;

    public String getMarca(){
        return marca;
    }

    public String getMOdelo(){
        return modelo;
    }

    public Veiculo(String marca, String modelo){
        this.marca = marca;
        this.modelo = modelo;
    }

    public abstract String dirigir();
    public abstract String exibirDetalhes();

}
