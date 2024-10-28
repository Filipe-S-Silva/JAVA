package entidades;

public abstract class ItemBiblioteca {

    protected String titulo;
    protected String codigo;

    public String getTitulo(){
        return titulo;
    }

    public String getCodigo(){
        return codigo;
    }

    public ItemBiblioteca(String titulo, String codigo){
        this.codigo = codigo;
        this.titulo = titulo;
    }


    public abstract String exibirDetalhes();

}
