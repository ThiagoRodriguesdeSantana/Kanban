package persistencia;

import entidade.EAtividade;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class PAtividade {
    
    public void incluir(EAtividade eAtividade)throws SQLException{
        
        String sql = "INSERT INTO atividade (descricao, data_de_entrega,concluida, relato_final, codigo_usuario)"
                +"VALUES(?,?,?,?,?)";
        
        Connection cnn = util.Conexao.getConexao();
        
        PreparedStatement prd = cnn.prepareStatement(sql);
        
        prd.setString(1, eAtividade.getDescricao());
        prd.setDate(2, eAtividade.getDataDeEntrega());
        prd.setBoolean(3, eAtividade.isConcluida());
        prd.setString(4, eAtividade.getRelatoFinal());
        prd.setInt(5, eAtividade.getUsuario().getCodigo());
                
                
        prd.execute();
        cnn.close();
    }
    
    public void alterar(EAtividade eAtividade)throws SQLException{
        
        String sql = "UPDATE atividade SET descricao = ?, "
                + "data_de_entrega = ?, "
                + "concluida = ?, "
                + "relato_final = ?, "
                + "codigo_usuario = ?"
                + "WHERE codigo = ?";
        
        Connection cnn = util.Conexao.getConexao();
        PreparedStatement prd = cnn.prepareStatement(sql);
        
        prd.setString(1, eAtividade.getDescricao());
        prd.setDate(2, eAtividade.getDataDeEntrega());
        prd.setBoolean(3, eAtividade.isConcluida());
        prd.setString(4, eAtividade.getRelatoFinal());
        prd.setInt(5, eAtividade.getUsuario().getCodigo());
        prd.setInt(6, eAtividade.getCodigo());
        
        prd.execute();
        cnn.close();
        
    }
    
    public void excluir(int codigo)throws SQLException{
        
        String sql = "DELETE FROM entidade WHERE "
    }
    
}
