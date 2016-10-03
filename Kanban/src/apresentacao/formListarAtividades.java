/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package apresentacao;

import entidade.EAtividade;
import entidade.StatusEnum;
import java.sql.SQLException;
import java.util.List;
import java.util.Vector;
import javax.swing.JOptionPane;
import apresentacao.*;
import javax.swing.JDesktopPane;
import javax.swing.table.DefaultTableModel;
import negocio.NAtividade;

/**
 *
 * @author Thiago
 */
public class formListarAtividades extends javax.swing.JInternalFrame {

    JDesktopPane pnlPrincipal;

    public formListarAtividades() throws SQLException {
        initComponents();
        PreencheGrid();
    }

    public formListarAtividades(JDesktopPane desktopPane) throws SQLException {
        this();
        try {

            this.pnlPrincipal = desktopPane;
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e.getMessage());
        }
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel5 = new javax.swing.JLabel();
        jPopupMenu1 = new javax.swing.JPopupMenu();
        mnuDeletar = new javax.swing.JMenuItem();
        mnuEditar = new javax.swing.JMenuItem();
        jScrollPane1 = new javax.swing.JScrollPane();
        grdAtividade = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        txtDescricao = new javax.swing.JTextField();
        txtListar = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        jInternalFrame1 = new javax.swing.JInternalFrame();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTable2 = new javax.swing.JTable();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        chkConcluido1 = new javax.swing.JCheckBox();
        txtData1 = new javax.swing.JTextField();
        txtCodigo1 = new javax.swing.JTextField();
        txtDescricao1 = new javax.swing.JTextField();
        txtListar1 = new javax.swing.JButton();
        jLabel9 = new javax.swing.JLabel();
        cmdLimpar1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        lbMensagem = new javax.swing.JLabel();

        jLabel5.setText("jLabel5");

