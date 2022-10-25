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

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        jTextArea1 = new javax.swing.JTextArea();
        campoEmail = new javax.swing.JTextField();
        campoSenha = new javax.swing.JPasswordField();
        BotaoEntrar = new javax.swing.JButton();
        BotaoFechar = new javax.swing.JButton();
        LabelTotal = new javax.swing.JLabel();

        jTextArea1.setColumns(20);
        jTextArea1.setRows(5);
        jScrollPane1.setViewportView(jTextArea1);

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        campoEmail.setBackground(new java.awt.Color(217, 217, 217));
        campoEmail.setBorder(null);
        campoEmail.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                campoEmailActionPerformed(evt);
            }
        });
        getContentPane().add(campoEmail, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 215, 280, 20));

        campoSenha.setBackground(new java.awt.Color(217, 217, 217));
        campoSenha.setToolTipText("");
        campoSenha.setBorder(null);
        campoSenha.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                campoSenhaActionPerformed(evt);
            }
        });
        getContentPane().add(campoSenha, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 300, 280, 20));

        BotaoEntrar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/botao entrar.png"))); // NOI18N
        BotaoEntrar.setBorder(null);
        BotaoEntrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotaoEntrarActionPerformed(evt);
            }
        });
        getContentPane().add(BotaoEntrar, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 370, -1, 70));

        BotaoFechar.setForeground(new java.awt.Color(255, 255, 255));
        BotaoFechar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/Captura de tela 2022-10-19 213715.png"))); // NOI18N
        BotaoFechar.setBorderPainted(false);
        BotaoFechar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotaoFecharActionPerformed(evt);
            }
        });
        getContentPane().add(BotaoFechar, new org.netbeans.lib.awtextra.AbsoluteConstraints(660, 8, 30, 30));

        LabelTotal.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/LOGIN USUÁRIO (1).png"))); // NOI18N
        getContentPane().add(LabelTotal, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 700, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void campoEmailActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_campoEmailActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_campoEmailActionPerformed

    private void campoSenhaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_campoSenhaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_campoSenhaActionPerformed

    private void BotaoFecharActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotaoFecharActionPerformed
        System.exit(0);
    }//GEN-LAST:event_BotaoFecharActionPerformed

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
            TelaPrincipal principal = new TelaPrincipal();
            principal.setVisible(true);
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

    /**
     * @param args the command line arguments
     */

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BotaoEntrar;
    private javax.swing.JButton BotaoFechar;
    private javax.swing.JLabel LabelTotal;
    private javax.swing.JTextField campoEmail;
    private javax.swing.JPasswordField campoSenha;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextArea jTextArea1;
    // End of variables declaration//GEN-END:variables
}
