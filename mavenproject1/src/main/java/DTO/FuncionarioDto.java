 
package DTO;


public class FuncionarioDto {
    
    private String nomeFuncionario, cidadeFuncionario;
    
    public String getCidadeFuncionario(){
        return cidadeFuncionario;
    }
    
    public String getNomeFuncionario() {
        return nomeFuncionario;
    }
    
    public void setNomeFuncionario(String nomeFuncionario) {
        this.nomeFuncionario = nomeFuncionario;
    }
    
    public void setCidadeFuncionario(String cidadeFuncionario) {
        this.cidadeFuncionario = cidadeFuncionario;
    }   
    
    
}
