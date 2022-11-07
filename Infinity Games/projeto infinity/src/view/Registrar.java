
package view;

import java.sql.*;
import javax.swing.JOptionPane;
import view.Login;


public class Registrar extends javax.swing.JFrame {
  private String nome,senha,email,seg;
//private Splash splash;
  
    public Registrar() {
        initComponents();
        setLocationRelativeTo(null); //CENTRALIZAR TELA
       // splash = new Splash();
    }


    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        BotaoJaPossuoConta = new javax.swing.JButton();
        BotaoRegistrar = new javax.swing.JButton();
        campoEmail = new javax.swing.JTextField();
        campoSenha = new javax.swing.JPasswordField();
        campoNome = new javax.swing.JTextField();
        campoPalavraSegurança = new javax.swing.JTextField();
        BotaoFechar = new javax.swing.JButton();
        ImagemFundo = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        BotaoJaPossuoConta.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/Já possuo conta!.png"))); // NOI18N
        BotaoJaPossuoConta.setBorder(null);
        BotaoJaPossuoConta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotaoJaPossuoContaActionPerformed(evt);
            }
        });
        getContentPane().add(BotaoJaPossuoConta, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 475, 110, 20));

        BotaoRegistrar.setForeground(new java.awt.Color(255, 255, 255));
        BotaoRegistrar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/Captura de tela 2022-10-19 194216.png"))); // NOI18N
        BotaoRegistrar.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        BotaoRegistrar.setBorderPainted(false);
        BotaoRegistrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotaoRegistrarActionPerformed(evt);
            }
        });
        getContentPane().add(BotaoRegistrar, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 420, 180, 50));

        campoEmail.setBackground(new java.awt.Color(217, 217, 217));
        campoEmail.setFont(new java.awt.Font("Arial", 1, 11)); // NOI18N
        campoEmail.setActionCommand("<Not Set>");
        campoEmail.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        campoEmail.setName(""); // NOI18N
        campoEmail.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                campoEmailActionPerformed(evt);
            }
        });
        getContentPane().add(campoEmail, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 240, 280, 20));

        campoSenha.setBackground(new java.awt.Color(217, 217, 217));
        campoSenha.setBorder(null);
        campoSenha.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                campoSenhaActionPerformed(evt);
            }
        });
        getContentPane().add(campoSenha, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 310, 280, 20));

        campoNome.setBackground(new java.awt.Color(217, 217, 217));
        campoNome.setFont(new java.awt.Font("Arial", 1, 11)); // NOI18N
        campoNome.setActionCommand("<Not Set>");
        campoNome.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        campoNome.setName(""); // NOI18N
        campoNome.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                campoNomeActionPerformed(evt);
            }
        });
        getContentPane().add(campoNome, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 180, 280, 20));

        campoPalavraSegurança.setBackground(new java.awt.Color(217, 217, 217));
        campoPalavraSegurança.setFont(new java.awt.Font("Arial", 1, 11)); // NOI18N
        campoPalavraSegurança.setBorder(null);
        campoPalavraSegurança.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                campoPalavraSegurançaActionPerformed(evt);
            }
        });
        getContentPane().add(campoPalavraSegurança, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 374, 280, 20));

        BotaoFechar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/Captura de tela 2022-10-19 213715.png"))); // NOI18N
        BotaoFechar.setBorderPainted(false);
        BotaoFechar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotaoFecharActionPerformed(evt);
            }
        });
        getContentPane().add(BotaoFechar, new org.netbeans.lib.awtextra.AbsoluteConstraints(660, 8, 30, 30));

        ImagemFundo.setBackground(new java.awt.Color(255, 255, 255));
        ImagemFundo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/Registrar Usuário (2).png"))); // NOI18N
        getContentPane().add(ImagemFundo, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void campoEmailActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_campoEmailActionPerformed
  
    }//GEN-LAST:event_campoEmailActionPerformed

    private void BotaoRegistrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotaoRegistrarActionPerformed
          nome = campoNome.getText();
	  email = campoEmail.getText();
          seg = campoPalavraSegurança.getText();
          senha = campoSenha.getText();
		if(nome.equals("")||email.equals("")||senha.equals("")||seg.equals("")){
                    JOptionPane.showMessageDialog(null,"Erro para realizar o cadastro!!!","Erro",JOptionPane.ERROR_MESSAGE);
                } else{	
	try
        {
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection con = DriverManager.getConnection("jdbc:mysql://localhost/infinitygames","root","");
		Statement stm = con.createStatement();
		if(stm.executeUpdate("INSERT into registro (nome,email,senha,seg) values('"+nome+"','"+email+"','"+senha+"','"+seg+"')")!=0)
		{
			JOptionPane.showMessageDialog(null,"Cadastro realizado com sucesso!!!","Sucesso",JOptionPane.INFORMATION_MESSAGE);
			campoNome.setText("");
			campoEmail.setText("");
                        campoSenha.setText("");
                        campoPalavraSegurança.setText("");
		}
		if(stm.executeUpdate("INSERT into user (email,senha,seg,nome,status) values('"+email+"','"+senha+"','"+seg+"','"+nome+"',0)")!=0)
		{
			campoEmail.setText("");
                        campoSenha.setText("");
                        campoPalavraSegurança.setText("");
                        campoNome.setText("");
		}
                else
		{
			JOptionPane.showMessageDialog(null,"Erro para realizar o cadastro!!!","Erro",JOptionPane.ERROR_MESSAGE);
		}
                
	}
	catch(ClassNotFoundException ex)
	{
		JOptionPane.showMessageDialog(null,ex.getMessage(),"Registrar",JOptionPane.ERROR_MESSAGE);
	}
	catch(SQLException ex)
	{
		JOptionPane.showMessageDialog(null,ex.getMessage(),"Registrar",JOptionPane.ERROR_MESSAGE);
	}
    
    }//GEN-LAST:event_BotaoRegistrarActionPerformed
    }
    private void campoNomeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_campoNomeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_campoNomeActionPerformed

    private void BotaoFecharActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotaoFecharActionPerformed
       System.exit(0); // TODO add your handling code here:
    }//GEN-LAST:event_BotaoFecharActionPerformed

    private void campoPalavraSegurançaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_campoPalavraSegurançaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_campoPalavraSegurançaActionPerformed

    private void BotaoJaPossuoContaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotaoJaPossuoContaActionPerformed
        Login obj = new Login(); 
      obj.setVisible(true);
      this.dispose();
    }//GEN-LAST:event_BotaoJaPossuoContaActionPerformed

    private void campoSenhaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_campoSenhaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_campoSenhaActionPerformed




    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BotaoFechar;
    private javax.swing.JButton BotaoJaPossuoConta;
    private javax.swing.JButton BotaoRegistrar;
    private javax.swing.JLabel ImagemFundo;
    private javax.swing.JTextField campoEmail;
    private javax.swing.JTextField campoNome;
    private javax.swing.JTextField campoPalavraSegurança;
    private javax.swing.JPasswordField campoSenha;
    // End of variables declaration//GEN-END:variables
}
