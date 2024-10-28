package entidades;

public class Moto extends Veiculo{

    protected int cilindradas;

    public Moto(String marca,  String modelo, int cilindradas){
        super(marca, modelo);
        this.cilindradas = cilindradas;
    }

    @Override
    public String dirigir(){
        return "Dirigindo uma moto, " + marca + " " + modelo + " com " + cilindradas + " cilindradas\n";
    }

    @Override
    public String exibirDetalhes() {
        return  "Marca: " + marca + "," + " Modelo: " + modelo +
                "\n" + dirigir();
    }

}
