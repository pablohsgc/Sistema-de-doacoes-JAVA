package Visao;

import Modelo.Interesse;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 * JPanel auxiliar para permitir que um usuario selecione um interesse.
 */
public class PainelInteressados extends javax.swing.JPanel {
    private List interessados;
    private Integer id_escolhido;
    
    public PainelInteressados(List interessados) {
        initComponents();
        this.interessados = interessados;
        this.id_escolhido = -1;
        this.preencheTabela();
    }

    public Integer getId_escolhido() {
        return id_escolhido;
    }

    public void setId_escolhido(Integer id_escolhido) {
        this.id_escolhido = id_escolhido;
    }
    
    
    public void preencheTabela(){
        DefaultTableModel tabela = (DefaultTableModel) this.tabelaInteressados.getModel();
        
        for(Object obj : this.interessados){
            Interesse interessado = (Interesse)obj; 
            tabela.addRow(new Object[]{interessado.getId_usuario(),interessado.getJustificativa()});
        }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        tabelaInteressados = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        jLabel2 = new javax.swing.JLabel();
        botaoEscolheInteresse = new javax.swing.JButton();

        tabelaInteressados.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "Justificativa"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(tabelaInteressados);
        if (tabelaInteressados.getColumnModel().getColumnCount() > 0) {
            tabelaInteressados.getColumnModel().getColumn(0).setMinWidth(40);
            tabelaInteressados.getColumnModel().getColumn(0).setMaxWidth(40);
        }

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel1.setText("Lista de Interessados");

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel2.setText("Ao selecionar um usuario e clicar em sim, um email será enviado ao usuario.");

        botaoEscolheInteresse.setText("Escolhe interesse");
        botaoEscolheInteresse.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botaoEscolheInteresseActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jSeparator1))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 477, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(161, 161, 161)
                        .addComponent(jLabel1)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(jLabel2))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(194, 194, 194)
                        .addComponent(botaoEscolheInteresse)))
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addGap(2, 2, 2)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 245, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 10, Short.MAX_VALUE)
                .addComponent(botaoEscolheInteresse)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel2)
                .addGap(20, 20, 20))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void botaoEscolheInteresseActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botaoEscolheInteresseActionPerformed
        int linha = this.tabelaInteressados.getSelectedRow();
        this.id_escolhido = (Integer) this.tabelaInteressados.getValueAt(linha, 0);
        JOptionPane.showMessageDialog(this, "Interesse escolhido!");
    }//GEN-LAST:event_botaoEscolheInteresseActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton botaoEscolheInteresse;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JTable tabelaInteressados;
    // End of variables declaration//GEN-END:variables
}
