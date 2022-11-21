package DAO;

import DTO.UsuarioDTO;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;
import java.sql.*;
import java.util.ArrayList;



public class UsuarioDAO {

    Connection conn;
    ArrayList<UsuarioDTO> Lista = new ArrayList<>();
    
    public ResultSet AutenticacaoUsuario(UsuarioDTO obj){
        conn = new ConexaoDAO().conectaBD();
        try {
            String sql = "Select * from user where email = ? and senha = ?";
            String sql1 = "Update user set status = ? where email = ? and senha = ?";
            String sql2 = "Update vendas set status = ? where email = ?";
            
            PreparedStatement pstm = conn.prepareStatement(sql);
            pstm.setString(1, obj.getEmail());
            pstm.setString(2, obj.getSenha());
            
            PreparedStatement pstm1 = conn.prepareStatement(sql1);
            pstm1.setInt(1, 1);
            pstm1.setString(2, obj.getEmail());
            pstm1.setString(3, obj.getSenha());
            
            PreparedStatement pstm2 = conn.prepareStatement(sql2);
            pstm2.setInt(1, 1);
            pstm2.setString(2, obj.getEmail());
            
            ResultSet rs = pstm.executeQuery();
            pstm1.execute();
            pstm2.execute();
            pstm1.close();
            pstm2.close();
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
            JOptionPane.showMessageDialog(null,erro + "VerificaçãoSegurança");
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
    
    public void SelecionarDados(UsuarioDTO obj){
     String sql = "Select * from user where status = ?";
     
     conn = new ConexaoDAO().conectaBD();
        try {
            
            PreparedStatement pstm = conn.prepareStatement(sql);
            pstm.setInt(1, 1);
            ResultSet rs = pstm.executeQuery();
            while(rs.next()){
            obj.getSenha();
            obj.getNome();
            obj.getEmail();
            obj.getSeg();
            }
        
        } catch (SQLException erro) {
            JOptionPane.showMessageDialog(null,erro + "AlterarSenha");
            }
    }
    
    public ResultSet alterarDados(UsuarioDTO obj){
     String sql = "update user set senha = ?, nome = ?, email = ?, seg = ? where status = ?";
     
     conn = new ConexaoDAO().conectaBD();
        try {
            
            PreparedStatement pstm = conn.prepareStatement(sql);
            pstm.setString(1, obj.getSenha());
            pstm.setString(2, obj.getNome());
            pstm.setString(3, obj.getEmail());
            pstm.setString(4, obj.getSeg());
            pstm.setInt(5, 1);
            pstm.execute();
            pstm.close();
            
            
        
        } catch (SQLException erro) {
            JOptionPane.showMessageDialog(null,erro + "AlterarDados");
            }
        return null;
    }
    
       public ResultSet RevelacaoPerfil(UsuarioDTO obj){
        conn = new ConexaoDAO().conectaBD();
        try {
            String sql = "Select * from user where status = 1";
            PreparedStatement pstm = conn.prepareStatement(sql);
            
            ResultSet rs = pstm.executeQuery();
            return rs;
            
        } catch (SQLException erro) {
            JOptionPane.showMessageDialog(null,erro + "RevelacaoPerfil");
            }
            return null;
     }
       public ResultSet Deconnect(UsuarioDTO obj){
       conn = new ConexaoDAO().conectaBD();
        try {
            String sql = "Update user set status = ?";
            String sql1 = "Update jogos set status = ?";
            String sql2 = "Update vendas set status = ?";
            PreparedStatement pstm = conn.prepareStatement(sql);
            pstm.setInt(1, 0);
            pstm.execute();
            pstm.close();
            PreparedStatement pstm1 = conn.prepareStatement(sql1);
            pstm1.setInt(1, 0);
            pstm1.execute();
            pstm1.close();
            PreparedStatement pstm2 = conn.prepareStatement(sql2);
            pstm2.setInt(1, 0);
            pstm2.execute();
            pstm2.close();
        } 
        catch (SQLException erro) {
            JOptionPane.showMessageDialog(null,erro + "Deconnect");
        }
       
        return null;
       }
       
       public ResultSet Cancelamento(UsuarioDTO obj){
       conn = new ConexaoDAO().conectaBD();
        try {
            String sql1 = "Update jogos set status = ?";
            PreparedStatement pstm1 = conn.prepareStatement(sql1);
            pstm1.setInt(1, 0);
            pstm1.execute();
            pstm1.close();
        } 
        catch (SQLException erro) {
            JOptionPane.showMessageDialog(null,erro + "Deconnect");
        }
       
        return null;
       }

       public ResultSet Hades(UsuarioDTO obj){
        conn = new ConexaoDAO().conectaBD();
        try {
            String sql = "update jogos set status = ? where nome = ? and valor = ?";
            PreparedStatement pstm = conn.prepareStatement(sql);
            pstm.setInt(1, 1);
            pstm.setString(2,"Hades");
            pstm.setInt(3, 48);
            pstm.execute();
            pstm.close();
            
            
            
        } catch (SQLException erro) {
            JOptionPane.showMessageDialog(null,erro + "Hades");
            }
            return null;
     }
       public ResultSet HollowKnight(UsuarioDTO obj){
        conn = new ConexaoDAO().conectaBD();
        try {
            String sql = "update jogos set status = ? where nome = ? and valor = ?";
            PreparedStatement pstm = conn.prepareStatement(sql);
            pstm.setInt(1, 1);
            pstm.setString(2,"Hollow Knight");
            pstm.setInt(3, 28);
            pstm.execute();
            pstm.close();
            
            
        } catch (SQLException erro) {
            JOptionPane.showMessageDialog(null,erro + "HollowKnight");
            }
            return null;
     }
       public ResultSet Terraria(UsuarioDTO obj){
        conn = new ConexaoDAO().conectaBD();
        try {
            String sql = "update jogos set status = ? where nome = ? and valor = ?";
            
            PreparedStatement pstm = conn.prepareStatement(sql);
            pstm.setInt(1, 1);
            pstm.setString(2,"Terraria");
            pstm.setInt(3, 20);
            pstm.execute();
            pstm.close();
            
        } catch (SQLException erro) {
            JOptionPane.showMessageDialog(null,erro + "Terraria");
            }
            return null;
     }
       public ResultSet OneShot(UsuarioDTO obj){
        conn = new ConexaoDAO().conectaBD();
        try {
            String sql = "update jogos set status = ? where nome = ? and valor = ?";
           
            PreparedStatement pstm = conn.prepareStatement(sql);
            pstm.setInt(1, 1);
            pstm.setString(2,"OneShot");
            pstm.setInt(3, 20);
            pstm.execute();
            pstm.close();
            
        } catch (SQLException erro) {
            JOptionPane.showMessageDialog(null,erro + "OneShot");
            }
            return null;
     }
       public ResultSet HorizonChaseTurbo(UsuarioDTO obj){
        conn = new ConexaoDAO().conectaBD();
        try {
            String sql = "update jogos set status = ? where nome = ? and valor = ?";
           
            PreparedStatement pstm = conn.prepareStatement(sql);
            pstm.setInt(1, 1);
            pstm.setString(2,"Horizon Chase Turbo");
            pstm.setInt(3, 50);
            pstm.execute();
            pstm.close();
            
        } catch (SQLException erro) {
            JOptionPane.showMessageDialog(null,erro + "HorizonChaseTurbo");
            }
            return null;
     }
       public ResultSet PunchClub(UsuarioDTO obj){
        conn = new ConexaoDAO().conectaBD();
        try {
            String sql = "update jogos set status = ? where nome = ? and valor = ?";
            
            PreparedStatement pstm = conn.prepareStatement(sql);
            pstm.setInt(1, 1);
            pstm.setString(2,"Punch Club");
            pstm.setInt(3, 20);
            pstm.execute();
            pstm.close();
            
        } catch (SQLException erro) {
            JOptionPane.showMessageDialog(null,erro + "PunchClub");
            }
            return null;
     }
       public ResultSet StardewValley(UsuarioDTO obj){
        conn = new ConexaoDAO().conectaBD();
        try {
            String sql = "update jogos set status = ? where nome = ? and valor = ?";
            
            PreparedStatement pstm = conn.prepareStatement(sql);
            pstm.setInt(1, 1);
            pstm.setString(2,"Stardew Valley");
            pstm.setInt(3, 25);
            pstm.execute();
            pstm.close();
            
        } catch (SQLException erro) {
            JOptionPane.showMessageDialog(null,erro + "StardewValley");
            }
            return null;
     }
       public ResultSet MoonLighter(UsuarioDTO obj){
        conn = new ConexaoDAO().conectaBD();
        try {
            String sql = "update jogos set status = ? where nome = ? and valor = ?";
            
            PreparedStatement pstm = conn.prepareStatement(sql);
            pstm.setInt(1, 1);
            pstm.setString(2,"Moonlighter");
            pstm.setInt(3, 10);
            pstm.execute();
            pstm.close();
            
        } catch (SQLException erro) {
            JOptionPane.showMessageDialog(null,erro + "MoonLighter");
            }
            return null;
     }
       public ResultSet Ori(UsuarioDTO obj){
        conn = new ConexaoDAO().conectaBD();
        try {
            String sql = "update jogos set status = ? where nome = ? and valor = ?";
          
            PreparedStatement pstm = conn.prepareStatement(sql);
            pstm.setInt(1, 1);
            pstm.setString(2,"Ori and the Blind Forest");
            pstm.setInt(3, 60);
            pstm.execute();
            pstm.close();
            
        } catch (SQLException erro) {
            JOptionPane.showMessageDialog(null,erro + "Ori");
            }
            return null;
     }
       public ResultSet Child(UsuarioDTO obj){
        conn = new ConexaoDAO().conectaBD();
        try {
            String sql = "update jogos set status = ? where nome = ? and valor = ?";
           
            PreparedStatement pstm = conn.prepareStatement(sql);
            pstm.setInt(1, 1);
            pstm.setString(2,"Child of Light");
            pstm.setInt(3, 45);
            pstm.execute();
            pstm.close();
            
        } catch (SQLException erro) {
            JOptionPane.showMessageDialog(null,erro + "Child");
            }
            return null;
     }
     public ArrayList<UsuarioDTO> PesquisarCompras(){
        String sql = "Select * from vendas where status = ?";
        conn = new ConexaoDAO().conectaBD();
         try {
             PreparedStatement pstm = conn.prepareStatement(sql);
             pstm.setInt(1, 1);
             ResultSet rs = pstm.executeQuery();
             while(rs.next()){
                 UsuarioDTO objusuariodto = new UsuarioDTO();
                 
                 objusuariodto.setJogo(rs.getString("jogo"));
                 objusuariodto.setCodigo(rs.getString("codigo"));
                 Lista.add(objusuariodto);
             }
             
         } catch (SQLException erro) {
             JOptionPane.showMessageDialog(null,erro + "PesquisarCompras");
         }
       return Lista;
     }
     public ResultSet DadosUsuario(UsuarioDTO obj){
        conn = new DAO.ConexaoDAO().conectaBD();
        try {
            String sql = "Select * from registro where email = ? and senha = ?";
            
            PreparedStatement pstm = conn.prepareStatement(sql);
            pstm.setString(1, obj.getNome());
            pstm.setString(2, obj.getEmail());
            pstm.setString(3, obj.getSenha());
            pstm.setString(3, obj.getSeg());
            
            ResultSet rs = pstm.executeQuery();
            return rs;
            
        } catch (SQLException erro) {
            JOptionPane.showMessageDialog(null,erro + "ConexaoDAO");
            }
            return null;
     }
}
