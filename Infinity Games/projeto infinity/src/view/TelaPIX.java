/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package view;

/**
 *
 * @author luisr
 */
public class TelaPIX extends javax.swing.JFrame {

    /**
     * Creates new form TelaPIX
     */
    public TelaPIX() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        campoValor = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jTextField2 = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        campoValor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                campoValorActionPerformed(evt);
            }
        });
        getContentPane().add(campoValor, new org.netbeans.lib.awtextra.AbsoluteConstraints(840, 370, 150, 40));

        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/botaoPagamentoEfetuado.png"))); // NOI18N
        jButton1.setBorder(null);
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(824, 565, -1, -1));

        jTextField2.setEditable(false);
        jTextField2.setBackground(new java.awt.Color(82, 113, 255));
        jTextField2.setForeground(new java.awt.Color(82, 113, 255));
        jTextField2.setBorder(null);
        getContentPane().add(jTextField2, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 50, 190, 50));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/Tela Pix.png"))); // NOI18N
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void campoValorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_campoValorActionPerformed
      
    }//GEN-LAST:event_campoValorActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
       PagamentoRealizado obj = new PagamentoRealizado();
       obj.setVisible(true);
       this.dispose();
    }//GEN-LAST:event_jButton1ActionPerformed

    /**
     * @param args the command line arguments
     */
   

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField campoValor;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JTextField jTextField2;
    // End of variables declaration//GEN-END:variables
}
