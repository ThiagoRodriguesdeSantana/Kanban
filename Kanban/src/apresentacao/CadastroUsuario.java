/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package apresentacao;

import entidade.EUsuario;
import java.awt.Color;
import java.awt.event.KeyEvent;
import javax.swing.JOptionPane;

import negocio.NUsuario;

/**
 *
 * @author Thiago
 */
public class CadastroUsuario extends javax.swing.JInternalFrame {

    NUsuario _Usuario;

    public CadastroUsuario() {
        initComponents();
        SetEdicaoDeSenha(false);
        lbMessage.setVisible(false);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        txtNome = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        txtEmail = new javax.swing.JTextField();
        cadastrar = new javax.swing.JToggleButton();
        jLabel3 = new javax.swing.JLabel();
        txtCodigo = new javax.swing.JTextField();
        cmdConfirmar = new javax.swing.JButton();
        lbMessage = new javax.swing.JLabel();
        cmdFinalizar = new javax.swing.JButton();
        txtSenha = new javax.swing.JPasswordField();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        txtConfirmSenha = new javax.swing.JPasswordField();

        setTitle("Cadastro");
        setName(""); // NOI18N
        addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                formMouseClicked(evt);
            }
        });

        jLabel1.setText("Nome:");

        jLabel2.setText("Email:");

        cadastrar.setText("Cadastrar");
        cadastrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cadastrarActionPerformed(evt);
            }
        });

        jLabel3.setText("Codigo de segurança");

        cmdConfirmar.setText("Confirmar");
        cmdConfirmar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmdConfirmarActionPerformed(evt);
            }
        });

        lbMessage.setText("message");

        cmdFinalizar.setText("Finalizar");
        cmdFinalizar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmdFinalizarActionPerformed(evt);
            }
        });

        txtSenha.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtSenhaKeyPressed(evt);
            }
        });

        jLabel4.setText("Senha:");

        jLabel5.setText("Confirme ");

        txtConfirmSenha.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtConfirmSenhaKeyPressed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(lbMessage, javax.swing.GroupLayout.PREFERRED_SIZE, 262, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(cmdFinalizar, javax.swing.GroupLayout.PREFERRED_SIZE, 81, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1)
                            .addComponent(jLabel2))
                        .addGap(28, 28, 28)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(txtEmail)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(cadastrar))
                            .addComponent(txtNome, javax.swing.GroupLayout.PREFERRED_SIZE, 350, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtCodigo, javax.swing.GroupLayout.PREFERRED_SIZE, 143, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(cmdConfirmar, javax.swing.GroupLayout.PREFERRED_SIZE, 81, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel4)
                        .addGap(28, 28, 28)
                        .addComponent(txtSenha, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel5)
                        .addGap(14, 14, 14)
                        .addComponent(txtConfirmSenha, javax.swing.GroupLayout.PREFERRED_SIZE, 202, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(txtNome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(txtEmail, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cadastrar))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(txtCodigo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cmdConfirmar))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtSenha, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(txtConfirmSenha, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(30, 30, 30)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbMessage)
                    .addComponent(cmdFinalizar))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void cadastrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cadastrarActionPerformed
        try {

            _Usuario = new NUsuario();
            _Usuario.EnviarCodigo(txtEmail.getText(), txtNome.getText());

            JOptionPane.showMessageDialog(null, "O codigo de confirmação foi enviado para o email " + txtEmail.getText());

        } catch (Exception e) {
            JOptionPane.showMessageDialog(rootPane, e);
        }


    }//GEN-LAST:event_cadastrarActionPerformed

    private void cmdConfirmarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmdConfirmarActionPerformed
        try {
            _Usuario = new NUsuario();

            if (!txtEmail.getText().isEmpty()
                    && _Usuario.ValidarCodigo(txtEmail.getText(), Integer.parseInt(txtCodigo.getText()))) {

                SetEdicaoDeSenha(true);
                lbMessage.setVisible(true);
                lbMessage.setText("Codigo confirmado");

            }

        } catch (Exception e) {

            lbMessage.setVisible(true);
            lbMessage.setText(e.getMessage());
        }

    }//GEN-LAST:event_cmdConfirmarActionPerformed

    private void txtSenhaKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtSenhaKeyPressed

        if (evt.getKeyCode() == KeyEvent.VK_ENTER || evt.getKeyCode() == KeyEvent.VK_TAB) {

            txtConfirmSenha.requestFocus();

        }


    }//GEN-LAST:event_txtSenhaKeyPressed

    private void formMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_formMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_formMouseClicked

    private void txtConfirmSenhaKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtConfirmSenhaKeyPressed

        if (evt.getKeyCode() == KeyEvent.VK_ENTER || evt.getKeyCode() == KeyEvent.VK_TAB) {

            try {

                if (_Usuario.ValidarSenha(txtSenha.getText(), txtConfirmSenha.getText())) {
                    lbMessage.setVisible(true);
                    lbMessage.setForeground(Color.green);
                    lbMessage.setText("OK");
                }

            } catch (Exception e) {
                lbMessage.setVisible(true);
                lbMessage.setForeground(Color.red);
                lbMessage.setText(e.getMessage());
            }

        }

    }//GEN-LAST:event_txtConfirmSenhaKeyPressed

    private void cmdFinalizarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmdFinalizarActionPerformed

        try {
            EUsuario eUsuario = new EUsuario();
            eUsuario.setNome(txtNome.getText());
            eUsuario.setEmail(txtEmail.getText());
            eUsuario.setSenha(txtConfirmSenha.getText());
            _Usuario.inserir(eUsuario);

            JOptionPane.showMessageDialog(null, "Cadastrado com sucesso!");
            this.dispose();

        } catch (Exception e) {
            
            lbMessage.setVisible(true);
            lbMessage.setForeground(Color.red);
            lbMessage.setText(e.getMessage());
        }
    }//GEN-LAST:event_cmdFinalizarActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JToggleButton cadastrar;
    private javax.swing.JButton cmdConfirmar;
    private javax.swing.JButton cmdFinalizar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel lbMessage;
    private javax.swing.JTextField txtCodigo;
    private javax.swing.JPasswordField txtConfirmSenha;
    private javax.swing.JTextField txtEmail;
    private javax.swing.JTextField txtNome;
    private javax.swing.JPasswordField txtSenha;
    // End of variables declaration//GEN-END:variables

    private void SetEdicaoDeSenha(boolean b) {

        txtSenha.setEditable(b);
        txtConfirmSenha.setEditable(b);
    }

}
