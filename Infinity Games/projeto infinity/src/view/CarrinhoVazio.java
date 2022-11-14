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
public class CarrinhoVazio extends javax.swing.JFrame {

    /**
     * Creates new form Carrinho
     */
    public CarrinhoVazio() {
        initComponents();
        setLocationRelativeTo(null); //CENTRALIZAR TELA
    }

    
    
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        BotaoFinalizarCompra = new javax.swing.JButton();
        BotaoFechar = new javax.swing.JButton();
        BotaoInicio = new javax.swing.JButton();
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

        ImagemFundo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/Tela Carrinho.png"))); // NOI18N
        getContentPane().add(ImagemFundo, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1200, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void BotaoFinalizarCompraActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotaoFinalizarCompraActionPerformed
      JOptionPane.showMessageDialog(null,"Nenhum item adicionado");
      TelaPrincLog obj = new TelaPrincLog();
      obj.setVisible(true);
    }//GEN-LAST:event_BotaoFinalizarCompraActionPerformed

    private void BotaoFecharActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotaoFecharActionPerformed
        UsuarioDTO objseg = new UsuarioDTO();
        DAO.UsuarioDAO objDAO = new DAO.UsuarioDAO();
        ResultSet rsusuariodao = objDAO.Deconnect(objseg);
        System.exit(0);
    }//GEN-LAST:event_BotaoFecharActionPerformed

    private void BotaoInicioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotaoInicioActionPerformed
       TelaPrincLog obj = new TelaPrincLog();
       obj.setVisible(true);
       this.dispose();
    }//GEN-LAST:event_BotaoInicioActionPerformed

    /**
     * @param args the command line arguments
     */
  

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BotaoFechar;
    private javax.swing.JButton BotaoFinalizarCompra;
    private javax.swing.JButton BotaoInicio;
    private javax.swing.JLabel ImagemFundo;
    // End of variables declaration//GEN-END:variables
       
    
}
