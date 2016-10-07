/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package apresentacao;

import javax.swing.JOptionPane;
import negocio.NUsuario;

/**
 *
 * @author Thiago
 */
public class Login extends javax.swing.JFrame {

    
    public Login() {
        initComponents();
        cmdEntrar.setText("Cadastrar");
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        cmdEntrar = new javax.swing.JButton();
        cmdCadastrar = new javax.swing.JToggleButton();
        txtSenha = new javax.swing.JPasswordField();
        txtMail = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(51, 51, 255));
        jLabel1.setText("Senha");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 130, 70, 20));

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(51, 51, 255));
        jLabel5.setText("Email");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 100, 50, 20));

        cmdEntrar.setText("Entrar");
        cmdEntrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmdEntrarActionPerformed(evt);
            }
        });
        getContentPane().add(cmdEntrar, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 160, 90, -1));

        cmdCadastrar.setText("Cadastrar");
        cmdCadastrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmdCadastrarActionPerformed(evt);
            }
        });
        getContentPane().add(cmdCadastrar, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 240, 105, -1));

        txtSenha.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtSenhaKeyPressed(evt);
            }
        });
        getContentPane().add(txtSenha, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 130, 280, -1));

        txtMail.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtMailKeyPressed(evt);
            }
        });
        getContentPane().add(txtMail, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 100, 280, -1));

        jLabel6.setIcon(new javax.swing.ImageIcon("C:\\Users\\Thiago\\Desktop\\KanBanMenor.png")); // NOI18N
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 610, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void cmdEntrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmdEntrarActionPerformed
        try {
            NUsuario nUsuario = new NUsuario();

            if (nUsuario.ValidarLogin(txtMail.getText(), txtSenha.getText())) {
               // Principal1 principal1 = new Principal1(txtMail.getText());
                //principal1.setVisible(true);
                this.dispose();

            }

        } catch (Exception e) {
            JOptionPane.showMessageDialog(rootPane, e.getMessage());
        }
    }//GEN-LAST:event_cmdEntrarActionPerformed

    private void txtSenhaKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtSenhaKeyPressed
        if (!txtSenha.getText().isEmpty()) {
            cmdEntrar.setText("Entrar");
        }
    }//GEN-LAST:event_txtSenhaKeyPressed

    private void txtMailKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtMailKeyPressed
        if (!txtMail.getText().isEmpty()) {
            cmdEntrar.setText("Entrar");
        }
    }//GEN-LAST:event_txtMailKeyPressed

    private void cmdCadastrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmdCadastrarActionPerformed
        
        CadastroUsuario cadastroUsuario = new CadastroUsuario();
        cadastroUsuario.setVisible(true);
        
    }//GEN-LAST:event_cmdCadastrarActionPerformed

    /**
     * @param args the command line arguments
     */
//    public static void main(String args[]) {
//        /* Set the Nimbus look and feel */
//        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
//        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
//         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
//         */
//        try {
//            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
//                if ("Nimbus".equals(info.getName())) {
//                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
//                    break;
//                }
//            }
//        } catch (ClassNotFoundException ex) {
//            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (InstantiationException ex) {
//            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (IllegalAccessException ex) {
//            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
//            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        }
//        //</editor-fold>
//
//        /* Create and display the form */
//        java.awt.EventQueue.invokeLater(new Runnable() {
//            public void run() {
//                new Login().setVisible(true);
//            }
//        });
//    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JToggleButton cmdCadastrar;
    private javax.swing.JButton cmdEntrar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JTextField txtMail;
    private javax.swing.JPasswordField txtSenha;
    // End of variables declaration//GEN-END:variables
}
