/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package design;

import classes.Nsa;
import classes.ParticipantesNsa;
import classes.TestClass;

/**
 *
 * @author admin
 */
public class Test extends javax.swing.JInternalFrame {

    /**
     * Creates new form Exercise
     */
    public Test() {
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

        buttonGroup1 = new javax.swing.ButtonGroup();
        buttonGroup2 = new javax.swing.ButtonGroup();
        buttonGroup3 = new javax.swing.ButtonGroup();
        buttonGroup4 = new javax.swing.ButtonGroup();
        buttonGroup5 = new javax.swing.ButtonGroup();
        jLabel4 = new javax.swing.JLabel();
        text_crypt = new javax.swing.JLabel();
        jRadioButton5 = new javax.swing.JRadioButton();
        jRadioButton6 = new javax.swing.JRadioButton();
        jRadioButton7 = new javax.swing.JRadioButton();
        jRadioButton13 = new javax.swing.JRadioButton();
        jRadioButton8 = new javax.swing.JRadioButton();
        jLabel2 = new javax.swing.JLabel();
        jRadioButton14 = new javax.swing.JRadioButton();
        jLabel5 = new javax.swing.JLabel();
        jRadioButton1 = new javax.swing.JRadioButton();
        text_crypt1 = new javax.swing.JLabel();
        jRadioButton12 = new javax.swing.JRadioButton();
        jRadioButton9 = new javax.swing.JRadioButton();
        jRadioButton10 = new javax.swing.JRadioButton();
        jRadioButton4 = new javax.swing.JRadioButton();
        jRadioButton11 = new javax.swing.JRadioButton();
        jRadioButton2 = new javax.swing.JRadioButton();
        jRadioButton3 = new javax.swing.JRadioButton();
        jRadioButton20 = new javax.swing.JRadioButton();
        jRadioButton16 = new javax.swing.JRadioButton();
        jRadioButton15 = new javax.swing.JRadioButton();
        jRadioButton17 = new javax.swing.JRadioButton();
        jLabel6 = new javax.swing.JLabel();
        jRadioButton19 = new javax.swing.JRadioButton();
        jRadioButton18 = new javax.swing.JRadioButton();
        jButton1 = new javax.swing.JButton();
        salvar_Cadastral = new javax.swing.JButton();

        jLabel4.setText(" 2. Qual dos comandos abaixo irá incluir um registro na tabela CLIENTES ? ");

        text_crypt.setText("1. Qual nível de execução (runlevel) indica uma reinicialização do Sistema ?");

        buttonGroup2.add(jRadioButton5);
        jRadioButton5.setText("update");
        jRadioButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButton5ActionPerformed(evt);
            }
        });

        buttonGroup2.add(jRadioButton6);
        jRadioButton6.setText("delete");

        buttonGroup2.add(jRadioButton7);
        jRadioButton7.setText("select");

        buttonGroup3.add(jRadioButton13);
        jRadioButton13.setText("update");

        buttonGroup2.add(jRadioButton8);
        jRadioButton8.setText("insert");

        jLabel2.setText("NSATest");

        buttonGroup3.add(jRadioButton14);
        jRadioButton14.setText("delete");

        jLabel5.setText("4. Qual é a correta permissão em valor octal que ativa o chamado SGID em um determinado diretório ? ");

        buttonGroup1.add(jRadioButton1);
        jRadioButton1.setText("7");

        text_crypt1.setText("3. Qual instrução SQL que modifica dados já inseridos em uma tabela ? ");

        buttonGroup4.add(jRadioButton12);
        jRadioButton12.setText("7575");

        buttonGroup4.add(jRadioButton9);
        jRadioButton9.setText("1777");

        buttonGroup4.add(jRadioButton10);
        jRadioButton10.setText("1400");

        buttonGroup1.add(jRadioButton4);
        jRadioButton4.setText("5");

        buttonGroup4.add(jRadioButton11);
        jRadioButton11.setText("2775");

        buttonGroup1.add(jRadioButton2);
        jRadioButton2.setText("8");

        buttonGroup1.add(jRadioButton3);
        jRadioButton3.setText("6");

        buttonGroup5.add(jRadioButton20);
        jRadioButton20.setText("join");

        buttonGroup3.add(jRadioButton16);
        jRadioButton16.setText("insert");

        buttonGroup3.add(jRadioButton15);
        jRadioButton15.setText("where");

        buttonGroup5.add(jRadioButton17);
        jRadioButton17.setText("tr");

        jLabel6.setText("5. Qual comando pode ser usado para dividir um determinado arquivo em 4 partes iguais ? ");

        buttonGroup5.add(jRadioButton19);
        jRadioButton19.setText("split");

        buttonGroup5.add(jRadioButton18);
        jRadioButton18.setText("cat");

        jButton1.setText("Finalizar");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        salvar_Cadastral.setText("sair");
        salvar_Cadastral.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                salvar_CadastralActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(salvar_Cadastral)
                .addGap(33, 33, 33)
                .addComponent(jButton1)
                .addGap(20, 20, 20))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel4)
                    .addComponent(jLabel6)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jRadioButton9)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jRadioButton11)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jRadioButton10)
                        .addGap(2, 2, 2)
                        .addComponent(jRadioButton12))
                    .addComponent(jLabel5)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jRadioButton13)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jRadioButton15)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jRadioButton14)
                        .addGap(2, 2, 2)
                        .addComponent(jRadioButton16))
                    .addComponent(text_crypt1)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jRadioButton5)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jRadioButton7)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jRadioButton6)
                        .addGap(2, 2, 2)
                        .addComponent(jRadioButton8))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jRadioButton18)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jRadioButton20)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jRadioButton19)
                        .addGap(2, 2, 2)
                        .addComponent(jRadioButton17))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jRadioButton1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jRadioButton2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jRadioButton4)
                        .addGap(2, 2, 2)
                        .addComponent(jRadioButton3))
                    .addComponent(text_crypt)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 252, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(85, 85, 85)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel2)
                .addGap(45, 45, 45)
                .addComponent(text_crypt)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jRadioButton1)
                    .addComponent(jRadioButton2)
                    .addComponent(jRadioButton4)
                    .addComponent(jRadioButton3))
                .addGap(18, 18, 18)
                .addComponent(jLabel4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jRadioButton5)
                    .addComponent(jRadioButton7)
                    .addComponent(jRadioButton6)
                    .addComponent(jRadioButton8))
                .addGap(18, 18, 18)
                .addComponent(text_crypt1)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jRadioButton13)
                    .addComponent(jRadioButton15)
                    .addComponent(jRadioButton14)
                    .addComponent(jRadioButton16))
                .addGap(18, 18, 18)
                .addComponent(jLabel5)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jRadioButton9)
                    .addComponent(jRadioButton11)
                    .addComponent(jRadioButton10)
                    .addComponent(jRadioButton12))
                .addGap(18, 18, 18)
                .addComponent(jLabel6)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jRadioButton18)
                    .addComponent(jRadioButton20)
                    .addComponent(jRadioButton19)
                    .addComponent(jRadioButton17))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 55, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton1)
                    .addComponent(salvar_Cadastral))
                .addGap(23, 23, 23))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
