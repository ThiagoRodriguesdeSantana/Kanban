/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package negocio;

import java.sql.SQLException;
import java.util.Random;
import org.apache.commons.mail.EmailException;
import org.apache.commons.mail.SimpleEmail;
import persistencia.PUsuario;

public class Servicos {

    private static String _EmailDestino;

    public static void EnviarEmailDeConfirmacao(String emailDestino) throws EmailException, SQLException {

        _EmailDestino = emailDestino;

        SimpleEmail email = new SimpleEmail();

        email.setHostName("smtp.gmail.com");
        email.setSmtpPort(465);
        email.setFrom("thiagorodriguescamara@gmail.com");
        email.addTo(emailDestino);
        email.setSubject("Equipe KanBan");
        email.setMsg(PegarMensagem());
        email.setSSL(true);
        email.setAuthentication("Thiagorodriguescamara@gmail.com", "aminorejgafay261188");
        email.send();

    }

    private static String PegarMensagem() throws SQLException {

        String mensagem = "<!DOCTYPE html>\n"
                + "<html lang = \"pt-br\">\n"
                + "\n"
                + "		<head>\n"
                + "\n"
                + "			<meta charset = \"UTF-8/\">\n"
                + "			<tite>\n"
                + "\n"
                + "\n"
                + "			</title>\n"
                + "		</head>\n"
                + "\n"
                + "		<body>\n"
                + "                       <h1>Mensagem de Confirmacao<h1>\n"
                + "			<p>Seu código de confirmação é <strong>" + GeradorDeCodigo() + "</strong><p>\n"
                + "		</body>\n"
                + "\n"
                + "</html>";
        return mensagem;
    }

    private static int GeradorDeCodigo() throws SQLException {

        Random num = new Random();
        int numero = num.nextInt(10000);
        
        while(numero<1000){
            
        }
        if(numero >= 1000){
             
            PUsuario pUsuario = new PUsuario();
            pUsuario.InserirCodigo(numero, _EmailDestino);

        }
        return numero;

    }

}
