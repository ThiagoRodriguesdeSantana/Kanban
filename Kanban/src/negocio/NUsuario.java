/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package negocio;

import entidade.EUsuario;
import java.sql.SQLException;
import java.util.List;
import org.apache.commons.mail.EmailException;
import persistencia.PUsuario;

public class NUsuario {

    PUsuario pUsuario = new PUsuario();
    EUsuario eUsuario;

    public void inserir(EUsuario eUsuario) throws Exception {
        if (eUsuario.getNome().isEmpty() || eUsuario.getEmail().isEmpty()) {
            throw new Exception("O Usuário deve conter pelo menos um nome e um email para cadastro!");
        }

        pUsuario.Inserir(eUsuario);
    }

    public EUsuario Buscar(int codigo) throws Exception{
        if(codigo==0)
            throw new Exception("Informe um codigo para busca!");
        
        return pUsuario.Buscar(codigo);
    }
    public EUsuario Buscar(String nome) throws Exception{
        
        return pUsuario.Buscar(nome);
    }
    public void Excluir(int codigo, String senha, String email) throws Exception{
        
        
        if(!ValidarLogin(senha,email))
            throw new Exception("Você não tem permissão para excluir esse usuário!");
        
        pUsuario.Excluir(eUsuario.getCodigo());
        
    }
    public List<EUsuario> Listar() throws SQLException{
        
        return pUsuario.Listar();
    }

    public boolean ValidarLogin(String email, String senha) throws SQLException, Exception {
        
        if(pUsuario.BuscarPorEamil(email).getCodigo()==0||!pUsuario.BuscarPorEamil(email).getSenha().equals(senha))
             throw new Exception("Usuário não encontrado!");
             
        
          eUsuario = pUsuario.BuscarPorEamil(email);
          return true;
        
    }
    public void InserirCodigo(int codigo, String email) throws SQLException{
        
        pUsuario.InserirCodigo(codigo, email);
    }
    public void EnviarEmail(String email) throws EmailException, SQLException{
        
        Servicos.EnviarEmailDeConfirmacao(email);
        
    }
    

}
