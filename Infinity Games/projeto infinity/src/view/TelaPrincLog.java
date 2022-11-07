
package view;

import DTO.UsuarioDTO;
import java.sql.ResultSet;
import Jogos.Hades;
import Jogos.Moonlighter;
import Jogos.Ori;
import Jogos.StardewValley;
import Jogos.ChildOfLight;
import Jogos.HollowKnigth;
import Jogos.HorizonTurbo;
import Jogos.OneShot;
import Jogos.PunchClub;
import Jogos.Terraria;


public class TelaPrincLog extends javax.swing.JFrame {


    public TelaPrincLog() {
        initComponents();
        setLocationRelativeTo(null); //CENTRALIZAR TELA
    }


    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        BotaoPerfil = new javax.swing.JButton();
        BotaoFechar = new javax.swing.JButton();
        BotaoPesquisar = new javax.swing.JButton();
        BotaoBiblioteca = new javax.swing.JButton();
        BotaoCarrinho = new javax.swing.JButton();
        BotaoDesconexao = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jButton5 = new javax.swing.JButton();
        jButton6 = new javax.swing.JButton();
        jButton7 = new javax.swing.JButton();
        jButton8 = new javax.swing.JButton();
        jButton9 = new javax.swing.JButton();
        jButton10 = new javax.swing.JButton();
        ImagemFundo = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(1200, 700));
        setUndecorated(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        BotaoPerfil.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/Icone Perfil tela Princ.png"))); // NOI18N
        BotaoPerfil.setBorder(null);
        BotaoPerfil.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotaoPerfilActionPerformed(evt);
            }
        });
        getContentPane().add(BotaoPerfil, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 50, 60, 50));

        BotaoFechar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/Captura de tela 2022-10-19 213715.png"))); // NOI18N
        BotaoFechar.setBorder(null);
        BotaoFechar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotaoFecharActionPerformed(evt);
            }
        });
        getContentPane().add(BotaoFechar, new org.netbeans.lib.awtextra.AbsoluteConstraints(1130, 0, 30, 30));

        BotaoPesquisar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/BotaoPesquisar.png"))); // NOI18N
        BotaoPesquisar.setBorder(null);
        getContentPane().add(BotaoPesquisar, new org.netbeans.lib.awtextra.AbsoluteConstraints(735, 54, 60, 45));

        BotaoBiblioteca.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/Icone Biblioteca.png"))); // NOI18N
        BotaoBiblioteca.setBorder(null);
        BotaoBiblioteca.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotaoBibliotecaActionPerformed(evt);
            }
        });
        getContentPane().add(BotaoBiblioteca, new org.netbeans.lib.awtextra.AbsoluteConstraints(920, 50, 50, 50));

        BotaoCarrinho.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/Icone Carrinho.png"))); // NOI18N
        BotaoCarrinho.setBorder(null);
        BotaoCarrinho.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotaoCarrinhoActionPerformed(evt);
            }
        });
        getContentPane().add(BotaoCarrinho, new org.netbeans.lib.awtextra.AbsoluteConstraints(1070, 53, 50, 40));

        BotaoDesconexao.setText("Desconectar");
        BotaoDesconexao.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotaoDesconexaoActionPerformed(evt);
            }
        });
        getContentPane().add(BotaoDesconexao, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 60, -1, -1));

        jButton1.setText("Hades");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 510, -1, -1));

        jButton2.setText("Stardew");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 510, -1, -1));

        jButton3.setText("MoonLighter");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton3, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 510, -1, -1));

        jButton4.setText("Ori");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton4, new org.netbeans.lib.awtextra.AbsoluteConstraints(790, 510, -1, -1));

        jButton5.setText("Child of Light");
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton5, new org.netbeans.lib.awtextra.AbsoluteConstraints(990, 510, -1, -1));

        jButton6.setText("Terraria");
        jButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton6ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton6, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 280, -1, -1));

        jButton7.setText("Hollow Knight");
        jButton7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton7ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton7, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 280, -1, -1));

        jButton8.setText("OneShot");
        jButton8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton8ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton8, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 280, -1, -1));

        jButton9.setText("Horizon");
        jButton9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton9ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton9, new org.netbeans.lib.awtextra.AbsoluteConstraints(790, 280, -1, -1));

        jButton10.setText("PunchClub");
        jButton10.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton10ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton10, new org.netbeans.lib.awtextra.AbsoluteConstraints(1000, 280, -1, -1));

        ImagemFundo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/TelaPrinc Depois Login.png"))); // NOI18N
        getContentPane().add(ImagemFundo, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void BotaoFecharActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotaoFecharActionPerformed
        UsuarioDTO objseg = new UsuarioDTO();
        DAO.UsuarioDAO objDAO = new DAO.UsuarioDAO();
        ResultSet rsusuariodao = objDAO.Deconnect(objseg);
        System.exit(0);
    }//GEN-LAST:event_BotaoFecharActionPerformed

    private void BotaoPerfilActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotaoPerfilActionPerformed
      Perfil obj = new Perfil();
      obj.setVisible(true);
      this.dispose();
  
       
    }//GEN-LAST:event_BotaoPerfilActionPerformed

    private void BotaoCarrinhoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotaoCarrinhoActionPerformed
       Carrinho obj = new Carrinho();
       obj.setVisible(true);
       this.dispose();
    }//GEN-LAST:event_BotaoCarrinhoActionPerformed

    private void BotaoBibliotecaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotaoBibliotecaActionPerformed
        Biblioteca obj = new Biblioteca();
        obj.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_BotaoBibliotecaActionPerformed

    private void BotaoDesconexaoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotaoDesconexaoActionPerformed
        String email,nome = null,senha = null,seg = null;

             UsuarioDTO objseg = new UsuarioDTO();
             DAO.UsuarioDAO objDAO = new DAO.UsuarioDAO();
             ResultSet rsusuariodao = objDAO.Deconnect(objseg);
             Login obj = new Login();
             obj.setVisible(true);
             this.dispose();
    }//GEN-LAST:event_BotaoDesconexaoActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        Hades obj = new Hades();
        obj.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        StardewValley obj = new StardewValley();
        obj.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        Moonlighter obj = new Moonlighter();
        obj.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        Ori obj = new Ori();
        obj.setVisible(true);
        this.dispose();                                           
    }//GEN-LAST:event_jButton4ActionPerformed

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
        ChildOfLight obj = new ChildOfLight();
        obj.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_jButton5ActionPerformed

    private void jButton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton6ActionPerformed
        Terraria obj = new Terraria();
        obj.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_jButton6ActionPerformed

    private void jButton7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton7ActionPerformed
        HollowKnigth obj = new HollowKnigth();
        obj.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_jButton7ActionPerformed

    private void jButton8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton8ActionPerformed
        OneShot obj = new OneShot();
        obj.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_jButton8ActionPerformed

    private void jButton9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton9ActionPerformed
        HorizonTurbo obj = new HorizonTurbo();
        obj.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_jButton9ActionPerformed

    private void jButton10ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton10ActionPerformed
        PunchClub obj = new PunchClub();
        obj.setVisible(true);
        this.dispose();    }//GEN-LAST:event_jButton10ActionPerformed

   

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BotaoBiblioteca;
    private javax.swing.JButton BotaoCarrinho;
    private javax.swing.JButton BotaoDesconexao;
    private javax.swing.JButton BotaoFechar;
    private javax.swing.JButton BotaoPerfil;
    private javax.swing.JButton BotaoPesquisar;
    private javax.swing.JLabel ImagemFundo;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton10;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton6;
    private javax.swing.JButton jButton7;
    private javax.swing.JButton jButton8;
    private javax.swing.JButton jButton9;
    // End of variables declaration//GEN-END:variables
}
