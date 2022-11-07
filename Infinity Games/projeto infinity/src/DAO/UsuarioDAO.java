package DAO;

import DTO.UsuarioDTO;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;
import java.sql.*;

public class UsuarioDAO {

    Connection conn;

    public ResultSet AutenticacaoUsuario(UsuarioDTO obj){
        conn = new ConexaoDAO().conectaBD();
        try {
            String sql = "Select * from user where email = ? and senha = ?";
            String sql1 = "Update user set status = ?";
            
            PreparedStatement pstm = conn.prepareStatement(sql);
            pstm.setString(1, obj.getEmail());
            pstm.setString(2, obj.getSenha());
            
            PreparedStatement pstm1 = conn.prepareStatement(sql1);
            pstm1.setInt(1, 1);
            
            ResultSet rs = pstm.executeQuery();
            pstm1.execute();
            pstm1.close();
            return rs;
            
        } catch (SQLException erro) {
            JOptionPane.showMessageDialog(null,erro + "AutenticaçãoUsuário");
            }
            return null;
     }
    public ResultSet VerificacaoSeguranca(UsuarioDTO obj){
        conn = new ConexaoDAO().conectaBD();
        try {
            String sql = "Select * from user where email = ? and seg = ?";
            PreparedStatement pstm = conn.prepareStatement(sql);
            pstm.setString(1, obj.getEmail());
            pstm.setString(2, obj.getSeg());
            
            ResultSet rs = pstm.executeQuery();
            return rs;
            
        } catch (SQLException erro) {
            JOptionPane.showMessageDialog(null,erro + "ConexaoDAO");
            }
            return null;
     }
    public void alterarSenha(UsuarioDTO obj){
     String sql = "update user set senha = ? where email = ? and seg = ?";
     String sql1 = "update registro set senha = ? where email = ? and seg = ?";
     conn = new ConexaoDAO().conectaBD();
        try {
            
            PreparedStatement pstm = conn.prepareStatement(sql);
            pstm.setString(1, obj.getSenha());
            pstm.setString(2, obj.getEmail());
            pstm.setString(3, obj.getSeg());
            pstm.execute();
            pstm.close();
            
            PreparedStatement pstm1 = conn.prepareStatement(sql1);
            pstm1.setString(1, obj.getSenha());
            pstm1.setString(2, obj.getEmail());
            pstm1.setString(3, obj.getSeg());
            pstm1.execute();
            pstm1.close();
        
        } catch (SQLException erro) {
            JOptionPane.showMessageDialog(null,erro + "AlterarSenha");
            }
    }
    
    public ResultSet ListarUsuario(UsuarioDTO obj){
             
               String nome = null,senha = null,seg = null,email = null;
        try
	   {
		   Class.forName("com.mysql.cj.jdbc.Driver");
		   Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/infinitygames?user=root&password=");
		   java.sql.Statement stm = con.createStatement();
		   ResultSet res = stm.executeQuery("Select * from registro");
		   while(res.next())
		   {
			   nome = res.getString("nome");
			   senha = res.getString("senha");
			   seg = res.getString("seg");
			   email = res.getString("email");
		   }
                   return res;
	   }
	   catch(ClassNotFoundException ex)
	   {
		   JOptionPane.showMessageDialog(null, ex.getMessage(),"Erro", JOptionPane.ERROR_MESSAGE);
	   }
	   catch(SQLException ex)
	   {
		   JOptionPane.showMessageDialog(null, ex.getMessage(),"Erro", JOptionPane.ERROR_MESSAGE);
           }
         return null;
 }
       public ResultSet VerificacaoEmail(UsuarioDTO obj){
        conn = new ConexaoDAO().conectaBD();
        try {
            String sql = "Select * from user where status = 1";
            PreparedStatement pstm = conn.prepareStatement(sql);
            
            ResultSet rs = pstm.executeQuery();
            return rs;
            
        } catch (SQLException erro) {
            JOptionPane.showMessageDialog(null,erro + "VerificaçãoEmail");
            }
            return null;
     }
    
    
   }
