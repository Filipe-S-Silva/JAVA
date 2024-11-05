
package DAO;

import DTO.FuncionarioDto;
import java.sql.Connection;
import java.sql.PreparedStatement;
import javax.swing.JOptionPane;


public class FuncionarioDao {

    Connection conn;
    PreparedStatement pstm;
    
    
    public void cadastrarFuncionario(FuncionarioDto funcionarioDto){
        
        String sql = "insert into tabela(nome, cidade) values (?,?)";
        conn = new ClasseConexao().conectaBd();
        
        try {
            
            pstm = conn.prepareStatement(sql);
            pstm.setString(1,funcionarioDto.getNomeFuncionario());
            pstm.setString(2, funcionarioDto.getCidadeFuncionario());
            pstm.execute();
            pstm.close();
            
            
        } catch (Exception e) {
            
            JOptionPane.showMessageDialog(null, e + "Funcionario");
            
        }
        
    }
    
}
