
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
        Hades = new javax.swing.JButton();
        StardewValley = new javax.swing.JButton();
        MoonLighter = new javax.swing.JButton();
        Ori = new javax.swing.JButton();
        ChildOfLight = new javax.swing.JButton();
        Terraria = new javax.swing.JButton();
        HollowKnight = new javax.swing.JButton();
        OneShot = new javax.swing.JButton();
        Horizon = new javax.swing.JButton();
        PunchClub = new javax.swing.JButton();
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

        Hades.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/Hades botao.png"))); // NOI18N
        Hades.setBorder(null);
        Hades.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                HadesActionPerformed(evt);
            }
        });
        getContentPane().add(Hades, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 420, -1, -1));

        StardewValley.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/Stardew Valey botao.png"))); // NOI18N
        StardewValley.setBorder(null);
        StardewValley.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                StardewValleyActionPerformed(evt);
            }
        });
        getContentPane().add(StardewValley, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 410, -1, -1));

        MoonLighter.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/MoonLigth botao.png"))); // NOI18N
        MoonLighter.setBorder(null);
        MoonLighter.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MoonLighterActionPerformed(evt);
            }
        });
        getContentPane().add(MoonLighter, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 410, -1, -1));

        Ori.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/Ori botao.png"))); // NOI18N
        Ori.setBorder(null);
        Ori.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                OriActionPerformed(evt);
            }
        });
        getContentPane().add(Ori, new org.netbeans.lib.awtextra.AbsoluteConstraints(750, 420, -1, -1));

        ChildOfLight.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/Child of Ligth botao.png"))); // NOI18N
        ChildOfLight.setBorder(null);
        ChildOfLight.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ChildOfLightActionPerformed(evt);
            }
        });
        getContentPane().add(ChildOfLight, new org.netbeans.lib.awtextra.AbsoluteConstraints(960, 420, -1, -1));

        Terraria.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/Terraria botao.png"))); // NOI18N
        Terraria.setBorder(null);
        Terraria.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TerrariaActionPerformed(evt);
            }
        });
        getContentPane().add(Terraria, new org.netbeans.lib.awtextra.AbsoluteConstraints(82, 182, -1, -1));

        HollowKnight.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/Hollow Knitght botao.png"))); // NOI18N
        HollowKnight.setBorder(null);
        HollowKnight.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                HollowKnightActionPerformed(evt);
            }
        });
        getContentPane().add(HollowKnight, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 182, -1, -1));

        OneShot.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/One Shot botao.png"))); // NOI18N
        OneShot.setBorder(null);
        OneShot.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                OneShotActionPerformed(evt);
            }
        });
        getContentPane().add(OneShot, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 180, -1, -1));

        Horizon.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/Horizon botao.png"))); // NOI18N
        Horizon.setBorder(null);
        Horizon.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                HorizonActionPerformed(evt);
            }
        });
        getContentPane().add(Horizon, new org.netbeans.lib.awtextra.AbsoluteConstraints(740, 180, -1, -1));

        PunchClub.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/Punch club botao.png"))); // NOI18N
        PunchClub.setBorder(null);
        PunchClub.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                PunchClubActionPerformed(evt);
            }
        });
        getContentPane().add(PunchClub, new org.netbeans.lib.awtextra.AbsoluteConstraints(950, 180, -1, -1));

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

    private void HadesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_HadesActionPerformed
        Hades obj = new Hades();
        obj.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_HadesActionPerformed

    private void StardewValleyActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_StardewValleyActionPerformed
        StardewValley obj = new StardewValley();
        obj.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_StardewValleyActionPerformed

    private void MoonLighterActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MoonLighterActionPerformed
        Moonlighter obj = new Moonlighter();
        obj.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_MoonLighterActionPerformed

    private void OriActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_OriActionPerformed
        Ori obj = new Ori();
        obj.setVisible(true);
        this.dispose();                                           
    }//GEN-LAST:event_OriActionPerformed

    private void ChildOfLightActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ChildOfLightActionPerformed
        ChildOfLight obj = new ChildOfLight();
        obj.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_ChildOfLightActionPerformed

    private void TerrariaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TerrariaActionPerformed
        Terraria obj = new Terraria();
        obj.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_TerrariaActionPerformed

    private void HollowKnightActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_HollowKnightActionPerformed
        HollowKnigth obj = new HollowKnigth();
        obj.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_HollowKnightActionPerformed

    private void OneShotActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_OneShotActionPerformed
        OneShot obj = new OneShot();
        obj.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_OneShotActionPerformed

    private void HorizonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_HorizonActionPerformed
        HorizonTurbo obj = new HorizonTurbo();
        obj.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_HorizonActionPerformed

    private void PunchClubActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_PunchClubActionPerformed
        PunchClub obj = new PunchClub();
        obj.setVisible(true);
        this.dispose();    }//GEN-LAST:event_PunchClubActionPerformed

   

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BotaoBiblioteca;
    private javax.swing.JButton BotaoCarrinho;
    private javax.swing.JButton BotaoDesconexao;
    private javax.swing.JButton BotaoFechar;
    private javax.swing.JButton BotaoPerfil;
    private javax.swing.JButton BotaoPesquisar;
    private javax.swing.JButton ChildOfLight;
    private javax.swing.JButton Hades;
    private javax.swing.JButton HollowKnight;
    private javax.swing.JButton Horizon;
    private javax.swing.JLabel ImagemFundo;
    private javax.swing.JButton MoonLighter;
    private javax.swing.JButton OneShot;
    private javax.swing.JButton Ori;
    private javax.swing.JButton PunchClub;
    private javax.swing.JButton StardewValley;
    private javax.swing.JButton Terraria;
    // End of variables declaration//GEN-END:variables
}
