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
    
    public void salvar(EAtividade eAtividade)throws SQLException{
        
        if(eAtividade.getCodigo() == 0){
            pAtividade.incluir(eAtividade);
        }else{
            pAtividade.alterar(eAtividade);
        }
    }
    
    public void excluir(int codigo)throws SQLException{
        pAtividade.excluir(codigo);
    }
    
    public EAtividade consultar(int codigo)throws SQLException{
        return pAtividade.Consultar(codigo);
    }
    
    public List<EAtividade> Listar(String nome)throws SQLException{
        return pAtividade.listar(nome);
    }
    
    
}
