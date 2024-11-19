package DAO;

import DTO.FuncionarioDto;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import javax.swing.JOptionPane;

public class FuncionarioDao {

    Connection conn;
    PreparedStatement pstm;
    ResultSet rs;
    ArrayList<FuncionarioDto> lista = new ArrayList<>();

    public void cadastrarFuncionario(FuncionarioDto funcionarioDto) {

        String sql = "insert into formulario(nome,cidade) value (?,?)";
        conn = new ConexaoClasse().conectaBd();

        try {

            pstm = conn.prepareStatement(sql);
            pstm.setString(1, funcionarioDto.getNomeFuncionario());
            pstm.setString(2, funcionarioDto.getCidadeFuncionario());
            pstm.execute();
            pstm.close();

        } catch (Exception e) {

            JOptionPane.showMessageDialog(null, e + "Funcionario");

        }

    }

    public ArrayList<FuncionarioDto> PesquisarFuncionario() {

        String sql = "select * from formulario";
        conn = new ConexaoClasse().conectaBd();

        try {
            pstm = conn.prepareStatement(sql);
            rs = pstm.executeQuery();

            while (rs.next()) {
                FuncionarioDto funcionarioDto = new FuncionarioDto();
                funcionarioDto.setId(rs.getInt("id"));
                funcionarioDto.setNomeFuncionario(rs.getString("nome"));
                funcionarioDto.setCidadeFuncionario(rs.getString("cidade"));

                lista.add(funcionarioDto);
            }

        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e + "Erro pesquisar");
        }

        return lista;
    }

    public void alterarFuncionario(FuncionarioDto funcionarioDto) {

        String sql = "update formulario set nome = ?, cidade = ? where id = ?";
        conn = new ConexaoClasse().conectaBd();

        try {

            pstm = conn.prepareStatement(sql);
            pstm.setString(1, funcionarioDto.getNomeFuncionario());
            pstm.setString(2, funcionarioDto.getCidadeFuncionario());
            pstm.setInt(3, funcionarioDto.getId());
            pstm.execute();
            pstm.close();

        } catch (Exception e) {

            JOptionPane.showMessageDialog(null, e + "Funcionario");

        }

    }

    public void excluirFuncinario(FuncionarioDto funcionarioDto) {
        
        String sql = "delete from formulario where id = ?";
        
         conn = new ConexaoClasse().conectaBd();
        
        try {

            pstm = conn.prepareStatement(sql);
         
            pstm.setInt(1, funcionarioDto.getId());
            
            pstm.execute();
            pstm.close();

        } catch (Exception e) {

            JOptionPane.showMessageDialog(null, e + "Funcionario");

        }
    }
}
