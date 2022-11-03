
package DAOPerfil;

import DTO.UsuarioDTO;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;
import java.sql.*;

public class UsuarioDAO {
        Connection conn;

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
