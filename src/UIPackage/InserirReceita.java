/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package UIPackage;

import LogicPackage.Modelo;
import javax.swing.DefaultListModel;

/**
 *
 * @author Sammy Guergachi <sguergachi at gmail.com>
 */
public class InserirReceita extends javax.swing.JFrame {
    
    Modelo l;
    DefaultListModel<String> model;
    /**
     * Creates new form InserirReceita
     */
    public InserirReceita(Modelo l) {
        initComponents();
        model = new DefaultListModel<>();
        this.l=l;
    }
    public InserirReceita() {
        initComponents();
    }
    

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        lTitulo = new javax.swing.JLabel();
        lTituloReceita = new javax.swing.JLabel();
        lnºpessoas = new javax.swing.JLabel();
        lingredientesselecionados = new javax.swing.JLabel();
        lupoadImagem = new javax.swing.JLabel();
        lTipoIngrediente = new javax.swing.JLabel();
        lingredientesDisponiveis = new javax.swing.JLabel();
        lmetododepreparacao = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        lstIngDisp = new javax.swing.JList<>();
        bEliminarIngrediente = new javax.swing.JButton();
        bAcrescentarIngrediente = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        testAreaMetodoDePreparacao = new javax.swing.JTextArea();
        bGuardarReceita = new javax.swing.JButton();
        bEliminarReceita = new javax.swing.JButton();
        bVoltarAtras = new javax.swing.JButton();
        textFildTituloReceita = new javax.swing.JTextField();
        textFildnpessoas = new javax.swing.JTextField();
        boxTipoIngrediente = new javax.swing.JComboBox<>();
        bUpload = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        txtGramas = new javax.swing.JTextField();
        jScrollPane3 = new javax.swing.JScrollPane();
        lstIngSelec = new javax.swing.JList<>();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setPreferredSize(new java.awt.Dimension(950, 550));

        lTitulo.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        lTitulo.setText("Inserir Receita");

        lTituloReceita.setText("Titulo da Receita:");

        lnºpessoas.setText("Nº Pessoas:");

        lingredientesselecionados.setText("Ingredientes Selecionados:");

        lupoadImagem.setText("Upload de Imagem");

        lTipoIngrediente.setText("Tipo Ingrediente:");

        lingredientesDisponiveis.setText("Ingredientes Disponiveis:");

        lmetododepreparacao.setText("Método de Preparação:");

        lstIngDisp.setModel(boxTipoIngrediente.getModel());
        jScrollPane1.setViewportView(lstIngDisp);

