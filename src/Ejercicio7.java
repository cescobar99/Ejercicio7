
import javax.swing.JOptionPane;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author User
 */
public class Ejercicio7 extends javax.swing.JFrame {

    /**
     * Creates new form Ejercicio7
     */
    public Ejercicio7() {
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

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        txtNumeroAños = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        txtMontoTota = new javax.swing.JTextField();
        cdmCalcular = new javax.swing.JButton();
        cmdBorrar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 0, 0));
        jLabel1.setText("Empresa");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(166, 11, 100, -1));

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(0, 0, 255));
        jLabel2.setText("Numero De Años");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 60, -1, -1));

        txtNumeroAños.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtNumeroAñosKeyTyped(evt);
            }
        });
        jPanel1.add(txtNumeroAños, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 60, 160, -1));

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(0, 0, 204));
        jLabel3.setText("Monto Total");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 110, -1, -1));

        txtMontoTota.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtMontoTotaKeyTyped(evt);
            }
        });
        jPanel1.add(txtMontoTota, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 110, 180, -1));

        cdmCalcular.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        cdmCalcular.setForeground(new java.awt.Color(0, 255, 0));
        cdmCalcular.setText("CALCULAR");
        cdmCalcular.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cdmCalcularActionPerformed(evt);
            }
        });
        jPanel1.add(cdmCalcular, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 190, -1, -1));

        cmdBorrar.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        cmdBorrar.setForeground(new java.awt.Color(0, 255, 0));
        cmdBorrar.setText("BORRAR");
        cmdBorrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmdBorrarActionPerformed(evt);
            }
        });
        jPanel1.add(cmdBorrar, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 190, -1, -1));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 411, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 273, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void cdmCalcularActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cdmCalcularActionPerformed
    String MontoTotal;
    double NumAños, op1, op2=0;
    if(txtNumeroAños.getText().trim().isEmpty()){
    JOptionPane.showMessageDialog(this, "Digite el numero de años", "Error", JOptionPane.ERROR_MESSAGE);
    txtNumeroAños.requestFocusInWindow();
    }
    else {
    NumAños= Double.parseDouble(txtNumeroAños.getText());
    op1= (NumAños-1);
    op2= (100000+(op1*120000));
    }
    MontoTotal= String.valueOf(op2);
    txtMontoTota.setText(MontoTotal);
    }//GEN-LAST:event_cdmCalcularActionPerformed

    private void cmdBorrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmdBorrarActionPerformed
    txtNumeroAños.setText("");
    txtMontoTota.setText("");
    
    txtNumeroAños.requestFocusInWindow();
    }//GEN-LAST:event_cmdBorrarActionPerformed

    private void txtNumeroAñosKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtNumeroAñosKeyTyped
    char c=evt.getKeyChar();
    
    if(!Character.isDigit(c)){
    getToolkit().beep();
    evt.consume();
    }
    }//GEN-LAST:event_txtNumeroAñosKeyTyped

    private void txtMontoTotaKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtMontoTotaKeyTyped
    char c=evt.getKeyChar();
    
    if(!Character.isDigit(c)){
    getToolkit().beep();
    evt.consume();
    }
    }//GEN-LAST:event_txtMontoTotaKeyTyped

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
            java.util.logging.Logger.getLogger(Ejercicio7.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Ejercicio7.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Ejercicio7.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Ejercicio7.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Ejercicio7().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton cdmCalcular;
    private javax.swing.JButton cmdBorrar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTextField txtMontoTota;
    private javax.swing.JTextField txtNumeroAños;
    // End of variables declaration//GEN-END:variables
}
