//Beatriz Cristina de Faria RA: 2349710
//POO - C31

import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;



public class RelGeral extends javax.swing.JFrame {

    
    private static RelGeral unicoRG;
    private static BdRomance bdromance = new BdRomance();
    private static BdCientifico bdCientifico = new BdCientifico();
    private static BdHQ bdhq = new BdHQ();
    private static BdDidatico bdDidatico = new BdDidatico(); 
   
    
    

    private RelGeral() {
        initComponents();
    }
    
    public static RelGeral getRelGeralDidatico(BdDidatico bd){
        bdDidatico = bd;
        
        if(unicoRG == null){
            unicoRG = new RelGeral();
        }
        return unicoRG;
    }
    
    public static RelGeral getRelGeralCientifico(BdCientifico bd){
        bdCientifico = bd;
        
        if(unicoRG == null){
            unicoRG = new RelGeral();
        }
        return unicoRG;
    }
    
    public static RelGeral getRelGeralHQ(BdHQ bd){
        bdhq = bd;
        
        if(unicoRG == null){
            unicoRG = new RelGeral();
        }
        return unicoRG;
    }
    
    public static RelGeral getRelGeralRomance(BdRomance bd){
        bdromance = bd;
        
        if(unicoRG == null){
            unicoRG = new RelGeral();
        }
        return unicoRG;
    }
    
   
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lbGeral = new javax.swing.JLabel();
        btVoltar = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        tbRomance = new javax.swing.JTable();
        lbRomance = new javax.swing.JLabel();
        lbCientifico = new javax.swing.JLabel();
        jScrollPane3 = new javax.swing.JScrollPane();
        tbCientifico = new javax.swing.JTable();
        lbHQ = new javax.swing.JLabel();
        jScrollPane4 = new javax.swing.JScrollPane();
        tbHQ = new javax.swing.JTable();
        lbDidatico = new javax.swing.JLabel();
        jScrollPane5 = new javax.swing.JScrollPane();
        tbDidatico = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        addPropertyChangeListener(new java.beans.PropertyChangeListener() {
            public void propertyChange(java.beans.PropertyChangeEvent evt) {
                formPropertyChange(evt);
            }
        });

        lbGeral.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        lbGeral.setText("Relatório Geral - Biblioteca Coruja");

