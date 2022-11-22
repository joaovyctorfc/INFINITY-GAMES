
package view;

import DTO.UsuarioDTO;
import java.sql.ResultSet;


public class TelaPrincipal extends javax.swing.JFrame {


    public TelaPrincipal() {
        initComponents();
         setLocationRelativeTo(null); //CENTRALIZAR TELA
    }


    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        BotaoPesquisar = new javax.swing.JButton();
        BotaoPerfil = new javax.swing.JButton();
        BotaoMinimizar = new javax.swing.JButton();
        BotaoFechar = new javax.swing.JButton();
        BotaoLogar = new javax.swing.JButton();
        BotaoRegistrar = new javax.swing.JButton();
        ImageFundo = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        BotaoPesquisar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/BotaoPesquisar.png"))); // NOI18N
        BotaoPesquisar.setToolTipText("");
        BotaoPesquisar.setBorder(null);
        BotaoPesquisar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotaoPesquisarActionPerformed(evt);
            }
        });
        getContentPane().add(BotaoPesquisar, new org.netbeans.lib.awtextra.AbsoluteConstraints(735, 54, 60, 45));

        BotaoPerfil.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/icone tela princ sem log.png"))); // NOI18N
        BotaoPerfil.setBorder(null);
        BotaoPerfil.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotaoPerfilActionPerformed(evt);
            }
        });
        getContentPane().add(BotaoPerfil, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 40, 57, 70));

        BotaoMinimizar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/Captura de tela 2022-10-19 214036.png"))); // NOI18N
        BotaoMinimizar.setBorder(null);
        getContentPane().add(BotaoMinimizar, new org.netbeans.lib.awtextra.AbsoluteConstraints(1080, 5, 22, 24));

        BotaoFechar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/Captura de tela 2022-10-19 213715.png"))); // NOI18N
        BotaoFechar.setBorder(null);
        BotaoFechar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotaoFecharActionPerformed(evt);
            }
        });
        getContentPane().add(BotaoFechar, new org.netbeans.lib.awtextra.AbsoluteConstraints(1130, 0, 30, 30));

        BotaoLogar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/Botao Logar.png"))); // NOI18N
        BotaoLogar.setText("Logar");
        BotaoLogar.setBorder(null);
        BotaoLogar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotaoLogarActionPerformed(evt);
            }
        });
        getContentPane().add(BotaoLogar, new org.netbeans.lib.awtextra.AbsoluteConstraints(1070, 60, 80, 30));

        BotaoRegistrar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/Botao Registrar.png"))); // NOI18N
        BotaoRegistrar.setBorder(null);
        BotaoRegistrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotaoRegistrarActionPerformed(evt);
            }
        });
        getContentPane().add(BotaoRegistrar, new org.netbeans.lib.awtextra.AbsoluteConstraints(895, 60, 90, 30));

        ImageFundo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/Tela Principal Sem Login .png"))); // NOI18N
        getContentPane().add(ImageFundo, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, -10, 1200, 720));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void BotaoRegistrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotaoRegistrarActionPerformed
  Registrar obj = new Registrar();
  obj.setVisible(true);
  this.dispose();
    }//GEN-LAST:event_BotaoRegistrarActionPerformed

    private void BotaoLogarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotaoLogarActionPerformed
   Login obj = new Login();
  obj.setVisible(true);
  this.dispose();
    }//GEN-LAST:event_BotaoLogarActionPerformed

    private void BotaoFecharActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotaoFecharActionPerformed
        UsuarioDTO objseg = new UsuarioDTO();
        DAO.UsuarioDAO objDAO = new DAO.UsuarioDAO();
        ResultSet rsusuariodao = objDAO.Deconnect(objseg);
        System.exit(0);
    }//GEN-LAST:event_BotaoFecharActionPerformed

    private void BotaoPerfilActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotaoPerfilActionPerformed
  Login obj = new Login();
  obj.setVisible(true);
  this.dispose();
    }//GEN-LAST:event_BotaoPerfilActionPerformed

    private void BotaoPesquisarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotaoPesquisarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_BotaoPesquisarActionPerformed

 

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BotaoFechar;
    private javax.swing.JButton BotaoLogar;
    private javax.swing.JButton BotaoMinimizar;
    private javax.swing.JButton BotaoPerfil;
    private javax.swing.JButton BotaoPesquisar;
    private javax.swing.JButton BotaoRegistrar;
    private javax.swing.JLabel ImageFundo;
    // End of variables declaration//GEN-END:variables
}
