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
            
            PreparedStatement pstm = conn.prepareStatement(sql);
            pstm.setString(1, obj.getEmail());
            pstm.setString(2, obj.getSenha());
            
            ResultSet rs = pstm.executeQuery();
            return rs;
            
        } catch (SQLException erro) {
            JOptionPane.showMessageDialog(null,erro + "ConexaoDAO");
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
     String sql = "update user set senha = ?";
     String sql1 = "update registro set senha = ?";
     conn = new ConexaoDAO().conectaBD();
        try {
            
            PreparedStatement pstm = conn.prepareStatement(sql);
            PreparedStatement pstm1 = conn.prepareStatement(sql1);
            pstm.setString(1, obj.getSenha());
            pstm1.setString(1, obj.getSenha());
            pstm.execute();
            pstm.close();
            pstm1.execute();
            pstm1.close();
            
            
            
        } catch (SQLException erro) {
            JOptionPane.showMessageDialog(null,erro + "AlterarSenha");
            }
    }
    
   }
