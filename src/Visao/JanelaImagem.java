package Visao;

import Controle.Controle_De_Imagens;
import java.awt.Dimension;
import java.io.File;
import java.util.Arrays;
import javax.swing.ImageIcon;
import javax.swing.JFileChooser;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

/**
 * JFrame utilizado para auxiliar na adição de imagens nas doações.
 */
public class JanelaImagem extends javax.swing.JFrame {
    
    private JFileChooser chooser;
    private Controle_De_Imagens controle;
    private JFrame janela_pai;
    
    public JanelaImagem(JFrame janela) {
        initComponents(); 
        
        chooser = new JFileChooser();
        this.controle = new Controle_De_Imagens();
        this.janela_pai = janela;
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        botaoSelecionarImagem = new javax.swing.JToggleButton();
        botaoAdicionarImagem = new javax.swing.JButton();
        campoImagemSelecionada = new javax.swing.JTextField();
        jCombo_fotos = new javax.swing.JComboBox<>();
        botaoVerImagem = new javax.swing.JButton();
        botaoFinalizar = new javax.swing.JButton();
        jSeparator1 = new javax.swing.JSeparator();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Tela de adição de imagens");
        setResizable(false);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowClosing(java.awt.event.WindowEvent evt) {
                formWindowClosing(evt);
            }
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });

        botaoSelecionarImagem.setText("Selecionar Imagem");
        botaoSelecionarImagem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botaoSelecionarImagemActionPerformed(evt);
            }
        });

        botaoAdicionarImagem.setText("Adicionar imagem");
        botaoAdicionarImagem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botaoAdicionarImagemActionPerformed(evt);
            }
        });

        jCombo_fotos.setPreferredSize(new java.awt.Dimension(80, 20));

        botaoVerImagem.setText("Ver Imagem");
        botaoVerImagem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botaoVerImagemActionPerformed(evt);
            }
        });

        botaoFinalizar.setText("Finalizar");
        botaoFinalizar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botaoFinalizarActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel1.setText("Obs 1: Imagens são adicionadas a itens apenas se clicar em \"Finalizar\"");

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel2.setText("Obs 2: O software não salva imagens apenas utiliza o caminho informado.");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(19, 19, 19)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(botaoSelecionarImagem, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(botaoAdicionarImagem, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(botaoVerImagem, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(campoImagemSelecionada)
                                    .addComponent(jCombo_fotos, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 484, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 11, Short.MAX_VALUE))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(227, 227, 227)
                        .addComponent(botaoFinalizar)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 381, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(70, 70, 70))
            .addGroup(layout.createSequentialGroup()
                .addGap(59, 59, 59)
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 415, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(campoImagemSelecionada, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(botaoSelecionarImagem))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(botaoAdicionarImagem)
                    .addComponent(jCombo_fotos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(botaoVerImagem)
                .addGap(41, 41, 41)
                .addComponent(botaoFinalizar)
                .addGap(18, 18, 18)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel2)
                .addContainerGap(15, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void botaoSelecionarImagemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botaoSelecionarImagemActionPerformed
        chooser.showOpenDialog(null);
        File f = chooser.getSelectedFile();
        
        if(f != null){
            try{
                ImageIcon imageIcon = Controle_De_Imagens.leImagem(f);
                Controle_De_Imagens.ajustaImagem(imageIcon);
                JOptionPane.showMessageDialog(null, imageIcon,f.getName(),-1);
                this.campoImagemSelecionada.setText(imageIcon.toString());
            }catch(Exception ex){
                JOptionPane.showMessageDialog(this, ex.getMessage(),"Mensagem de erro",0);
            }
        }
    }//GEN-LAST:event_botaoSelecionarImagemActionPerformed

    private void botaoAdicionarImagemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botaoAdicionarImagemActionPerformed
        try{
            this.controle.adicionaImagem(this.campoImagemSelecionada.getText());
            this.jCombo_fotos.addItem(this.campoImagemSelecionada.getText());
            JOptionPane.showMessageDialog(this, "Imagem adicionada!");
        }catch(Exception ex){
            JOptionPane.showMessageDialog(this, ex.getMessage(),"Mensagem de erro",0);
        }  
    }//GEN-LAST:event_botaoAdicionarImagemActionPerformed

    private void botaoVerImagemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botaoVerImagemActionPerformed
        String s = (String) this.jCombo_fotos.getSelectedItem();
        
        try{
            File f = new File(s);
            ImageIcon imageIcon = Controle_De_Imagens.leImagem(f);
            Controle_De_Imagens.ajustaImagem(imageIcon);
            JOptionPane.showMessageDialog(null, imageIcon,f.getName(),-1);
        }catch(Exception ex){
            JOptionPane.showMessageDialog(this, ex.getMessage(),"Mensagem de erro",0);
        }
    }//GEN-LAST:event_botaoVerImagemActionPerformed

    private void formWindowClosing(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowClosing
        this.janela_pai.setEnabled(true);
        this.controle.limpaBufferDeImagens();
        JOptionPane.showMessageDialog(this, "Imagens não salvas devido ao fechamento forçado!");
    }//GEN-LAST:event_formWindowClosing

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
        this.jCombo_fotos.removeAllItems();
        this.jCombo_fotos.setMaximumSize(new Dimension(80,20));
        this.campoImagemSelecionada.setEditable(false);
    }//GEN-LAST:event_formWindowOpened

    private void botaoFinalizarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botaoFinalizarActionPerformed
        this.janela_pai.setEnabled(true);
        this.dispose();
    }//GEN-LAST:event_botaoFinalizarActionPerformed

    public String[] imagens(){
        Object[] arrayObj = this.controle.getImagens().toArray();
        String[] imagens = Arrays.copyOf(arrayObj, arrayObj.length, String[].class);
        return imagens;
    }
    
    public void reinicializaComponentes(){
        this.jCombo_fotos.removeAllItems();
        this.controle.limpaBufferDeImagens();
        this.campoImagemSelecionada.setText("");
    }
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton botaoAdicionarImagem;
    private javax.swing.JButton botaoFinalizar;
    private javax.swing.JToggleButton botaoSelecionarImagem;
    private javax.swing.JButton botaoVerImagem;
    private javax.swing.JTextField campoImagemSelecionada;
    private javax.swing.JComboBox<String> jCombo_fotos;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JSeparator jSeparator1;
    // End of variables declaration//GEN-END:variables
}