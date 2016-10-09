/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package apresentacao;

import entidade.EUsuario;
import java.awt.Dimension;
import javax.swing.JInternalFrame;
import javax.swing.JOptionPane;

/**
 *
 * @author Thiago
 */
public class Principal1 extends javax.swing.JFrame {

    public static EUsuario Usuario;

    public Principal1() {
        initComponents();
        this.setExtendedState(this.MAXIMIZED_BOTH);

        LoginUsuario loginUsuario = new LoginUsuario(jmnuCadastro, jmnuEditar, pnlPrincipal);
        this.pnlPrincipal.add(loginUsuario);
        centralizarLogin(loginUsuario);
        loginUsuario.setVisible(true);
        jmnuCadastro.setEnabled(false);
        jmnuEditar.setEnabled(false);

    }

    public void Cadastrar(String eamil) {
        CadastroUsuario cadastroUsuario = new CadastroUsuario();
        this.pnlPrincipal.add(cadastroUsuario);
        cadastroUsuario.setVisible(true);
    }

    private void loginUsuario() {
        LoginUsuario loginUsuario = new LoginUsuario();
        this.pnlPrincipal.add(loginUsuario);
        loginUsuario.setVisible(true);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        pnlPrincipal = new javax.swing.JDesktopPane();
        jMenuBar1 = new javax.swing.JMenuBar();
        jmnuCadastro = new javax.swing.JMenu();
        tarefa = new javax.swing.JMenuItem();
        jMenuItem1 = new javax.swing.JMenuItem();
        jmnuEditar = new javax.swing.JMenu();
        jMenuItem2 = new javax.swing.JMenuItem();
        jMenu1 = new javax.swing.JMenu();
        jMenuItem3 = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowClosing(java.awt.event.WindowEvent evt) {
                formWindowClosing(evt);
            }
        });

        pnlPrincipal.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

        javax.swing.GroupLayout pnlPrincipalLayout = new javax.swing.GroupLayout(pnlPrincipal);
        pnlPrincipal.setLayout(pnlPrincipalLayout);
        pnlPrincipalLayout.setHorizontalGroup(
            pnlPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 981, Short.MAX_VALUE)
        );
        pnlPrincipalLayout.setVerticalGroup(
            pnlPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 452, Short.MAX_VALUE)
        );

        jmnuCadastro.setText("Novo");

        tarefa.setText("Tarefa");
        tarefa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tarefaActionPerformed(evt);
            }
        });
        jmnuCadastro.add(tarefa);

        jMenuItem1.setText("Lista de Tarefas");
        jMenuItem1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem1ActionPerformed(evt);
            }
        });
        jmnuCadastro.add(jMenuItem1);

        jMenuBar1.add(jmnuCadastro);

        jmnuEditar.setText("Editar");

        jMenuItem2.setText("Usuário");
        jMenuItem2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem2ActionPerformed(evt);
            }
        });
        jmnuEditar.add(jMenuItem2);

        jMenuBar1.add(jmnuEditar);

        jMenu1.setText("Sair");

        jMenuItem3.setText("Sair");
        jMenuItem3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem3ActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItem3);

        jMenuBar1.add(jMenu1);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(pnlPrincipal)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(pnlPrincipal, javax.swing.GroupLayout.Alignment.TRAILING)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void tarefaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tarefaActionPerformed

        formAtividade atividade = new formAtividade();
        this.pnlPrincipal.add(atividade);
        atividade.setVisible(true);
    }//GEN-LAST:event_tarefaActionPerformed

    private void jMenuItem1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem1ActionPerformed
        try {

            formListarAtividades atividades = new formListarAtividades(this.pnlPrincipal);
            this.pnlPrincipal.add(atividades);
            atividades.setVisible(true);

        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e.getMessage());
        }

    }//GEN-LAST:event_jMenuItem1ActionPerformed

    private void jMenuItem2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem2ActionPerformed

        try {

            CadastroUsuario cadastroUsuario = new CadastroUsuario();
            this.pnlPrincipal.add(cadastroUsuario);
            cadastroUsuario.setVisible(true);

        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e.getMessage());
        }

    }//GEN-LAST:event_jMenuItem2ActionPerformed

    private void jMenuItem3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem3ActionPerformed
        Sair();
    }//GEN-LAST:event_jMenuItem3ActionPerformed

    private void formWindowClosing(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowClosing
        Sair();
    }//GEN-LAST:event_formWindowClosing

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
//            java.util.logging.Logger.getLogger(Principal1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (InstantiationException ex) {
//            java.util.logging.Logger.getLogger(Principal1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (IllegalAccessException ex) {
//            java.util.logging.Logger.getLogger(Principal1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
//            java.util.logging.Logger.getLogger(Principal1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        }
//        //</editor-fold>
//
//        /* Create and display the form */
//        java.awt.EventQueue.invokeLater(new Runnable() {
//            public void run() {
//                new Principal1().setVisible(true);
//            }
//        });
//    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JMenuItem jMenuItem2;
    private javax.swing.JMenuItem jMenuItem3;
    private javax.swing.JMenu jmnuCadastro;
    private javax.swing.JMenu jmnuEditar;
    private javax.swing.JDesktopPane pnlPrincipal;
    private javax.swing.JMenuItem tarefa;
    // End of variables declaration//GEN-END:variables

    private void Sair() {

        int resp = JOptionPane.showConfirmDialog(null, "Deseja Sair Do Systema", "KanBan", JOptionPane.WARNING_MESSAGE, JOptionPane.YES_NO_OPTION);
        if (resp == JOptionPane.YES_OPTION) {
            System.exit(0);
        }

    }

    private void centralizarLogin(JInternalFrame login) {
        Dimension panel = this.getSize();
        Dimension internal = login.getSize();
        login.setLocation((panel.width)/2,(panel.height)/2);
    }
}
