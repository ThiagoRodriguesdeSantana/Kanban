/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package util;

import java.sql.SQLException;
import java.util.Random;
import javax.swing.JOptionPane;
import org.apache.commons.mail.EmailException;
import org.apache.commons.mail.SimpleEmail;
import persistencia.PUsuario;

public class Servicos {

    private static String _EmailDestino;

    public static void EnviarEmailDeConfirmacao(String emailDestino) throws EmailException, SQLException {

        try {
            _EmailDestino = emailDestino;

            SimpleEmail email = new SimpleEmail();

            email.setHostName("smtp.gmail.com");
            email.setSmtpPort(587);
            email.setFrom("thiagorodriguescamara@gmail.com");
            email.addTo(emailDestino);
            email.setSubject("Equipe KanBan");
            email.setMsg(PegarMensagem());
            email.setSSL(true);
            email.setAuthentication("kanbanworktime@gmail.com", "kanban@123");
            email.send();

        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
        }

    }

    private static String PegarMensagem() throws SQLException {

        String mensagem = "Seu Codigo de confirmação é:" + GeradorDeCodigo() + "\nEste é um email automático por favor não respoda";
        return mensagem;
    }

    private static int GeradorDeCodigo() throws SQLException {

        Random num = new Random();
        int numero = num.nextInt(10000);

        while (numero < 1000) {

        }
        if (numero >= 1000) {

            PUsuario pUsuario = new PUsuario();
            pUsuario.InserirCodigo(numero, _EmailDestino);

        }
        return numero;

    }

}
