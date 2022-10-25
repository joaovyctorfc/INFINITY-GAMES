
package view;

import java.sql.*;
import javax.swing.JOptionPane;


public class Registrar extends javax.swing.JFrame {
  private String nome,senha,email;
//private Splash splash;
  
    public Registrar() {
        initComponents();
        setLocationRelativeTo(null); //CENTRALIZAR TELA
       // splash = new Splash();
    }


    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        campoEmail = new javax.swing.JTextField();
        campoSenha = new javax.swing.JPasswordField();
        campoNome = new javax.swing.JTextField();
        BotaoRegistrar = new javax.swing.JButton();
        BotaoJaPossuo = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        LabelTotal = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

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
        getContentPane().add(campoEmail, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 263, 280, 25));

        campoSenha.setBackground(new java.awt.Color(217, 217, 217));
        campoSenha.setBorder(null);
        getContentPane().add(campoSenha, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 330, 280, 20));

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
        getContentPane().add(campoNome, new org.netbeans.lib.awtextra.AbsoluteConstraints(32, 196, 280, 25));

        BotaoRegistrar.setForeground(new java.awt.Color(255, 255, 255));
        BotaoRegistrar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/Captura de tela 2022-10-19 194216.png"))); // NOI18N
        BotaoRegistrar.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        BotaoRegistrar.setBorderPainted(false);
        BotaoRegistrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotaoRegistrarActionPerformed(evt);
            }
        });
        getContentPane().add(BotaoRegistrar, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 408, 180, 50));

        BotaoJaPossuo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/Captura de tela 2022-10-19 195315.png"))); // NOI18N
        BotaoJaPossuo.setBorder(null);
        BotaoJaPossuo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotaoJaPossuoActionPerformed(evt);
            }
        });
        getContentPane().add(BotaoJaPossuo, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 470, -1, -1));

        jButton3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/Captura de tela 2022-10-19 213715.png"))); // NOI18N
        jButton3.setBorderPainted(false);
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton3, new org.netbeans.lib.awtextra.AbsoluteConstraints(660, 8, 30, 30));

        LabelTotal.setBackground(new java.awt.Color(255, 255, 255));
        LabelTotal.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/Registrar Usuário (1).png"))); // NOI18N
        getContentPane().add(LabelTotal, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void campoEmailActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_campoEmailActionPerformed
  
    }//GEN-LAST:event_campoEmailActionPerformed

    private void BotaoRegistrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotaoRegistrarActionPerformed
          nome = campoNome.getText();
	  email = campoEmail.getText();
          senha = campoSenha.getText();
		if(nome.equals("")||email.equals("")||senha.equals("")){
                    JOptionPane.showMessageDialog(null,"Erro para realizar o cadastro!!!","Erro",JOptionPane.ERROR_MESSAGE);
                } else{	
	try
        {
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection con = DriverManager.getConnection("jdbc:mysql://localhost/infinitygames","root","");
		Statement stm = con.createStatement();
		if(stm.executeUpdate("INSERT into registro (nome,email,senha) values('"+nome+"','"+email+"','"+senha+"')")!=0)
		{
			JOptionPane.showMessageDialog(null,"Cadastro realizado com sucesso!!!","Sucesso",JOptionPane.INFORMATION_MESSAGE);
			campoNome.setText("");
			campoEmail.setText("");
                        campoSenha.setText("");
		}
		if(stm.executeUpdate("INSERT into user (email,senha) values('"+email+"','"+senha+"')")!=0)
		{
			campoEmail.setText("");
                        campoSenha.setText("");
		}
                else
		{
			JOptionPane.showMessageDialog(null,"Erro para realizar o cadastro!!!","Erro",JOptionPane.ERROR_MESSAGE);
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
    
    }//GEN-LAST:event_BotaoRegistrarActionPerformed
    }
    private void campoNomeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_campoNomeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_campoNomeActionPerformed

    private void BotaoJaPossuoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotaoJaPossuoActionPerformed
      Login login = new Login(); 
      login.setVisible(true);
      this.dispose();
    }//GEN-LAST:event_BotaoJaPossuoActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
       System.exit(0); // TODO add your handling code here:
    }//GEN-LAST:event_jButton3ActionPerformed




    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BotaoJaPossuo;
    private javax.swing.JButton BotaoRegistrar;
    private javax.swing.JLabel LabelTotal;
    private javax.swing.JTextField campoEmail;
    private javax.swing.JTextField campoNome;
    private javax.swing.JPasswordField campoSenha;
    private javax.swing.JButton jButton3;
    // End of variables declaration//GEN-END:variables
}
