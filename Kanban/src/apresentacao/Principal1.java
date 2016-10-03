/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package apresentacao;

import entidade.EUsuario;
import javax.swing.JOptionPane;
import negocio.NUsuario;

/**
 *
 * @author Thiago
 */
public class Principal1 extends javax.swing.JFrame {

    public static EUsuario Usuario;

    public Principal1() {
        initComponents();
        this.setExtendedState(this.MAXIMIZED_BOTH); 
//        this.setUndecorated(true);
//        this.setVisible(true);
    }
    
    

    public Principal1(String email) throws Exception {
        this();
        Usuario = PegarUsuario(email);

    }

    public Principal1(CadastroUsuario tela) {
        
        this();

        this.pnlPrincipal.add(tela);
        tela.setVisible(true);

    }
    
    private EUsuario PegarUsuario(String email) throws Exception {
        NUsuario nUsuario = new NUsuario();
        return nUsuario.BuscarPorEmail(email);

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
        formCadastro = new javax.swing.JMenu();
        tarefa = new javax.swing.JMenuItem();
        jMenuItem1 = new javax.swing.JMenuItem();
        jMenu2 = new javax.swing.JMenu();
        jMenuItem2 = new javax.swing.JMenuItem();

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

        formCadastro.setText("Novo");

        tarefa.setText("Tarefa");
        tarefa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tarefaActionPerformed(evt);
            }
        });
        formCadastro.add(tarefa);

        jMenuItem1.setText("Lista de tafefas");
        jMenuItem1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem1ActionPerformed(evt);
            }
        });
        formCadastro.add(jMenuItem1);

        jMenuBar1.add(formCadastro);

        jMenu2.setText("Editar");

        jMenuItem2.setText("Usuário");
        jMenuItem2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem2ActionPerformed(evt);
            }
        });
        jMenu2.add(jMenuItem2);

        jMenuBar1.add(jMenu2);

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
            JOptionPane.showMessageDialog(null,e.getMessage());
        }

    }//GEN-LAST:event_jMenuItem1ActionPerformed

    private void jMenuItem2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem2ActionPerformed
        
        try {
          
            //int codigo,String nome, String email, String senha
            CadastroUsuario cadastroUsuario = new CadastroUsuario(Usuario.getCodigo(),
                    Usuario.getNome(), Usuario.getEmail(), Usuario.getSenha());
            this.pnlPrincipal.add(cadastroUsuario);
            cadastroUsuario.setVisible(true);
            
            
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null,e.getMessage());
        }
        
    }//GEN-LAST:event_jMenuItem2ActionPerformed

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
    private javax.swing.JMenu formCadastro;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JMenuItem jMenuItem2;
    private javax.swing.JDesktopPane pnlPrincipal;
    private javax.swing.JMenuItem tarefa;
    // End of variables declaration//GEN-END:variables
}
