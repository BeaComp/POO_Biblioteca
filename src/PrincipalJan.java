
public class PrincipalJan extends javax.swing.JFrame {

    /**
     * Creates new form PrincipalJan
     */
    public PrincipalJan() {
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

        btSair = new javax.swing.JButton();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        cdCientifico = new javax.swing.JMenuItem();
        cdRomance = new javax.swing.JMenuItem();
        cdDidatico = new javax.swing.JMenuItem();
        cdHQ = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        btSair.setText("Sair");

        jMenu1.setText("Cadastrar");

        cdCientifico.setText("Livro Cientifico");
        cdCientifico.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cdCientificoActionPerformed(evt);
            }
        });
        jMenu1.add(cdCientifico);

        cdRomance.setText("Livro Romance");
        cdRomance.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cdRomanceActionPerformed(evt);
            }
        });
        jMenu1.add(cdRomance);

        cdDidatico.setText("Livro  Didatico");
        cdDidatico.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cdDidaticoActionPerformed(evt);
            }
        });
        jMenu1.add(cdDidatico);

        cdHQ.setText("HQ");
        cdHQ.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cdHQActionPerformed(evt);
            }
        });
        jMenu1.add(cdHQ);

        jMenuBar1.add(jMenu1);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(302, Short.MAX_VALUE)
                .addComponent(btSair)
                .addGap(26, 26, 26))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(227, Short.MAX_VALUE)
                .addComponent(btSair)
                .addGap(30, 30, 30))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void cdCientificoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cdCientificoActionPerformed
        Cientificos cientifico = new Cientificos();
        
    }//GEN-LAST:event_cdCientificoActionPerformed

    private void cdRomanceActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cdRomanceActionPerformed
        Romance romance = new Romance();
    }//GEN-LAST:event_cdRomanceActionPerformed

    private void cdDidaticoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cdDidaticoActionPerformed
        Didatico  didatico = new Didatico();
    }//GEN-LAST:event_cdDidaticoActionPerformed

    private void cdHQActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cdHQActionPerformed
        HQ hq = new HQ();
    }//GEN-LAST:event_cdHQActionPerformed

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
            java.util.logging.Logger.getLogger(PrincipalJan.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(PrincipalJan.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(PrincipalJan.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(PrincipalJan.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new PrincipalJan().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btSair;
    private javax.swing.JMenuItem cdCientifico;
    private javax.swing.JMenuItem cdDidatico;
    private javax.swing.JMenuItem cdHQ;
    private javax.swing.JMenuItem cdRomance;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenuBar jMenuBar1;
    // End of variables declaration//GEN-END:variables
}
