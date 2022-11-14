/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package view;

import DAO.ConexaoDAO;
import DTO.UsuarioDTO;
import UTIL.ManipularImagem;
import com.sun.jdi.connect.spi.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.text.DecimalFormat;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;


/**
 *
 * @author Cliente
 */
public class Carrinho extends javax.swing.JFrame {

    /**
     * Creates new form Carrinho
     */
    public Carrinho() {
        initComponents();
        setLocationRelativeTo(null); //CENTRALIZAR TELA
        
        java.sql.Connection conn = new ConexaoDAO().conectaBD();
        UsuarioDTO retorno = null;
        int x = 0;
        
        try {
            String sql = "Select SUM(valor) from jogos where status = ?";
            String sql1 = "Select (imagem) from jogos where status = ?";
            PreparedStatement pstm = conn.prepareStatement(sql);
            pstm.setInt(1,1);
            PreparedStatement pstm1 = conn.prepareStatement(sql1);
            pstm1.setInt(1,1);
            
            ResultSet rs1 = pstm1.executeQuery();
            if(rs1.next()){
               retorno = new UsuarioDTO();
               retorno.setImagem(rs1.getBytes("imagem"));
               }
            
            ResultSet rs = pstm.executeQuery();
            while(rs.next()){
            x = rs.getInt(1);
            }
            
            campoTotal.setText("R$"+x);
            ManipularImagem.exibiImagemLabel(retorno.getImagem(),lblImg);
        } catch (SQLException erro) {
            JOptionPane.showMessageDialog(null,erro + "revelar");
            }
    }

    
    
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        BotaoFinalizarCompra = new javax.swing.JButton();
        BotaoFechar = new javax.swing.JButton();
        BotaoInicio = new javax.swing.JButton();
        campoTotal = new javax.swing.JTextField();
        jPanel1 = new javax.swing.JPanel();
        lblImg = new javax.swing.JLabel();
        ImagemFundo = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        BotaoFinalizarCompra.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/Botao Finalizar Compra Fundo Branco.png"))); // NOI18N
        BotaoFinalizarCompra.setBorder(null);
        BotaoFinalizarCompra.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotaoFinalizarCompraActionPerformed(evt);
            }
        });
        getContentPane().add(BotaoFinalizarCompra, new org.netbeans.lib.awtextra.AbsoluteConstraints(950, 50, -1, -1));

        BotaoFechar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/Captura de tela 2022-10-19 213715.png"))); // NOI18N
        BotaoFechar.setBorder(null);
        BotaoFechar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotaoFecharActionPerformed(evt);
            }
        });
        getContentPane().add(BotaoFechar, new org.netbeans.lib.awtextra.AbsoluteConstraints(1130, 0, 30, 30));

        BotaoInicio.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/Botao Inicio AZUL.png"))); // NOI18N
        BotaoInicio.setBorder(null);
        BotaoInicio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotaoInicioActionPerformed(evt);
            }
        });
        getContentPane().add(BotaoInicio, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 50, -1, -1));

        campoTotal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                campoTotalActionPerformed(evt);
            }
        });
        getContentPane().add(campoTotal, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 190, 100, -1));

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lblImg.setPreferredSize(new java.awt.Dimension(165, 215));
        jPanel1.add(lblImg, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 210, 170));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 190, 210, 170));

        ImagemFundo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/Tela Carrinho.png"))); // NOI18N
        getContentPane().add(ImagemFundo, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1200, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void BotaoFinalizarCompraActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotaoFinalizarCompraActionPerformed
      Pagamento obj = new Pagamento();
      obj.setVisible(true);
      this.dispose();
    }//GEN-LAST:event_BotaoFinalizarCompraActionPerformed

    private void BotaoFecharActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotaoFecharActionPerformed
        UsuarioDTO objseg = new UsuarioDTO();
        DAO.UsuarioDAO objDAO = new DAO.UsuarioDAO();
        ResultSet rsusuariodao = objDAO.Deconnect(objseg);
        System.exit(0);
    }//GEN-LAST:event_BotaoFecharActionPerformed

    private void BotaoInicioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotaoInicioActionPerformed
        UsuarioDTO objseg = new UsuarioDTO();
        DAO.UsuarioDAO objDAO = new DAO.UsuarioDAO();
        ResultSet rsusuariodao = objDAO.Cancelamento(objseg);
        TelaPrincLog obj = new TelaPrincLog();
       obj.setVisible(true);
       this.dispose();
    }//GEN-LAST:event_BotaoInicioActionPerformed

    private void campoTotalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_campoTotalActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_campoTotalActionPerformed

    /**
     * @param args the command line arguments
     */
  

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BotaoFechar;
    private javax.swing.JButton BotaoFinalizarCompra;
    private javax.swing.JButton BotaoInicio;
    private javax.swing.JLabel ImagemFundo;
    private javax.swing.JTextField campoTotal;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel lblImg;
    // End of variables declaration//GEN-END:variables
       
    
}
