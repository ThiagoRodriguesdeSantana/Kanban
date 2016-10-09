/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package apresentacao;

import entidade.EAtividade;
import java.awt.Color;
import javax.swing.JOptionPane;
import negocio.NAtividade;
import negocio.NUsuario;

public class formAtividade extends javax.swing.JInternalFrame {

    NAtividade _Atividade = new NAtividade();
    private boolean _Editar;

    public formAtividade() {
        initComponents();
        txtCodigo.setEditable(false);
        SetCampos(true);

    }

    public formAtividade(int codigo) throws Exception {

        NAtividade atividade = new NAtividade();
        EAtividade eAtividade = atividade.consultar(codigo);

        initComponents();
     
        PreecheCampos(eAtividade,true);
        SetCampos(true);
       

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel5 = new javax.swing.JLabel();
        jFormattedTextField1 = new javax.swing.JFormattedTextField();
        jLabel1 = new javax.swing.JLabel();
        txtCodigo = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        txtDescricao = new javax.swing.JTextField();
        chknova = new javax.swing.JCheckBox();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        chkAnalise = new javax.swing.JCheckBox();
        chkDesenvolvimento = new javax.swing.JCheckBox();
        chkConcluida = new javax.swing.JCheckBox();
        cmdConsultar = new javax.swing.JButton();
        cmdSalvar = new javax.swing.JButton();
        cmdCancelar = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        txtObservacoes = new javax.swing.JTextPane();
        jLabel6 = new javax.swing.JLabel();
        cmdNovo = new javax.swing.JButton();
        txtData = new javax.swing.JFormattedTextField();
        cmdBuscar = new javax.swing.JButton();
        lbMessage = new javax.swing.JLabel();

        jLabel5.setText("jLabel5");

        jFormattedTextField1.setText("jFormattedTextField1");

        setClosable(true);
        setTitle("Atividade");

        jLabel1.setText("Codigo");

        txtCodigo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtCodigoActionPerformed(evt);
            }
        });
        txtCodigo.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtCodigoKeyPressed(evt);
            }
        });

        jLabel2.setText("Descricao");

        chknova.setText("Nova");
        chknova.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                chknovaActionPerformed(evt);
            }
        });

        jLabel3.setText("Status");

        jLabel4.setText("Data de Entrga");

        chkAnalise.setText("Em Analise");
        chkAnalise.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                chkAnaliseActionPerformed(evt);
            }
        });

        chkDesenvolvimento.setText("Em Desenvolvimento");
        chkDesenvolvimento.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                chkDesenvolvimentoActionPerformed(evt);
            }
        });

        chkConcluida.setText("Concluída");
        chkConcluida.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                chkConcluidaActionPerformed(evt);
            }
        });

        cmdConsultar.setText("Buscar");
        cmdConsultar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmdConsultarActionPerformed(evt);
            }
        });

        cmdSalvar.setText("Salvar");
        cmdSalvar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmdSalvarActionPerformed(evt);
            }
        });

        cmdCancelar.setText("Cancelar");
        cmdCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmdCancelarActionPerformed(evt);
            }
        });

        jScrollPane1.setViewportView(txtObservacoes);

        jLabel6.setText("Observações");

        cmdNovo.setText("Nova");
        cmdNovo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmdNovoActionPerformed(evt);
            }
        });

        try {
            txtData.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("##/##/####")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }

        cmdBuscar.setText("Buscar");
        cmdBuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmdBuscarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane1)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(cmdCancelar)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(cmdConsultar, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(cmdNovo, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(cmdSalvar, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel6)
                                .addGap(0, 0, Short.MAX_VALUE)))
                        .addContainerGap())
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel2)
                                    .addComponent(jLabel3)
                                    .addComponent(jLabel1))
                                .addGap(45, 45, 45)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                        .addComponent(chknova)
                                        .addGap(18, 18, 18)
                                        .addComponent(chkAnalise)
                                        .addGap(18, 18, 18)
                                        .addComponent(chkDesenvolvimento)
                                        .addGap(18, 18, 18)
                                        .addComponent(chkConcluida)
                                        .addGap(194, 194, 194))
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addGroup(layout.createSequentialGroup()
                                            .addComponent(txtCodigo, javax.swing.GroupLayout.PREFERRED_SIZE, 132, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                            .addComponent(cmdBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                            .addComponent(jLabel4)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                            .addComponent(txtData, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addGap(51, 51, 51))
                                        .addGroup(layout.createSequentialGroup()
                                            .addComponent(txtDescricao, javax.swing.GroupLayout.PREFERRED_SIZE, 338, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addGap(234, 234, 234)))))
                            .addComponent(lbMessage, javax.swing.GroupLayout.PREFERRED_SIZE, 365, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 0, Short.MAX_VALUE))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(txtCodigo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4)
                    .addComponent(txtData, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cmdBuscar))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(txtDescricao, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(chknova)
                    .addComponent(jLabel3)
                    .addComponent(chkAnalise)
                    .addComponent(chkDesenvolvimento)
                    .addComponent(chkConcluida))
                .addGap(27, 27, 27)
                .addComponent(jLabel6)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 133, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cmdSalvar)
                    .addComponent(cmdCancelar)
                    .addComponent(cmdNovo)
                    .addComponent(cmdConsultar))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lbMessage, javax.swing.GroupLayout.DEFAULT_SIZE, 18, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void chknovaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_chknovaActionPerformed

        chkAnalise.setSelected(false);
        chkDesenvolvimento.setSelected(false);
        chkConcluida.setSelected(false);

    }//GEN-LAST:event_chknovaActionPerformed

    private void chkAnaliseActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_chkAnaliseActionPerformed

        chknova.setSelected(false);
        chkDesenvolvimento.setSelected(false);
        chkConcluida.setSelected(false);
    }//GEN-LAST:event_chkAnaliseActionPerformed

    private void chkDesenvolvimentoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_chkDesenvolvimentoActionPerformed
        chkConcluida.setSelected(false);
        chknova.setSelected(false);
        chkAnalise.setSelected(false);
    }//GEN-LAST:event_chkDesenvolvimentoActionPerformed

    private void chkConcluidaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_chkConcluidaActionPerformed
        chknova.setSelected(false);
        chkAnalise.setSelected(false);
        chkDesenvolvimento.setSelected(false);
    }//GEN-LAST:event_chkConcluidaActionPerformed

    private void cmdConsultarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmdConsultarActionPerformed

        try {
            
            LimparCampos();

            SetCampos(false);
            txtCodigo.setEditable(true);
            txtCodigo.requestFocus();

        } catch (Exception e) {

            JOptionPane.showMessageDialog(null, e.getMessage());
        }
    }//GEN-LAST:event_cmdConsultarActionPerformed

    private void cmdSalvarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmdSalvarActionPerformed
        try {
            EAtividade atividade = new EAtividade();
            NUsuario nUsuario = new NUsuario();

            atividade.setDescricao(txtDescricao.getText());
            atividade.setDataDeEntrega(txtData.getText());
            atividade.setConcluida(chkConcluida.isSelected());
            atividade.setRelatoFinal(txtObservacoes.getText());
            atividade.setUsuario(nUsuario.Buscar(LoginUsuario._EUsuario.getCodigo()));

            if (!_Editar) {

                _Atividade.salvar(atividade);

                JOptionPane.showMessageDialog(null, "Atividade Salva com sucesso!");

                LimparCampos();

            } else {

                atividade.setCodigo(Integer.parseInt(txtCodigo.getText()));

                _Atividade.Alterar(atividade);

                JOptionPane.showMessageDialog(null, "Atividade Alterada com sucesso!");
                

            }
            LimparCampos();

        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e.getMessage());
        }
    }//GEN-LAST:event_cmdSalvarActionPerformed

    private void cmdCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmdCancelarActionPerformed

        this.dispose();
    }//GEN-LAST:event_cmdCancelarActionPerformed

    private void txtCodigoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtCodigoActionPerformed

        SetCampos(false);

    }//GEN-LAST:event_txtCodigoActionPerformed

    private void cmdNovoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmdNovoActionPerformed
        LimparCampos();
        SetCampos(true);
        txtCodigo.setEditable(false);
    }//GEN-LAST:event_cmdNovoActionPerformed

    private void txtCodigoKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtCodigoKeyPressed
        SetCampos(false);
    }//GEN-LAST:event_txtCodigoKeyPressed

    private void cmdBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmdBuscarActionPerformed
        try {
            NAtividade atividade = new NAtividade();
            EAtividade eEtividade = atividade.consultar(Integer.parseInt(txtCodigo.getText()));
            PreecheCampos(eEtividade, true);
            SetCampos(true);
            lbMessage.setVisible(false);
        } catch (Exception e) {
            lbMessage.setForeground(Color.red);
            lbMessage.setVisible(true);
            lbMessage.setText(e.getMessage());

        }
    }//GEN-LAST:event_cmdBuscarActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JCheckBox chkAnalise;
    private javax.swing.JCheckBox chkConcluida;
    private javax.swing.JCheckBox chkDesenvolvimento;
    private javax.swing.JCheckBox chknova;
    private javax.swing.JButton cmdBuscar;
    private javax.swing.JButton cmdCancelar;
    private javax.swing.JButton cmdConsultar;
    private javax.swing.JButton cmdNovo;
    private javax.swing.JButton cmdSalvar;
    private javax.swing.JFormattedTextField jFormattedTextField1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lbMessage;
    private javax.swing.JTextField txtCodigo;
    private javax.swing.JFormattedTextField txtData;
    private javax.swing.JTextField txtDescricao;
    private javax.swing.JTextPane txtObservacoes;
    // End of variables declaration//GEN-END:variables

    private void PreecheCampos(EAtividade atividade, boolean editar) {

        txtCodigo.setText("" + atividade.getCodigo());
        txtData.setText("" + atividade.getDataDeEntrega());
        txtDescricao.setText(atividade.getDescricao());
        chkConcluida.setSelected(atividade.isConcluida());
        txtObservacoes.setText(atividade.getRelatoFinal());
        cmdSalvar.setText("Atualizar");
        cmdSalvar.setEnabled(true);
        _Editar = editar;
        
    }

    private void SetCampos(boolean b) {

        txtData.setEditable(b);
        txtDescricao.setEditable(b);
        txtObservacoes.setEditable(b);
         txtCodigo.setEditable(!b);

    }

    private void LimparCampos() {

        txtCodigo.setText("");
        txtData.setText("");
        txtDescricao.setText("");
        txtObservacoes.setText("");

    }

}