        mnuDeletar.setText("Excluir");
        mnuDeletar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnuDeletarActionPerformed(evt);
            }
        });
        jPopupMenu1.add(mnuDeletar);

        mnuEditar.setText("Editar");
        mnuEditar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnuEditarActionPerformed(evt);
            }
        });
        jPopupMenu1.add(mnuEditar);

        setClosable(true);

        grdAtividade.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {}
            },
            new String [] {

            }
        ));
        grdAtividade.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                grdAtividadeMouseReleased(evt);
            }
        });
        jScrollPane1.setViewportView(grdAtividade);

        jLabel1.setText("Descrição");

        txtListar.setText("Listar");
        txtListar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtListarActionPerformed(evt);
            }
        });

        jButton1.setText("Limpar Lista");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jTable2.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {}
            },
            new String [] {

            }
        ));
        jScrollPane2.setViewportView(jTable2);

        jLabel6.setText("Descrição");

        jLabel7.setText("Codigo");

        jLabel8.setText("Data");

        chkConcluido1.setText("Concluido");

        txtListar1.setText("Listar");

        jLabel9.setText("Status");

        cmdLimpar1.setText("Limpar Campos");

        jButton2.setText("Limpar Lista");

        javax.swing.GroupLayout jInternalFrame1Layout = new javax.swing.GroupLayout(jInternalFrame1.getContentPane());
        jInternalFrame1.getContentPane().setLayout(jInternalFrame1Layout);
        jInternalFrame1Layout.setHorizontalGroup(
            jInternalFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jInternalFrame1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jInternalFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane2)
                    .addGroup(jInternalFrame1Layout.createSequentialGroup()
                        .addGroup(jInternalFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jInternalFrame1Layout.createSequentialGroup()
                                .addGroup(jInternalFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel6)
                                    .addComponent(jLabel7))
                                .addGap(18, 18, 18)
                                .addGroup(jInternalFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txtCodigo1, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtData1, javax.swing.GroupLayout.PREFERRED_SIZE, 132, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtDescricao1, javax.swing.GroupLayout.PREFERRED_SIZE, 286, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(jInternalFrame1Layout.createSequentialGroup()
                                .addGroup(jInternalFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jInternalFrame1Layout.createSequentialGroup()
                                        .addGap(8, 8, 8)
                                        .addComponent(jLabel9))
                                    .addComponent(jLabel8))
                                .addGap(25, 25, 25)
                                .addComponent(chkConcluido1)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(jInternalFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(txtListar1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(cmdLimpar1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jButton2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                .addContainerGap())
        );
        jInternalFrame1Layout.setVerticalGroup(
            jInternalFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jInternalFrame1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jInternalFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(txtCodigo1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtListar1))
                .addGap(6, 6, 6)
                .addGroup(jInternalFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jInternalFrame1Layout.createSequentialGroup()
                        .addGroup(jInternalFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel6)
                            .addComponent(txtDescricao1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(2, 2, 2)
                        .addGroup(jInternalFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel8)
                            .addComponent(txtData1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(7, 7, 7)
                        .addGroup(jInternalFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(chkConcluido1)
                            .addComponent(jLabel9)))
                    .addGroup(jInternalFrame1Layout.createSequentialGroup()
                        .addComponent(cmdLimpar1)
                        .addGap(5, 5, 5)
                        .addComponent(jButton2)))
                .addGap(16, 16, 16)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 244, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 716, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(9, 9, 9)
                        .addComponent(jLabel1)
                        .addGap(18, 18, 18)
                        .addComponent(txtDescricao, javax.swing.GroupLayout.PREFERRED_SIZE, 302, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(txtListar, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(lbMensagem, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(0, 368, Short.MAX_VALUE)
                    .addComponent(jInternalFrame1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 368, Short.MAX_VALUE)))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtListar)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel1)
                        .addComponent(txtDescricao, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButton1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 303, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lbMensagem)
                .addContainerGap(25, Short.MAX_VALUE))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(0, 201, Short.MAX_VALUE)
                    .addComponent(jInternalFrame1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 202, Short.MAX_VALUE)))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void mnuDeletarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnuDeletarActionPerformed

        try {
            int linha = grdAtividade.getSelectedRow();

            String usuario = (String) grdAtividade.getValueAt(linha, 4);

            int codigo = Integer.parseInt((String) grdAtividade.getValueAt(linha, 0));

            NAtividade atividade = new NAtividade();

            int resp = JOptionPane.showConfirmDialog(null, "Você realmente deseja excluir esta linha?",
                    "SysClub", JOptionPane.WARNING_MESSAGE, JOptionPane.YES_NO_OPTION);

            if (atividade.ChecarUsuario(usuario, linha) && resp == JOptionPane.YES_OPTION) {

                atividade.excluir(codigo);
                JOptionPane.showMessageDialog(null, "Linha excluida com sucesso!");
                PreencheGrid();
            }
        } catch (Exception e) {
            lbMensagem.setText(e.getMessage());
        }
    }//GEN-LAST:event_mnuDeletarActionPerformed

    private void mnuEditarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnuEditarActionPerformed
        try {
            int linha = grdAtividade.getSelectedRow();

            String usuario = (String) grdAtividade.getValueAt(linha, 4);

            int codigo = Integer.parseInt((String) grdAtividade.getValueAt(linha, 0));

            NAtividade atividade = new NAtividade();

            if (atividade.ChecarUsuario(usuario, linha)) {

                formAtividade fAtividade = new formAtividade(codigo);
                
                this.pnlPrincipal.add(fAtividade);
                fAtividade.setVisible(true);

            }

        } catch (Exception e) {
            
            lbMensagem.setText(e.getMessage());
            
        }


    }//GEN-LAST:event_mnuEditarActionPerformed

    private void grdAtividadeMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_grdAtividadeMouseReleased
        int index = grdAtividade.getSelectedRow();
        if (evt.isPopupTrigger()) {

            jPopupMenu1.show(evt.getComponent(), evt.getX(), index);
        }
    }//GEN-LAST:event_grdAtividadeMouseReleased

    private void txtListarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtListarActionPerformed
        try {
            PreencheGrid();

        } catch (Exception e) {
            lbMensagem.setText(e.getMessage());
        }
    }//GEN-LAST:event_txtListarActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed

        try {
            LimparLista();

        } catch (Exception e) {
            lbMensagem.setText(e.getMessage());
        }
    }//GEN-LAST:event_jButton1ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JCheckBox chkConcluido1;
    private javax.swing.JButton cmdLimpar1;
    private javax.swing.JTable grdAtividade;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JInternalFrame jInternalFrame1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPopupMenu jPopupMenu1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable jTable2;
    private javax.swing.JLabel lbMensagem;
    private javax.swing.JMenuItem mnuDeletar;
    private javax.swing.JMenuItem mnuEditar;
    private javax.swing.JTextField txtCodigo1;
    private javax.swing.JTextField txtData1;
    private javax.swing.JTextField txtDescricao;
    private javax.swing.JTextField txtDescricao1;
    private javax.swing.JButton txtListar;
    private javax.swing.JButton txtListar1;
    // End of variables declaration//GEN-END:variables

    private void PreencheGrid() throws SQLException {

        Vector<String> cabecalho = new Vector<>();

        cabecalho.add("Código");
        cabecalho.add("Descrição");
        cabecalho.add("Concluida");
        cabecalho.add("Observação");
        cabecalho.add("Usuario");
        cabecalho.add("Data de Entrga");

        Vector detalhe = new Vector();

        NAtividade atividade = new NAtividade();

        List<EAtividade> list = atividade.Listar(txtDescricao.getText());

        for (EAtividade item : list) {

            Vector<String> linha = new Vector<>();
            linha.add(item.getCodigo() + "");
            linha.add(item.getDescricao());
            if (item.isConcluida()) {
                linha.add("" + StatusEnum.Concluido);
            } else {
                linha.add("" + StatusEnum.Novo);
            }
            linha.add(item.getRelatoFinal());
            linha.add(Principal1.Usuario.getNome());
            linha.add(item.getDataDeEntrega());

            detalhe.add(linha);

        }
        grdAtividade.setModel(new DefaultTableModel(detalhe, cabecalho));
    }

    public void LimparLista() {

        DefaultTableModel model = new DefaultTableModel();
        model = (DefaultTableModel) grdAtividade.getModel();

        while (model.getRowCount() > 0) {
            model.removeRow(0);
        }

    }

}
