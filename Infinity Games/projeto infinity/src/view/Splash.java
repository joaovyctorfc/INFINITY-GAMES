
package view;


public class Splash extends javax.swing.JFrame {
private Splash splash;
private Registrar regis;
    public Splash() {
        initComponents();
        setLocationRelativeTo(null); //CENTRALIZAR TELA
        splash = new Splash();
        regis = new Registrar();
    }


    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        LabelCarregamento = new javax.swing.JLabel();
        LabelTotal = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        setUndecorated(true);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        LabelCarregamento.setFont(new java.awt.Font("Arial Black", 1, 14)); // NOI18N
        LabelCarregamento.setForeground(new java.awt.Color(0, 0, 153));
        LabelCarregamento.setText("0%");
        getContentPane().add(LabelCarregamento, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 320, 30, 30));

        LabelTotal.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/Design sem nome.gif"))); // NOI18N
        getContentPane().add(LabelTotal, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
      new Thread(){
          int i = 0;
          public void run(){
                while(1<100){
                    i++;
                    LabelCarregamento.setText(String.valueOf(i)+"%");
                    try{
                        sleep(600);
                    } catch(Exception ex){
                    }  
                }
          }
      };
       System.exit(0);
       Splash.this.dispose();
       regis.setVisible(true);
       
    }//GEN-LAST:event_formWindowOpened

 
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel LabelCarregamento;
    private javax.swing.JLabel LabelTotal;
    // End of variables declaration//GEN-END:variables
}