        btVoltar.setText("Voltar");
        btVoltar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btVoltarActionPerformed(evt);
            }
        });

        tbRomance.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null, null}
            },
            new String [] {
                "Nome", "Capítulos", "Código", "Prateleira", "Seção", "Publicação", "Autor", "Edição", "Editora", "Páginas", "Personagens", "Tipo", "Narrador"
            }
        ));
        tbRomance.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        tbRomance.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tbRomanceMouseClicked(evt);
            }
        });
        tbRomance.addPropertyChangeListener(new java.beans.PropertyChangeListener() {
            public void propertyChange(java.beans.PropertyChangeEvent evt) {
                tbRomancePropertyChange(evt);
            }
        });
        jScrollPane2.setViewportView(tbRomance);

        lbRomance.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        lbRomance.setText("Gênero Romance:");

        lbCientifico.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        lbCientifico.setText("Gênero Científico:");

        tbCientifico.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null}
            },
            new String [] {
                "Nome", "Capítulos", "Código", "Prateleira", "Seção", "Publicação", "Autor", "Edição", "Editora", "Páginas", "Grau", "Estudo"
            }
        ));
        tbCientifico.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        tbCientifico.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tbCientificoMouseClicked(evt);
            }
        });
        tbCientifico.addPropertyChangeListener(new java.beans.PropertyChangeListener() {
            public void propertyChange(java.beans.PropertyChangeEvent evt) {
                tbCientificoPropertyChange(evt);
            }
        });
        jScrollPane3.setViewportView(tbCientifico);

        lbHQ.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        lbHQ.setText("Gênero HQ:");

        tbHQ.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null, null}
            },
            new String [] {
                "Nome", "Capítulos", "Código", "Prateleira", "Seção", "Publicação", "Autor", "Edição", "Editora", "Páginas", "Ilustrador", "Franquia", "Cor"
            }
        ));
        tbHQ.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        tbHQ.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tbHQMouseClicked(evt);
            }
        });
        tbHQ.addPropertyChangeListener(new java.beans.PropertyChangeListener() {
            public void propertyChange(java.beans.PropertyChangeEvent evt) {
                tbHQPropertyChange(evt);
            }
        });
        jScrollPane4.setViewportView(tbHQ);

        lbDidatico.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        lbDidatico.setText("Gênero Didatico:");

        tbDidatico.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null}
            },
            new String [] {
                "Nome", "Capítulos", "Código", "Prateleira", "Seção", "Publicação", "Autor", "Edição", "Editora", "Páginas", "Area", "Disciplina"
            }
        ));
        tbDidatico.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        tbDidatico.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tbDidaticoMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                tbDidaticoMouseEntered(evt);
            }
        });
        tbDidatico.addPropertyChangeListener(new java.beans.PropertyChangeListener() {
            public void propertyChange(java.beans.PropertyChangeEvent evt) {
                tbDidaticoPropertyChange(evt);
            }
        });
        jScrollPane5.setViewportView(tbDidatico);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(lbRomance)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(lbGeral, javax.swing.GroupLayout.PREFERRED_SIZE, 227, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(303, 303, 303)))
                .addComponent(btVoltar)
                .addGap(26, 26, 26))
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(lbHQ)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addComponent(jScrollPane4, javax.swing.GroupLayout.DEFAULT_SIZE, 952, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane2)
                            .addComponent(jScrollPane3)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(lbCientifico)
                                    .addComponent(lbDidatico))
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addComponent(jScrollPane5))
                        .addContainerGap())))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btVoltar)
                            .addComponent(lbGeral, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(19, 19, 19))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(lbRomance)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)))
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 119, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lbCientifico)
                .addGap(1, 1, 1)
                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 118, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(lbHQ)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 119, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lbDidatico)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane5, javax.swing.GroupLayout.PREFERRED_SIZE, 117, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void formPropertyChange(java.beans.PropertyChangeEvent evt) {//GEN-FIRST:event_formPropertyChange
        
    }//GEN-LAST:event_formPropertyChange

    private void btVoltarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btVoltarActionPerformed
        exit();
    }//GEN-LAST:event_btVoltarActionPerformed

    private void tbRomanceMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tbRomanceMouseClicked
        selectTabRomance();
    }//GEN-LAST:event_tbRomanceMouseClicked

    private void tbCientificoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tbCientificoMouseClicked
        selectTabCientifico();
    }//GEN-LAST:event_tbCientificoMouseClicked

    private void tbHQMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tbHQMouseClicked
        selectTabHQ();
    }//GEN-LAST:event_tbHQMouseClicked

    private void tbDidaticoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tbDidaticoMouseClicked
        selectTabDidatico();
    }//GEN-LAST:event_tbDidaticoMouseClicked

    private void tbRomancePropertyChange(java.beans.PropertyChangeEvent evt) {//GEN-FIRST:event_tbRomancePropertyChange
        listaTabRomance();
    }//GEN-LAST:event_tbRomancePropertyChange

    private void tbCientificoPropertyChange(java.beans.PropertyChangeEvent evt) {//GEN-FIRST:event_tbCientificoPropertyChange
        listaTabCientifico();
    }//GEN-LAST:event_tbCientificoPropertyChange

    private void tbHQPropertyChange(java.beans.PropertyChangeEvent evt) {//GEN-FIRST:event_tbHQPropertyChange
         listaTabHQ();
    }//GEN-LAST:event_tbHQPropertyChange

    private void tbDidaticoPropertyChange(java.beans.PropertyChangeEvent evt) {//GEN-FIRST:event_tbDidaticoPropertyChange
        listaTabDidatico();
    }//GEN-LAST:event_tbDidaticoPropertyChange

    private void tbDidaticoMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tbDidaticoMouseEntered
        // TODO add your handling code here:
    }//GEN-LAST:event_tbDidaticoMouseEntered
    
    public void exit() {
        int resp = JOptionPane.showConfirmDialog(null, "Deseja Sair?", "Saida", JOptionPane.YES_NO_CANCEL_OPTION);

        if (resp == 0) {
            this.dispose();
        }
    }
    
    public void listaTabRomance(){
    
        DefaultTableModel modelo = (DefaultTableModel)tbRomance.getModel();
        int posLin = 0;
        modelo.setRowCount(posLin);
        
       for (Romance livro : bdromance.getBdRomance()) {
            modelo.insertRow(posLin, new Object[]{livro.getNome(), livro.getCaracteristicas().getCapitulos(), livro.getCodigo(),
                livro.getPrateleira(), livro.getSecao(), livro.getCaracteristicas().getPublicacao(), livro.getCaracteristicas().getAutor(),
                livro.getCaracteristicas().getEdicao(), livro.getCaracteristicas().getEditora(), livro.getCaracteristicas().getPaginas(),
                livro.getPersonagens(), livro.getTipo_romance(), livro.getNarrador()});
            posLin++;
        }
    }
    
    public void listaTabDidatico(){
    
        DefaultTableModel modelo = (DefaultTableModel)tbDidatico.getModel();
        int posLin = 0;
        modelo.setRowCount(posLin);
        
       for(Didatico livro : bdDidatico.getBdDidatico()){
            modelo.insertRow(posLin, new Object[]{livro.getNome(),livro.getCaracteristicas().getCapitulos(), livro.getCodigo(), 
                livro.getPrateleira(), livro.getSecao(), livro.getCaracteristicas().getPublicacao(), livro.getCaracteristicas().getAutor(),
                livro.getCaracteristicas().getEdicao(), livro.getCaracteristicas().getEditora(), livro.getCaracteristicas().getPaginas(),
                livro.getArea(), livro.getDisciplina()});
            posLin++;
        }
    }
   
    public void listaTabCientifico(){
    
        DefaultTableModel modelo = (DefaultTableModel)tbCientifico.getModel();
        int posLin = 0;
        modelo.setRowCount(posLin);
        
        for(Cientificos livro : bdCientifico.getBdCientifico()){
            modelo.insertRow(posLin, new Object[]{livro.getNome(),livro.getCaracteristicas().getCapitulos(), livro.getCodigo(), 
                livro.getPrateleira(), livro.getSecao(), livro.getCaracteristicas().getPublicacao(), livro.getCaracteristicas().getAutor(),
                livro.getCaracteristicas().getEdicao(), livro.getCaracteristicas().getEditora(), livro.getCaracteristicas().getPaginas(),
                livro.getGrau_academico(), livro.getEstudos()});
            posLin++;
        }
    }
    
     public void listaTabHQ(){
    
        DefaultTableModel modelo = (DefaultTableModel)tbHQ.getModel();
        int posLin = 0;
        modelo.setRowCount(posLin);
        
         for(HQ livro : bdhq.getBdHQ()){
            modelo.insertRow(posLin, new Object[]{livro.getNome(),livro.getCaracteristicas().getCapitulos(), livro.getCodigo(), 
                livro.getPrateleira(), livro.getSecao(), livro.getCaracteristicas().getPublicacao(), livro.getCaracteristicas().getAutor(),
                livro.getCaracteristicas().getEdicao(), livro.getCaracteristicas().getEditora(), livro.getCaracteristicas().getPaginas(),
                livro.getIlustrador(), livro.getFranquia(), livro.getCor()});
            posLin++;
        }
    }
     
    public void selectTabRomance(){
         String valLinTab = "";
        int posLin = tbRomance.getSelectedRow();

        for (int coluna = 0; coluna < tbRomance.getColumnCount(); coluna++) {
            valLinTab += tbRomance.getModel().getValueAt(posLin, coluna).toString();

            if (coluna + 1 < tbRomance.getColumnCount()) {
                valLinTab += " - ";
            }
        }
        JOptionPane.showMessageDialog(
                null,
                "valor da Linha: " + valLinTab,
                "Seleção",
                1
        );
        
    }
    
    public void selectTabCientifico(){
         String valLinTab = "";
        int posLin = tbCientifico.getSelectedRow();

        for (int coluna = 0; coluna < tbCientifico.getColumnCount(); coluna++) {
            valLinTab += tbCientifico.getModel().getValueAt(posLin, coluna).toString();

            if (coluna + 1 < tbCientifico.getColumnCount()) {
                valLinTab += " - ";
            }
        }
        JOptionPane.showMessageDialog(
                null,
                "valor da Linha: " + valLinTab,
                "Seleção",
                1
        );
        
    }
    
    public void selectTabHQ(){
         String valLinTab = "";
        int posLin = tbHQ.getSelectedRow();

        for (int coluna = 0; coluna < tbHQ.getColumnCount(); coluna++) {
            valLinTab += tbHQ.getModel().getValueAt(posLin, coluna).toString();

            if (coluna + 1 < tbHQ.getColumnCount()) {
                valLinTab += " - ";
            }
        }
        JOptionPane.showMessageDialog(
                null,
                "valor da Linha: " + valLinTab,
                "Seleção",
                1
        );
        
    }
    
    public void selectTabDidatico(){
         String valLinTab = "";
        int posLin = tbDidatico.getSelectedRow();

        for (int coluna = 0; coluna < tbDidatico.getColumnCount(); coluna++) {
            valLinTab += tbDidatico.getModel().getValueAt(posLin, coluna).toString();

            if (coluna + 1 < tbDidatico.getColumnCount()) {
                valLinTab += " - ";
            }
        }
        JOptionPane.showMessageDialog(
                null,
                "valor da Linha: " + valLinTab,
                "Seleção",
                1
        );
        
    }
    
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
            java.util.logging.Logger.getLogger(RelGeral.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(RelGeral.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(RelGeral.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(RelGeral.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new RelGeral().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btVoltar;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JScrollPane jScrollPane5;
    private javax.swing.JLabel lbCientifico;
    private javax.swing.JLabel lbDidatico;
    private javax.swing.JLabel lbGeral;
    private javax.swing.JLabel lbHQ;
    private javax.swing.JLabel lbRomance;
    private javax.swing.JTable tbCientifico;
    private javax.swing.JTable tbDidatico;
    private javax.swing.JTable tbHQ;
    private javax.swing.JTable tbRomance;
    // End of variables declaration//GEN-END:variables
}
