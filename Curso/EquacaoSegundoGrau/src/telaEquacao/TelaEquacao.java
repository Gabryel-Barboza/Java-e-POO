/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */

package telaEquacao;

/**
 *
 * @author gabri
 */
public class TelaEquacao extends javax.swing.JFrame {

    /** Creates new form TelaEquacao */
    public TelaEquacao() {
        initComponents();
        pnlRes.setVisible(false);
    }

    /** This method is called from within the constructor to
     * initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is
     * always regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel6 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        spnA = new javax.swing.JSpinner();
        spnB = new javax.swing.JSpinner();
        spnC = new javax.swing.JSpinner();
        btnCalc = new javax.swing.JButton();
        pnlRes = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        lblDelta = new javax.swing.JLabel();
        lblTipo = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        lblB = new javax.swing.JLabel();
        lblA = new javax.swing.JLabel();
        lblC = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();

        jLabel6.setText("jLabel6");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel1.setText("x² +");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(72, 60, -1, -1));

        jLabel2.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel2.setText("x +");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(173, 60, 26, -1));

        jLabel3.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel3.setText("= 0");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(263, 60, -1, -1));

        spnA.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        spnA.setModel(new javax.swing.SpinnerNumberModel());
        spnA.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                spnAStateChanged(evt);
            }
        });
        getContentPane().add(spnA, new org.netbeans.lib.awtextra.AbsoluteConstraints(14, 57, 52, -1));

        spnB.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        spnB.setModel(new javax.swing.SpinnerNumberModel());
        spnB.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                spnBStateChanged(evt);
            }
        });
        getContentPane().add(spnB, new org.netbeans.lib.awtextra.AbsoluteConstraints(109, 57, 52, -1));

        spnC.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        spnC.setModel(new javax.swing.SpinnerNumberModel());
        spnC.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                spnCStateChanged(evt);
            }
        });
        getContentPane().add(spnC, new org.netbeans.lib.awtextra.AbsoluteConstraints(205, 57, 52, -1));

        btnCalc.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        btnCalc.setText("<html>Calcular &Delta; </html>");
        btnCalc.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCalcActionPerformed(evt);
            }
        });
        getContentPane().add(btnCalc, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 190, -1, 35));

        jLabel4.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel4.setText("<html>&Delta;    = </html>");

        jLabel5.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel5.setText("Tipo =");

        lblDelta.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        lblDelta.setForeground(new java.awt.Color(0, 51, 255));
        lblDelta.setText("0");

        lblTipo.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        lblTipo.setForeground(new java.awt.Color(0, 51, 255));
        lblTipo.setText("Indefinido");

        javax.swing.GroupLayout pnlResLayout = new javax.swing.GroupLayout(pnlRes);
        pnlRes.setLayout(pnlResLayout);
        pnlResLayout.setHorizontalGroup(
            pnlResLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlResLayout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addGroup(pnlResLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(pnlResLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblDelta)
                    .addComponent(lblTipo))
                .addContainerGap(164, Short.MAX_VALUE))
        );
        pnlResLayout.setVerticalGroup(
            pnlResLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlResLayout.createSequentialGroup()
                .addGap(28, 28, 28)
                .addGroup(pnlResLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblDelta))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(pnlResLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(lblTipo))
                .addContainerGap(34, Short.MAX_VALUE))
        );

        getContentPane().add(pnlRes, new org.netbeans.lib.awtextra.AbsoluteConstraints(14, 230, -1, -1));

        jLabel7.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel7.setText("<html> &Delta;  =</html> ");
        getContentPane().add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(38, 128, -1, -1));

        lblB.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        lblB.setForeground(new java.awt.Color(204, 51, 0));
        lblB.setText("B");
        getContentPane().add(lblB, new org.netbeans.lib.awtextra.AbsoluteConstraints(93, 128, -1, -1));

        lblA.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        lblA.setForeground(new java.awt.Color(204, 51, 0));
        lblA.setText("A");
        getContentPane().add(lblA, new org.netbeans.lib.awtextra.AbsoluteConstraints(157, 128, -1, -1));

        lblC.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        lblC.setForeground(new java.awt.Color(204, 51, 0));
        lblC.setText("C");
        getContentPane().add(lblC, new org.netbeans.lib.awtextra.AbsoluteConstraints(183, 128, -1, -1));

        jLabel11.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel11.setText("² - 4 .");
        getContentPane().add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(109, 128, -1, -1));

        jLabel12.setText(".");
        getContentPane().add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(174, 135, -1, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnCalcActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCalcActionPerformed
        // TODO add your handling code here:
        int a, b, c, delta;
        a = Integer.parseInt(spnA.getValue().toString());
        b = Integer.parseInt(spnB.getValue().toString());
        c = Integer.parseInt(spnC.getValue().toString());
        delta = (int) (Math.pow(b, 2)) - 4 * a * c;
        lblDelta.setText(Integer.toString(delta));
        String msg = (delta < 0)? "Não existem raízes reais":
                (delta == 0)? "Apenas uma raíz real":
                "Existem duas raízes nessa equação";
        lblTipo.setText(msg);
        pnlRes.setVisible(true);
    }//GEN-LAST:event_btnCalcActionPerformed

    private void spnAStateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_spnAStateChanged
        // TODO add your handling code here:
        lblA.setText(spnA.getValue().toString());
    }//GEN-LAST:event_spnAStateChanged

    private void spnBStateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_spnBStateChanged
        // TODO add your handling code here:
        lblB.setText(spnB.getValue().toString());
    }//GEN-LAST:event_spnBStateChanged

    private void spnCStateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_spnCStateChanged
        // TODO add your handling code here:
        lblC.setText(spnC.getValue().toString());
    }//GEN-LAST:event_spnCStateChanged

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
            java.util.logging.Logger.getLogger(TelaEquacao.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TelaEquacao.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TelaEquacao.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TelaEquacao.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TelaEquacao().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCalc;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel lblA;
    private javax.swing.JLabel lblB;
    private javax.swing.JLabel lblC;
    private javax.swing.JLabel lblDelta;
    private javax.swing.JLabel lblTipo;
    private javax.swing.JPanel pnlRes;
    private javax.swing.JSpinner spnA;
    private javax.swing.JSpinner spnB;
    private javax.swing.JSpinner spnC;
    // End of variables declaration//GEN-END:variables

}