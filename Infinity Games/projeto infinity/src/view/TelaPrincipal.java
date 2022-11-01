
package view;


public class TelaPrincipal extends javax.swing.JFrame {


    public TelaPrincipal() {
        initComponents();
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
        getContentPane().add(BotaoPerfil, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 70, 40, 30));

        BotaoMinimizar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/Captura de tela 2022-10-19 214036.png"))); // NOI18N
        getContentPane().add(BotaoMinimizar, new org.netbeans.lib.awtextra.AbsoluteConstraints(1070, 0, 30, 30));

        BotaoFechar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/Captura de tela 2022-10-19 213715.png"))); // NOI18N
        getContentPane().add(BotaoFechar, new org.netbeans.lib.awtextra.AbsoluteConstraints(1130, 0, 30, 30));

        BotaoLogar.setText("Logar");
        getContentPane().add(BotaoLogar, new org.netbeans.lib.awtextra.AbsoluteConstraints(1063, 63, 80, 30));

        BotaoRegistrar.setText("Registrar");
        getContentPane().add(BotaoRegistrar, new org.netbeans.lib.awtextra.AbsoluteConstraints(900, 63, -1, 30));

        ImageFundo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/Tela Princ sem log.png"))); // NOI18N
        getContentPane().add(ImageFundo, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

 

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
