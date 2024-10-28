package entidades;

public class Carro extends Veiculo{
    protected int numeroPortas;


    public Carro(String marca,  String modelo, int numeroPortas){
        super(marca, modelo);
        this.numeroPortas = numeroPortas;
    }
    @Override
    public String dirigir(){
        return "Dirigindo um carro, " + marca + " " + modelo + " com " + numeroPortas + " portas\n";
    }

    @Override
    public String exibirDetalhes() {
        return  "Marca: " + marca +
                "\nModelo: " + modelo +
                "\n" + dirigir();
    }
}
