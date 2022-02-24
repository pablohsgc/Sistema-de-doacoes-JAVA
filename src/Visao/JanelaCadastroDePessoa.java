package Visao;

import Controle.Controle_Pessoa;
import Controle.Sistema;
import Modelo.Pessoa;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

/**
 * JFrame utilizado para auxiliar no cadastro de usuarios.
 */
public class JanelaCadastroDePessoa extends javax.swing.JFrame {
    private String email;
    private String senha;
    private JFrame janela_pai;
    private Sistema sistema;
    
    
    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }
    
    public JanelaCadastroDePessoa(JFrame janela_pai, Sistema sistema) {
        initComponents();
        this.janela_pai = janela_pai;
        this.email = "";
        this.senha = "";
        this.sistema = sistema;
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        campoNome = new javax.swing.JTextField();
        campoDocumento = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        botaoPessoaFisica = new javax.swing.JButton();
        botaoPessoaJuridica = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setResizable(false);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowClosing(java.awt.event.WindowEvent evt) {
                formWindowClosing(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel1.setText("Nome: ");

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel2.setText("Dados de Usuario");

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel3.setText("CPF/CNPJ:");

        botaoPessoaFisica.setText("Cadastra Pessoa Física");
        botaoPessoaFisica.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botaoPessoaFisicaActionPerformed(evt);
            }
        });

        botaoPessoaJuridica.setText("Cadastra Pessoa Jurídica");
        botaoPessoaJuridica.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botaoPessoaJuridicaActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(130, 130, 130)
                .addComponent(jLabel2)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(20, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 408, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel1)
                                    .addComponent(jLabel3))
                                .addGap(23, 23, 23)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(campoNome, javax.swing.GroupLayout.PREFERRED_SIZE, 273, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(campoDocumento, javax.swing.GroupLayout.PREFERRED_SIZE, 273, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(botaoPessoaFisica)
                                .addGap(44, 44, 44)
                                .addComponent(botaoPessoaJuridica)))
                        .addGap(39, 39, 39))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(8, 8, 8)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1)
                    .addComponent(campoNome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(campoDocumento, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 26, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(botaoPessoaFisica)
                    .addComponent(botaoPessoaJuridica))
                .addContainerGap())
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    public void cadastraUsuario(Pessoa pessoa) throws Exception{
        System.out.println("Chegou em cadastra!");
        this.sistema.cadastraUsuario(email, senha, pessoa);
        JOptionPane.showMessageDialog(this, "Usuario cadastrado!");
        this.finalizaJanela();
    }
    
    private void botaoPessoaFisicaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botaoPessoaFisicaActionPerformed
        try {
            Pessoa p = Controle_Pessoa.instancia_Pessoa_Fisica(this.campoNome.getText(), this.campoDocumento.getText());
            this.cadastraUsuario(p);
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(this, ex.getMessage(),"Mensagem de erro",0);
        }
            
    }//GEN-LAST:event_botaoPessoaFisicaActionPerformed

    private void botaoPessoaJuridicaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botaoPessoaJuridicaActionPerformed
        try {
            Pessoa p = Controle_Pessoa.instancia_Pessoa_Juridica(this.campoNome.getText(), this.campoDocumento.getText());
            this.cadastraUsuario(p);
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(this, ex.getMessage(),"Mensagem de erro",0);
        }
    }//GEN-LAST:event_botaoPessoaJuridicaActionPerformed

    private void formWindowClosing(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowClosing
        this.janela_pai.setEnabled(true);
    }//GEN-LAST:event_formWindowClosing

    public void finalizaJanela(){
        this.janela_pai.setEnabled(true);
        this.dispose();
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton botaoPessoaFisica;
    private javax.swing.JButton botaoPessoaJuridica;
    private javax.swing.JTextField campoDocumento;
    private javax.swing.JTextField campoNome;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JSeparator jSeparator1;
    // End of variables declaration//GEN-END:variables
}
