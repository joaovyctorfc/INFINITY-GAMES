/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package view;

import DAO.UsuarioDAO;
import DTO.UsuarioDTO;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

public class Login extends javax.swing.JFrame {

    private String senha, email;

    public Login() {
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

        BotaoRegistrarse = new javax.swing.JButton();
        BotaoEsquceuSenha = new javax.swing.JButton();
        BotaoEntrar = new javax.swing.JButton();
        campoEmail = new javax.swing.JTextField();
        campoSenha = new javax.swing.JPasswordField();
        BotaoSair = new javax.swing.JButton();
        ImagemFundo = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(700, 500));
        setUndecorated(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        BotaoRegistrarse.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/botao link Registrar-se.png"))); // NOI18N
        BotaoRegistrarse.setBorder(null);
        BotaoRegistrarse.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotaoRegistrarseActionPerformed(evt);
            }
        });
        getContentPane().add(BotaoRegistrarse, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 468, -1, -1));

        BotaoEsquceuSenha.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/Botao Esqueceu senha.png"))); // NOI18N
        BotaoEsquceuSenha.setBorder(null);
        BotaoEsquceuSenha.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotaoEsquceuSenhaActionPerformed(evt);
            }
        });
        getContentPane().add(BotaoEsquceuSenha, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 470, 120, -1));

        BotaoEntrar.setBackground(new java.awt.Color(217, 217, 217));
        BotaoEntrar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/botao entrar.png"))); // NOI18N
        BotaoEntrar.setBorder(null);
        BotaoEntrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotaoEntrarActionPerformed(evt);
            }
        });
        getContentPane().add(BotaoEntrar, new org.netbeans.lib.awtextra.AbsoluteConstraints(93, 385, 160, 50));

        campoEmail.setBackground(new java.awt.Color(217, 217, 217));
        campoEmail.setBorder(null);
        getContentPane().add(campoEmail, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 210, 270, 30));

        campoSenha.setBackground(new java.awt.Color(217, 217, 217));
        campoSenha.setBorder(null);
        getContentPane().add(campoSenha, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 300, 280, 20));

        BotaoSair.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/Captura de tela 2022-10-19 213715.png"))); // NOI18N
        BotaoSair.setBorderPainted(false);
        BotaoSair.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotaoSairActionPerformed(evt);
            }
        });
        getContentPane().add(BotaoSair, new org.netbeans.lib.awtextra.AbsoluteConstraints(660, 8, 30, 30));

        ImagemFundo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/LOGIN USUÁRIO (1).png"))); // NOI18N
        getContentPane().add(ImagemFundo, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, -10, -1, 520));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void BotaoEntrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotaoEntrarActionPerformed
        email = campoEmail.getText();
        senha = campoSenha.getText();
        
        if(email.equals("")||senha.equals("")){
                 JOptionPane.showMessageDialog(null,"Erro para realizar o login!!!","Erro",JOptionPane.ERROR_MESSAGE);
                } 
     
     else{
        
        try {
            String email, senha;

            email = campoEmail.getText();
            senha = campoSenha.getText();

            UsuarioDTO obj = new UsuarioDTO();
            obj.setEmail(email);
            obj.setSenha(senha);
            
            UsuarioDAO objDAO = new UsuarioDAO();
            ResultSet rsusuariodao = objDAO.AutenticacaoUsuario(obj);
            if(rsusuariodao.next())
            {
            TelaPrincLog telaprin = new TelaPrincLog();
            telaprin.setVisible(true);
            this.dispose();
            }
            else
            {
            JOptionPane.showMessageDialog(null,"Usuário ou senha inválida!!!","Erro",JOptionPane.ERROR_MESSAGE);
            }
            
        } catch (SQLException erro) {
            JOptionPane.showMessageDialog(null,senha +"btnlogin");
        }
        }
    }//GEN-LAST:event_BotaoEntrarActionPerformed

    private void BotaoSairActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotaoSairActionPerformed
        System.exit(0);
    }//GEN-LAST:event_BotaoSairActionPerformed

    private void BotaoRegistrarseActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotaoRegistrarseActionPerformed
   Registrar obj = new Registrar();
   obj.setVisible(true);
   this.dispose();
    }//GEN-LAST:event_BotaoRegistrarseActionPerformed

    private void BotaoEsquceuSenhaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotaoEsquceuSenhaActionPerformed
      EsqueceuSenha obj = new EsqueceuSenha();
      obj.setVisible(true);
      this.dispose();
    }//GEN-LAST:event_BotaoEsquceuSenhaActionPerformed

    /**
     * @param args the command line arguments
     */


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BotaoEntrar;
    private javax.swing.JButton BotaoEsquceuSenha;
    private javax.swing.JButton BotaoRegistrarse;
    private javax.swing.JButton BotaoSair;
    private javax.swing.JLabel ImagemFundo;
    private javax.swing.JTextField campoEmail;
    private javax.swing.JPasswordField campoSenha;
    // End of variables declaration//GEN-END:variables
}
