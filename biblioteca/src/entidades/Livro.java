package entidades;

public class Livro extends ItemBiblioteca{

    private String autor;
    private int numeroPaginas;

    public String getAutor(){
        return autor;
    }

    public int getNumeroPaginas(){
        return numeroPaginas;
    }

    public Livro(String titulo, String codigo, String autor, int numeroPaginas){
        super(titulo, codigo);
        this.autor = autor;
        this.numeroPaginas = numeroPaginas;
    }

    @Override
    public String exibirDetalhes(){
        return "Titulo: " + titulo + ", Código: " + codigo +
                "\nAutor: " + autor + ", Número de páginas: " + numeroPaginas;
    }

}
