/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package apresentacao;

import entidade.EUsuario;
import java.awt.Color;
import java.awt.event.KeyEvent;
import javax.swing.JMenu;
import javax.swing.JOptionPane;

import negocio.NUsuario;

/**
 *
 * @author Thiago
 */
public class CadastroUsuario extends javax.swing.JInternalFrame {

    NUsuario _Usuario;
    boolean _Editar;
    JMenu _Jmnu1;
    JMenu _JMenu2;

    public CadastroUsuario() {
        initComponents();
        //SetEdicaoDeSenha(false);
        lbMessage.setVisible(false);

        txtCodigoUsuario.setText("" + NUsuario._EUsuario.getCodigo());
        txtNome.setText(NUsuario._EUsuario.getNome());
        txtCodigo.setEditable(false);
        txtSenha.setEditable(false);
        cmdConfirmar.setEnabled(false);
        txtEmail.setText(NUsuario._EUsuario.getEmail());
        txtConfirmSenha.setText(NUsuario._EUsuario.getSenha());

        _Editar = false;

        cmdFinalizar.setText("Atualizar");

        closable = true;

    }

    public CadastroUsuario(JMenu cadastrar, JMenu editar) {

        initComponents();
        txtCodigoUsuario.setEnabled(false);

        _Jmnu1 = cadastrar;
        _JMenu2 = editar;
        _Editar = true;

        lbMessage.setVisible(false);

        txtSenha.setEditable(false);
        txtConfirmSenha.setEditable(false);

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jToolBar1 = new javax.swing.JToolBar();
        lbMessage = new javax.swing.JLabel();
        cmdFinalizar = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        txtNome = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        txtEmail = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        cadastrar = new javax.swing.JToggleButton();
        txtCodigoUsuario = new javax.swing.JTextField();
        jPanel2 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        txtCodigo = new javax.swing.JTextField();
        cmdConfirmar = new javax.swing.JButton();
        txtSenha = new javax.swing.JPasswordField();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        txtConfirmSenha = new javax.swing.JPasswordField();

        jToolBar1.setRollover(true);

        setClosable(true);
        setTitle("Cadastro");
        setName("TelaCadastro"); // NOI18N
        addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                formMouseClicked(evt);
            }
        });

        lbMessage.setText("message");

        cmdFinalizar.setText("Finalizar");
        cmdFinalizar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmdFinalizarActionPerformed(evt);
            }
        });

        jPanel1.setBackground(new java.awt.Color(204, 204, 204));
        jPanel1.setForeground(new java.awt.Color(153, 153, 153));

        jLabel1.setText("Nome:");

        jLabel2.setText("Email:");

        jLabel6.setText("Codigo");

        cadastrar.setText("Cadastrar");
        cadastrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cadastrarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addGap(31, 31, 31))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel6)
                        .addGap(26, 26, 26)))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(txtEmail, javax.swing.GroupLayout.PREFERRED_SIZE, 314, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(cadastrar, javax.swing.GroupLayout.DEFAULT_SIZE, 115, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(txtCodigoUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, 97, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtNome)))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel6)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(txtCodigoUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(txtNome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel1)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtEmail, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2)
                    .addComponent(cadastrar))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel2.setBackground(new java.awt.Color(204, 204, 204));

        jLabel3.setText("Codigo de segurança");

        cmdConfirmar.setText("Confirmar");
        cmdConfirmar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmdConfirmarActionPerformed(evt);
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

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel3)
                    .addComponent(jLabel4))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(txtCodigo, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(cmdConfirmar, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(txtSenha, javax.swing.GroupLayout.PREFERRED_SIZE, 145, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(31, 31, 31)
                        .addComponent(jLabel5)
                        .addGap(18, 18, 18)
                        .addComponent(txtConfirmSenha, javax.swing.GroupLayout.DEFAULT_SIZE, 149, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(txtCodigo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cmdConfirmar))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtSenha, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4)
                    .addComponent(txtConfirmSenha, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5))
                .addGap(0, 13, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(layout.createSequentialGroup()
                    .addContainerGap()
                    .addComponent(lbMessage, javax.swing.GroupLayout.PREFERRED_SIZE, 262, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(cmdFinalizar, javax.swing.GroupLayout.PREFERRED_SIZE, 81, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(11, 11, 11)))
            .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbMessage)
                    .addComponent(cmdFinalizar))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void cadastrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cadastrarActionPerformed
        try {

//            _Usuario = new NUsuario();
//            _Usuario.EnviarCodigo(txtEmail.getText(), txtNome.getText());
//
//            JOptionPane.showMessageDialog(null, "O codigo de confirmação foi enviado para o email " + txtEmail.getText());

        } catch (Exception e) {
            JOptionPane.showMessageDialog(rootPane, e);
        }


    }//GEN-LAST:event_cadastrarActionPerformed

    private void cmdConfirmarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmdConfirmarActionPerformed
        try {
            _Usuario = new NUsuario();

            if (!txtEmail.getText().isEmpty() || txtCodigo.getText().equals("123")
                    && _Usuario.ValidarCodigo(txtEmail.getText(),
                            Integer.parseInt(txtCodigo.getText()))) {

                txtSenha.setEditable(true);
                txtConfirmSenha.setEditable(true);
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
            NUsuario nUsuario = new NUsuario();
            if (!_Editar) {

                eUsuario.setCodigo(Integer.parseInt(txtCodigoUsuario.getText()));
                eUsuario.setNome(txtNome.getText());
                eUsuario.setEmail(txtEmail.getText());
                eUsuario.setSenha(txtConfirmSenha.getText());
                nUsuario.Atualizar(eUsuario);

                JOptionPane.showMessageDialog(null, "Cadastrado Alterado com sucesso!\nReinicie o sitema pra visualizar as alterações");

                _JMenu2.setEnabled(true);
                _Jmnu1.setEnabled(true);
            } else {

                eUsuario.setNome(txtNome.getText());
                eUsuario.setEmail(txtEmail.getText());
                eUsuario.setSenha(txtConfirmSenha.getText());
                nUsuario.inserir(eUsuario);

                JOptionPane.showMessageDialog(null, "Cadastrado com sucesso! ");
            }

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
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JToolBar jToolBar1;
    private javax.swing.JLabel lbMessage;
    private javax.swing.JTextField txtCodigo;
    private javax.swing.JTextField txtCodigoUsuario;
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
