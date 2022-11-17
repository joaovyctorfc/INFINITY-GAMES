/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package adicionarimagem;
import DAO.ConexaoDAO;
import adicionarimagem.Jogo;
import adicionarimagem.imagem;
import java.awt.AlphaComposite;
import java.awt.Graphics2D;
import java.awt.image.BufferedImage;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.IOException;
import java.sql.Connection;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import javax.swing.filechooser.FileNameExtensionFilter;

/**
 *
 * @author Vander
 */
public class NewJFrame extends javax.swing.JFrame {

    Connection conn = new ConexaoDAO().conectaBD();
    private File imagem;
    private imagem conexao = new imagem();
    private Jogo jogo;
    public NewJFrame() {
        initComponents();
        setLocationRelativeTo(null); //CENTRALIZAR TELA
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jButton1 = new javax.swing.JButton();
        painelimagem = new javax.swing.JPanel();
        lblimagem = new javax.swing.JLabel();
        jButton2 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jButton1.setText("selecionar");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout painelimagemLayout = new javax.swing.GroupLayout(painelimagem);
        painelimagem.setLayout(painelimagemLayout);
        painelimagemLayout.setHorizontalGroup(
            painelimagemLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(painelimagemLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblimagem, javax.swing.GroupLayout.DEFAULT_SIZE, 187, Short.MAX_VALUE)
                .addContainerGap())
        );
        painelimagemLayout.setVerticalGroup(
            painelimagemLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(painelimagemLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblimagem, javax.swing.GroupLayout.DEFAULT_SIZE, 146, Short.MAX_VALUE)
                .addContainerGap())
        );

        jButton2.setText("trocar icone");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(70, 70, 70)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jButton2)
                    .addComponent(painelimagem, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton1))
                .addContainerGap(131, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(38, 38, 38)
                .addComponent(jButton1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(painelimagem, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButton2)
                .addContainerGap(46, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        imagem = selecionarImagem();
        abrirImagem(imagem);
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        Jogo jogo = new Jogo();
        jogo.setImagem(getImagem());
        conexao.inserir(jogo);
        JOptionPane.showMessageDialog(null,"Icone trocado com sucesso!!!");
    }//GEN-LAST:event_jButton2ActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(NewJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(NewJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(NewJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(NewJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new NewJFrame().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel lblimagem;
    private javax.swing.JPanel painelimagem;
    // End of variables declaration//GEN-END:variables
public File selecionarImagem(){
  JFileChooser fileChooser = new JFileChooser();
  FileNameExtensionFilter filtro = new FileNameExtensionFilter("Imagens em JPEG e PNG","jpg","png");
  fileChooser.addChoosableFileFilter(filtro);
  fileChooser.setAcceptAllFileFilterUsed(false);
  fileChooser.setDialogType(JFileChooser.OPEN_DIALOG);
  fileChooser.setCurrentDirectory(new File("/"));
  fileChooser.showOpenDialog(this);
  return fileChooser.getSelectedFile();
}
private byte[] getImagem(){
boolean isPng = false;
if(imagem != null){
   isPng = imagem.getName().endsWith("png");
    try {
        BufferedImage image = ImageIO.read(imagem);
        ByteArrayOutputStream out = new ByteArrayOutputStream();
        int type = BufferedImage.TYPE_INT_RGB;
        if(isPng){
           type = BufferedImage.BITMASK;
        }
        BufferedImage novaImagem = new BufferedImage(painelimagem.getWidth()- 100,painelimagem.getHeight()- 80,type);
        Graphics2D g = novaImagem.createGraphics();
        g.setComposite(AlphaComposite.Src);
        g.drawImage(image, 0,0, painelimagem.getWidth() - 100,painelimagem.getHeight() - 80,null);
        if(isPng){
        ImageIO.write(novaImagem,"png",out);
        }else
        {
        ImageIO.write(novaImagem,"jpg",out);
        }
        out.flush();
        byte[] byteArray = out.toByteArray();
        out.close();
        return byteArray;
    } catch (IOException ex) {
        Logger.getLogger(NewJFrame.class.getName()).log(Level.SEVERE, null, ex);
    }
}
return null;
}
private void abrirImagem(Object source){
if(source instanceof File){
    ImageIcon icon = new ImageIcon(imagem.getAbsolutePath());
    icon.setImage(icon.getImage().getScaledInstance(painelimagem.getWidth() - 100,painelimagem.getHeight() - 80,100));
    lblimagem.setIcon(icon);
    
}
else if(source instanceof byte[]){
    ImageIcon icon = new ImageIcon(jogo.getImagem());
    icon.setImage(icon.getImage().getScaledInstance(painelimagem.getWidth() - 100,painelimagem.getHeight() - 80,100));
    lblimagem.setIcon(icon);
}
}
}
