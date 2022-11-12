/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package adicionarimagem;
import DAO.ConexaoDAO;
import DTO.UsuarioDTO;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;
import java.sql.*;
import java.util.logging.Level;
import java.util.logging.Logger;

public class imagem {
    Connection conn = new ConexaoDAO().conectaBD();
    public void inserir(Jogo jogo){
         String sql = "insert into jogos(nome,descri,valor,status,imagem) values(?,?,?,?,?)";
        try {
            PreparedStatement pstm = conn.prepareStatement(sql);
            pstm.setString(1,"Child of Light");
            pstm.setString(2,"Aurora, uma jovem da Áustria de 1895, desperta no continente perdido de conto de fadas da Lemúria. Para voltar para casa, ela deve lutar contra as criaturas sombrias da Rainha da Noite, que roubaram o sol, a lua e as estrelas. Em jogo não está apenas a Lemúria, mas o verdadeiro destino de Aurora.\n" +
"\n" +
"UMA AVENTURA A SUA ESPERA!\n" +
"Criado por uma talentosa equipe da Ubisoft Montreal usando o UbiArt Framework, Child of Light é um RPG inspirado em contos de fadas complementado com uma história cuidadosamente elaborada em versos e rimas. Entre em uma pintura viva, o cenário de tirar o fôlego da Lemúria é um convite para explorar um mundo perdido há muito tempo.\n" +
"\n" +
"ENTRE NO MUNDO DE LEMÚRIA!\n" +
"Ao longo de sua jornada pela Lemúria, você encontrará muitas criaturas excêntricas, de espíritos da floresta a ratos falantes, bruxas malvadas e serpentes marinhas malignas. Descubra uma vasta terra com locais icônicos e masmorras emocionantes que evoluirão à medida que Aurora recupera as luzes roubadas.");
            pstm.setInt(3,45);
            pstm.setInt(4,0);
            pstm.setBytes(5,jogo.getImagem());
            pstm.execute();
        
        } catch (SQLException ex) {
            Logger.getLogger(imagem.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}
