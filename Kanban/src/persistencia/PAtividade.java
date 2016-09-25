package persistencia;

import entidade.EAtividade;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

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
        prd.close();
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
        prd.close();
        cnn.close();
        
    }
    
    public void excluir(int codigo)throws SQLException{
        
        String sql = "DELETE FROM atividade WHERE codigo = ?";
        
        Connection cnn = util.Conexao.getConexao();
        PreparedStatement prd = cnn.prepareStatement(sql);
        
        prd.setInt(1, codigo);
        
        prd.execute();
        prd.close();
        cnn.close();
        
    }
    
    public EAtividade Consultar(int codigo)throws SQLException{
        
        String sql = "SELECT * FROM atividade WHERE codigo = ?";
        
        Connection cnn = util.Conexao.getConexao();
        PreparedStatement prd = cnn.prepareStatement(sql);
        
        prd.setInt(1,codigo);
        
        ResultSet rs = prd.executeQuery();
        
        EAtividade eAtividade = new EAtividade();
        if(rs.next()){
            eAtividade.setCodigo(rs.getInt("codigo"));
            eAtividade.setDescricao(rs.getString("descricao"));
            eAtividade.setDataDeEntrega(rs.getDate("data_de_entrega"));
            eAtividade.setConcluida(rs.getBoolean("concluida"));
            eAtividade.setRelatoFinal(rs.getString("relato_final"));
            eAtividade.getUsuario().setCodigo(rs.getInt("codigo_usuario"));
        }
        
        prd.close();
        rs.close();
        cnn.close();
        
        return eAtividade;
        
    }
    
    public List<EAtividade> listar(String descricao)throws SQLException{
        
        String sql = "SELECT * FROM atividade WHERE descricao LIKE ?";
        
        Connection cnn = util.Conexao.getConexao();
        PreparedStatement prd = cnn.prepareStatement(sql);
        
        prd.setString(1, "%"+descricao+"%");
        
        ResultSet rs = prd.executeQuery();
        
        List<EAtividade> lista = new ArrayList<>();
        
        while(rs.next()){
            EAtividade eAtividade = new EAtividade();
            
            eAtividade.setCodigo(rs.getInt("codigo"));
            eAtividade.setDescricao(rs.getString("descricao"));
            eAtividade.setDataDeEntrega(rs.getDate("data_de_entrega"));
            eAtividade.setConcluida(rs.getBoolean("concluida"));
            eAtividade.setRelatoFinal(rs.getString("relato_final"));
            eAtividade.getUsuario().setCodigo(rs.getInt("codigo_usuario"));
            
            lista.add(eAtividade);
        }
        
        
        return lista;
    }
    
}
