
package view;


public class TelaPrincipal extends javax.swing.JFrame {


    public TelaPrincipal() {
        initComponents();
         setLocationRelativeTo(null); //CENTRALIZAR TELA
    }


    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        BotaoPesquisar = new javax.swing.JButton();
        BotaoPerfil = new javax.swing.JButton();
        BotaoMinimizar = new javax.swing.JButton();
        BotaoFechar = new javax.swing.JButton();
        BotaoLogar = new javax.swing.JButton();
        BotaoRegistrar = new javax.swing.JButton();
        ImageFundo = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        getContentPane().add(BotaoPesquisar, new org.netbeans.lib.awtextra.AbsoluteConstraints(760, 60, 40, 30));

        BotaoPerfil.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotaoPerfilActionPerformed(evt);
            }
        });
        getContentPane().add(BotaoPerfil, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 70, 40, 30));

        BotaoMinimizar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/Captura de tela 2022-10-19 214036.png"))); // NOI18N
        getContentPane().add(BotaoMinimizar, new org.netbeans.lib.awtextra.AbsoluteConstraints(1070, 0, 30, 30));

        BotaoFechar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/Captura de tela 2022-10-19 213715.png"))); // NOI18N
        BotaoFechar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotaoFecharActionPerformed(evt);
            }
        });
        getContentPane().add(BotaoFechar, new org.netbeans.lib.awtextra.AbsoluteConstraints(1130, 0, 30, 30));

        BotaoLogar.setText("Logar");
        BotaoLogar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotaoLogarActionPerformed(evt);
            }
        });
        getContentPane().add(BotaoLogar, new org.netbeans.lib.awtextra.AbsoluteConstraints(1063, 63, 80, 30));

        BotaoRegistrar.setText("Registrar");
        BotaoRegistrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotaoRegistrarActionPerformed(evt);
            }
        });
        getContentPane().add(BotaoRegistrar, new org.netbeans.lib.awtextra.AbsoluteConstraints(900, 63, -1, 30));

        ImageFundo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/Tela Princ sem log.png"))); // NOI18N
        getContentPane().add(ImageFundo, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void BotaoRegistrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotaoRegistrarActionPerformed
  Registrar obj = new Registrar();
  obj.setVisible(true);
  this.dispose();
    }//GEN-LAST:event_BotaoRegistrarActionPerformed

    private void BotaoLogarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotaoLogarActionPerformed
   Login obj = new Login();
  obj.setVisible(true);
  this.dispose();
    }//GEN-LAST:event_BotaoLogarActionPerformed

    private void BotaoFecharActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotaoFecharActionPerformed
        System.exit(0);
    }//GEN-LAST:event_BotaoFecharActionPerformed

    private void BotaoPerfilActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotaoPerfilActionPerformed
  Login obj = new Login();
  obj.setVisible(true);
  this.dispose();
    }//GEN-LAST:event_BotaoPerfilActionPerformed

 

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BotaoFechar;
    private javax.swing.JButton BotaoLogar;
    private javax.swing.JButton BotaoMinimizar;
    private javax.swing.JButton BotaoPerfil;
    private javax.swing.JButton BotaoPesquisar;
    private javax.swing.JButton BotaoRegistrar;
    private javax.swing.JLabel ImageFundo;
    // End of variables declaration//GEN-END:variables
}
