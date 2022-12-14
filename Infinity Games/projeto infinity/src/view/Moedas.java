/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package view;

import DAO.ConexaoDAO;
import DTO.UsuarioDTO;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;
import java.sql.Connection;

/**
 *   Tela para a pessoa pagar o jogo com o uso de Moedas
 * @author Vander
 */
public class Moedas extends javax.swing.JFrame {

    /**
     * Creates new form Moedas
     */
    public Moedas() {
        initComponents();
        Connection conn = new ConexaoDAO().conectaBD();
        setLocationRelativeTo(null); //CENTRALIZAR TELA
        int x = 0;
        int y = 0;
        int z = 0;
        int soma = 0;
        int desconto = 0;
       campoValor.setText("R$"+x);
       //vai acessar o banco de dados e pegar o valor do jogo selecionado 
       try {
            String sql = "Select valor from jogos where status = ?";
            PreparedStatement pstm = conn.prepareStatement(sql);
            pstm.setInt(1,1);
            ResultSet rs = pstm.executeQuery();
            while(rs.next()){
            x = rs.getInt(1);
            }
        } catch (SQLException erro) {
            JOptionPane.showMessageDialog(null,erro + "campoPreço");
            }
       //vai acessar o banco de dados e pegar as moedas do usuario logado  
       try {
            String sql = "Select moedas from user where status = ?";
            PreparedStatement pstm = conn.prepareStatement(sql);
            pstm.setInt(1,1);
            ResultSet rs = pstm.executeQuery();
            while(rs.next()){
            z = rs.getInt(1);
            }
            //vai realizar o a conta para o desconto do jogo
            desconto = x-z;
            campoDesconto.setText("R$"+x+"-"+z+" pontos");
            campoValor.setText("R$"+desconto);
            soma = desconto / 5;
        } catch (SQLException erro) {
            JOptionPane.showMessageDialog(null,erro + "Moedas");
            }
       //vai adicionar as moedas que o usuário ganhou ao realizar a compra  
       try {
            String sql = "Update user set moedas = ? where status = ?";
            PreparedStatement pstm = conn.prepareStatement(sql);
            pstm.setInt(1,soma);
            pstm.setInt(2,1);
            pstm.execute();
       
            
        } catch (SQLException erro) {
            JOptionPane.showMessageDialog(null,erro + "Moedas");
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

        BotaoVoltar = new javax.swing.JButton();
        BotaoPagamentoEfetuado = new javax.swing.JButton();
        campoValor = new javax.swing.JTextField();
        campoDesconto = new javax.swing.JTextField();
        BotaoFechar = new javax.swing.JButton();
        ImagemFundo = new javax.swing.JLabel();

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
        getContentPane().add(BotaoVoltar, new org.netbeans.lib.awtextra.AbsoluteConstraints(66, 50, -1, -1));

        BotaoPagamentoEfetuado.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/botaoPagamentoEfetuado.png"))); // NOI18N
        BotaoPagamentoEfetuado.setBorder(null);
        BotaoPagamentoEfetuado.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotaoPagamentoEfetuadoActionPerformed(evt);
            }
        });
        getContentPane().add(BotaoPagamentoEfetuado, new org.netbeans.lib.awtextra.AbsoluteConstraints(824, 565, -1, -1));

        campoValor.setEditable(false);
        campoValor.setBackground(new java.awt.Color(255, 255, 255));
        campoValor.setFont(new java.awt.Font("Segoe UI", 0, 48)); // NOI18N
        campoValor.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        campoValor.setBorder(null);
        campoValor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                campoValorActionPerformed(evt);
            }
        });
        getContentPane().add(campoValor, new org.netbeans.lib.awtextra.AbsoluteConstraints(730, 340, 360, 160));

        campoDesconto.setEditable(false);
        campoDesconto.setBackground(new java.awt.Color(255, 255, 255));
        campoDesconto.setFont(new java.awt.Font("Segoe UI", 0, 48)); // NOI18N
        campoDesconto.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        campoDesconto.setBorder(null);
        campoDesconto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                campoDescontoActionPerformed(evt);
            }
        });
        getContentPane().add(campoDesconto, new org.netbeans.lib.awtextra.AbsoluteConstraints(680, 130, 450, 160));

        BotaoFechar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/Captura de tela 2022-10-19 213715.png"))); // NOI18N
        BotaoFechar.setBorder(null);
        BotaoFechar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotaoFecharActionPerformed(evt);
            }
        });
        getContentPane().add(BotaoFechar, new org.netbeans.lib.awtextra.AbsoluteConstraints(1135, 5, 20, 20));

        ImagemFundo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/Tela Pix.png"))); // NOI18N
        getContentPane().add(ImagemFundo, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1200, 700));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void BotaoPagamentoEfetuadoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotaoPagamentoEfetuadoActionPerformed
        PagamentoRealizado obj = new PagamentoRealizado();
        obj.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_BotaoPagamentoEfetuadoActionPerformed

    private void campoValorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_campoValorActionPerformed

    }//GEN-LAST:event_campoValorActionPerformed

    private void campoDescontoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_campoDescontoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_campoDescontoActionPerformed

    private void BotaoFecharActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotaoFecharActionPerformed
        UsuarioDTO objseg = new UsuarioDTO();
        DAO.UsuarioDAO objDAO = new DAO.UsuarioDAO();
        ResultSet rsusuariodao = objDAO.Deconnect(objseg);
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
            java.util.logging.Logger.getLogger(Moedas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Moedas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Moedas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Moedas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Moedas().setVisible(true);
            }
        });
    }


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BotaoFechar;
    private javax.swing.JButton BotaoPagamentoEfetuado;
    private javax.swing.JButton BotaoVoltar;
    private javax.swing.JLabel ImagemFundo;
    private javax.swing.JTextField campoDesconto;
    private javax.swing.JTextField campoValor;
    // End of variables declaration//GEN-END:variables
}
