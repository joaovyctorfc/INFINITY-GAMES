
package view;



import DTO.UsuarioDTO;
import DAO.UsuarioDAO;
import adicionarimagem.NewJFrame;
import java.sql.ResultSet;
import java.sql.SQLException;

import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;




public class Perfil extends javax.swing.JFrame {

 
    public Perfil() {
        
        initComponents();
      setLocationRelativeTo(null); //CENTRALIZAR TELA
      listarVendas();
      try {
              String email,nome = null,senha = null,seg = null;

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
                    CampoNome.setText(nome);
                    CampoEmail.setText(email);
                    CampoPalavra.setText(seg);
                    CampoSenha.setText(senha);
            }
             } catch (SQLException erro) {
            JOptionPane.showMessageDialog(null,erro +"Revelar");
        }
    }


    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        CampoNome = new javax.swing.JTextField();
        CampoEmail = new javax.swing.JTextField();
        CampoPalavra = new javax.swing.JTextField();
        CampoSenha1 = new javax.swing.JTextField();
        BotaoInicio = new javax.swing.JButton();
        BotaoFechar = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tabelaVendas = new javax.swing.JTable();
        jTextField1 = new javax.swing.JTextField();
        ImagemFundo = new javax.swing.JLabel();
        CampoSenha = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        CampoNome.setEditable(false);
        CampoNome.setBackground(new java.awt.Color(82, 113, 255));
        CampoNome.setFont(new java.awt.Font("Arial", 1, 11)); // NOI18N
        CampoNome.setForeground(new java.awt.Color(255, 255, 255));
        CampoNome.setBorder(null);
        CampoNome.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CampoNomeActionPerformed(evt);
            }
        });
        getContentPane().add(CampoNome, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 238, 410, 30));

        CampoEmail.setEditable(false);
        CampoEmail.setBackground(new java.awt.Color(82, 113, 255));
        CampoEmail.setFont(new java.awt.Font("Arial", 1, 11)); // NOI18N
        CampoEmail.setForeground(new java.awt.Color(255, 255, 255));
        CampoEmail.setBorder(null);
        getContentPane().add(CampoEmail, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 346, 430, 30));

        CampoPalavra.setEditable(false);
        CampoPalavra.setBackground(new java.awt.Color(82, 113, 255));
        CampoPalavra.setFont(new java.awt.Font("Arial", 1, 11)); // NOI18N
        CampoPalavra.setForeground(new java.awt.Color(255, 255, 255));
        CampoPalavra.setBorder(null);
        getContentPane().add(CampoPalavra, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 564, 430, 30));

        CampoSenha1.setEditable(false);
        CampoSenha1.setBackground(new java.awt.Color(82, 113, 255));
        CampoSenha1.setFont(new java.awt.Font("Arial", 1, 11)); // NOI18N
        CampoSenha1.setForeground(new java.awt.Color(255, 255, 255));
        CampoSenha1.setText("* * * * * * * * * * * * ");
        CampoSenha1.setBorder(null);
        CampoSenha1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CampoSenha1ActionPerformed(evt);
            }
        });
        getContentPane().add(CampoSenha1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 457, 430, 30));

        BotaoInicio.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/Botao Inicio tela perfil.png"))); // NOI18N
        BotaoInicio.setBorder(null);
        BotaoInicio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotaoInicioActionPerformed(evt);
            }
        });
        getContentPane().add(BotaoInicio, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 40, -1, -1));

        BotaoFechar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/Captura de tela 2022-10-19 213715.png"))); // NOI18N
        BotaoFechar.setBorder(null);
        BotaoFechar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotaoFecharActionPerformed(evt);
            }
        });
        getContentPane().add(BotaoFechar, new org.netbeans.lib.awtextra.AbsoluteConstraints(1120, 0, 30, 30));

        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/trocarfoto.png"))); // NOI18N
        jButton1.setBorder(null);
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(800, 583, 190, 50));

        jButton2.setForeground(new java.awt.Color(255, 255, 255));
        jButton2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/trocardados.png"))); // NOI18N
        jButton2.setBorder(null);
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(800, 505, 180, 50));

        jLabel1.setText("Pedidos");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(870, 150, -1, -1));

        tabelaVendas.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null},
                {null, null},
                {null, null},
                {null, null}
            },
            new String [] {
                "", ""
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(tabelaVendas);
        if (tabelaVendas.getColumnModel().getColumnCount() > 0) {
            tabelaVendas.getColumnModel().getColumn(0).setResizable(false);
            tabelaVendas.getColumnModel().getColumn(1).setResizable(false);
        }

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(670, 180, 450, 270));

        jTextField1.setEditable(false);
        jTextField1.setBackground(new java.awt.Color(255, 255, 255));
        jTextField1.setBorder(null);
        getContentPane().add(jTextField1, new org.netbeans.lib.awtextra.AbsoluteConstraints(680, 500, 130, 130));

        ImagemFundo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/Tela Perfil.png"))); // NOI18N
        getContentPane().add(ImagemFundo, new org.netbeans.lib.awtextra.AbsoluteConstraints(-10, 0, 1200, 700));

        CampoSenha.setEditable(false);
        CampoSenha.setBackground(new java.awt.Color(82, 113, 255));
        CampoSenha.setFont(new java.awt.Font("Arial", 1, 11)); // NOI18N
        CampoSenha.setForeground(new java.awt.Color(255, 255, 255));
        CampoSenha.setBorder(null);
        CampoSenha.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CampoSenhaActionPerformed(evt);
            }
        });
        getContentPane().add(CampoSenha, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 455, 430, 30));

        pack();
    }// </editor-fold>//GEN-END:initComponents

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

    private void CampoNomeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CampoNomeActionPerformed
                    
    }//GEN-LAST:event_CampoNomeActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
          NewJFrame obj = new NewJFrame();
          obj.setVisible(true);
          
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        NovosDados obj = new NovosDados();
        obj.setVisible(true);
        
    }//GEN-LAST:event_jButton2ActionPerformed

    private void CampoSenhaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CampoSenhaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_CampoSenhaActionPerformed

    private void CampoSenha1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CampoSenha1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_CampoSenha1ActionPerformed



    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BotaoFechar;
    private javax.swing.JButton BotaoInicio;
    private javax.swing.JTextField CampoEmail;
    private javax.swing.JTextField CampoNome;
    private javax.swing.JTextField CampoPalavra;
    private javax.swing.JTextField CampoSenha;
    private javax.swing.JTextField CampoSenha1;
    private javax.swing.JLabel ImagemFundo;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTable tabelaVendas;
    // End of variables declaration//GEN-END:variables

 private void listarVendas(){
     try {
           UsuarioDAO objusuariodao = new UsuarioDAO();
           DefaultTableModel model = (DefaultTableModel) tabelaVendas.getModel();
           model.setNumRows(0);
           ArrayList<UsuarioDTO> Lista = objusuariodao.PesquisarCompras();
           for(int num = 0;num<Lista.size();num++){
           model.addRow(new Object[]{
             
              Lista.get(num).getJogo(),
              Lista.get(num).getCodigo()
           });
           }
     } catch (Exception erro) {
         JOptionPane.showMessageDialog(null,erro + "listarVendas");
     }

 }


}