        bEliminarIngrediente.setText("Eliminar Ingrediente");
        bEliminarIngrediente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bEliminarIngredienteActionPerformed(evt);
            }
        });

        bAcrescentarIngrediente.setText("Acrescentar");
        bAcrescentarIngrediente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bAcrescentarIngredienteActionPerformed(evt);
            }
        });

        testAreaMetodoDePreparacao.setColumns(20);
        testAreaMetodoDePreparacao.setRows(5);
        jScrollPane2.setViewportView(testAreaMetodoDePreparacao);

        bGuardarReceita.setText("Guardar Receita");
        bGuardarReceita.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bGuardarReceitaActionPerformed(evt);
            }
        });

        bEliminarReceita.setText("Eliminar Receita");
        bEliminarReceita.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bEliminarReceitaActionPerformed(evt);
            }
        });

        bVoltarAtras.setText("Voltar atrás");
        bVoltarAtras.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bVoltarAtrasActionPerformed(evt);
            }
        });

        boxTipoIngrediente.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Carne", "Peixe", "Vegetal", "Fruta", "Cereal", "Lacticinios", "Leguminosas", "Oleos" }));
        boxTipoIngrediente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                boxTipoIngredienteActionPerformed(evt);
            }
        });

        bUpload.setText("Upload");
        bUpload.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bUploadActionPerformed(evt);
            }
        });

        jLabel1.setText("Gramas:");

        txtGramas.setToolTipText("");

        lstIngSelec.setModel(new javax.swing.AbstractListModel<String>() {
            String[] strings = { "Item 1", "Item 2", "Item 3", "Item 4", "Item 5" };
            public int getSize() { return strings.length; }
            public String getElementAt(int i) { return strings[i]; }
        });
        jScrollPane3.setViewportView(lstIngSelec);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(375, 375, 375)
                .addComponent(lTitulo, javax.swing.GroupLayout.PREFERRED_SIZE, 176, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(62, 62, 62)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(bGuardarReceita)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(bEliminarReceita)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(bVoltarAtras)
                        .addGap(12, 12, 12))
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(lingredientesselecionados)
                            .addComponent(lmetododepreparacao)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(lTituloReceita)
                                    .addComponent(lnºpessoas))
                                .addGap(18, 18, 18)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(textFildTituloReceita, javax.swing.GroupLayout.PREFERRED_SIZE, 137, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(textFildnpessoas)
                                        .addGap(109, 109, 109))))
                            .addComponent(bEliminarIngrediente)
                            .addComponent(jScrollPane3))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 288, Short.MAX_VALUE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(lupoadImagem)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(bUpload))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(lingredientesDisponiveis)
                                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 222, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                    .addComponent(jLabel1)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(txtGramas)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(bAcrescentarIngrediente)))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(lTipoIngrediente)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(boxTipoIngrediente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addGap(114, 114, 114))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(67, 67, 67)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lTipoIngrediente)
                            .addComponent(boxTipoIngrediente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lupoadImagem)
                            .addComponent(bUpload)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(21, 21, 21)
                        .addComponent(lTitulo, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lTituloReceita)
                            .addComponent(textFildTituloReceita, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lnºpessoas)
                            .addComponent(textFildnpessoas, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lingredientesselecionados)
                    .addComponent(lingredientesDisponiveis))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 147, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(bAcrescentarIngrediente)
                    .addComponent(bEliminarIngrediente)
                    .addComponent(jLabel1)
                    .addComponent(txtGramas, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(lmetododepreparacao)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(bGuardarReceita)
                    .addComponent(bEliminarReceita)
                    .addComponent(bVoltarAtras))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 528, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void bEliminarIngredienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bEliminarIngredienteActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_bEliminarIngredienteActionPerformed

    private void bUploadActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bUploadActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_bUploadActionPerformed

    private void boxTipoIngredienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_boxTipoIngredienteActionPerformed
        // TODO add your handling code here:
            lstIngDisp.setModel(l.returnNomeIngredientes(boxTipoIngrediente.getItemAt(boxTipoIngrediente.getSelectedIndex())));
    }//GEN-LAST:event_boxTipoIngredienteActionPerformed

    private void bAcrescentarIngredienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bAcrescentarIngredienteActionPerformed
        // TODO add your handling code here:
if(txtGramas.getText().equals(" "))
            return;
        
        int g = 0;
        
        try{
            g = Integer.parseInt(txtGramas.getText());
        }catch(NumberFormatException e){
            return;
        }
        
        lstIngSelec.setModel(model);
        model.addElement(lstIngDisp.getSelectedValue() + " " + g + "g");
    }//GEN-LAST:event_bAcrescentarIngredienteActionPerformed

    private void bGuardarReceitaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bGuardarReceitaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_bGuardarReceitaActionPerformed

    private void bEliminarReceitaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bEliminarReceitaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_bEliminarReceitaActionPerformed

    private void bVoltarAtrasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bVoltarAtrasActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_bVoltarAtrasActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(InserirReceita.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(InserirReceita.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(InserirReceita.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(InserirReceita.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new InserirReceita().setVisible(true);
            
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton bAcrescentarIngrediente;
    private javax.swing.JButton bEliminarIngrediente;
    private javax.swing.JButton bEliminarReceita;
    private javax.swing.JButton bGuardarReceita;
    private javax.swing.JButton bUpload;
    private javax.swing.JButton bVoltarAtras;
    private javax.swing.JComboBox<String> boxTipoIngrediente;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JLabel lTipoIngrediente;
    private javax.swing.JLabel lTitulo;
    private javax.swing.JLabel lTituloReceita;
    private javax.swing.JLabel lingredientesDisponiveis;
    private javax.swing.JLabel lingredientesselecionados;
    private javax.swing.JLabel lmetododepreparacao;
    private javax.swing.JLabel lnºpessoas;
    private javax.swing.JList<String> lstIngDisp;
    private javax.swing.JList<String> lstIngSelec;
    private javax.swing.JLabel lupoadImagem;
    private javax.swing.JTextArea testAreaMetodoDePreparacao;
    private javax.swing.JTextField textFildTituloReceita;
    private javax.swing.JTextField textFildnpessoas;
    private javax.swing.JTextField txtGramas;
    // End of variables declaration//GEN-END:variables
}
