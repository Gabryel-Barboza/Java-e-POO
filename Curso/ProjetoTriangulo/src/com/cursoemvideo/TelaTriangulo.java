/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package com.cursoemvideo;

/**
 *
 * @author gabri
 */
public class TelaTriangulo extends javax.swing.JFrame {

    /**
     * Creates new form TelaTriangulo
     */
    public TelaTriangulo() {
        initComponents();
        pnlRes.setVisible(false);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        sldA = new javax.swing.JSlider();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        sldC = new javax.swing.JSlider();
        sldB = new javax.swing.JSlider();
        jLabel4 = new javax.swing.JLabel();
        btnCalc = new javax.swing.JButton();
        lblA = new javax.swing.JLabel();
        lblB = new javax.swing.JLabel();
        lblC = new javax.swing.JLabel();
        pnlRes = new javax.swing.JPanel();
        lblRes = new javax.swing.JLabel();
        lblTipo = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(600, 400));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        sldA.setMaximum(20);
        sldA.setSnapToTicks(true);
        sldA.setToolTipText("");
        sldA.setValue(0);
        sldA.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        sldA.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                sldAStateChanged(evt);
            }
        });
        getContentPane().add(sldA, new org.netbeans.lib.awtextra.AbsoluteConstraints(112, 37, 115, -1));

        jLabel1.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel1.setText("Segmento A");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(24, 35, -1, -1));

        jLabel2.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel2.setText("Segmento C");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(25, 99, -1, -1));

        jLabel3.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel3.setText("Segmento B");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(25, 67, -1, -1));

        sldC.setMajorTickSpacing(1);
        sldC.setMaximum(20);
        sldC.setSnapToTicks(true);
        sldC.setValue(0);
        sldC.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                sldCStateChanged(evt);
            }
        });
        getContentPane().add(sldC, new org.netbeans.lib.awtextra.AbsoluteConstraints(112, 101, 115, -1));

        sldB.setMajorTickSpacing(1);
        sldB.setMaximum(20);
        sldB.setSnapToTicks(true);
        sldB.setValue(0);
        sldB.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                sldBStateChanged(evt);
            }
        });
        getContentPane().add(sldB, new org.netbeans.lib.awtextra.AbsoluteConstraints(112, 69, 115, -1));

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/Triangulo150.png"))); // NOI18N
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(344, 6, -1, -1));

        btnCalc.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        btnCalc.setText("Verificar");
        btnCalc.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCalcActionPerformed(evt);
            }
        });
        getContentPane().add(btnCalc, new org.netbeans.lib.awtextra.AbsoluteConstraints(112, 153, -1, -1));

        lblA.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        lblA.setForeground(new java.awt.Color(153, 153, 153));
        lblA.setText("0");
        getContentPane().add(lblA, new org.netbeans.lib.awtextra.AbsoluteConstraints(239, 31, -1, -1));

        lblB.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        lblB.setForeground(new java.awt.Color(153, 153, 153));
        lblB.setText("0");
        getContentPane().add(lblB, new org.netbeans.lib.awtextra.AbsoluteConstraints(239, 63, -1, -1));

        lblC.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        lblC.setForeground(new java.awt.Color(153, 153, 153));
        lblC.setText("0");
        getContentPane().add(lblC, new org.netbeans.lib.awtextra.AbsoluteConstraints(239, 95, -1, -1));

        lblRes.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        lblRes.setForeground(new java.awt.Color(0, 51, 255));
        lblRes.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblRes.setText("Resultado");
        lblRes.setMaximumSize(new java.awt.Dimension(79, 25));

        lblTipo.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        lblTipo.setForeground(new java.awt.Color(204, 0, 51));
        lblTipo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblTipo.setText("Tipo");

        javax.swing.GroupLayout pnlResLayout = new javax.swing.GroupLayout(pnlRes);
        pnlRes.setLayout(pnlResLayout);
        pnlResLayout.setHorizontalGroup(
            pnlResLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(lblRes, javax.swing.GroupLayout.DEFAULT_SIZE, 330, Short.MAX_VALUE)
            .addComponent(lblTipo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        pnlResLayout.setVerticalGroup(
            pnlResLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlResLayout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(lblRes, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lblTipo)
                .addContainerGap(24, Short.MAX_VALUE))
        );

        getContentPane().add(pnlRes, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 210, 330, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnCalcActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCalcActionPerformed
        // TODO add your handling code here:
        int a = sldA.getValue();
        int b = sldB.getValue();
        int c = sldC.getValue();
        if (a >= b + c || b >= a + c || c >= a + b) {  //Medida de um lado é menor que a soma de 2 outros para formar o triangulo
            lblRes.setText("Não forma um triângulo!");
            lblTipo.setText("-");
        } else {
            lblRes.setText("Forma um Triângulo");
            if (a != b && a != c && b != c) {
                lblTipo.setText("Escaleno");
            } else if (a != b || a != c) {
                lblTipo.setText("Isósceles");
            } else {
                lblTipo.setText("Equilátero");
            }
        }
        pnlRes.setVisible(true);
    }//GEN-LAST:event_btnCalcActionPerformed

    private void sldAStateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_sldAStateChanged
        // TODO add your handling code here:
        lblA.setText(Integer.toString(sldA.getValue()));
    }//GEN-LAST:event_sldAStateChanged

    private void sldBStateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_sldBStateChanged
        // TODO add your handling code here:
        lblB.setText(Integer.toString(sldB.getValue()));
    }//GEN-LAST:event_sldBStateChanged

    private void sldCStateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_sldCStateChanged
        // TODO add your handling code here:
        lblC.setText(Integer.toString(sldC.getValue()));
    }//GEN-LAST:event_sldCStateChanged

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
            java.util.logging.Logger.getLogger(TelaTriangulo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TelaTriangulo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TelaTriangulo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TelaTriangulo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TelaTriangulo().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCalc;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel lblA;
    private javax.swing.JLabel lblB;
    private javax.swing.JLabel lblC;
    private javax.swing.JLabel lblRes;
    private javax.swing.JLabel lblTipo;
    private javax.swing.JPanel pnlRes;
    private javax.swing.JSlider sldA;
    private javax.swing.JSlider sldB;
    private javax.swing.JSlider sldC;
    // End of variables declaration//GEN-END:variables
}