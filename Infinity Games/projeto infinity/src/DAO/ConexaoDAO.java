package DAO;
import DTO.UsuarioDTO;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;
import java.sql.*;

public class ConexaoDAO {
  public Connection conectaBD(){
       Connection conn = null;
            try {
                String url = "jdbc:mysql://localhost:3306/infinitygames?user=root&password=";
                conn = DriverManager.getConnection(url);
            } catch (SQLException erro) {
                JOptionPane.showMessageDialog(null,erro + "ConexaoDAO");
            }
            return conn;
}
}
