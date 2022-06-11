
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;


public class CadCientifico extends javax.swing.JFrame {

    private Cientificos cientifico;
    private BdCientifico bdCientifico = new BdCientifico();
    
    private static CadCientifico cadCientifico;

    private CadCientifico() {
        initComponents();
    }

    public static CadCientifico getCadCientifico() {
        if (cadCientifico == null) {
            cadCientifico = new CadCientifico();
        }

        return cadCientifico;
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
        btLimpar = new javax.swing.JButton();
        btSair = new javax.swing.JButton();
        btRelGeral = new javax.swing.JButton();
        btSalvar = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        tabLivro = new javax.swing.JTable();
        lbArea = new javax.swing.JLabel();
        cxGrau = new javax.swing.JTextField();
        lbDisciplina = new javax.swing.JLabel();
        cxEstudo = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        lbTitulo.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        lbTitulo.setText("Cadastramento de Livro Gênero Científico");

        btVoltar.setText("Voltar");
        btVoltar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btVoltarActionPerformed(evt);
            }
        });

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
        btExcluir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btExcluirActionPerformed(evt);
            }
        });

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

        btRelGeral.setText("Relatório Geral");
        btRelGeral.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btRelGeralActionPerformed(evt);
            }
        });

        btSalvar.setText("Salvar");
        btSalvar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btSalvarActionPerformed(evt);
            }
        });

        tabLivro.setModel(new javax.swing.table.DefaultTableModel(
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
        tabLivro.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        tabLivro.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tabLivroMouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(tabLivro);

        lbArea.setText("Grau Academico:");

        lbDisciplina.setText("Estudo:");

        jLabel1.setText("--- Caracteristicas Gênero Romance ---");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane2)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(lbDisciplina)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(cxEstudo, javax.swing.GroupLayout.PREFERRED_SIZE, 106, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(lbPrateleira)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(cxPrateleira, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(lbSecao)
                                .addGap(18, 18, 18)
                                .addComponent(cxSecao, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(lbNome)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(cxNome, javax.swing.GroupLayout.PREFERRED_SIZE, 242, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(lbDados, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lbCaracteristicas)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(lbAutor)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(cxAutor, javax.swing.GroupLayout.PREFERRED_SIZE, 157, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(lbEditora)
                                .addGap(18, 18, 18)
                                .addComponent(cxEditora, javax.swing.GroupLayout.PREFERRED_SIZE, 137, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(lbArea)
                                .addGap(18, 18, 18)
                                .addComponent(cxGrau, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jLabel1)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(btVoltar)
                                .addGap(90, 90, 90)
                                .addComponent(lbTitulo, javax.swing.GroupLayout.PREFERRED_SIZE, 356, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(lbPaginas)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(cxPaginas, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(lbCapitulos)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(cxCapitulos, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(lbPublicacao)
                                .addGap(18, 18, 18)
                                .addComponent(cxPublicacao, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(lbEdicao)
                                .addGap(26, 26, 26)
                                .addComponent(cxEdicao, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(lbCodigo)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(cxCodigo, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED, 18, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(btLimpar)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btSalvar, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btSair)
                                .addGap(69, 69, 69))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(btExcluir, javax.swing.GroupLayout.PREFERRED_SIZE, 141, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(btRelGeral, javax.swing.GroupLayout.PREFERRED_SIZE, 123, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(btConsultar, javax.swing.GroupLayout.PREFERRED_SIZE, 141, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(btAlterar, javax.swing.GroupLayout.PREFERRED_SIZE, 141, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(87, 87, 87))))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btVoltar)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(btSair)
                        .addComponent(btSalvar)
                        .addComponent(btLimpar))
                    .addComponent(lbTitulo, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lbDados)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbNome)
                    .addComponent(cxNome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btAlterar))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lbCodigo)
                            .addComponent(cxCodigo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lbPrateleira)
                            .addComponent(cxPrateleira, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btExcluir, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lbSecao, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(cxSecao, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(16, 16, 16)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lbCaracteristicas)
                            .addComponent(btRelGeral))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lbPaginas)
                            .addComponent(cxPaginas, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lbCapitulos)
                            .addComponent(cxCapitulos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lbPublicacao)
                            .addComponent(cxPublicacao, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lbEdicao)
                            .addComponent(cxEdicao, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(9, 9, 9)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lbAutor)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(cxAutor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(lbEditora)
                                .addComponent(cxEditora, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(11, 11, 11)
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lbArea)
                            .addComponent(cxGrau, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(10, 10, 10)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lbDisciplina)
                            .addComponent(cxEstudo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(25, 25, 25)
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 161, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(btConsultar))
                .addGap(0, 36, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btConsultarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btConsultarActionPerformed
        consultar();
    }//GEN-LAST:event_btConsultarActionPerformed

    private void cxAutorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cxAutorActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cxAutorActionPerformed

    private void btAlterarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btAlterarActionPerformed
        alterar();
        listaTab();
    }//GEN-LAST:event_btAlterarActionPerformed

    private void btLimparActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btLimparActionPerformed
        clean();
    }//GEN-LAST:event_btLimparActionPerformed

    private void btSairActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btSairActionPerformed
        exit();
    }//GEN-LAST:event_btSairActionPerformed

    private void btSalvarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btSalvarActionPerformed

       cadastrarCientifico();
       clean();
       listaTab();
     
    }//GEN-LAST:event_btSalvarActionPerformed

    private void btRelGeralActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btRelGeralActionPerformed
        
    }//GEN-LAST:event_btRelGeralActionPerformed

    private void btVoltarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btVoltarActionPerformed
        exit();
    }//GEN-LAST:event_btVoltarActionPerformed

    private void tabLivroMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tabLivroMouseClicked
        selectTab();
    }//GEN-LAST:event_tabLivroMouseClicked

    private void btExcluirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btExcluirActionPerformed
       excluir();
       clean();
       listaTab();
    }//GEN-LAST:event_btExcluirActionPerformed
    
    
    
