//Beatriz Cristina de Faria RA: 2349710
//POO - C31

import javax.swing.JOptionPane;


public class CadLivros extends javax.swing.JFrame {
    
    private static CadLivros cadLivros;
    
    public static CadLivros getCadLivros() {
        if (cadLivros == null) {
            cadLivros = new CadLivros();
        }

        return cadLivros;
    }
    
    public CadLivros() {
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

        cbRomance = new javax.swing.JButton();
        cbDidatico = new javax.swing.JButton();
        cbHQ = new javax.swing.JButton();
        cbCientifico = new javax.swing.JButton();
        cbVoltar = new javax.swing.JButton();
        lbTitulo = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        cbRomance.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        cbRomance.setText("Livro Romance");
        cbRomance.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbRomanceActionPerformed(evt);
            }
        });

        cbDidatico.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        cbDidatico.setText("Livro Didatico");
        cbDidatico.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbDidaticoActionPerformed(evt);
            }
        });

        cbHQ.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        cbHQ.setText("Livro HQ");
        cbHQ.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbHQActionPerformed(evt);
            }
        });

        cbCientifico.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        cbCientifico.setText("Livro Cientifico");
        cbCientifico.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbCientificoActionPerformed(evt);
            }
        });

        cbVoltar.setText("Voltar");
        cbVoltar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbVoltarActionPerformed(evt);
            }
        });

        lbTitulo.setFont(new java.awt.Font("MS Reference Sans Serif", 3, 18)); // NOI18N
        lbTitulo.setText("Gêneros Coruja ^-^   ");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(138, 138, 138)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(cbCientifico)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(cbRomance, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(cbDidatico, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(cbHQ, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(102, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(lbTitulo, javax.swing.GroupLayout.PREFERRED_SIZE, 206, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(92, 92, 92))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(cbVoltar)
                        .addGap(19, 19, 19))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lbTitulo, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(cbRomance)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(cbDidatico)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(cbHQ)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(cbCientifico)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 31, Short.MAX_VALUE)
                .addComponent(cbVoltar)
                .addGap(29, 29, 29))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void cbRomanceActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbRomanceActionPerformed
        CadRomance.getCadRomance().setVisible(true); 
    }//GEN-LAST:event_cbRomanceActionPerformed

    private void cbDidaticoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbDidaticoActionPerformed
        CadDidatico.getCadDidatico().setVisible(true);
    }//GEN-LAST:event_cbDidaticoActionPerformed

    private void cbHQActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbHQActionPerformed
        CadHQ.getCadHQ().setVisible(true);
    }//GEN-LAST:event_cbHQActionPerformed

    private void cbCientificoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbCientificoActionPerformed
        CadCientifico.getCadCientifico().setVisible(true);
    }//GEN-LAST:event_cbCientificoActionPerformed

    private void cbVoltarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbVoltarActionPerformed
       exit();
    }//GEN-LAST:event_cbVoltarActionPerformed
    
    public void exit() {
        int resp = JOptionPane.showConfirmDialog(null, "Deseja Sair?", "Saida", JOptionPane.YES_NO_CANCEL_OPTION);

        if (resp == 0) {
            this.dispose();
        }
    }
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
            java.util.logging.Logger.getLogger(CadLivros.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(CadLivros.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(CadLivros.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(CadLivros.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new CadLivros().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton cbCientifico;
    private javax.swing.JButton cbDidatico;
    private javax.swing.JButton cbHQ;
    private javax.swing.JButton cbRomance;
    private javax.swing.JButton cbVoltar;
    private javax.swing.JLabel lbTitulo;
    // End of variables declaration//GEN-END:variables
}
