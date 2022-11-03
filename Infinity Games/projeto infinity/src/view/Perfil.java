
package view;

import DAOPerfil.UsuarioDAO;
import DAOPerfil.ConexaoDAO;
import DTO.UsuarioDTO;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JOptionPane;



public class Perfil extends javax.swing.JFrame {

 
    public Perfil() {
        
        initComponents();
      setLocationRelativeTo(null); //CENTRALIZAR TELA
    }


    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        CampoNome = new javax.swing.JTextField();
        CampoEmail = new javax.swing.JTextField();
        AreaTexto = new javax.swing.JScrollPane();
        Campotexto = new javax.swing.JTextArea();
        CampoPalavra = new javax.swing.JTextField();
        CampoSenha = new javax.swing.JTextField();
        BotaoInicio = new javax.swing.JButton();
        BotaoFechar = new javax.swing.JButton();
        ImagemFundo = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        CampoNome.setBackground(new java.awt.Color(82, 113, 255));
        CampoNome.setFont(new java.awt.Font("Arial", 1, 11)); // NOI18N
        CampoNome.setBorder(null);
        CampoNome.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CampoNomeActionPerformed(evt);
            }
        });
        getContentPane().add(CampoNome, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 230, 430, 20));

        CampoEmail.setBackground(new java.awt.Color(82, 113, 255));
        CampoEmail.setFont(new java.awt.Font("Arial", 1, 11)); // NOI18N
        CampoEmail.setBorder(null);
        getContentPane().add(CampoEmail, new org.netbeans.lib.awtextra.AbsoluteConstraints(51, 350, 430, 20));

        Campotexto.setColumns(20);
        Campotexto.setRows(5);
        AreaTexto.setViewportView(Campotexto);

        getContentPane().add(AreaTexto, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 220, -1, -1));

        CampoPalavra.setBackground(new java.awt.Color(82, 113, 255));
        CampoPalavra.setFont(new java.awt.Font("Arial", 1, 11)); // NOI18N
        CampoPalavra.setBorder(null);
        getContentPane().add(CampoPalavra, new org.netbeans.lib.awtextra.AbsoluteConstraints(51, 568, 430, 20));

        CampoSenha.setBackground(new java.awt.Color(82, 113, 255));
        CampoSenha.setFont(new java.awt.Font("Arial", 1, 11)); // NOI18N
        CampoSenha.setBorder(null);
        getContentPane().add(CampoSenha, new org.netbeans.lib.awtextra.AbsoluteConstraints(51, 459, 430, 20));

        BotaoInicio.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/Botao Inicio tela perfil.png"))); // NOI18N
        BotaoInicio.setBorder(null);
        BotaoInicio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotaoInicioActionPerformed(evt);
            }
        });
        getContentPane().add(BotaoInicio, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 40, -1, -1));

        BotaoFechar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/Captura de tela 2022-10-19 213715.png"))); // NOI18N
        BotaoFechar.setBorder(null);
        BotaoFechar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotaoFecharActionPerformed(evt);
            }
        });
        getContentPane().add(BotaoFechar, new org.netbeans.lib.awtextra.AbsoluteConstraints(1140, 0, 30, 30));

        ImagemFundo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/Tela Perfil.png"))); // NOI18N
        getContentPane().add(ImagemFundo, new org.netbeans.lib.awtextra.AbsoluteConstraints(6, 0, -1, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void BotaoFecharActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotaoFecharActionPerformed
        System.exit(0);
    }//GEN-LAST:event_BotaoFecharActionPerformed

    private void BotaoInicioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotaoInicioActionPerformed
       TelaPrincLog obj = new TelaPrincLog();
       obj.setVisible(true);
       this.dispose();
    }//GEN-LAST:event_BotaoInicioActionPerformed

    private void CampoNomeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CampoNomeActionPerformed
 
	try
        {
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection con = DriverManager.getConnection("jdbc:mysql://localhost/infinitygames","root","");
		Statement stm = con.createStatement();
		ResultSet res = stm.executeQuery("SELECT * from registro");
		{
			CampoNome.setText("nome");
		}
                
	}
	catch(ClassNotFoundException ex)
	{
		JOptionPane.showMessageDialog(null,ex.getMessage(),"Erro",JOptionPane.ERROR_MESSAGE);
	}
	catch(SQLException ex)
	{
		JOptionPane.showMessageDialog(null,ex.getMessage(),"Erro",JOptionPane.ERROR_MESSAGE);
	}
    }//GEN-LAST:event_CampoNomeActionPerformed



    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JScrollPane AreaTexto;
    private javax.swing.JButton BotaoFechar;
    private javax.swing.JButton BotaoInicio;
    private javax.swing.JTextField CampoEmail;
    private javax.swing.JTextField CampoNome;
    private javax.swing.JTextField CampoPalavra;
    private javax.swing.JTextField CampoSenha;
    private javax.swing.JTextArea Campotexto;
    private javax.swing.JLabel ImagemFundo;
    // End of variables declaration//GEN-END:variables
}
