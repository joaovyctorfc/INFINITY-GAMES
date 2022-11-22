
package view;

import DAO.UsuarioDAO;
import DTO.UsuarioDTO;
import java.sql.ResultSet;
import java.sql.SQLException;
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

        BotaoSair = new javax.swing.JButton();
        CampoEmail = new javax.swing.JTextField();
        BotaoRedefinir = new javax.swing.JButton();
        CampoPalavraSegurança = new javax.swing.JTextField();
        CampoNovaSenha = new javax.swing.JPasswordField();
        jTextField1 = new javax.swing.JTextField();
        jTextField2 = new javax.swing.JTextField();
        ImageFundo = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

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

        jTextField1.setEditable(false);
        jTextField1.setBackground(new java.awt.Color(255, 255, 255));
        jTextField1.setBorder(null);
        getContentPane().add(jTextField1, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 460, 130, 30));

        jTextField2.setEditable(false);
        jTextField2.setBackground(new java.awt.Color(255, 255, 255));
        jTextField2.setBorder(null);
        getContentPane().add(jTextField2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 460, 130, 30));

        ImageFundo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/RedefinirSenha Tela.png"))); // NOI18N
        getContentPane().add(ImageFundo, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void CampoEmailActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CampoEmailActionPerformed
        
    }//GEN-LAST:event_CampoEmailActionPerformed

    private void BotaoRedefinirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotaoRedefinirActionPerformed
        //vai pegar o conteúdo dos campos de texto
        email = CampoEmail.getText();
        seg = CampoPalavraSegurança.getText();
        senha = CampoNovaSenha.getText();
        //cada if vai verificar se algum dos campos estiver vazio se sim vai aparecer a msg
        if(email.equals("")){
                 JOptionPane.showMessageDialog(null,"Email em branco!!!","Erro",JOptionPane.ERROR_MESSAGE);
                }
        if(seg.equals("")){
                 JOptionPane.showMessageDialog(null,"Segurança em branco!!!","Erro",JOptionPane.ERROR_MESSAGE);
                }
        if(senha.equals("")){
                 JOptionPane.showMessageDialog(null,"Nova senha em branco!!!","Erro",JOptionPane.ERROR_MESSAGE);
                }
     
     else{
        
        try {
            String email,seg;
            //vai pegar os 2 texto dos campos email e seg e verificar se existem no banco de dados
            email = CampoEmail.getText();
            seg = CampoPalavraSegurança.getText();
            
            
            UsuarioDTO objseg = new UsuarioDTO();
            objseg.setEmail(email);
            objseg.setSeg(seg);

            UsuarioDAO objDAO = new UsuarioDAO();
            ResultSet rsusuariodao = objDAO.VerificacaoSeguranca(objseg);
            if(rsusuariodao.next())
            {
              //vai realizar a troca de senha se o passo anterior for concluido
              UsuarioDTO objsenha = new UsuarioDTO();
              objsenha.setEmail(email);
              objsenha.setSeg(seg);
              objsenha.setSenha(senha);

              UsuarioDAO obj2Senha = new UsuarioDAO();
              obj2Senha.alterarSenha(objsenha);

              UsuarioDAO objSenha2 = new UsuarioDAO();
              objSenha2.alterarSenha(objsenha);
              JOptionPane.showMessageDialog(null,"Senha trocada com sucesso!!!","Sucesso",JOptionPane.INFORMATION_MESSAGE);
              //vai abrir a tela Login
              Login obj = new Login();
              obj.setVisible(true);
              this.dispose();
            }
            else
            {
            JOptionPane.showMessageDialog(null,"Email ou palavra de segurança errados!!!","Erro",JOptionPane.ERROR_MESSAGE);
            }
        } catch (SQLException erro) {
            JOptionPane.showMessageDialog(null, "EsqueceuSenha");
        }
        }
     
    }//GEN-LAST:event_BotaoRedefinirActionPerformed

    private void CampoPalavraSegurançaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CampoPalavraSegurançaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_CampoPalavraSegurançaActionPerformed

    private void BotaoSairActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotaoSairActionPerformed
      //Sair do programa
        System.exit(0);
    }//GEN-LAST:event_BotaoSairActionPerformed

    /**
     * @param args the command line arguments
     */


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BotaoRedefinir;
    private javax.swing.JButton BotaoSair;
    private javax.swing.JTextField CampoEmail;
    private javax.swing.JPasswordField CampoNovaSenha;
    private javax.swing.JTextField CampoPalavraSegurança;
    private javax.swing.JLabel ImageFundo;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField2;
    // End of variables declaration//GEN-END:variables
}
