package DAO;
import java.sql.Connection;
import java.sql.SQLException;
import javax.swing.JOptionPane;
import java.sql.*;

//Classe de conexão com o banco de dados

public class ConexaoDAO {
    /**
 * Classe de conexão com o banco de dados
 * @author Vander
 * @return
 */
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
