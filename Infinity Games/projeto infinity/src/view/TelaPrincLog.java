
package view;


public class TelaPrincLog extends javax.swing.JFrame {


    public TelaPrincLog() {
        initComponents();
        setLocationRelativeTo(null); //CENTRALIZAR TELA
    }


    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        BotaoPerfil = new javax.swing.JButton();
        BotaoFechar = new javax.swing.JButton();
        BotaoPesquisar = new javax.swing.JButton();
        BotaoBiblioteca = new javax.swing.JButton();
        BotaoCarrinho = new javax.swing.JButton();
        ImagemFundo = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(1200, 700));
        setUndecorated(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        BotaoPerfil.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/Icone Perfil tela Princ.png"))); // NOI18N
        BotaoPerfil.setBorder(null);
        BotaoPerfil.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotaoPerfilActionPerformed(evt);
            }
        });
        getContentPane().add(BotaoPerfil, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 50, 60, 50));

        BotaoFechar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/Captura de tela 2022-10-19 213715.png"))); // NOI18N
        BotaoFechar.setBorder(null);
        BotaoFechar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotaoFecharActionPerformed(evt);
            }
        });
        getContentPane().add(BotaoFechar, new org.netbeans.lib.awtextra.AbsoluteConstraints(1130, 0, 30, 30));

        BotaoPesquisar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/BotaoPesquisar.png"))); // NOI18N
        BotaoPesquisar.setBorder(null);
        getContentPane().add(BotaoPesquisar, new org.netbeans.lib.awtextra.AbsoluteConstraints(735, 54, 60, 45));

        BotaoBiblioteca.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/Icone Biblioteca.png"))); // NOI18N
        BotaoBiblioteca.setBorder(null);
        BotaoBiblioteca.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotaoBibliotecaActionPerformed(evt);
            }
        });
        getContentPane().add(BotaoBiblioteca, new org.netbeans.lib.awtextra.AbsoluteConstraints(920, 50, 50, 50));

        BotaoCarrinho.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/Icone Carrinho.png"))); // NOI18N
        BotaoCarrinho.setBorder(null);
        BotaoCarrinho.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotaoCarrinhoActionPerformed(evt);
            }
        });
        getContentPane().add(BotaoCarrinho, new org.netbeans.lib.awtextra.AbsoluteConstraints(1070, 53, 50, 40));

        ImagemFundo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/TelaPrinc Depois Login.png"))); // NOI18N
        getContentPane().add(ImagemFundo, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void BotaoFecharActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotaoFecharActionPerformed
      System.exit(0);
    }//GEN-LAST:event_BotaoFecharActionPerformed

    private void BotaoPerfilActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotaoPerfilActionPerformed
      Perfil obj = new Perfil();
      obj.setVisible(true);
      this.dispose();
  
       
    }//GEN-LAST:event_BotaoPerfilActionPerformed

    private void BotaoCarrinhoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotaoCarrinhoActionPerformed
       Carrinho obj = new Carrinho();
       obj.setVisible(true);
       this.dispose();
    }//GEN-LAST:event_BotaoCarrinhoActionPerformed

    private void BotaoBibliotecaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotaoBibliotecaActionPerformed
        Biblioteca obj = new Biblioteca();
        obj.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_BotaoBibliotecaActionPerformed

   

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BotaoBiblioteca;
    private javax.swing.JButton BotaoCarrinho;
    private javax.swing.JButton BotaoFechar;
    private javax.swing.JButton BotaoPerfil;
    private javax.swing.JButton BotaoPesquisar;
    private javax.swing.JLabel ImagemFundo;
    // End of variables declaration//GEN-END:variables
}
