package negocio;

import entidade.EAtividade;
import java.sql.SQLException;
import java.util.List;
import persistencia.PAtividade;

public class NAtividade {

    PAtividade pAtividade;

    public NAtividade() {
        pAtividade = new PAtividade();
    }

    public void salvar(EAtividade eAtividade) throws SQLException {

        if (eAtividade.getCodigo() == 0) {
            pAtividade.incluir(eAtividade);
        } else {
            pAtividade.alterar(eAtividade);
        }
    }

    public void excluir(int codigo) throws SQLException {
        pAtividade.excluir(codigo);
    }

    public EAtividade consultar(int codigo) throws SQLException, Exception {
      
        EAtividade atividade = pAtividade.Consultar(codigo);
        if (atividade == null|| atividade.getCodigo() == 0 ){
            throw new Exception("Código da atividade não emcontrado ou inválido");
        } else {
            return atividade;
        }
    }

    public List<EAtividade> Listar(String nome) throws SQLException {
        return pAtividade.listar(nome);
    }
    
    public  boolean ChecarUsuario(String usuario, int codigo) throws Exception{
        
        if(!usuario.equals(NUsuario._EUsuario.getEmail()))
            throw new Exception("Você só tem permissão para excluir suas próprias atividades");
        else
            return true;
        
    }
    public void Alterar(EAtividade atividade) throws SQLException{
        pAtividade.alterar(atividade);
    }

}
