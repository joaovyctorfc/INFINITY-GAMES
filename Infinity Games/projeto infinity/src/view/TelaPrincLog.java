
package view;

import DAO.ConexaoDAO;
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
import UTIL.ManipularImagem;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;
import java.sql.*;
import java.sql.PreparedStatement;
import javax.swing.DefaultListModel;
import javax.swing.JOptionPane;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;


public class TelaPrincLog extends javax.swing.JFrame {
        Connection conn;
        DefaultListModel MODELO;
        int Enter = 0;
        private String n;
        UsuarioDTO retorno = null;
        String [] Config;
        
        public TelaPrincLog() {
        initComponents();
        setLocationRelativeTo(null); //CENTRALIZAR TELA
        Lista.setVisible(false);
        MODELO = new DefaultListModel();
        Lista.setModel(MODELO);
        
        n = campoPesquisa.getText();
            
        java.sql.Connection conn = new ConexaoDAO().conectaBD();
            try {
                 String sql1 = "Select (imagem) from user where status = ?";
                 PreparedStatement pstm1 = conn.prepareStatement(sql1);
                 pstm1.setInt(1,1);
                 ResultSet rs1 = pstm1.executeQuery();
                if(rs1.next()){
               retorno = new UsuarioDTO();
               retorno.setImagem(rs1.getBytes("imagem"));
               }
                 ManipularImagem.exibirImagemLabel(retorno.getImagem(),lblImg);
            } catch (SQLException erro) {
                JOptionPane.showMessageDialog(null,erro + "icone");
            } 
    }


    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        campoPesquisa = new javax.swing.JTextField();
        Lista = new javax.swing.JList<>();
        BotaoPerfil = new javax.swing.JButton();
        BotaoFechar = new javax.swing.JButton();
        BotaoPesquisar = new javax.swing.JButton();
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
        jPanel1 = new javax.swing.JPanel();
        lblImg = new javax.swing.JLabel();
        ImagemFundo = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(1200, 700));
        setUndecorated(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        campoPesquisa.setBorder(null);
        campoPesquisa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                campoPesquisaActionPerformed(evt);
            }
        });
        campoPesquisa.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                campoPesquisaKeyReleased(evt);
            }
        });
        getContentPane().add(campoPesquisa, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 60, 330, 30));

        Lista.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        Lista.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                ListaMousePressed(evt);
            }
        });
        getContentPane().add(Lista, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 90, 330, 80));

        BotaoPerfil.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/Icone Perfil tela Princ.png"))); // NOI18N
        BotaoPerfil.setBorder(null);
        BotaoPerfil.setPreferredSize(new java.awt.Dimension(50, 50));
        BotaoPerfil.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotaoPerfilActionPerformed(evt);
            }
        });
        getContentPane().add(BotaoPerfil, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 50, -1, 50));

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
        BotaoPesquisar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotaoPesquisarActionPerformed(evt);
            }
        });
        getContentPane().add(BotaoPesquisar, new org.netbeans.lib.awtextra.AbsoluteConstraints(745, 54, 40, 40));

        BotaoDesconexao.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/botaoDesconectar.png"))); // NOI18N
        BotaoDesconexao.setBorder(null);
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

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lblImg.setText("Sem foto de Perfil");
        jPanel1.add(lblImg, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 110, 80));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(990, 40, 110, 80));

        ImagemFundo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/Telas principal nova.png"))); // NOI18N
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

    private void campoPesquisaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_campoPesquisaActionPerformed
        Lista.setVisible(false);
        Enter = 1;
    }//GEN-LAST:event_campoPesquisaActionPerformed

    private void campoPesquisaKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_campoPesquisaKeyReleased
        if(Enter == 0){
        ListaDePesquisa();
        }
        else{
        Enter = 0;
        }
    }//GEN-LAST:event_campoPesquisaKeyReleased

    private void ListaMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ListaMousePressed
        
        ResultadoPesquisa();
        Lista.setVisible(false);
    }//GEN-LAST:event_ListaMousePressed

    private void BotaoPesquisarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotaoPesquisarActionPerformed
        n = campoPesquisa.getText();
        if(n.equals("Hollow Knight")){
        HollowKnigth obj = new HollowKnigth();
        obj.setVisible(true);
        this.dispose();
        }
        if(n.equals("hollow knight")){
        HollowKnigth obj = new HollowKnigth();
        obj.setVisible(true);
        this.dispose();
        }
        if(n.equals("hollow")){
        HollowKnigth obj = new HollowKnigth();
        obj.setVisible(true);
        this.dispose();
        }
        if(n.equals("Hollow")){
        HollowKnigth obj = new HollowKnigth();
        obj.setVisible(true);
        this.dispose();
        }
        if(n.equals("Ho")){
        HollowKnigth obj = new HollowKnigth();
        obj.setVisible(true);
        this.dispose();
        }
        if(n.equals("ho")){
        HollowKnigth obj = new HollowKnigth();
        obj.setVisible(true);
        this.dispose();
        }
        if(n.equals("Hades")){
        Hades obj = new Hades();
        obj.setVisible(true);
        this.dispose();
        }
        if(n.equals("hades")){
        Hades obj = new Hades();
        obj.setVisible(true);
        this.dispose();
        }
        if(n.equals("Child of Light")){
        ChildOfLight obj = new ChildOfLight();
        obj.setVisible(true);
        this.dispose();
        }
        if(n.equals("Child Of Light")){
        ChildOfLight obj = new ChildOfLight();
        obj.setVisible(true);
        this.dispose();
        }
        if(n.equals("child of light")){
        ChildOfLight obj = new ChildOfLight();
        obj.setVisible(true);
        this.dispose();
        }
        if(n.equals("child")){
        ChildOfLight obj = new ChildOfLight();
        obj.setVisible(true);
        this.dispose();
        }
        if(n.equals("Child")){
        ChildOfLight obj = new ChildOfLight();
        obj.setVisible(true);
        this.dispose();
        }
        if(n.equals("Horizon Turbo")){
        HorizonTurbo obj = new HorizonTurbo();
        obj.setVisible(true);
        this.dispose();
        }
        if(n.equals("horizon turbo")){
        HorizonTurbo obj = new HorizonTurbo();
        obj.setVisible(true);
        this.dispose();
        }
        if(n.equals("horizon")){
        HorizonTurbo obj = new HorizonTurbo();
        obj.setVisible(true);
        this.dispose();
        }
        if(n.equals("Horizon")){
        HorizonTurbo obj = new HorizonTurbo();
        obj.setVisible(true);
        this.dispose();
        }
        if(n.equals("Moonlighter")){
        Moonlighter obj = new Moonlighter();
        obj.setVisible(true);
        this.dispose();
        }
        if(n.equals("moonlighter")){
        Moonlighter obj = new Moonlighter();
        obj.setVisible(true);
        this.dispose();
        }
        if(n.equals("MoonLighter")){
        Moonlighter obj = new Moonlighter();
        obj.setVisible(true);
        this.dispose();
        }
        if(n.equals("OneShot")){
        OneShot obj = new OneShot();
        obj.setVisible(true);
        this.dispose();
        }
        if(n.equals("oneshot")){
        OneShot obj = new OneShot();
        obj.setVisible(true);
        this.dispose();
        }
        if(n.equals("one")){
        OneShot obj = new OneShot();
        obj.setVisible(true);
        this.dispose();
        }
        if(n.equals("One")){
        OneShot obj = new OneShot();
        obj.setVisible(true);
        this.dispose();
        }
        if(n.equals("Ori and the Blind Forest")){
        Ori obj = new Ori();
        obj.setVisible(true);
        this.dispose();
        }
        if(n.equals("ori and the blind forest")){
        Ori obj = new Ori();
        obj.setVisible(true);
        this.dispose();
        }
        if(n.equals("Ori")){
        Ori obj = new Ori();
        obj.setVisible(true);
        this.dispose();
        }
        if(n.equals("ori")){
        Ori obj = new Ori();
        obj.setVisible(true);
        this.dispose();
        }
        if(n.equals("Punch Club")){
        PunchClub obj = new PunchClub();
        obj.setVisible(true);
        this.dispose();
        }
        if(n.equals("PunchClub")){
        PunchClub obj = new PunchClub();
        obj.setVisible(true);
        this.dispose();
        }
        if(n.equals("punchclub")){
        PunchClub obj = new PunchClub();
        obj.setVisible(true);
        this.dispose();
        }
        if(n.equals("punch club")){
        PunchClub obj = new PunchClub();
        obj.setVisible(true);
        this.dispose();
        }
        if(n.equals("punch")){
        PunchClub obj = new PunchClub();
        obj.setVisible(true);
        this.dispose();
        }
        if(n.equals("Punch")){
        PunchClub obj = new PunchClub();
        obj.setVisible(true);
        this.dispose();
        }
        if(n.equals("Stardew Valley")){
        StardewValley obj = new StardewValley();
        obj.setVisible(true);
        this.dispose();
        }
        if(n.equals("stardew valley")){
        StardewValley obj = new StardewValley();
        obj.setVisible(true);
        this.dispose();
        }
        if(n.equals("Stardew")){
        StardewValley obj = new StardewValley();
        obj.setVisible(true);
        this.dispose();
        }
        if(n.equals("stardew")){
        StardewValley obj = new StardewValley();
        obj.setVisible(true);
        this.dispose();
        }
        if(n.equals("Terraria")){
        Terraria obj = new Terraria();
        obj.setVisible(true);
        this.dispose();
        }
        if(n.equals("terraria")){
        Terraria obj = new Terraria();
        obj.setVisible(true);
        this.dispose();
        }
    }//GEN-LAST:event_BotaoPesquisarActionPerformed

   

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BotaoDesconexao;
    private javax.swing.JButton BotaoFechar;
    private javax.swing.JButton BotaoPerfil;
    private javax.swing.JButton BotaoPesquisar;
    private javax.swing.JButton ChildOfLight;
    private javax.swing.JButton Hades;
    private javax.swing.JButton HollowKnight;
    private javax.swing.JButton Horizon;
    private javax.swing.JLabel ImagemFundo;
    private javax.swing.JList<String> Lista;
    private javax.swing.JButton MoonLighter;
    private javax.swing.JButton OneShot;
    private javax.swing.JButton Ori;
    private javax.swing.JButton PunchClub;
    private javax.swing.JButton StardewValley;
    private javax.swing.JButton Terraria;
    private javax.swing.JTextField campoPesquisa;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel lblImg;
    // End of variables declaration//GEN-END:variables

    public void ListaDePesquisa(){
         conn = (Connection) new ConexaoDAO().conectaBD();
        try {
            String sql = "select * from jogos where nome like '"+campoPesquisa.getText()+"%' ORDER BY nome";
            PreparedStatement pstm = conn.prepareStatement(sql);
            ResultSet rs = pstm.executeQuery();
            MODELO.removeAllElements();
            int v = 0;
            Config = new String[4];
            while(rs.next() & v < 4){
                MODELO.addElement(rs.getString("nome"));
                Config[v] = rs.getString("nome");
                v++;
            }
            if(v>=1){
            Lista.setVisible(true);
            }
            else{
            Lista.setVisible(false);
            }
           
            
        } catch (SQLException erro) {
            JOptionPane.showMessageDialog(null,erro + "ListaDePesquisa");
        }
    }
      
      public void ResultadoPesquisa(){
        n = campoPesquisa.getText();
        if(n.equals("Hollow Knight")){
        HollowKnigth obj = new HollowKnigth();
        obj.setVisible(true);
        this.dispose();
        }
        if(n.equals("hollow knight")){
        HollowKnigth obj = new HollowKnigth();
        obj.setVisible(true);
        this.dispose();
        }
        if(n.equals("hollow")){
        HollowKnigth obj = new HollowKnigth();
        obj.setVisible(true);
        this.dispose();
        }
        if(n.equals("Hollow")){
        HollowKnigth obj = new HollowKnigth();
        obj.setVisible(true);
        this.dispose();
        }
        if(n.equals("Hol")){
        HollowKnigth obj = new HollowKnigth();
        obj.setVisible(true);
        this.dispose();
        }
        if(n.equals("hol")){
        HollowKnigth obj = new HollowKnigth();
        obj.setVisible(true);
        this.dispose();
        }
        if(n.equals("Hades")){
        Hades obj = new Hades();
        obj.setVisible(true);
        this.dispose();
        }
        if(n.equals("hades")){
        Hades obj = new Hades();
        obj.setVisible(true);
        this.dispose();
        }
        if(n.equals("Child of Light")){
        ChildOfLight obj = new ChildOfLight();
        obj.setVisible(true);
        this.dispose();
        }
        if(n.equals("Child Of Light")){
        ChildOfLight obj = new ChildOfLight();
        obj.setVisible(true);
        this.dispose();
        }
        if(n.equals("child of light")){
        ChildOfLight obj = new ChildOfLight();
        obj.setVisible(true);
        this.dispose();
        }
        if(n.equals("child")){
        ChildOfLight obj = new ChildOfLight();
        obj.setVisible(true);
        this.dispose();
        }
        if(n.equals("Child")){
        ChildOfLight obj = new ChildOfLight();
        obj.setVisible(true);
        this.dispose();
        }
        if(n.equals("Horizon Turbo")){
        HorizonTurbo obj = new HorizonTurbo();
        obj.setVisible(true);
        this.dispose();
        }
        if(n.equals("horizon turbo")){
        HorizonTurbo obj = new HorizonTurbo();
        obj.setVisible(true);
        this.dispose();
        }
        if(n.equals("horizon")){
        HorizonTurbo obj = new HorizonTurbo();
        obj.setVisible(true);
        this.dispose();
        }
        if(n.equals("Horizon")){
        HorizonTurbo obj = new HorizonTurbo();
        obj.setVisible(true);
        this.dispose();
        }
        if(n.equals("hor")){
        HorizonTurbo obj = new HorizonTurbo();
        obj.setVisible(true);
        this.dispose();
        }
        if(n.equals("Hor")){
        HorizonTurbo obj = new HorizonTurbo();
        obj.setVisible(true);
        this.dispose();
        }
        if(n.equals("Moonlighter")){
        Moonlighter obj = new Moonlighter();
        obj.setVisible(true);
        this.dispose();
        }
        if(n.equals("moonlighter")){
        Moonlighter obj = new Moonlighter();
        obj.setVisible(true);
        this.dispose();
        }
        if(n.equals("MoonLighter")){
        Moonlighter obj = new Moonlighter();
        obj.setVisible(true);
        this.dispose();
        }
        if(n.equals("OneShot")){
        OneShot obj = new OneShot();
        obj.setVisible(true);
        this.dispose();
        }
        if(n.equals("oneshot")){
        OneShot obj = new OneShot();
        obj.setVisible(true);
        this.dispose();
        }
        if(n.equals("one")){
        OneShot obj = new OneShot();
        obj.setVisible(true);
        this.dispose();
        }
        if(n.equals("One")){
        OneShot obj = new OneShot();
        obj.setVisible(true);
        this.dispose();
        }
        if(n.equals("Ori and the Blind Forest")){
        Ori obj = new Ori();
        obj.setVisible(true);
        this.dispose();
        }
        if(n.equals("ori and the blind forest")){
        Ori obj = new Ori();
        obj.setVisible(true);
        this.dispose();
        }
        if(n.equals("Ori")){
        Ori obj = new Ori();
        obj.setVisible(true);
        this.dispose();
        }
        if(n.equals("ori")){
        Ori obj = new Ori();
        obj.setVisible(true);
        this.dispose();
        }
        if(n.equals("Punch Club")){
        PunchClub obj = new PunchClub();
        obj.setVisible(true);
        this.dispose();
        }
        if(n.equals("PunchClub")){
        PunchClub obj = new PunchClub();
        obj.setVisible(true);
        this.dispose();
        }
        if(n.equals("punchclub")){
        PunchClub obj = new PunchClub();
        obj.setVisible(true);
        this.dispose();
        }
        if(n.equals("punch club")){
        PunchClub obj = new PunchClub();
        obj.setVisible(true);
        this.dispose();
        }
        if(n.equals("punch")){
        PunchClub obj = new PunchClub();
        obj.setVisible(true);
        this.dispose();
        }
        if(n.equals("Punch")){
        PunchClub obj = new PunchClub();
        obj.setVisible(true);
        this.dispose();
        }
        if(n.equals("Stardew Valley")){
        StardewValley obj = new StardewValley();
        obj.setVisible(true);
        this.dispose();
        }
        if(n.equals("stardew valley")){
        StardewValley obj = new StardewValley();
        obj.setVisible(true);
        this.dispose();
        }
        if(n.equals("Stardew")){
        StardewValley obj = new StardewValley();
        obj.setVisible(true);
        this.dispose();
        }
        if(n.equals("stardew")){
        StardewValley obj = new StardewValley();
        obj.setVisible(true);
        this.dispose();
        }
        if(n.equals("Terraria")){
        Terraria obj = new Terraria();
        obj.setVisible(true);
        this.dispose();
        }
        if(n.equals("terraria")){
        Terraria obj = new Terraria();
        obj.setVisible(true);
        this.dispose();
        }
        if(n.equals("Te")){
        Terraria obj = new Terraria();
        obj.setVisible(true);
        this.dispose();
        }
        if(n.equals("te")){
        Terraria obj = new Terraria();
        obj.setVisible(true);
        this.dispose();
        }
      }
}
