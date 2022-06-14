//Beatriz Cristina de Faria RA: 2349710
//POO - C31

import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class CadRomance extends javax.swing.JFrame {

    private Romance romance;
    private BdRomance bdromance = new BdRomance();

    private static CadRomance cadRomance;

    private CadRomance() {

        initComponents();
    }

    public static CadRomance getCadRomance() {
        if (cadRomance == null) {
            cadRomance = new CadRomance();
        }

        return cadRomance;
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
        lbPersonagens = new javax.swing.JLabel();
        cxPersonagens = new javax.swing.JTextField();
        lbTipo = new javax.swing.JLabel();
        cxTipo = new javax.swing.JTextField();
        cxNarrador = new javax.swing.JTextField();
        lbNarrador = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        lbTaxa = new javax.swing.JLabel();
        btnTaxes = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        lbTitulo.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        lbTitulo.setText("Cadastramento de Livro Gênero Romance");

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
        tabLivro.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        tabLivro.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tabLivroMouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(tabLivro);

        lbPersonagens.setText("Personagens:");

        lbTipo.setText("Tipo do Romance:");

        lbNarrador.setText("Narrador:");

        jLabel1.setText("--- Caracteristicas Gênero Romance ---");

        jLabel2.setText("Taxa da Editora: ");

        lbTaxa.setText("R$ 0,00");

        btnTaxes.setText("Calcular Taxa");
        btnTaxes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnTaxesActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane2)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
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
                                .addComponent(lbPersonagens)
                                .addGap(18, 18, 18)
                                .addComponent(cxPersonagens, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(lbNarrador)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(cxNarrador, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE))
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
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 115, Short.MAX_VALUE)
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
                                    .addComponent(jLabel2)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                        .addGroup(layout.createSequentialGroup()
                                            .addComponent(btnTaxes)
                                            .addGap(18, 18, 18)
                                            .addComponent(lbTaxa))
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(btExcluir, javax.swing.GroupLayout.PREFERRED_SIZE, 141, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(btRelGeral, javax.swing.GroupLayout.PREFERRED_SIZE, 123, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(btConsultar, javax.swing.GroupLayout.PREFERRED_SIZE, 141, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(btAlterar, javax.swing.GroupLayout.PREFERRED_SIZE, 141, javax.swing.GroupLayout.PREFERRED_SIZE))))
                                .addGap(87, 87, 87))))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(lbPrateleira)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(cxPrateleira, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(lbSecao)
                                .addGap(18, 18, 18)
                                .addComponent(cxSecao, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(lbTipo)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(cxTipo, javax.swing.GroupLayout.PREFERRED_SIZE, 106, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
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
                            .addComponent(lbPersonagens)
                            .addComponent(cxPersonagens, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lbNarrador)
                            .addComponent(cxNarrador, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(10, 10, 10)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lbTipo)
                            .addComponent(cxTipo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(25, 25, 25)
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 161, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(btConsultar)
                        .addGap(130, 130, 130)
                        .addComponent(jLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lbTaxa)
                            .addComponent(btnTaxes))))
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

        cadastrarRomance();
        listaTab();

    }//GEN-LAST:event_btSalvarActionPerformed

    private void btRelGeralActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btRelGeralActionPerformed
        abreRelGerLivro();
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

    private void btnTaxesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnTaxesActionPerformed
        if (cxPaginas.getText().equals("")) {
            JOptionPane.showMessageDialog(null, "Inserir numero de paginas!", "Erro!", JOptionPane.ERROR_MESSAGE);
        } else {
            int pages = Integer.parseInt(cxPaginas.getText());
            calctaxa(pages);
        }
        
    }//GEN-LAST:event_btnTaxesActionPerformed


    public void calctaxa(int fee) {
        Romance rom = new Romance();
        double taxa = rom.calcTaxaEditora(fee);

        lbTaxa.setText(String.format("R$ %.2f", taxa));
    }

    public void abreRelGerLivro() {
        RelGeral.getRelGeralRomance(bdromance).setVisible(true);
    }

    public Romance registInformations(Romance rom) {

        rom.setNome(cxNome.getText());
        rom.setSecao(cxSecao.getText());

        rom.getCaracteristicas().setPublicacao(cxPublicacao.getText());
        rom.getCaracteristicas().setAutor(cxAutor.getText());
        rom.getCaracteristicas().setEditora(cxEditora.getText());
        rom.setTipo_romance(cxTipo.getText());

        try {
            rom.setCodigo(Integer.parseInt(cxCodigo.getText()));
        } catch (CodigoException e) {
            e.limCodigo();
            cxCodigo.setText("");
            cxCodigo.requestFocus();
            return null;
        } catch (NumberFormatException nfe) {
            JOptionPane.showMessageDialog(null, "O código deve ser um inteiro!", "Erro!", JOptionPane.ERROR_MESSAGE);
            return null;
        }

        try {
            rom.setPrateleira(Integer.parseInt(cxPrateleira.getText()));
        } catch (PrateleiraException nfe) {
            nfe.limPrateleira();
            cxPrateleira.setText("");
            cxPrateleira.requestFocus();
            JOptionPane.showMessageDialog(null, "Há somente 10 prateleiras!", "Erro!", JOptionPane.ERROR_MESSAGE);
            return null;
        } catch (NumberFormatException nfe) {
            JOptionPane.showMessageDialog(null, "A prateleira deve ser um inteiro!", "Erro!", JOptionPane.ERROR_MESSAGE);
            return null;
        }

        try {
            rom.setNarrador(Integer.parseInt(cxNarrador.getText()));
        } catch (NarradorException nfe) {
            nfe.limNarrador();
            cxNarrador.setText("");
            cxNarrador.requestFocus();
            JOptionPane.showMessageDialog(null, "O narrador deve ser de 1 (primeira) ou 3 (terceira) pessoa!", "Erro!", JOptionPane.ERROR_MESSAGE);
            return null;
        }

        try {
              rom.getCaracteristicas().setPaginas(Integer.parseInt(cxPaginas.getText()));
        } catch (NumberFormatException nfe) {
            cxPaginas.setText("");
            cxPaginas.requestFocus();
            JOptionPane.showMessageDialog(null, "A página deve ser um inteiro!", "Erro!", JOptionPane.ERROR_MESSAGE);
            return null;
        }

        try {
            rom.getCaracteristicas().setCapitulos(Integer.parseInt(cxCapitulos.getText()));
        } catch (NumberFormatException nfe) {
            cxCapitulos.setText("");
            cxCapitulos.requestFocus();
            JOptionPane.showMessageDialog(null, "A página deve ser um inteiro!", "Erro!", JOptionPane.ERROR_MESSAGE);
            return null;
        }

        try {
            rom.getCaracteristicas().setEdicao(Integer.parseInt(cxEdicao.getText()));
        } catch (NumberFormatException nfe) {
            cxEdicao.setText("");
            cxEdicao.requestFocus();
            JOptionPane.showMessageDialog(null, "A página deve ser um inteiro!", "Erro!", JOptionPane.ERROR_MESSAGE);
            return null;
        }

        try {
            rom.setPersonagens(Integer.parseInt(cxPersonagens.getText()));
        } catch (NumberFormatException nfe) {
            cxPersonagens.setText("");
            cxPersonagens.requestFocus();
            JOptionPane.showMessageDialog(null, "O persoangem deve ser um inteiro!", "Erro!", JOptionPane.ERROR_MESSAGE);
            return null;
        }

        return rom;

    }

    public void cadastrarRomance() {
        if (verifyLivro()) {
            romance = new Romance();
            Romance romToSave = registInformations(romance);
            
            if(romToSave != null)
                recordLivro(romToSave);

        } else {
            JOptionPane.showMessageDialog(null, "Preencha todos os campos", "Erro!", JOptionPane.ERROR_MESSAGE);
        }

    }

    public void excluir() {
        Romance rom = bdromance.verifyLivro(cxNome.getText());

        if (rom != null) {
            cxCodigo.setText(Integer.toString(rom.getCodigo()));
            cxPrateleira.setText(Integer.toString(rom.getPrateleira()));
            cxSecao.setText(rom.getSecao());
            cxPaginas.setText(Integer.toString(rom.getCaracteristicas().getPaginas()));
            cxCapitulos.setText(Integer.toString(rom.getCaracteristicas().getCapitulos()));
            cxPublicacao.setText(rom.getCaracteristicas().getPublicacao());
            cxAutor.setText(rom.getCaracteristicas().getAutor());
            cxEdicao.setText(Integer.toString(rom.getCaracteristicas().getEdicao()));
            cxNome.setText(rom.getNome());
            cxEditora.setText(rom.getCaracteristicas().getEditora());
            cxPersonagens.setText(Integer.toString(rom.getPersonagens()));
            cxTipo.setText(rom.getTipo_romance());
            cxNarrador.setText(Integer.toString(rom.getNarrador()));

            int resp = JOptionPane.showConfirmDialog(null, "Deseja excluir este Livro?", "Exclusão", JOptionPane.YES_NO_CANCEL_OPTION);
            if (resp == 0) {
                rom = bdromance.removeRomance(rom);
                if (rom == null) {
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
            romance = new Romance();
            Romance romToSave = registInformations(romance);
            
            if(romToSave != null)
                recordLivro(romToSave);
            
            
            Romance romanceAtu = bdromance.atualizaLivroRomance(romToSave);

            if (romanceAtu == null) {
                int resp = JOptionPane.showConfirmDialog(null, "Livro não registrado, deseja registrar?", "Resultado", JOptionPane.YES_NO_CANCEL_OPTION);
                if (resp == 0) {
                    recordLivro(romance);
                }
            } else {
                JOptionPane.showMessageDialog(null, "Livro alterado com sucesso!", "Alteração OK", 1);

            }
            
        } else {
            JOptionPane.showMessageDialog(null, "Preencha todos os campos", "Erro!", JOptionPane.ERROR_MESSAGE);
        }

         
    }

    public void recordLivro(Romance a) {

        romance = bdromance.cadRomance(a);
        if (romance != null) {
            JOptionPane.showMessageDialog(null, "Livro cadastrado com sucesso!", "Cadastro OK", 1);
            clean();
        } else {
            JOptionPane.showMessageDialog(null, "Livro ja cadastrado!", "Erro no cadastro", 1);
        }

    }

    public void listaTab() {

        DefaultTableModel modelo = (DefaultTableModel) tabLivro.getModel();
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

    public void selectTab() {
        String valLinTab = "";
        int posLin = tabLivro.getSelectedRow();

        for (int coluna = 0; coluna < tabLivro.getColumnCount(); coluna++) {
            valLinTab += tabLivro.getModel().getValueAt(posLin, coluna).toString();

            if (coluna + 1 < tabLivro.getColumnCount()) {
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
                || "".equals(cxTipo.getText())
                || "".equals(cxPersonagens.getText())
                || "".equals(cxNarrador.getText()));

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
        cxTipo.setText("");
        cxNarrador.setText("");
        cxPersonagens.setText("");
    }

    public void exit() {
        int resp = JOptionPane.showConfirmDialog(null, "Deseja Sair?", "Saida", JOptionPane.YES_NO_CANCEL_OPTION);

        if (resp == 0) {
            this.dispose();
        }
    }

    public void consultar() {
        Romance rom = bdromance.verifyLivro(cxNome.getText());

        if (rom != null) {
            cxCodigo.setText(Integer.toString(rom.getCodigo()));
            cxPrateleira.setText(Integer.toString(rom.getPrateleira()));
            cxSecao.setText(rom.getSecao());
            cxPaginas.setText(Integer.toString(rom.getCaracteristicas().getPaginas()));
            cxCapitulos.setText(Integer.toString(rom.getCaracteristicas().getCapitulos()));
            cxPublicacao.setText(rom.getCaracteristicas().getPublicacao());
            cxAutor.setText(rom.getCaracteristicas().getAutor());
            cxEdicao.setText(Integer.toString(rom.getCaracteristicas().getEdicao()));
            cxNome.setText(rom.getNome());
            cxEditora.setText(rom.getCaracteristicas().getEditora());
            cxPersonagens.setText(Integer.toString(rom.getPersonagens()));
            cxTipo.setText(rom.getTipo_romance());
            cxNarrador.setText(Integer.toString(rom.getNarrador()));

        } else {
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
                new CadRomance().setVisible(true);
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
    private javax.swing.JButton btnTaxes;
    private javax.swing.JTextField cxAutor;
    private javax.swing.JTextField cxCapitulos;
    private javax.swing.JTextField cxCodigo;
    private javax.swing.JTextField cxEdicao;
    private javax.swing.JTextField cxEditora;
    private javax.swing.JTextField cxNarrador;
    private javax.swing.JTextField cxNome;
    private javax.swing.JTextField cxPaginas;
    private javax.swing.JTextField cxPersonagens;
    private javax.swing.JTextField cxPrateleira;
    private javax.swing.JTextField cxPublicacao;
    private javax.swing.JTextField cxSecao;
    private javax.swing.JTextField cxTipo;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JLabel lbAutor;
    private javax.swing.JLabel lbCapitulos;
    private javax.swing.JLabel lbCaracteristicas;
    private javax.swing.JLabel lbCodigo;
    private javax.swing.JLabel lbDados;
    private javax.swing.JLabel lbEdicao;
    private javax.swing.JLabel lbEditora;
    private javax.swing.JLabel lbNarrador;
    private javax.swing.JLabel lbNome;
    private javax.swing.JLabel lbPaginas;
    private javax.swing.JLabel lbPersonagens;
    private javax.swing.JLabel lbPrateleira;
    private javax.swing.JLabel lbPublicacao;
    private javax.swing.JLabel lbSecao;
    private javax.swing.JLabel lbTaxa;
    private javax.swing.JLabel lbTipo;
    private javax.swing.JLabel lbTitulo;
    private javax.swing.JTable tabLivro;
    // End of variables declaration//GEN-END:variables

}
