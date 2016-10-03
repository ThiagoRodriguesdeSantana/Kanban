package persistencia;

import entidade.EAtividade;
import entidade.EUsuario;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

public class PUsuario {

    public void Inserir(EUsuario eUsuario) throws SQLException {

        String sql = "INSERT INTO public.usuario(senha, email, nome)\n"
                + "VALUES ('" + eUsuario.getSenha() + "','" + eUsuario.getEmail() + "','" + eUsuario.getNome() + "');";

        Connection conn = util.Conexao.getConexao();
        Statement prd = conn.createStatement();
        prd.execute(sql);
        conn.close();

    }

    public void Alterar(EUsuario eUsuario) throws SQLException {
        String sql = "UPDATE public.usuario SET senha='" + eUsuario.getSenha() + "',"
                + " email='" + eUsuario.getEmail() + "', nome='" + eUsuario.getNome() + "'WHERE codigo = " + eUsuario.getCodigo() + ";";

        Connection conn = util.Conexao.getConexao();
        Statement prd = conn.createStatement();
        prd.execute(sql);
        conn.close();
    }

    public void Excluir(int codigo) throws SQLException {
        String sql = "DELETE FROM public.usuario WHERE codigo = " + codigo + ";";

        try (Connection conn = util.Conexao.getConexao()) {
            Statement st = conn.createStatement();
            st.executeUpdate(sql);
        }
    }

    public List<EUsuario> Listar() throws SQLException {

        String sql = "SELECT codigo, senha, email, nome FROM public.usuario;";

        Connection conn = util.Conexao.getConexao();

        Statement st = conn.createStatement();
        ResultSet rs = st.executeQuery(sql);
        List<EUsuario> list = new ArrayList<>();

        while (rs.next()) {

            EUsuario eUsuario = new EUsuario();

            eUsuario.setCodigo(rs.getInt("codigo"));
            eUsuario.setSenha(rs.getString("senha"));
            eUsuario.setSenha(rs.getString("email"));
            eUsuario.setSenha(rs.getString("nome"));

            list.add(eUsuario);

        }
        return list;

    }

    public EUsuario Buscar(int codigo) throws SQLException {
        String sql = "SELECT codigo, senha, email, nome FROM public.usuario where codigo = " + codigo + ";";

        Connection conn = util.Conexao.getConexao();

        Statement st = conn.createStatement();
        ResultSet rs = st.executeQuery(sql);

        EUsuario eUsuario = new EUsuario();

        while(rs.next()){
        eUsuario.setCodigo(rs.getInt("codigo"));
        eUsuario.setSenha(rs.getString("senha"));
        eUsuario.setSenha(rs.getString("email"));
        eUsuario.setSenha(rs.getString("nome"));
        }

        return eUsuario;
    }

    public EUsuario Buscar(String nome) throws SQLException {
        String sql = "SELECT codigo, senha, email, nome FROM public.usuario where nome like = '" + nome + "'%;";

        Connection conn = util.Conexao.getConexao();

        Statement st = conn.createStatement();
        ResultSet rs = st.executeQuery(sql);

        EUsuario eUsuario = new EUsuario();

        eUsuario.setCodigo(rs.getInt("codigo"));
        eUsuario.setSenha(rs.getString("senha"));
        eUsuario.setSenha(rs.getString("email"));
        eUsuario.setSenha(rs.getString("nome"));

        return eUsuario;
    }

    public EUsuario BuscarPorEamil(String email) throws SQLException {
        String sql = "SELECT codigo, senha, email, nome FROM public.usuario where email = '" + email + "';";

        Connection conn = util.Conexao.getConexao();

        Statement st = conn.createStatement();
        ResultSet rs = st.executeQuery(sql);

        EUsuario eUsuario = new EUsuario();
        while (rs.next()) {

            eUsuario.setCodigo(rs.getInt("codigo"));
            eUsuario.setSenha(rs.getString("senha"));
            eUsuario.setEmail(rs.getString("email"));
            eUsuario.setNome(rs.getString("nome"));
        }

        return eUsuario;
    }

    public void InserirCodigo(int codigo, String mail) throws SQLException {

        String sql = "INSERT INTO public.confirmacao(codigo, email) VALUES (" + codigo + ", '" + mail + "');";

        Connection conn = util.Conexao.getConexao();
        Statement prd = conn.createStatement();
        prd.execute(sql);
        conn.close();
    }

    public String PegarCodigo(int codigo) throws SQLException {

        String sql = "SELECT email FROM public.confirmacao where codigo = " + codigo;

        Connection cnn = util.Conexao.getConexao();
        PreparedStatement prd = cnn.prepareStatement(sql);

        ResultSet rs = prd.executeQuery();

        String email = "";
        if (rs.next()) {
            email = rs.getString("email");

        }

        prd.close();
        rs.close();
        cnn.close();

        return email;
    }

}
