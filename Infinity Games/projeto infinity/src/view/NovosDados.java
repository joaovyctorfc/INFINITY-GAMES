/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package view;

import DAO.UsuarioDAO;
import DTO.UsuarioDTO;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;

/**
 *    Tela para a pessoa alterar qualquer um de seus dados de usuário
 * @author Vander
 */
public class NovosDados extends javax.swing.JFrame {

    String email,seg,nome,senha;
    
    public NovosDados() {
        initComponents();
        setLocationRelativeTo(null); //CENTRALIZAR TELA
        try {
              String email = null,nome = null,senha = null,seg = null;

             UsuarioDTO objseg = new UsuarioDTO();
             DAO.UsuarioDAO objDAO = new DAO.UsuarioDAO();
             ResultSet rsusuariodao = objDAO.RevelacaoPerfil(objseg);
             while(rsusuariodao.next())
            {
		   {
			   nome = rsusuariodao.getString("nome");
			   email = rsusuariodao.getString("email");
                           senha = rsusuariodao.getString("senha");
			   seg = rsusuariodao.getString("seg");
		   }
                    campoNome.setText(nome);
                    campoEmail.setText(email);
                    campoSeg.setText(seg);
                    campoSenha.setText(senha);
            }
             } catch (SQLException erro) {
            JOptionPane.showMessageDialog(null,erro +"Revelar");
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

        campoNome = new javax.swing.JTextField();
        campoEmail = new javax.swing.JTextField();
        campoSenha = new javax.swing.JTextField();
        campoSeg = new javax.swing.JTextField();
        BotaoTrocarDados = new javax.swing.JButton();
        BotaoInicio = new javax.swing.JButton();
        ImagemFundo = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setUndecorated(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        campoNome.setBackground(new java.awt.Color(82, 113, 255));
        campoNome.setForeground(new java.awt.Color(255, 255, 255));
        campoNome.setBorder(null);
        getContentPane().add(campoNome, new org.netbeans.lib.awtextra.AbsoluteConstraints(88, 87, 290, 20));

        campoEmail.setBackground(new java.awt.Color(82, 113, 255));
        campoEmail.setForeground(new java.awt.Color(255, 255, 255));
        campoEmail.setBorder(null);
        getContentPane().add(campoEmail, new org.netbeans.lib.awtextra.AbsoluteConstraints(88, 160, 280, 20));

        campoSenha.setBackground(new java.awt.Color(82, 113, 255));
        campoSenha.setForeground(new java.awt.Color(255, 255, 255));
        campoSenha.setBorder(null);
        getContentPane().add(campoSenha, new org.netbeans.lib.awtextra.AbsoluteConstraints(88, 232, 270, 20));

        campoSeg.setBackground(new java.awt.Color(82, 113, 255));
        campoSeg.setForeground(new java.awt.Color(255, 255, 255));
        campoSeg.setBorder(null);
        getContentPane().add(campoSeg, new org.netbeans.lib.awtextra.AbsoluteConstraints(88, 304, 270, 20));

        BotaoTrocarDados.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/trocardados.png"))); // NOI18N
        BotaoTrocarDados.setBorder(null);
        BotaoTrocarDados.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotaoTrocarDadosActionPerformed(evt);
            }
        });
        getContentPane().add(BotaoTrocarDados, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 346, -1, 40));

        BotaoInicio.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/botaoinicioperfil.png"))); // NOI18N
        BotaoInicio.setToolTipText("");
        BotaoInicio.setBorder(null);
        BotaoInicio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotaoInicioActionPerformed(evt);
            }
        });
        getContentPane().add(BotaoInicio, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 355, 90, 29));

        ImagemFundo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/Dados.png"))); // NOI18N
        getContentPane().add(ImagemFundo, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void BotaoTrocarDadosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotaoTrocarDadosActionPerformed
        String email,seg,nome,senha;
        email = campoEmail.getText();
        seg = campoSeg.getText();
        senha = campoSenha.getText();
        nome = campoNome.getText();
        UsuarioDTO objseg = new UsuarioDTO();
        objseg.setEmail(email);
        objseg.setSeg(seg);
        objseg.setSenha(senha);
        objseg.setNome(nome);
        UsuarioDAO objDAO = new UsuarioDAO();
        objDAO.alterarDados(objseg);
        
        
            
    }//GEN-LAST:event_BotaoTrocarDadosActionPerformed

    private void BotaoInicioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotaoInicioActionPerformed
        TelaPrincLog obj = new TelaPrincLog();
       obj.setVisible(true);
       this.dispose();
    }//GEN-LAST:event_BotaoInicioActionPerformed

<<<<<<< HEAD
    /**
     * @param args the command line arguments
     */
=======
  
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
            java.util.logging.Logger.getLogger(NovosDados.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(NovosDados.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(NovosDados.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(NovosDados.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
>>>>>>> 09bceb99cd67f3920d8b927cce3623dfe5d6d31c


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BotaoInicio;
    private javax.swing.JButton BotaoTrocarDados;
    private javax.swing.JLabel ImagemFundo;
    private javax.swing.JTextField campoEmail;
    private javax.swing.JTextField campoNome;
    private javax.swing.JTextField campoSeg;
    private javax.swing.JTextField campoSenha;
    // End of variables declaration//GEN-END:variables
}
