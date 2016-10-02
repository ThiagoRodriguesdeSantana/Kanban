/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package negocio;

import util.Servicos;
import entidade.EUsuario;
import java.sql.SQLException;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import org.apache.commons.mail.EmailException;
import persistencia.PUsuario;

public class NUsuario {

    PUsuario pUsuario = new PUsuario();
    EUsuario eUsuario;

    public void inserir(EUsuario eUsuario) throws Exception {
        if (eUsuario.getNome().isEmpty() || eUsuario.getEmail().isEmpty()|| eUsuario.getSenha().isEmpty()) {
            throw new Exception("Você precisa preencher todos os campos!");
        }
        if(BuscarPorEmail(eUsuario.getEmail()) != null){
            throw new Exception("Email ja cadastrado!");
        }

        pUsuario.Inserir(eUsuario);
    }

    public EUsuario Buscar(int codigo) throws Exception {
        if (codigo == 0) {
            throw new Exception("Informe um codigo para busca!");
        }

        
        return pUsuario.Buscar(codigo);
    }

    public EUsuario Buscar(String nome) throws Exception {

        return pUsuario.Buscar(nome);
    }
    public EUsuario BuscarPorEmail(String email) throws SQLException{
      return pUsuario.BuscarPorEamil(email);
    }

    public void Excluir(int codigo, String senha, String email) throws Exception {

        if (!ValidarLogin(senha, email)) {
            throw new Exception("Você não tem permissão para excluir esse usuário!");
        }

        pUsuario.Excluir(eUsuario.getCodigo());

    }

    public List<EUsuario> Listar() throws SQLException {

        return pUsuario.Listar();
    }

    public boolean ValidarLogin(String email, String senha) throws SQLException, Exception {

        if (pUsuario.BuscarPorEamil(email).getCodigo() == 0 || !pUsuario.BuscarPorEamil(email).getSenha().equals(senha)) {
            throw new Exception("Usuário não encontrado!");
        }

        eUsuario = pUsuario.BuscarPorEamil(email);
        return true;

    }

    public void InserirCodigo(int codigo, String email) throws SQLException {

        pUsuario.InserirCodigo(codigo, email);
    }

    public void EnviarEmail(String email) throws EmailException, SQLException, Exception {

        Servicos.EnviarEmailDeConfirmacao(email);

    }

    public void EnviarCodigo(String email, String nome) throws EmailException, SQLException, Exception {

        if (nome.isEmpty()) {
            throw new Exception("Você precisa informar seu nome");
        }
        
        else if (CheckEamil(email)) {

            EnviarEmail(email);

        } else {
            throw new Exception("Email inválido");
        }
    }

    private boolean CheckEamil(String email) {

        String emailPattern = "\\b(^[_A-Za-z0-9-]+(\\.[_A-Za-z0-9-]+)*@([A-Za-z0-9-])+(\\.[A-Za-z0-9-]+)*((\\.[A-Za-z0-9]{2,})|(\\.[A-Za-z0-9]{2,}\\.[A-Za-z0-9]{2,}))$)\\b";
        Pattern pattern = Pattern.compile(emailPattern, Pattern.CASE_INSENSITIVE);
        Matcher matcher = pattern.matcher(email);
        return matcher.matches();

    }

    public boolean ValidarCodigo(String email, int codigo) throws SQLException, Exception {

        String mail = pUsuario.PegarCodigo(codigo);
        if (mail.isEmpty() || !mail.equals(email)) {
            throw new Exception("Codigo Inválido");
        } else {
            return true;
        }
    }
    public boolean ValidarSenha(String senha, String confirmacao) throws Exception{
      
        if(!senha.equals(confirmacao))
            throw new Exception("Senha não correspondem!");
        else
            return true;
        
    }

}
