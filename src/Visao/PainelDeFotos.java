package Visao;

import Controle.Controle_De_Imagens;
import java.io.File;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;

/**
 * JPanel auxiliar para permitir ao usuario ver fotos de uma doação.
 */
public class PainelDeFotos extends javax.swing.JPanel {
    private Object[] fotos;
    
    public PainelDeFotos(Object[] fotos) {
        initComponents();
        this.fotos = fotos;
        this.inicializaJComboFotos();
    }
    
    private void inicializaJComboFotos(){
        for(Object obj : this.fotos){
            String foto = (String) obj;
            this.jComboFotos.addItem(foto);
        }
    }
   
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jComboFotos = new javax.swing.JComboBox<>();
        jLabel2 = new javax.swing.JLabel();
        botaoVerFoto = new javax.swing.JButton();

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel1.setText("Painel de Fotos");

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel2.setText("Fotos: ");

        botaoVerFoto.setText("Ver foto selecionada");
        botaoVerFoto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botaoVerFotoActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addComponent(jLabel2)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 72, Short.MAX_VALUE)
                        .addComponent(jLabel1)
                        .addGap(138, 138, 138))
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jComboFotos, javax.swing.GroupLayout.PREFERRED_SIZE, 298, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
            .addGroup(layout.createSequentialGroup()
                .addGap(135, 135, 135)
                .addComponent(botaoVerFoto)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel2)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addGap(26, 26, 26)
                        .addComponent(jComboFotos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 34, Short.MAX_VALUE)
                .addComponent(botaoVerFoto)
                .addGap(37, 37, 37))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void botaoVerFotoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botaoVerFotoActionPerformed
        String s = (String) this.jComboFotos.getSelectedItem();
        
        try{
            File f = new File(s);
            ImageIcon imageIcon = Controle_De_Imagens.leImagem(f);
            Controle_De_Imagens.ajustaImagem(imageIcon);
            JOptionPane.showMessageDialog(null, imageIcon,f.getName(),-1);
        }catch(Exception ex){
            JOptionPane.showMessageDialog(this, ex.getMessage(),"Mensagem de erro",0);
        }

    }//GEN-LAST:event_botaoVerFotoActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton botaoVerFoto;
    private javax.swing.JComboBox<String> jComboFotos;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    // End of variables declaration//GEN-END:variables
}
