
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

public class EsqueceuSenha extends javax.swing.JFrame {

  private String email,seg,senha;
    public EsqueceuSenha() {
        initComponents();
         setLocationRelativeTo(null); //CENTRALIZAR TELA
    }


    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        BotaoEsqueceuSenha = new javax.swing.JButton();
        BotaoRegistrarse = new javax.swing.JButton();
        BotaoSair = new javax.swing.JButton();
        CampoEmail = new javax.swing.JTextField();
        BotaoRedefinir = new javax.swing.JButton();
        CampoPalavraSegurança = new javax.swing.JTextField();
        CampoNovaSenha = new javax.swing.JPasswordField();
        ImageFundo = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        BotaoEsqueceuSenha.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/Botao Esqueceu senha.png"))); // NOI18N
        BotaoEsqueceuSenha.setBorder(null);
        BotaoEsqueceuSenha.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotaoEsqueceuSenhaActionPerformed(evt);
            }
        });
        getContentPane().add(BotaoEsqueceuSenha, new org.netbeans.lib.awtextra.AbsoluteConstraints(15, 471, 120, -1));

        BotaoRegistrarse.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/botao link Registrar-se.png"))); // NOI18N
        BotaoRegistrarse.setBorder(null);
        BotaoRegistrarse.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotaoRegistrarseActionPerformed(evt);
            }
        });
        getContentPane().add(BotaoRegistrarse, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 470, 80, 20));

        BotaoSair.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/Captura de tela 2022-10-19 213715.png"))); // NOI18N
        BotaoSair.setBorder(null);
        BotaoSair.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotaoSairActionPerformed(evt);
            }
        });
        getContentPane().add(BotaoSair, new org.netbeans.lib.awtextra.AbsoluteConstraints(660, 8, 30, 30));

        CampoEmail.setBackground(new java.awt.Color(217, 217, 217));
        CampoEmail.setFont(new java.awt.Font("Arial", 1, 11)); // NOI18N
        CampoEmail.setBorder(null);
        CampoEmail.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CampoEmailActionPerformed(evt);
            }
        });
        getContentPane().add(CampoEmail, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 184, 280, 20));

        BotaoRedefinir.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/Botao Redefinir.png"))); // NOI18N
        BotaoRedefinir.setBorder(null);
        BotaoRedefinir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotaoRedefinirActionPerformed(evt);
            }
        });
        getContentPane().add(BotaoRedefinir, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 385, 170, 50));

        CampoPalavraSegurança.setBackground(new java.awt.Color(217, 217, 217));
        CampoPalavraSegurança.setFont(new java.awt.Font("Arial", 1, 11)); // NOI18N
        CampoPalavraSegurança.setBorder(null);
        CampoPalavraSegurança.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CampoPalavraSegurançaActionPerformed(evt);
            }
        });
        getContentPane().add(CampoPalavraSegurança, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 248, 280, 20));

        CampoNovaSenha.setBackground(new java.awt.Color(217, 217, 217));
        CampoNovaSenha.setFont(new java.awt.Font("Arial", 1, 11)); // NOI18N
        CampoNovaSenha.setBorder(null);
        getContentPane().add(CampoNovaSenha, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 317, 280, 20));

        ImageFundo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/RedefinirSenha Tela.png"))); // NOI18N
        getContentPane().add(ImageFundo, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void CampoEmailActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CampoEmailActionPerformed
        
    }//GEN-LAST:event_CampoEmailActionPerformed

    private void BotaoRedefinirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotaoRedefinirActionPerformed
        email = CampoEmail.getText();
        seg = CampoPalavraSegurança.getText();
        senha = CampoNovaSenha.getText();
        if(email.equals("")){
                 JOptionPane.showMessageDialog(null,"Email em branco!!!","Erro",JOptionPane.ERROR_MESSAGE);
                } 
     
     else{
        
        try {
            String email,seg;

            email = CampoEmail.getText();
            seg = CampoPalavraSegurança.getText();
            
            
            UsuarioDTO objseg = new UsuarioDTO();
            objseg.setEmail(email);
            objseg.setSeg(seg);

            UsuarioDAO objDAO = new UsuarioDAO();
            ResultSet rsusuariodao = objDAO.VerificacaoSeguranca(objseg);
            if(rsusuariodao.next())
            {
              UsuarioDTO objsenha = new UsuarioDTO();
              objsenha.setEmail(email);
              objsenha.setSeg(seg);
              objsenha.setSenha(senha);

              UsuarioDAO obj2Senha = new UsuarioDAO();
              obj2Senha.alterarSenha(objsenha);

              UsuarioDAO objSenha2 = new UsuarioDAO();
              objSenha2.alterarSenha(objsenha);
              JOptionPane.showMessageDialog(null,"Senha trocada com sucesso!!!","Sucesso",JOptionPane.INFORMATION_MESSAGE);

            }
            else
            {
            JOptionPane.showMessageDialog(null,"Senha inválida!!!","Erro",JOptionPane.ERROR_MESSAGE);
            }
            
        } catch (SQLException erro) {
            JOptionPane.showMessageDialog(null, "btnlogin");
        }
        }
    }//GEN-LAST:event_BotaoRedefinirActionPerformed

    private void CampoPalavraSegurançaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CampoPalavraSegurançaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_CampoPalavraSegurançaActionPerformed

    private void BotaoSairActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotaoSairActionPerformed
      System.exit(0);
    }//GEN-LAST:event_BotaoSairActionPerformed

    private void BotaoEsqueceuSenhaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotaoEsqueceuSenhaActionPerformed
     EsqueceuSenha obj = new EsqueceuSenha();
     obj.setVisible(true);
     this.dispose();
    }//GEN-LAST:event_BotaoEsqueceuSenhaActionPerformed

    private void BotaoRegistrarseActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotaoRegistrarseActionPerformed
      Registrar obj = new Registrar();
      obj.setVisible(true);
      this.dispose();
    }//GEN-LAST:event_BotaoRegistrarseActionPerformed

    /**
     * @param args the command line arguments
     */


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BotaoEsqueceuSenha;
    private javax.swing.JButton BotaoRedefinir;
    private javax.swing.JButton BotaoRegistrarse;
    private javax.swing.JButton BotaoSair;
    private javax.swing.JTextField CampoEmail;
    private javax.swing.JPasswordField CampoNovaSenha;
    private javax.swing.JTextField CampoPalavraSegurança;
    private javax.swing.JLabel ImageFundo;
    // End of variables declaration//GEN-END:variables
}
