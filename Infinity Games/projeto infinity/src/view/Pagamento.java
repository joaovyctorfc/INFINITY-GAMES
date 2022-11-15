/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package view;

import DTO.UsuarioDTO;
import java.sql.ResultSet;

/**
 *
 * @author Cliente
 */
public class Pagamento extends javax.swing.JFrame {

    /**
     * Creates new form Pagamento
     */
    public Pagamento() {
        initComponents();
        setLocationRelativeTo(null); //CENTRALIZAR TELA
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        BotaoVoltar = new javax.swing.JButton();
        BotaoFechar = new javax.swing.JButton();
        BotaoPIX = new javax.swing.JButton();
        BotaoBoleto = new javax.swing.JButton();
        ImageFundo = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        BotaoVoltar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/BotaoVoltar.png"))); // NOI18N
        BotaoVoltar.setBorder(null);
        BotaoVoltar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotaoVoltarActionPerformed(evt);
            }
        });
        getContentPane().add(BotaoVoltar, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 50, -1, -1));

        BotaoFechar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/Captura de tela 2022-10-19 213715.png"))); // NOI18N
        BotaoFechar.setBorder(null);
        BotaoFechar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotaoFecharActionPerformed(evt);
            }
        });
        getContentPane().add(BotaoFechar, new org.netbeans.lib.awtextra.AbsoluteConstraints(1130, 0, 30, 30));

        BotaoPIX.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/BotaoPix.png"))); // NOI18N
        BotaoPIX.setBorder(null);
        BotaoPIX.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotaoPIXActionPerformed(evt);
            }
        });
        getContentPane().add(BotaoPIX, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 290, -1, -1));

        BotaoBoleto.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/BotaoBoleto.png"))); // NOI18N
        BotaoBoleto.setBorder(null);
        BotaoBoleto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotaoBoletoActionPerformed(evt);
            }
        });
        getContentPane().add(BotaoBoleto, new org.netbeans.lib.awtextra.AbsoluteConstraints(650, 280, -1, -1));

        ImageFundo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/Tela Pagamento.png"))); // NOI18N
        getContentPane().add(ImageFundo, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, 700));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void BotaoFecharActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotaoFecharActionPerformed
      System.exit(0);
    }//GEN-LAST:event_BotaoFecharActionPerformed

    private void BotaoVoltarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotaoVoltarActionPerformed
       UsuarioDTO objseg = new UsuarioDTO();
       DAO.UsuarioDAO objDAO = new DAO.UsuarioDAO();
       ResultSet rsusuariodao = objDAO.Cancelamento(objseg);
       TelaPrincLog obj = new TelaPrincLog();
       obj.setVisible(true);
       this.dispose();
    }//GEN-LAST:event_BotaoVoltarActionPerformed

    private void BotaoBoletoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotaoBoletoActionPerformed
       TelaBoleto obj = new TelaBoleto();
       obj.setVisible(true);
       this.dispose();
    }//GEN-LAST:event_BotaoBoletoActionPerformed

    private void BotaoPIXActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotaoPIXActionPerformed
       TelaPIX obj = new TelaPIX();
       obj.setVisible(true);
       this.dispose();
    }//GEN-LAST:event_BotaoPIXActionPerformed

    /**
     * @param args the command line arguments
     */


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BotaoBoleto;
    private javax.swing.JButton BotaoFechar;
    private javax.swing.JButton BotaoPIX;
    private javax.swing.JButton BotaoVoltar;
    private javax.swing.JLabel ImageFundo;
    // End of variables declaration//GEN-END:variables
}
