/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package adicionarimagem;
import DAO.ConexaoDAO;
import java.sql.Connection;
import java.sql.SQLException;
import java.sql.*;
import java.util.logging.Level;
import java.util.logging.Logger;
/**
 * Código para adicionar no banco de dados imagem
 * @author Vander
 */
public class imagem {
    Connection conn = new ConexaoDAO().conectaBD();
    /**
 * Código para adicionar no banco de dados imagem
 * @author Vander
 */
    public void inserir(Jogo jogo){
         String sql = "Update user set imagem = ? where status = ?";
        try {
            PreparedStatement pstm = conn.prepareStatement(sql);
            pstm.setBytes(1,jogo.getImagem());
            pstm.setInt(2,1);
            pstm.execute();
        
        } catch (SQLException ex) {
            Logger.getLogger(imagem.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}
