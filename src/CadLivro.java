
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;


public class CadLivro extends javax.swing.JFrame {

    private Livro livro;
    private BdLivro livroNovo = new BdLivro();

    private static CadLivro cadLivro;
    
    public CadLivro() {
        initComponents();
    }
    
    public static CadLivro getCadLivro() {
        if (cadLivro == null) {
            cadLivro = new CadLivro();
        }

        return cadLivro;
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lbTitulo = new javax.swing.JLabel();
        btVoltar = new javax.swing.JButton();
        btAlterar = new javax.swing.JButton();
        btConsultar = new javax.swing.JButton();
        btExcluir = new javax.swing.JButton();
        lbNome = new javax.swing.JLabel();
        lbCodigo = new javax.swing.JLabel();
        lbPrateleira = new javax.swing.JLabel();
        lbSecao = new javax.swing.JLabel();
        lbDados = new javax.swing.JLabel();
        cxNome = new javax.swing.JTextField();
        cxCodigo = new javax.swing.JTextField();
        cxPrateleira = new javax.swing.JTextField();
        cxSecao = new javax.swing.JTextField();
        lbCaracteristicas = new javax.swing.JLabel();
        lbPaginas = new javax.swing.JLabel();
        cxPaginas = new javax.swing.JTextField();
        lbCapitulos = new javax.swing.JLabel();
        cxCapitulos = new javax.swing.JTextField();
        lbPublicacao = new javax.swing.JLabel();
        cxPublicacao = new javax.swing.JTextField();
        lbEdicao = new javax.swing.JLabel();
        cxEdicao = new javax.swing.JTextField();
        lbAutor = new javax.swing.JLabel();
        cxAutor = new javax.swing.JTextField();
        lbEditora = new javax.swing.JLabel();
        cxEditora = new javax.swing.JTextField();
        lbTipoGenero = new javax.swing.JLabel();
        btRomance = new javax.swing.JButton();
        btHQ = new javax.swing.JButton();
        btCientifico = new javax.swing.JButton();
        btDidatico = new javax.swing.JButton();
        btLimpar = new javax.swing.JButton();
        btSair = new javax.swing.JButton();
        btRelRomance = new javax.swing.JButton();
        btRelHQ = new javax.swing.JButton();
        btRelCientifico = new javax.swing.JButton();
        btRelDidatico = new javax.swing.JButton();
        btRelGeral = new javax.swing.JButton();
        btSalvar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        lbTitulo.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        lbTitulo.setText("Cadastramento de Livro");

        btVoltar.setText("Voltar");

        btAlterar.setText("Alterar pelo nome");
        btAlterar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btAlterarActionPerformed(evt);
            }
        });

        btConsultar.setText("Consultar pelo nome");
        btConsultar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btConsultarActionPerformed(evt);
            }
        });

        btExcluir.setText("Excluir pelo nome");

        lbNome.setText("Nome do Livro:");

        lbCodigo.setText("Código:");

        lbPrateleira.setText("Prateleira:");

        lbSecao.setText("Seção:");

        lbDados.setText("--- Dados do Livro ---");

        lbCaracteristicas.setText("--- Caracteristicas do Livro ---");

        lbPaginas.setText("Páginas: ");

        lbCapitulos.setText("Capítulos:");

        lbPublicacao.setText("Data Publicação:");

        lbEdicao.setText("Edição:");

        lbAutor.setText("Autor(a):");

        cxAutor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cxAutorActionPerformed(evt);
            }
        });

        lbEditora.setText("Editora:");

        lbTipoGenero.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        lbTipoGenero.setText("Tipo de Gênero:");

        btRomance.setText("Romance");
        btRomance.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btRomanceActionPerformed(evt);
            }
        });

        btHQ.setText("HQ");

        btCientifico.setText("Científico");

        btDidatico.setText("Didático");

        btLimpar.setText("Limpar");
        btLimpar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btLimparActionPerformed(evt);
            }
        });

        btSair.setText("Sair");
        btSair.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btSairActionPerformed(evt);
            }
        });

        btRelRomance.setText("Relatório Romance");

        btRelHQ.setText("Relatório HQ");

        btRelCientifico.setText("Relatório Científico");

        btRelDidatico.setText("Relatório Didático");

        btRelGeral.setText("Relatório Geral");

        btSalvar.setText("Salvar");
        btSalvar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btSalvarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(lbAutor)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(cxAutor, javax.swing.GroupLayout.PREFERRED_SIZE, 157, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(62, 62, 62)
                        .addComponent(lbEditora)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(cxEditora, javax.swing.GroupLayout.PREFERRED_SIZE, 137, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(lbPrateleira)
                                            .addComponent(lbSecao))
                                        .addGap(18, 18, 18)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(cxSecao, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(cxPrateleira, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(lbNome)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(cxNome, javax.swing.GroupLayout.PREFERRED_SIZE, 242, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(lbCodigo)
                                        .addGap(12, 12, 12)
                                        .addComponent(cxCodigo, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGap(77, 77, 77))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(lbPaginas)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(cxPaginas, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(lbCapitulos)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(cxCapitulos, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(lbPublicacao)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(cxPublicacao, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(lbEdicao)
                                .addGap(18, 18, 18)))
                        .addComponent(cxEdicao, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(lbDados, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lbCaracteristicas))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(btAlterar, javax.swing.GroupLayout.PREFERRED_SIZE, 141, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btExcluir, javax.swing.GroupLayout.PREFERRED_SIZE, 141, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btConsultar)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(btCientifico)
                                .addGap(152, 152, 152)))
                        .addGap(55, 55, 55))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(btDidatico, javax.swing.GroupLayout.PREFERRED_SIZE, 81, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(33, 33, 33)
                                .addComponent(btRelDidatico, javax.swing.GroupLayout.PREFERRED_SIZE, 132, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(lbTipoGenero, javax.swing.GroupLayout.PREFERRED_SIZE, 108, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGroup(layout.createSequentialGroup()
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addComponent(btRomance, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(btHQ, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                    .addGap(36, 36, 36)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(btRelRomance)
                                        .addComponent(btRelHQ, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(btRelCientifico)))))
                        .addGap(42, 42, 42))))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(btVoltar)
                .addGap(210, 210, 210)
                .addComponent(lbTitulo, javax.swing.GroupLayout.PREFERRED_SIZE, 201, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(346, 346, 346))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btRelGeral)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btLimpar)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btSair)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btSalvar)
                .addGap(222, 222, 222))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(btVoltar)
                        .addGap(54, 54, 54)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btAlterar)
                            .addComponent(lbDados))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btConsultar)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(lbNome)
                                .addComponent(cxNome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btExcluir, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lbCodigo)
                            .addComponent(cxCodigo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lbPrateleira)
                            .addComponent(cxPrateleira, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(18, 18, 18)
                                .addComponent(lbTipoGenero, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(lbSecao, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(cxSecao, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(lbTitulo, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(196, 196, 196)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btRomance)
                    .addComponent(btRelRomance)
                    .addComponent(lbCaracteristicas, javax.swing.GroupLayout.Alignment.TRAILING))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(lbPaginas)
                        .addComponent(cxPaginas, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(lbCapitulos)
                        .addComponent(cxCapitulos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(lbPublicacao)
                        .addComponent(cxPublicacao, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(cxEdicao, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(btHQ)
                        .addComponent(lbEdicao))
                    .addComponent(btRelHQ))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lbAutor)
                            .addComponent(cxAutor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lbEditora)
                            .addComponent(cxEditora, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btCientifico)
                            .addComponent(btRelCientifico))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btDidatico)
                            .addComponent(btRelDidatico))))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btRelGeral)
                    .addComponent(btLimpar)
                    .addComponent(btSair)
                    .addComponent(btSalvar))
                .addGap(0, 35, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btConsultarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btConsultarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btConsultarActionPerformed

    private void cxAutorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cxAutorActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cxAutorActionPerformed

    private void btRomanceActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btRomanceActionPerformed
        btRomance.setVisible(true);
    }//GEN-LAST:event_btRomanceActionPerformed

    private void btAlterarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btAlterarActionPerformed
        alterar();
    }//GEN-LAST:event_btAlterarActionPerformed

    private void btLimparActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btLimparActionPerformed
        clean();
    }//GEN-LAST:event_btLimparActionPerformed

    private void btSairActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btSairActionPerformed
        exit();
    }//GEN-LAST:event_btSairActionPerformed

    private void btSalvarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btSalvarActionPerformed

       
    }//GEN-LAST:event_btSalvarActionPerformed

    
    public void alterar() {
        if (verifyLivro()) {
            livro = new Livro();
            Livro livro = new Livro();

            try {
                livro.setNome(cxNome.getText());
                livro.setSecao(cxSecao.getText());
                livro.setCodigo(Integer.parseInt(cxCodigo.getText()));
                livro.setPrateleira(Integer.parseInt(cxPrateleira.getText()));
                
                livro.getCaracteristicas().setPublicacao(cxPublicacao.getText());
                livro.getCaracteristicas().setAutor(cxAutor.getText());
                livro.getCaracteristicas().setEditora(cxEditora.getText());
                livro.getCaracteristicas().setPaginas(Integer.parseInt(cxPublicacao.getText()));
                livro.getCaracteristicas().setCapitulos(Integer.parseInt(cxCapitulos.getText()));
                livro.getCaracteristicas().setEdicao(Integer.parseInt(cxEdicao.getText()));

                Livro livroalt = livroNovo.atualizaLivro(livro);

                if (livroalt == null) {
                    int resp = JOptionPane.showConfirmDialog(null, "Livro não resgitrado, deseja registrar?", "Resultado", JOptionPane.YES_NO_CANCEL_OPTION);
                    if (resp == 0) {
                        recordLivro(livro);
                    }
                } else {
                    JOptionPane.showMessageDialog(null, "Livro alterado com sucesso!", "Alteração OK", 1);
                    
                }

            } catch (CodigoException e) {
                
                 if (e.codigo == 0) {
                    e.limCodigo();
                    cxCodigo.setText("");
                    cxCodigo.requestFocus();
                }
            } catch (Exception e) {
                JOptionPane.showMessageDialog(null, "O código deve ser menor que 5 caracteres!", "Erro!", JOptionPane.ERROR_MESSAGE);
            }

        } else {
            JOptionPane.showMessageDialog(null, "Preencha todos os campos", "Erro!", JOptionPane.ERROR_MESSAGE);
        }
    }
    
    public void recordLivro(Livro a) {

        livro = livroNovo.cadLivro(a);
        if (livro != null) {
            JOptionPane.showMessageDialog(null, "Livro cadastrado com sucesso!", "Cadastro OK", 1);
            clean();
        } else {
            JOptionPane.showMessageDialog(null, "Livro ja cadastrado!", "Erro no cadastro", 1);
        }
       
    }
    
    public void clean() {
        cxEditora.requestFocus();
        cxCodigo.setText("");
        cxPrateleira.setText("");
        cxSecao.setText("");
        cxPaginas.setText("");
        cxCapitulos.setText("");
        cxPublicacao.setText("");
        cxAutor.setText("");
        cxEdicao.setText("");
        cxNome.setText("");
        cxNome.requestFocus();
    }
    
    public void exit() {
        int resp = JOptionPane.showConfirmDialog(null, "Deseja Sair?", "Saida", JOptionPane.YES_NO_CANCEL_OPTION);

        if (resp == 0) {
            this.dispose();
        }
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
            java.util.logging.Logger.getLogger(CadLivro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(CadLivro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(CadLivro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(CadLivro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new CadLivro().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btAlterar;
    private javax.swing.JButton btCientifico;
    private javax.swing.JButton btConsultar;
    private javax.swing.JButton btDidatico;
    private javax.swing.JButton btExcluir;
    private javax.swing.JButton btHQ;
    private javax.swing.JButton btLimpar;
    private javax.swing.JButton btRelCientifico;
    private javax.swing.JButton btRelDidatico;
    private javax.swing.JButton btRelGeral;
    private javax.swing.JButton btRelHQ;
    private javax.swing.JButton btRelRomance;
    private javax.swing.JButton btRomance;
    private javax.swing.JButton btSair;
    private javax.swing.JButton btSalvar;
    private javax.swing.JButton btVoltar;
    private javax.swing.JTextField cxAutor;
    private javax.swing.JTextField cxCapitulos;
    private javax.swing.JTextField cxCodigo;
    private javax.swing.JTextField cxEdicao;
    private javax.swing.JTextField cxEditora;
    private javax.swing.JTextField cxNome;
    private javax.swing.JTextField cxPaginas;
    private javax.swing.JTextField cxPrateleira;
    private javax.swing.JTextField cxPublicacao;
    private javax.swing.JTextField cxSecao;
    private javax.swing.JLabel lbAutor;
    private javax.swing.JLabel lbCapitulos;
    private javax.swing.JLabel lbCaracteristicas;
    private javax.swing.JLabel lbCodigo;
    private javax.swing.JLabel lbDados;
    private javax.swing.JLabel lbEdicao;
    private javax.swing.JLabel lbEditora;
    private javax.swing.JLabel lbNome;
    private javax.swing.JLabel lbPaginas;
    private javax.swing.JLabel lbPrateleira;
    private javax.swing.JLabel lbPublicacao;
    private javax.swing.JLabel lbSecao;
    private javax.swing.JLabel lbTipoGenero;
    private javax.swing.JLabel lbTitulo;
    // End of variables declaration//GEN-END:variables

    public boolean verifyLivro() {
        return !("".equals(cxNome.getText())
                || "".equals(cxCodigo.getText())
                || "".equals(cxPrateleira.getText())
                || "".equals(cxSecao.getText())
                || "".equals(cxPaginas.getText())
                || "".equals(cxCapitulos.getText())
                || "".equals(cxPublicacao.getText())
                || "".equals(cxAutor.getText())
                || "".equals(cxEdicao.getText())
                || "".equals(cxEditora.getText()));

    }

   
    }