//     public void abreRelGerLivro(){
//        RelGeral.getRelGeral(bdromance).setVisible(true);
//    } ;
    
    public void cadastrarCientifico() {
        if (verifyLivro()) {
            cientifico = new Cientificos();
            Livro livro = new Livro();

            try {

                livro.setNome(cxNome.getText());
                livro.setSecao(cxSecao.getText());
                livro.setCodigo(Integer.parseInt(cxCodigo.getText()));
                livro.setPrateleira(Integer.parseInt(cxPrateleira.getText()));


                livro.getCaracteristicas().setPublicacao(cxPublicacao.getText());
                livro.getCaracteristicas().setAutor(cxAutor.getText());
                livro.getCaracteristicas().setEditora(cxEditora.getText());
                livro.getCaracteristicas().setPaginas(Integer.parseInt(cxPaginas.getText()));
                livro.getCaracteristicas().setCapitulos(Integer.parseInt(cxCapitulos.getText()));
                livro.getCaracteristicas().setEdicao(Integer.parseInt(cxEdicao.getText()));
                
                cientifico.setGrau_academico(cxGrau.getText());
                cientifico.setEstudos(cxEstudo.getText());
               
                recordLivro(cientifico);
                
            } catch (CodigoException e) {
                int x = e.codigo;
                String y = String.valueOf(x);;
                
                 if (y.length() > 5) {
                    e.limCodigo();
                    cxCodigo.setText("");
                    cxCodigo.requestFocus();
                }
            } catch (Exception e) {
                JOptionPane.showMessageDialog(null, "Valores incondizentes com o tipo do campo!", "Erro!", JOptionPane.ERROR_MESSAGE);
            }

        } else {
            JOptionPane.showMessageDialog(null, "Preencha todos os campos", "Erro!", JOptionPane.ERROR_MESSAGE);
        }

    }
   
    public void excluir() {
        Cientificos cient = bdCientifico.verifyLivro(cxNome.getText());

        if (cient != null) {
            cxCodigo.setText(Integer.toString(cient.getCodigo()));
            cxPrateleira.setText(Integer.toString(cient.getPrateleira()));
            cxSecao.setText(cient.getSecao());
            cxPaginas.setText(Integer.toString(cient.getCaracteristicas().getPaginas()));
            cxCapitulos.setText(Integer.toString(cient.getCaracteristicas().getCapitulos()));
            cxPublicacao.setText(cient.getCaracteristicas().getPublicacao());
            cxAutor.setText(cient.getCaracteristicas().getAutor());
            cxEdicao.setText(Integer.toString(cient.getCaracteristicas().getEdicao()));
            cxNome.setText(cient.getNome());
            cxEditora.setText(cient.getCaracteristicas().getEditora());
            cxGrau.setText(cient.getGrau_academico());
            cxEstudo.setText(cient.getEstudos());
           
            

            int resp = JOptionPane.showConfirmDialog(null, "Deseja excluir este Motor?", "Exclusão", JOptionPane.YES_NO_CANCEL_OPTION);
            if (resp == 0) {
                cient = bdCientifico.removeCientificos(cient);
                if (cient == null) {
                    JOptionPane.showMessageDialog(null, "Livro excluido com sucesso!", "Exclusão OK", 1);
                    clean();
                } else {
                    JOptionPane.showMessageDialog(null, "Livro ja excluido!", "Erro na exclusão", 1);
                }
                listaTab();
            }

        } else {
            JOptionPane.showMessageDialog(null, "Livro não encontrado!", "Falha na consulta!", JOptionPane.ERROR_MESSAGE);
        }

    }
  

    public void alterar() {
        if (verifyLivro()) {
            cientifico = new Cientificos();
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
                
                cientifico.setGrau_academico(cxGrau.getText());
                cientifico.setEstudos(cxEstudo.getText());
               
               

                Cientificos cientAtu = bdCientifico.atualizaLivroCientifico(cientifico);

                if (cientAtu == null) {
                    int resp = JOptionPane.showConfirmDialog(null, "Livro não registrado, deseja registrar?", "Resultado", JOptionPane.YES_NO_CANCEL_OPTION);
                    if (resp == 0) {
                        recordLivro(cientifico);
                    }
                } else {
                    JOptionPane.showMessageDialog(null, "Livro alterado com sucesso!", "Alteração OK", 1);
                    
                }

            } catch (CodigoException e) {
                int x = e.codigo;
                String y = String.valueOf(x);;
                
                 if (y.length() > 5) {
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
    
    public void recordLivro(Cientificos a) {

       cientifico = bdCientifico.cadCientifico(a);
        if (cientifico != null) {
            JOptionPane.showMessageDialog(null, "Livro cadastrado com sucesso!", "Cadastro OK", 1);
            clean();
        } else {
            JOptionPane.showMessageDialog(null, "Livro ja cadastrado!", "Erro no cadastro", 1);
        }
       
    }
    
     public void listaTab(){
    
        DefaultTableModel modelo = (DefaultTableModel)tabLivro.getModel();
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
   
    public void selectTab(){
        String valLinTab = "";
        int posLin = tabLivro.getSelectedRow();
       
        for(int coluna = 0; coluna < tabLivro.getColumnCount(); coluna++){
            valLinTab += tabLivro.getModel().getValueAt(posLin, coluna).toString();
            
            if(coluna+1 < tabLivro.getColumnCount()){
                valLinTab += " - ";
            }
        }
        JOptionPane.showMessageDialog(
                null,
                "valor da Linha: "+valLinTab,
                "Seleção",
                1
        );
        
    }
    
    
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
                || "".equals(cxEditora.getText())
                || "".equals(cxEstudo.getText())
                || "".equals(cxGrau.getText()));

    }

    
    public void clean() {
        cxCodigo.setText("");
        cxPrateleira.setText("");
        cxSecao.setText("");
        cxPaginas.setText("");
        cxCapitulos.setText("");
        cxPublicacao.setText("");
        cxAutor.setText("");
        cxEdicao.setText("");
        cxNome.setText("");
        cxEditora.setText("");
        cxNome.requestFocus();
        cxEstudo.setText("");
        cxGrau.setText("");
    }
    
    public void exit() {
        int resp = JOptionPane.showConfirmDialog(null, "Deseja Sair?", "Saida", JOptionPane.YES_NO_CANCEL_OPTION);

        if (resp == 0) {
            this.dispose();
        }
    }
    
    public void consultar(){
        Cientificos cient = bdCientifico.verifyLivro(cxNome.getText());
        
        
         if(cient != null){
            cxCodigo.setText(Integer.toString(cient.getCodigo()));
            cxPrateleira.setText(Integer.toString(cient.getPrateleira()));
            cxSecao.setText(cient.getSecao());
            cxPaginas.setText(Integer.toString(cient.getCaracteristicas().getPaginas()));
            cxCapitulos.setText(Integer.toString(cient.getCaracteristicas().getCapitulos()));
            cxPublicacao.setText(cient.getCaracteristicas().getPublicacao());
            cxAutor.setText(cient.getCaracteristicas().getAutor());
            cxEdicao.setText(Integer.toString(cient.getCaracteristicas().getEdicao()));
            cxNome.setText(cient.getNome());
            cxEditora.setText(cient.getCaracteristicas().getEditora());
            cxGrau.setText(cient.getGrau_academico());
            cxEstudo.setText(cient.getEstudos());
           
          
           
        }
        else{
               JOptionPane.showMessageDialog(
                   null,
                   "Não existe livro com esse NOME!",
                   "Erro na Consulta",
                    0
                );
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
            java.util.logging.Logger.getLogger(CadRomance.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(CadRomance.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(CadRomance.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(CadRomance.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            @Override
            public void run() {
                new CadCientifico().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btAlterar;
    private javax.swing.JButton btConsultar;
    private javax.swing.JButton btExcluir;
    private javax.swing.JButton btLimpar;
    private javax.swing.JButton btRelGeral;
    private javax.swing.JButton btSair;
    private javax.swing.JButton btSalvar;
    private javax.swing.JButton btVoltar;
    private javax.swing.JTextField cxAutor;
    private javax.swing.JTextField cxCapitulos;
    private javax.swing.JTextField cxCodigo;
    private javax.swing.JTextField cxEdicao;
    private javax.swing.JTextField cxEditora;
    private javax.swing.JTextField cxEstudo;
    private javax.swing.JTextField cxGrau;
    private javax.swing.JTextField cxNome;
    private javax.swing.JTextField cxPaginas;
    private javax.swing.JTextField cxPrateleira;
    private javax.swing.JTextField cxPublicacao;
    private javax.swing.JTextField cxSecao;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JLabel lbArea;
    private javax.swing.JLabel lbAutor;
    private javax.swing.JLabel lbCapitulos;
    private javax.swing.JLabel lbCaracteristicas;
    private javax.swing.JLabel lbCodigo;
    private javax.swing.JLabel lbDados;
    private javax.swing.JLabel lbDisciplina;
    private javax.swing.JLabel lbEdicao;
    private javax.swing.JLabel lbEditora;
    private javax.swing.JLabel lbNome;
    private javax.swing.JLabel lbPaginas;
    private javax.swing.JLabel lbPrateleira;
    private javax.swing.JLabel lbPublicacao;
    private javax.swing.JLabel lbSecao;
    private javax.swing.JLabel lbTitulo;
    private javax.swing.JTable tabLivro;
    // End of variables declaration//GEN-END:variables

    }

