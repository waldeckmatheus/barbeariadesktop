package view;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Image;
import java.util.List;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.table.DefaultTableCellRenderer;
import javax.swing.table.DefaultTableModel;
import model.bean.Funcionario;
import model.bean.Produto;
import model.dao.ProdutoDao;

/**
 *
 * @author Equipe barbearia
 */
public class ViewGerenciarProduto extends javax.swing.JFrame {

    private int pcod;
    private final ProdutoDao dao;
    private DefaultTableModel modelo;
    private final Funcionario funcionario;

    private final String mensagemItemNaoSelecionado = "Nenhum produto foi selecionado, por favor selecionar.";
    private final String mensagemItemExclusao = "Deseja realmente EXCLUIR o produto ?";
    /**
     * Creates new form Cliente
     * @param funcionario
     */
    public ViewGerenciarProduto(Funcionario funcionario) {
        this.pcod = 0;
        this.funcionario = funcionario;
        this.dao = new ProdutoDao();
        //------------------------
        this.initComponents();
        this.txtpesqnome.requestFocus();
        //------------------------
        this.preecherTabelaProduto();
        this.ajustarLayout();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        ImageIcon icon=new ImageIcon(getClass().getResource("/imagens/barbeiro2.jpg")); Image image = icon.getImage();
        jPanel1 = new javax.swing.JPanel(){  public void paintComponent(Graphics g){ g.drawImage(image,0,0,getWidth(),getHeight(),this); }  };
        jPanel2 = new javax.swing.JPanel();
        btCadastrar = new javax.swing.JButton();
        btAlterar = new javax.swing.JButton();
        btVisualizar = new javax.swing.JButton();
        btExcluir = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        btFecharJanela = new javax.swing.JButton();
        jPanel4 = new javax.swing.JPanel(){  public void paintComponent(Graphics g){ g.drawImage(image,0,0,getWidth(),getHeight(),this); }  };
        jScrollPane1 = new javax.swing.JScrollPane();
        tbprodutos = new javax.swing.JTable();
        jPanel3 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        txtpesqnome =

        new utilitarios.JTextFieldHint(new JTextField(),null ,"Nome do produto");

        setTitle("Gerenciamento de Produto");

        jPanel1.setBackground(new java.awt.Color(104, 175, 245));

        jPanel2.setBackground(new java.awt.Color(36, 47, 65));
        jPanel2.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));

        btCadastrar.setBackground(new java.awt.Color(0, 153, 51));
        btCadastrar.setFont(new java.awt.Font("Tahoma", 1, 15)); // NOI18N
        btCadastrar.setForeground(new java.awt.Color(255, 255, 255));
        btCadastrar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/icons8-mais-80 (1) (2).png"))); // NOI18N
        btCadastrar.setText("Cadastrar");
        btCadastrar.setHorizontalAlignment(javax.swing.SwingConstants.LEADING);
        btCadastrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btCadastrarActionPerformed(evt);
            }
        });

        btAlterar.setBackground(new java.awt.Color(255, 106, 0));
        btAlterar.setFont(new java.awt.Font("Tahoma", 1, 15)); // NOI18N
        btAlterar.setForeground(new java.awt.Color(255, 255, 255));
        btAlterar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/icons8-lápis-80 (2).png"))); // NOI18N
        btAlterar.setText("Alterar");
        btAlterar.setHorizontalAlignment(javax.swing.SwingConstants.LEADING);
        btAlterar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btAlterarActionPerformed(evt);
            }
        });

        btVisualizar.setBackground(new java.awt.Color(90, 128, 205));
        btVisualizar.setFont(new java.awt.Font("Tahoma", 1, 15)); // NOI18N
        btVisualizar.setForeground(new java.awt.Color(255, 255, 255));
        btVisualizar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/icons8-visualizar-arquivo-64 (2).png"))); // NOI18N
        btVisualizar.setText("Visualizar");
        btVisualizar.setHorizontalAlignment(javax.swing.SwingConstants.LEADING);
        btVisualizar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btVisualizarActionPerformed(evt);
            }
        });

        btExcluir.setBackground(new java.awt.Color(204, 0, 0));
        btExcluir.setFont(new java.awt.Font("Tahoma", 1, 15)); // NOI18N
        btExcluir.setForeground(new java.awt.Color(255, 255, 255));
        btExcluir.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/icons8-cancelar-64 (1).png"))); // NOI18N
        btExcluir.setText("Excluir");
        btExcluir.setHorizontalAlignment(javax.swing.SwingConstants.LEADING);
        btExcluir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btExcluirActionPerformed(evt);
            }
        });

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/login (7).jpg"))); // NOI18N

        btFecharJanela.setBackground(new java.awt.Color(153, 153, 153));
        btFecharJanela.setFont(new java.awt.Font("Tahoma", 1, 15)); // NOI18N
        btFecharJanela.setForeground(new java.awt.Color(255, 255, 255));
        btFecharJanela.setText("Fechar Janela");
        btFecharJanela.setToolTipText("");
        btFecharJanela.setHorizontalAlignment(javax.swing.SwingConstants.LEADING);
        btFecharJanela.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btFecharJanela.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btFecharJanelaActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 161, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addComponent(btExcluir, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btVisualizar, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btAlterar, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btCadastrar, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 152, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(btFecharJanela, javax.swing.GroupLayout.PREFERRED_SIZE, 152, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addGap(73, 73, 73)
                .addComponent(btCadastrar, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btAlterar, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btVisualizar, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btExcluir, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btFecharJanela, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        jPanel4.setBackground(new java.awt.Color(104, 175, 245));
        jPanel4.setBorder(javax.swing.BorderFactory.createTitledBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 3, true), "Lista de Produtos", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 1, 20))); // NOI18N

        tbprodutos.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 1, 18))); // NOI18N
        tbprodutos.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        tbprodutos.setForeground(new java.awt.Color(255, 255, 255));
        tbprodutos.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Cod", "Dt. Inserção", "Dt. Atualização", "Nome", "Descrição", "Valor compra", "Valor venda"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, true, true, true, true
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tbprodutos.setSurrendersFocusOnKeystroke(true);
        jScrollPane1.setViewportView(tbprodutos);
        if (tbprodutos.getColumnModel().getColumnCount() > 0) {
            tbprodutos.getColumnModel().getColumn(0).setResizable(false);
            tbprodutos.getColumnModel().getColumn(1).setResizable(false);
            tbprodutos.getColumnModel().getColumn(2).setResizable(false);
            tbprodutos.getColumnModel().getColumn(3).setResizable(false);
        }

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 919, Short.MAX_VALUE)
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 623, Short.MAX_VALUE)
        );

        jPanel3.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.LOWERED));

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 20)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Pesquisar por Nome:");
        jLabel2.setBorder(javax.swing.BorderFactory.createCompoundBorder());

        txtpesqnome.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        txtpesqnome.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtpesqnomeKeyReleased(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtpesqnome)
                .addGap(39, 39, 39))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addContainerGap(23, Short.MAX_VALUE)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtpesqnome, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2))
                .addGap(21, 21, 21))
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, 181, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(81, 81, 81)
                        .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGap(92, 92, 92))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(38, 38, 38)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(27, 27, 27)
                .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel4.getAccessibleContext().setAccessibleDescription("");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btCadastrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btCadastrarActionPerformed

        ViewCadastrarProdutos v = new ViewCadastrarProdutos(this, true, 1, pcod, this.funcionario);
        v.setVisible(true);

        preecherTabelaProduto();
    }//GEN-LAST:event_btCadastrarActionPerformed

    private void btAlterarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btAlterarActionPerformed
        if (tbprodutos.getSelectedColumn() != -1) {
            int cod;
            cod = (int) tbprodutos.getValueAt(tbprodutos.getSelectedRow(), 0);
            pcod = cod;
            ViewCadastrarProdutos v = new ViewCadastrarProdutos(this, true, 2, pcod, this.funcionario);
            v.setVisible(true);

            preecherTabelaProduto();
        } else {

            JOptionPane.showMessageDialog(rootPane, this.mensagemItemNaoSelecionado);
        }

        tbprodutos.clearSelection();


    }//GEN-LAST:event_btAlterarActionPerformed

    private void btVisualizarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btVisualizarActionPerformed

        if (tbprodutos.getSelectedColumn() != -1) {
            int cod;
            cod = (int) tbprodutos.getValueAt(tbprodutos.getSelectedRow(), 0);
            pcod = cod;
            ViewCadastrarProdutos v = new ViewCadastrarProdutos(this, true, 3, pcod,this.funcionario);
            v.setVisible(true);

            preecherTabelaProduto();
        } else {
            JOptionPane.showMessageDialog(rootPane, this.mensagemItemNaoSelecionado);
        }

        tbprodutos.clearSelection();
    }//GEN-LAST:event_btVisualizarActionPerformed

    private void btExcluirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btExcluirActionPerformed
        if (tbprodutos.getSelectedColumn() != -1) {
            int cod, resposta;

            cod = (int) tbprodutos.getValueAt(tbprodutos.getSelectedRow(), 0);
            resposta = JOptionPane.showConfirmDialog(rootPane, this.mensagemItemExclusao, "Aviso", 1);
            if (resposta == JOptionPane.YES_OPTION) {
                dao.deletar(cod);
                preecherTabelaProduto();
            }

        } else {

            JOptionPane.showMessageDialog(rootPane, this.mensagemItemNaoSelecionado);
        }
                
        tbprodutos.clearSelection();
    }//GEN-LAST:event_btExcluirActionPerformed

    private void txtpesqnomeKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtpesqnomeKeyReleased
        if (txtpesqnome.getText().isEmpty()) {
            preecherTabelaProduto();
        } else {
            filtroTabelaProdutoNome(txtpesqnome.getText());
        }
    }//GEN-LAST:event_txtpesqnomeKeyReleased

    private void btFecharJanelaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btFecharJanelaActionPerformed
        // TODO add your handling code here:
        this.dispose();
    }//GEN-LAST:event_btFecharJanelaActionPerformed

    private void ajustarLayout() {
        jPanel2.setBackground(new Color(0, 0, 0, 140));
        jPanel3.setBackground(new Color(0, 0, 0, 140));
        jPanel4.setBackground(new Color(0, 0, 0, 120));
        //txtpesqnome.setOpaque(false);
        tbprodutos.setRowHeight(30);

        DefaultTableCellRenderer headerRenderer = new DefaultTableCellRenderer();
        headerRenderer.setOpaque(false);
        headerRenderer.setBackground(new Color(255, 255, 255, 50));

        headerRenderer.setForeground(Color.BLACK);

        for (int i = 0; i < tbprodutos.getModel().getColumnCount(); i++) {
            tbprodutos.getColumnModel().getColumn(i).setHeaderRenderer(headerRenderer);
        }

        tbprodutos.setShowGrid(false);//remove linhas da tabela
        jScrollPane1.setBackground(Color.BLACK);
        jScrollPane1.getViewport().setOpaque(false);
        jScrollPane1.setOpaque(false);
        tbprodutos.setOpaque(false);

        tbprodutos.setBackground(new Color(0, 0, 0, 150));
        tbprodutos.setGridColor(new Color(1.0f, 1.0f, 1.0f, 0f));
        //tbcliente.setForeground(Color.WHITE);
        //tbcliente.setSelectionForeground(Color.white);
        tbprodutos.setSelectionBackground(new Color(255, 255, 255, 100));

        this.setExtendedState(JFrame.MAXIMIZED_BOTH);
    }

    //---------------------------------------------------------
    public void addRows(List<Produto> listaProduto) {
        modelo = (DefaultTableModel) tbprodutos.getModel();
        modelo.setNumRows(0);
        for (Produto p : listaProduto) {
            modelo.addRow(new Object[]{
                p.getProdCod(),
                p.getProdDataInsercao(),
                p.getProdDataAtualizacao(),
                p.getProdNome(),
                p.getProdDescricao(),
                p.getProdValorCompra(),
                p.getProdValorVenda()
            });
        }
    }

    public void filtroTabelaProdutoNome(String nome) {
        List<Produto> lista = dao.filtrarPorNome(nome);
        this.addRows(lista);
    }

    private void preecherTabelaProduto() {
        List<Produto> lista = dao.listar();
        this.addRows(lista);
    }

    //---------------------------------------------------------
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
                if ("".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException | InstantiationException | IllegalAccessException | javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ViewGerenciarProduto.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        /* Create and display the form */
//        java.awt.EventQueue.invokeLater(new Runnable() {
//            public void run() {
//                new ViewGerenciarProduto().setVisible(true);
//            }
//        });
        
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
//        java.awt.EventQueue.invokeLater(new Runnable() {
//            public void run() {
//                new ViewGerenciarProduto().setVisible(true);
//            }
//        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btAlterar;
    private javax.swing.JButton btCadastrar;
    private javax.swing.JButton btExcluir;
    private javax.swing.JButton btFecharJanela;
    private javax.swing.JButton btVisualizar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tbprodutos;
    private javax.swing.JTextField txtpesqnome;
    // End of variables declaration//GEN-END:variables
}