TestClass tst = new TestClass();
Nsa.ctr=Nsa.key;
--Nsa.ctr;
Nsa.prtc[Nsa.ctr].setPontos(tst.ComputarPontos(jRadioButton3.isSelected(),jRadioButton8.isSelected(),jRadioButton13.isSelected(),jRadioButton11.isSelected(),jRadioButton19.isSelected()));
tst.Situation();
Nsa ns = new Nsa();
ns.AddMember();

        // TODO add your handling code here:
    }//GEN-LAST:event_jButton1ActionPerformed

    private void salvar_CadastralActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_salvar_CadastralActionPerformed
        this.dispose();
    }//GEN-LAST:event_salvar_CadastralActionPerformed

    private void jRadioButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButton5ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jRadioButton5ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.ButtonGroup buttonGroup2;
    private javax.swing.ButtonGroup buttonGroup3;
    private javax.swing.ButtonGroup buttonGroup4;
    private javax.swing.ButtonGroup buttonGroup5;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JRadioButton jRadioButton1;
    private javax.swing.JRadioButton jRadioButton10;
    private javax.swing.JRadioButton jRadioButton11;
    private javax.swing.JRadioButton jRadioButton12;
    private javax.swing.JRadioButton jRadioButton13;
    private javax.swing.JRadioButton jRadioButton14;
    private javax.swing.JRadioButton jRadioButton15;
    private javax.swing.JRadioButton jRadioButton16;
    private javax.swing.JRadioButton jRadioButton17;
    private javax.swing.JRadioButton jRadioButton18;
    private javax.swing.JRadioButton jRadioButton19;
    private javax.swing.JRadioButton jRadioButton2;
    private javax.swing.JRadioButton jRadioButton20;
    private javax.swing.JRadioButton jRadioButton3;
    private javax.swing.JRadioButton jRadioButton4;
    private javax.swing.JRadioButton jRadioButton5;
    private javax.swing.JRadioButton jRadioButton6;
    private javax.swing.JRadioButton jRadioButton7;
    private javax.swing.JRadioButton jRadioButton8;
    private javax.swing.JRadioButton jRadioButton9;
    private javax.swing.JButton salvar_Cadastral;
    private javax.swing.JLabel text_crypt;
    private javax.swing.JLabel text_crypt1;
    // End of variables declaration//GEN-END:variables
}