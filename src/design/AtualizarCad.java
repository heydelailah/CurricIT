/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package design;

import classes.Nsa;
import static classes.Nsa.ctr;
import static classes.Nsa.key;
import java.awt.event.KeyEvent;

/**
 *
 * @author admin
 */
public class AtualizarCad extends javax.swing.JFrame {

    /**
     * Creates new form AtualizarCad
     */
    public AtualizarCad() {
        initComponents();
    }

    
    //limpar dados
    void clsData(){
nome_Atua.setText(null);
senha_Atua.setText(null);
email_Atua.setText(null);
idade_Atua.setText(null);

}

    
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        salvar_Cadastral1 = new javax.swing.JButton();
        jLabel8 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        nome_Atua = new javax.swing.JTextField();
        idade_Atua = new javax.swing.JTextField();
        email_Atua = new javax.swing.JTextField();
        senha_Atua = new javax.swing.JPasswordField();
        habilidade_Atua = new javax.swing.JComboBox();
        cargo_Atua = new javax.swing.JComboBox();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jLabel1.setText("Idade");

        jLabel3.setText("email");

        jLabel4.setText("habilidade");

        jLabel5.setText("cargo");

        salvar_Cadastral1.setText("Atualizar");
        salvar_Cadastral1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                salvar_Cadastral1ActionPerformed(evt);
            }
        });

        jLabel8.setText("nome");

        jLabel12.setText("senha");

        idade_Atua.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                idade_AtuaActionPerformed(evt);
            }
        });
        idade_Atua.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                idade_AtuaKeyPressed(evt);
            }
        });

        email_Atua.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                email_AtuaActionPerformed(evt);
            }
        });
        email_Atua.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                email_AtuaKeyPressed(evt);
            }
        });

        habilidade_Atua.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "java", "c", "delphi", "assembly" }));
        habilidade_Atua.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                habilidade_AtuaActionPerformed(evt);
            }
        });

        cargo_Atua.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "analista", "DBA", "programador", "estudante" }));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(186, 186, 186)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel4)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(10, 10, 10)
                                .addComponent(jLabel5)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(cargo_Atua, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(habilidade_Atua, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addContainerGap(156, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(6, 6, 6)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(salvar_Cadastral1)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jLabel8)
                                    .addComponent(jLabel12)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(jLabel3)
                                        .addComponent(jLabel1)))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(nome_Atua)
                                    .addComponent(senha_Atua)
                                    .addComponent(idade_Atua, javax.swing.GroupLayout.DEFAULT_SIZE, 213, Short.MAX_VALUE)
                                    .addComponent(email_Atua))))
                        .addGap(0, 30, Short.MAX_VALUE))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(39, 39, 39)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel12)
                    .addComponent(senha_Atua, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(nome_Atua, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel8))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(12, 12, 12)
                        .addComponent(idade_Atua, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(email_Atua, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel3)))
                .addGap(11, 11, 11)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(habilidade_Atua, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(cargo_Atua, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(salvar_Cadastral1)
                .addContainerGap(154, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
   
  
  
  //setar combobx
  void item(){
habilidade_Atua.setSelectedItem(Nsa.member[DadosCadastrais.k].getHabilidade());
cargo_Atua.setSelectedItem(Nsa.member[DadosCadastrais.k].getCargo());
    }
  
 
    private void salvar_Cadastral1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_salvar_Cadastral1ActionPerformed
  DadosCadastrais dads = new DadosCadastrais();
  
  TelaCadastro tlCad = new TelaCadastro();
  /*id_Atua.getText(),*/    
  dads.Edit(new String(senha_Atua.getPassword()),nome_Atua.getText(),idade_Atua.getText(),email_Atua.getText(),cargo_Atua.getSelectedItem().toString(),habilidade_Atua.getSelectedItem().toString());
      clsData();
      dispose();
      
      
    }//GEN-LAST:event_salvar_Cadastral1ActionPerformed

    private void email_AtuaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_email_AtuaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_email_AtuaActionPerformed
    
    
    private void email_AtuaKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_email_AtuaKeyPressed
if(evt.getKeyCode()==KeyEvent.VK_ENTER){
 DadosCadastrais dads = new DadosCadastrais();
  
  
  TelaCadastro tlCad = new TelaCadastro();
  dads.Edit(new String(senha_Atua.getPassword()),nome_Atua.getText(),idade_Atua.getText(),email_Atua.getText(),cargo_Atua.getSelectedItem().toString(),habilidade_Atua.getSelectedItem().toString());
      clsData();
      dispose();
      
      
      
      
// TODO add your handling code here:
      }
    }//GEN-LAST:event_email_AtuaKeyPressed

    private void idade_AtuaKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_idade_AtuaKeyPressed
        // TODO add your handling code here:
    }//GEN-LAST:event_idade_AtuaKeyPressed

    private void idade_AtuaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_idade_AtuaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_idade_AtuaActionPerformed

    private void habilidade_AtuaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_habilidade_AtuaActionPerformed

              // TODO add your handling code here:
    }//GEN-LAST:event_habilidade_AtuaActionPerformed

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
            java.util.logging.Logger.getLogger(AtualizarCad.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(AtualizarCad.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(AtualizarCad.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(AtualizarCad.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new AtualizarCad().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox cargo_Atua;
    private javax.swing.JTextField email_Atua;
    private javax.swing.JComboBox habilidade_Atua;
    private javax.swing.JTextField idade_Atua;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JTextField nome_Atua;
    private javax.swing.JButton salvar_Cadastral1;
    private javax.swing.JPasswordField senha_Atua;
    // End of variables declaration//GEN-END:variables
}