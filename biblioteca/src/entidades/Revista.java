package entidades;


public class Revista extends ItemBiblioteca{

    private String mesPublicacao;
    private String edicao;

    public String getMesPublicacao() {
        return mesPublicacao;
    }

    public String getEdicao() {
        return edicao;
    }

    public Revista(String titulo, String codigo, String mesPublicacao, String edicao){
        super(titulo, codigo);
        this.mesPublicacao = mesPublicacao;
        this.edicao = edicao;
    }

    @Override
    public String exibirDetalhes(){
        return "Titulo: " + titulo + ", Código: " + codigo +
                "\nMês publicação: " + mesPublicacao + ", Edição: " + edicao;
    }
}

