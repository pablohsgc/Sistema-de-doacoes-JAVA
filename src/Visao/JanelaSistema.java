package Visao;

import Controle.Sistema;
import Modelo.Doacao;
import Modelo.Item;
import java.awt.CardLayout;
import java.awt.Color;
import java.io.IOException;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 * Janela principal do sistema e 'Pai' de todas as demais.
 * @author pablo
 */
public class JanelaSistema extends javax.swing.JFrame {
    private Sistema sistema;
    private JanelaCadastroDePessoa jc;
    private JanelaImagem ji;

    public JanelaSistema(Sistema sistema) {
        initComponents();
        this.sistema = sistema;
        this.setVisible(true);
        this.atualizaJComboTipoItem();
        this.jc = new JanelaCadastroDePessoa(this,this.sistema);
        this.ji = new JanelaImagem(this);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        painelVariavelPrincipal = new javax.swing.JPanel();
        painelLogin = new javax.swing.JPanel();
        botaoLogar = new javax.swing.JButton();
        campoSenha = new javax.swing.JTextField();
        botaoCadastrar = new javax.swing.JButton();
        labelAviso = new javax.swing.JLabel();
        labelEmail = new javax.swing.JLabel();
        labelSenha = new javax.swing.JLabel();
        campoEmail = new javax.swing.JTextField();
        painelVariavelSecundario = new javax.swing.JPanel();
        jTabbedPane1 = new javax.swing.JTabbedPane();
        painelCadastroDeItem = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        campoDescricao = new javax.swing.JTextField();
        campoCidade = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        campoQuantidade = new javax.swing.JSpinner();
        botaoCadastrar1 = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        jComboTipoItem = new javax.swing.JComboBox<>();
        jLabel1 = new javax.swing.JLabel();
        jButton3 = new javax.swing.JButton();
        jSeparator5 = new javax.swing.JSeparator();
        jLabel16 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        painelDePesquisa = new javax.swing.JPanel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        campoDescricaoPesquisa = new javax.swing.JTextField();
        jComboTipoItem2 = new javax.swing.JComboBox<>();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tabela_de_itens = new javax.swing.JTable();
        jLabel8 = new javax.swing.JLabel();
        botaoDemonstraInteresse = new javax.swing.JButton();
        botaoVerFotos = new javax.swing.JButton();
        painelDeDoacoes = new javax.swing.JPanel();
        jScrollPane3 = new javax.swing.JScrollPane();
        tabela_minhas_doacoes = new javax.swing.JTable();
        botaoAtualizaTabela1 = new javax.swing.JButton();
        jLabel14 = new javax.swing.JLabel();
        jSeparator4 = new javax.swing.JSeparator();
        botaoEscolheInteressado = new javax.swing.JButton();
        botaoAlteraDoacao = new javax.swing.JButton();
        botaoExcluirDoacao = new javax.swing.JButton();
        painelDeTiposDeItem = new javax.swing.JPanel();
        jLabel9 = new javax.swing.JLabel();
        campoTipoItemAdm = new javax.swing.JTextField();
        botaoNovoTipoItem = new javax.swing.JButton();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jSeparator2 = new javax.swing.JSeparator();
        painelDeAprovacaoDeDoacao = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        tabela_doacoes_nao_avaliadas = new javax.swing.JTable();
        jLabel12 = new javax.swing.JLabel();
        campoJustificativa = new javax.swing.JTextField();
        botaoAprovar = new javax.swing.JButton();
        botaoReprovar = new javax.swing.JButton();
        botaoAtualizaTabela = new javax.swing.JButton();
        jLabel13 = new javax.swing.JLabel();
        jSeparator3 = new javax.swing.JSeparator();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Sistema de Doações");
        setResizable(false);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowClosing(java.awt.event.WindowEvent evt) {
                formWindowClosing(evt);
            }
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });

        painelVariavelPrincipal.setLayout(new java.awt.CardLayout());

        botaoLogar.setText("Logar");
        botaoLogar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botaoLogarActionPerformed(evt);
            }
        });

        botaoCadastrar.setText("Cadastrar-se");
        botaoCadastrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botaoCadastrarActionPerformed(evt);
            }
        });

        labelAviso.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        labelAviso.setText("Digite suas credenciais!");

        labelEmail.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        labelEmail.setText("Email: ");

        labelSenha.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        labelSenha.setText("Senha: ");

        javax.swing.GroupLayout painelLoginLayout = new javax.swing.GroupLayout(painelLogin);
        painelLogin.setLayout(painelLoginLayout);
        painelLoginLayout.setHorizontalGroup(
            painelLoginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(painelLoginLayout.createSequentialGroup()
                .addGap(113, 113, 113)
                .addGroup(painelLoginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(painelLoginLayout.createSequentialGroup()
                        .addGroup(painelLoginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(labelSenha)
                            .addComponent(labelEmail))
                        .addGap(18, 18, 18)
                        .addGroup(painelLoginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(painelLoginLayout.createSequentialGroup()
                                .addGap(51, 51, 51)
                                .addComponent(botaoLogar)
                                .addGap(28, 28, 28)
                                .addComponent(botaoCadastrar))
                            .addGroup(painelLoginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(campoEmail)
                                .addComponent(campoSenha, javax.swing.GroupLayout.PREFERRED_SIZE, 302, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(painelLoginLayout.createSequentialGroup()
                        .addGap(132, 132, 132)
                        .addComponent(labelAviso)))
                .addContainerGap(146, Short.MAX_VALUE))
        );
        painelLoginLayout.setVerticalGroup(
            painelLoginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(painelLoginLayout.createSequentialGroup()
                .addGap(127, 127, 127)
                .addComponent(labelAviso)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(painelLoginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(labelEmail)
                    .addComponent(campoEmail, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(painelLoginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(labelSenha)
                    .addComponent(campoSenha, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(painelLoginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(botaoLogar)
                    .addComponent(botaoCadastrar))
                .addContainerGap(152, Short.MAX_VALUE))
        );

        painelVariavelPrincipal.add(painelLogin, "painel login");

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel2.setText("Quantidade:");

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel3.setText("Cidade: ");

        jLabel4.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel4.setText("Cadastro de item");

        campoQuantidade.setModel(new javax.swing.SpinnerNumberModel(1, 1, null, 1));

        botaoCadastrar1.setText("Cadastrar");
        botaoCadastrar1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botaoCadastrar1ActionPerformed(evt);
            }
        });

        jLabel5.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel5.setText("Tipo:");

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel1.setText("Descrição: ");

        jButton3.setText("Adicionar Fotos");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        jLabel16.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel16.setText("Obs: Item sem fotos serão cadastrado da mesma forma.");

        jLabel17.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel17.setText("Obs: Ao clicar em adicionar fotos novamente as fotos adicionadas não se mantém.");

        javax.swing.GroupLayout painelCadastroDeItemLayout = new javax.swing.GroupLayout(painelCadastroDeItem);
        painelCadastroDeItem.setLayout(painelCadastroDeItemLayout);
        painelCadastroDeItemLayout.setHorizontalGroup(
            painelCadastroDeItemLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(painelCadastroDeItemLayout.createSequentialGroup()
                .addGroup(painelCadastroDeItemLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(painelCadastroDeItemLayout.createSequentialGroup()
                        .addGap(20, 20, 20)
                        .addGroup(painelCadastroDeItemLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 557, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(painelCadastroDeItemLayout.createSequentialGroup()
                                .addGap(221, 221, 221)
                                .addComponent(jLabel4))
                            .addGroup(painelCadastroDeItemLayout.createSequentialGroup()
                                .addGap(10, 10, 10)
                                .addGroup(painelCadastroDeItemLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(painelCadastroDeItemLayout.createSequentialGroup()
                                        .addComponent(jLabel1)
                                        .addGap(18, 18, 18)
                                        .addComponent(campoDescricao, javax.swing.GroupLayout.PREFERRED_SIZE, 452, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(painelCadastroDeItemLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                        .addGroup(painelCadastroDeItemLayout.createSequentialGroup()
                                            .addComponent(jLabel2)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                            .addComponent(campoQuantidade, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addGap(393, 393, 393))
                                        .addGroup(painelCadastroDeItemLayout.createSequentialGroup()
                                            .addGroup(painelCadastroDeItemLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                .addComponent(jLabel3)
                                                .addComponent(jLabel5))
                                            .addGroup(painelCadastroDeItemLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                .addGroup(painelCadastroDeItemLayout.createSequentialGroup()
                                                    .addGap(36, 36, 36)
                                                    .addComponent(campoCidade, javax.swing.GroupLayout.PREFERRED_SIZE, 452, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, painelCadastroDeItemLayout.createSequentialGroup()
                                                    .addGap(35, 35, 35)
                                                    .addComponent(jComboTipoItem, javax.swing.GroupLayout.PREFERRED_SIZE, 453, javax.swing.GroupLayout.PREFERRED_SIZE)))))))
                            .addComponent(jSeparator5, javax.swing.GroupLayout.PREFERRED_SIZE, 557, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(painelCadastroDeItemLayout.createSequentialGroup()
                                .addGap(109, 109, 109)
                                .addComponent(jLabel16))))
                    .addGroup(painelCadastroDeItemLayout.createSequentialGroup()
                        .addGap(143, 143, 143)
                        .addComponent(jButton3)
                        .addGap(113, 113, 113)
                        .addComponent(botaoCadastrar1))
                    .addGroup(painelCadastroDeItemLayout.createSequentialGroup()
                        .addGap(55, 55, 55)
                        .addComponent(jLabel17)))
                .addContainerGap(44, Short.MAX_VALUE))
        );
        painelCadastroDeItemLayout.setVerticalGroup(
            painelCadastroDeItemLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(painelCadastroDeItemLayout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addComponent(jLabel4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(painelCadastroDeItemLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(campoDescricao, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(painelCadastroDeItemLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(campoCidade, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(painelCadastroDeItemLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(jComboTipoItem, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(painelCadastroDeItemLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(campoQuantidade, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(29, 29, 29)
                .addGroup(painelCadastroDeItemLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton3)
                    .addComponent(botaoCadastrar1))
                .addGap(48, 48, 48)
                .addComponent(jSeparator5, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel16)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel17)
                .addContainerGap(43, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("Cadastrar item", painelCadastroDeItem);

        jLabel6.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel6.setText("Descrição: ");

        jLabel7.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel7.setText("Tipo de item:");

        jButton1.setText("Por descrição");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton2.setText("Por tipo");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        tabela_de_itens.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "Descrição", "Cidade", "Quantidade"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(tabela_de_itens);
        if (tabela_de_itens.getColumnModel().getColumnCount() > 0) {
            tabela_de_itens.getColumnModel().getColumn(0).setResizable(false);
            tabela_de_itens.getColumnModel().getColumn(0).setPreferredWidth(40);
            tabela_de_itens.getColumnModel().getColumn(1).setResizable(false);
            tabela_de_itens.getColumnModel().getColumn(2).setResizable(false);
            tabela_de_itens.getColumnModel().getColumn(3).setResizable(false);
        }

        jLabel8.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel8.setText("Lista de Doações");

        botaoDemonstraInteresse.setText("Demostrar interesse");
        botaoDemonstraInteresse.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botaoDemonstraInteresseActionPerformed(evt);
            }
        });

        botaoVerFotos.setText("Ver fotos");
        botaoVerFotos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botaoVerFotosActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout painelDePesquisaLayout = new javax.swing.GroupLayout(painelDePesquisa);
        painelDePesquisa.setLayout(painelDePesquisaLayout);
        painelDePesquisaLayout.setHorizontalGroup(
            painelDePesquisaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(painelDePesquisaLayout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addGroup(painelDePesquisaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel7)
                    .addComponent(jLabel6))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(painelDePesquisaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jComboTipoItem2, 0, 329, Short.MAX_VALUE)
                    .addComponent(campoDescricaoPesquisa))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(painelDePesquisaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jButton1)
                    .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 97, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(56, 56, 56))
            .addGroup(painelDePesquisaLayout.createSequentialGroup()
                .addContainerGap(21, Short.MAX_VALUE)
                .addGroup(painelDePesquisaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 582, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(painelDePesquisaLayout.createSequentialGroup()
                        .addGap(244, 244, 244)
                        .addComponent(jLabel8)))
                .addContainerGap(18, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, painelDePesquisaLayout.createSequentialGroup()
                .addGap(124, 124, 124)
                .addComponent(botaoVerFotos)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(botaoDemonstraInteresse)
                .addGap(127, 127, 127))
        );
        painelDePesquisaLayout.setVerticalGroup(
            painelDePesquisaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(painelDePesquisaLayout.createSequentialGroup()
                .addGroup(painelDePesquisaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(painelDePesquisaLayout.createSequentialGroup()
                        .addGap(21, 21, 21)
                        .addComponent(jLabel6)
                        .addGap(17, 17, 17)
                        .addGroup(painelDePesquisaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel7)
                            .addComponent(jComboTipoItem2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(painelDePesquisaLayout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addGroup(painelDePesquisaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jButton1)
                            .addComponent(campoDescricaoPesquisa, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(11, 11, 11)
                        .addComponent(jButton2)))
                .addGap(18, 18, 18)
                .addComponent(jLabel8)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 203, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(painelDePesquisaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(botaoDemonstraInteresse)
                    .addComponent(botaoVerFotos))
                .addContainerGap())
        );

        jTabbedPane1.addTab("Buscar Doações", painelDePesquisa);

        tabela_minhas_doacoes.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "Descrição", "Quantidade", "Cidade", "Estado"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, true, true, true, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane3.setViewportView(tabela_minhas_doacoes);
        if (tabela_minhas_doacoes.getColumnModel().getColumnCount() > 0) {
            tabela_minhas_doacoes.getColumnModel().getColumn(0).setMinWidth(40);
            tabela_minhas_doacoes.getColumnModel().getColumn(0).setMaxWidth(40);
            tabela_minhas_doacoes.getColumnModel().getColumn(1).setResizable(false);
            tabela_minhas_doacoes.getColumnModel().getColumn(2).setResizable(false);
            tabela_minhas_doacoes.getColumnModel().getColumn(3).setResizable(false);
            tabela_minhas_doacoes.getColumnModel().getColumn(4).setResizable(false);
        }

        botaoAtualizaTabela1.setText("Atualiza tabela");
        botaoAtualizaTabela1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botaoAtualizaTabela1ActionPerformed(evt);
            }
        });

        jLabel14.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel14.setText("Doações ");

        botaoEscolheInteressado.setText("Escolher interessado");
        botaoEscolheInteressado.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botaoEscolheInteressadoActionPerformed(evt);
            }
        });

        botaoAlteraDoacao.setText("Alterar Doacao");
        botaoAlteraDoacao.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botaoAlteraDoacaoActionPerformed(evt);
            }
        });

        botaoExcluirDoacao.setText("Excluir Doacao");
        botaoExcluirDoacao.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botaoExcluirDoacaoActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout painelDeDoacoesLayout = new javax.swing.GroupLayout(painelDeDoacoes);
        painelDeDoacoes.setLayout(painelDeDoacoesLayout);
        painelDeDoacoesLayout.setHorizontalGroup(
            painelDeDoacoesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(painelDeDoacoesLayout.createSequentialGroup()
                .addGap(255, 255, 255)
                .addComponent(jLabel14)
                .addContainerGap(294, Short.MAX_VALUE))
            .addGroup(painelDeDoacoesLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(painelDeDoacoesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(painelDeDoacoesLayout.createSequentialGroup()
                        .addGap(41, 41, 41)
                        .addComponent(botaoExcluirDoacao)
                        .addGap(34, 34, 34)
                        .addComponent(botaoAlteraDoacao)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(botaoAtualizaTabela1)
                        .addGap(31, 31, 31)
                        .addComponent(botaoEscolheInteressado)
                        .addGap(20, 20, 20))
                    .addComponent(jScrollPane3)
                    .addComponent(jSeparator4))
                .addContainerGap())
        );
        painelDeDoacoesLayout.setVerticalGroup(
            painelDeDoacoesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(painelDeDoacoesLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel14)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator4, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 253, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(painelDeDoacoesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(botaoAtualizaTabela1)
                    .addComponent(botaoEscolheInteressado)
                    .addComponent(botaoAlteraDoacao)
                    .addComponent(botaoExcluirDoacao))
                .addContainerGap(29, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("Minhas Doacoes", painelDeDoacoes);

        jLabel9.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel9.setText("Tipo de item: ");

        botaoNovoTipoItem.setText("Cadastrar novo tipo");
        botaoNovoTipoItem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botaoNovoTipoItemActionPerformed(evt);
            }
        });

        jLabel10.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel10.setText("<html>Observação: <br>Apenas administradores conseguem cadastrar novos tipos de item!</html>");

        jLabel11.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel11.setText("Cadastro de Tipo de Item");

        javax.swing.GroupLayout painelDeTiposDeItemLayout = new javax.swing.GroupLayout(painelDeTiposDeItem);
        painelDeTiposDeItem.setLayout(painelDeTiposDeItemLayout);
        painelDeTiposDeItemLayout.setHorizontalGroup(
            painelDeTiposDeItemLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(painelDeTiposDeItemLayout.createSequentialGroup()
                .addGroup(painelDeTiposDeItemLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(painelDeTiposDeItemLayout.createSequentialGroup()
                        .addGap(58, 58, 58)
                        .addComponent(jLabel9)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(campoTipoItemAdm, javax.swing.GroupLayout.PREFERRED_SIZE, 441, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(painelDeTiposDeItemLayout.createSequentialGroup()
                        .addGap(189, 189, 189)
                        .addComponent(jLabel11))
                    .addGroup(painelDeTiposDeItemLayout.createSequentialGroup()
                        .addGap(91, 91, 91)
                        .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(28, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, painelDeTiposDeItemLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(botaoNovoTipoItem)
                .addGap(240, 240, 240))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, painelDeTiposDeItemLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jSeparator2)
                .addContainerGap())
        );
        painelDeTiposDeItemLayout.setVerticalGroup(
            painelDeTiposDeItemLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(painelDeTiposDeItemLayout.createSequentialGroup()
                .addGap(28, 28, 28)
                .addComponent(jLabel11)
                .addGap(9, 9, 9)
                .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 40, Short.MAX_VALUE)
                .addGroup(painelDeTiposDeItemLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel9)
                    .addComponent(campoTipoItemAdm, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(27, 27, 27)
                .addComponent(botaoNovoTipoItem)
                .addGap(112, 112, 112)
                .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(53, 53, 53))
        );

        jTabbedPane1.addTab("Adicionar Tipo item(ADM)", painelDeTiposDeItem);

        tabela_doacoes_nao_avaliadas.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "Descrição", "Quantidade", "Cidade"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane2.setViewportView(tabela_doacoes_nao_avaliadas);
        if (tabela_doacoes_nao_avaliadas.getColumnModel().getColumnCount() > 0) {
            tabela_doacoes_nao_avaliadas.getColumnModel().getColumn(0).setResizable(false);
            tabela_doacoes_nao_avaliadas.getColumnModel().getColumn(1).setResizable(false);
            tabela_doacoes_nao_avaliadas.getColumnModel().getColumn(2).setResizable(false);
            tabela_doacoes_nao_avaliadas.getColumnModel().getColumn(3).setResizable(false);
        }

        jLabel12.setText("Justificativa: ");

        campoJustificativa.setText(" ");

        botaoAprovar.setText("Aprovar");
        botaoAprovar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botaoAprovarActionPerformed(evt);
            }
        });

        botaoReprovar.setText("Reprovar");
        botaoReprovar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botaoReprovarActionPerformed(evt);
            }
        });

        botaoAtualizaTabela.setText("Atualiza tabela");
        botaoAtualizaTabela.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botaoAtualizaTabelaActionPerformed(evt);
            }
        });

        jLabel13.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel13.setText("Doações não avaliadas");

        javax.swing.GroupLayout painelDeAprovacaoDeDoacaoLayout = new javax.swing.GroupLayout(painelDeAprovacaoDeDoacao);
        painelDeAprovacaoDeDoacao.setLayout(painelDeAprovacaoDeDoacaoLayout);
        painelDeAprovacaoDeDoacaoLayout.setHorizontalGroup(
            painelDeAprovacaoDeDoacaoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(painelDeAprovacaoDeDoacaoLayout.createSequentialGroup()
                .addGroup(painelDeAprovacaoDeDoacaoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(painelDeAprovacaoDeDoacaoLayout.createSequentialGroup()
                        .addGap(217, 217, 217)
                        .addComponent(jLabel13))
                    .addGroup(painelDeAprovacaoDeDoacaoLayout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(painelDeAprovacaoDeDoacaoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jSeparator3, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jScrollPane2, javax.swing.GroupLayout.Alignment.TRAILING))))
                .addContainerGap())
            .addGroup(painelDeAprovacaoDeDoacaoLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(painelDeAprovacaoDeDoacaoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(painelDeAprovacaoDeDoacaoLayout.createSequentialGroup()
                        .addComponent(botaoAprovar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(botaoReprovar)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(painelDeAprovacaoDeDoacaoLayout.createSequentialGroup()
                        .addComponent(jLabel12)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(campoJustificativa, javax.swing.GroupLayout.PREFERRED_SIZE, 392, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 13, Short.MAX_VALUE)
                        .addComponent(botaoAtualizaTabela)
                        .addGap(29, 29, 29))))
        );
        painelDeAprovacaoDeDoacaoLayout.setVerticalGroup(
            painelDeAprovacaoDeDoacaoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(painelDeAprovacaoDeDoacaoLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel13)
                .addGap(5, 5, 5)
                .addComponent(jSeparator3, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 197, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 40, Short.MAX_VALUE)
                .addGroup(painelDeAprovacaoDeDoacaoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel12)
                    .addComponent(campoJustificativa, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(botaoAtualizaTabela))
                .addGap(18, 18, 18)
                .addGroup(painelDeAprovacaoDeDoacaoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(botaoAprovar)
                    .addComponent(botaoReprovar))
                .addGap(26, 26, 26))
        );

        jTabbedPane1.addTab("Avaliar Doacao(ADM)", painelDeAprovacaoDeDoacao);

        javax.swing.GroupLayout painelVariavelSecundarioLayout = new javax.swing.GroupLayout(painelVariavelSecundario);
        painelVariavelSecundario.setLayout(painelVariavelSecundarioLayout);
        painelVariavelSecundarioLayout.setHorizontalGroup(
            painelVariavelSecundarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jTabbedPane1)
        );
        painelVariavelSecundarioLayout.setVerticalGroup(
            painelVariavelSecundarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(painelVariavelSecundarioLayout.createSequentialGroup()
                .addComponent(jTabbedPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 406, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        painelVariavelPrincipal.add(painelVariavelSecundario, "painelVariavelSecundario");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(painelVariavelPrincipal, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(painelVariavelPrincipal, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void botaoLogarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botaoLogarActionPerformed
        try {
            sistema.login(this.campoEmail.getText(), this.campoSenha.getText());
            CardLayout cl = (CardLayout) painelVariavelPrincipal.getLayout();
            cl.show(painelVariavelPrincipal, "painelVariavelSecundario");
        }catch(Exception e){
            this.labelAviso.setText(e.getMessage());
            this.labelAviso.setForeground(Color.red);
        }
    }//GEN-LAST:event_botaoLogarActionPerformed

    private void botaoCadastrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botaoCadastrarActionPerformed
        this.jc.setEmail(this.campoEmail.getText());
        this.jc.setSenha(this.campoSenha.getText());
        this.setEnabled(false);
        this.jc.setVisible(true);
    }//GEN-LAST:event_botaoCadastrarActionPerformed

    private void formWindowClosing(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowClosing
        try {
            this.sistema.salvaSessao();
        } catch (IOException ex) {
            JOptionPane.showMessageDialog(this, ex.getMessage(),"Mensagem de erro",0);
        }
    }//GEN-LAST:event_formWindowClosing

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
        try {
            sistema.inicializaSistema();
            this.atualizaJComboTipoItem();
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(this, ex.getMessage(),"Mensagem de erro",0);
        }
    }//GEN-LAST:event_formWindowOpened

    private void botaoNovoTipoItemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botaoNovoTipoItemActionPerformed
        try {
            this.sistema.insereTipoItem(this.campoTipoItemAdm.getText());
            this.atualizaJComboTipoItem();
            JOptionPane.showMessageDialog(this, "Adicionado!");
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(this, ex.getMessage(),"Mensagem de erro",0);
        }
    }//GEN-LAST:event_botaoNovoTipoItemActionPerformed

    private void botaoCadastrar1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botaoCadastrar1ActionPerformed
        String mensagem = "";
        try {
            mensagem = this.sistema.cadastraDoacao(
                                        this.campoDescricao.getText(), 
                                        this.campoCidade.getText(),
                                        (Integer)this.campoQuantidade.getValue(),
                                        (String) this.jComboTipoItem.getSelectedItem(),
                                        this.ji.imagens());
            JOptionPane.showMessageDialog(this, mensagem);
            this.ji.reinicializaComponentes();
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(this, ex.getMessage(),"Mensagem de erro",0);
        }
    }//GEN-LAST:event_botaoCadastrar1ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        DefaultTableModel tabela = (DefaultTableModel) this.tabela_de_itens.getModel();
        this.resetaJTable(tabela);
        
        try {
            for(Item item : this.sistema.pesquisaPorDescricao(this.campoDescricaoPesquisa.getText()))
                tabela.addRow(new Object[]{item.getIdItem(),item.getDescricao(),item.getCidade(),item.getQuantidade()});
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(this, ex.getMessage(),"Mensagem de erro",0);
        }    
    }//GEN-LAST:event_jButton1ActionPerformed

    private void botaoAtualizaTabelaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botaoAtualizaTabelaActionPerformed
        DefaultTableModel tabela = (DefaultTableModel) this.tabela_doacoes_nao_avaliadas.getModel();
        this.resetaJTable(tabela);
        try {
            for (Item doacao : this.sistema.pesquisaItensNaoAvaliados())
                tabela.addRow(new Object[]{doacao.getIdItem(),doacao.getDescricao(),doacao.getQuantidade(),doacao.getCidade()});
        } catch (Exception ex) {
            System.out.println(ex.getMessage()); // remover após teste
        }
        
        // obs - fazer método para atualizar tabela
        
    }//GEN-LAST:event_botaoAtualizaTabelaActionPerformed

    private void botaoAprovarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botaoAprovarActionPerformed
        int linha_selecionada = this.tabela_doacoes_nao_avaliadas.getSelectedRow();
        
        try {
            Integer id = (Integer) this.tabela_doacoes_nao_avaliadas.getValueAt(linha_selecionada, 0);
            this.sistema.aprovaDoacao(id);
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(this, ex.getMessage(),"Mensagem de erro",0);
        }
    }//GEN-LAST:event_botaoAprovarActionPerformed

    private void botaoReprovarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botaoReprovarActionPerformed
        int linha_selecionada = this.tabela_doacoes_nao_avaliadas.getSelectedRow();
        
        try {
            Integer id = (Integer) this.tabela_doacoes_nao_avaliadas.getValueAt(linha_selecionada, 0);
            this.sistema.reprovaDoacao(id, this.campoJustificativa.getText());
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(this, ex.getMessage(),"Mensagem de erro",0);
        }
    }//GEN-LAST:event_botaoReprovarActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        DefaultTableModel tabela = (DefaultTableModel) this.tabela_de_itens.getModel();
        this.resetaJTable(tabela);
        String tipo = (String) this.jComboTipoItem2.getSelectedItem();
        
        try {
            for (Item doacao : this.sistema.pesquisaPorTipo(tipo))
                tabela.addRow(new Object[]{doacao.getIdItem(),doacao.getDescricao(),doacao.getCidade(),doacao.getQuantidade()});
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(this, ex.getMessage(),"Mensagem de erro",0);
        }
    }//GEN-LAST:event_jButton2ActionPerformed

    private void botaoAtualizaTabela1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botaoAtualizaTabela1ActionPerformed
        DefaultTableModel tabela = (DefaultTableModel) this.tabela_minhas_doacoes.getModel();
        this.resetaJTable(tabela);
        try{
            for(Doacao doacao : this.sistema.pesquisaDoacaoPorUsuario())
                tabela.addRow(new Object[]{doacao.getItem().getIdItem(), doacao.getItem().getDescricao(), doacao.getItem().getQuantidade(), doacao.getItem().getCidade(),doacao.getEstadoAvaliacao()});
        }catch(Exception ex){
            JOptionPane.showMessageDialog(this, ex.getMessage(),"Mensagem de erro",0);
        }
    }//GEN-LAST:event_botaoAtualizaTabela1ActionPerformed

    private void botaoEscolheInteressadoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botaoEscolheInteressadoActionPerformed
        int linha = this.tabela_minhas_doacoes.getSelectedRow();
        
        if(linha != -1)
            try {
                int id_item = (Integer) this.tabela_minhas_doacoes.getValueAt(linha, 0);
                List interessados = this.sistema.pesquisaDoacao(id_item).getInteressados();
                PainelInteressados painel = new PainelInteressados(interessados); 
                JOptionPane.showMessageDialog(this, painel,"Interessados",-1);
                String email = this.sistema.escolheInteresse(id_item, painel.getId_escolhido());
                JOptionPane.showMessageDialog(this, "Uma notificação foi enviada ao email:\n"+email);
            } catch (Exception ex) {
                JOptionPane.showMessageDialog(this, ex.getMessage(),"Mensagem de erro",0);
            }
    }//GEN-LAST:event_botaoEscolheInteressadoActionPerformed

    private void botaoDemonstraInteresseActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botaoDemonstraInteresseActionPerformed
        int linha = this.tabela_de_itens.getSelectedRow();
        
        if(linha != -1)
            try {
                int id_item = (Integer) this.tabela_de_itens.getValueAt(linha, 0);
                String justificativa = JOptionPane.showInputDialog(this, "Digite a justificativa!");
                this.sistema.adicionaInteresse(justificativa, id_item);
                JOptionPane.showMessageDialog(this, "Interesse adicionado!");
            } catch (Exception ex) {
                JOptionPane.showMessageDialog(this, ex.getMessage(),"Mensagem de erro",0);
            }
    }//GEN-LAST:event_botaoDemonstraInteresseActionPerformed

    private void botaoAlteraDoacaoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botaoAlteraDoacaoActionPerformed
        int linha = this.tabela_minhas_doacoes.getSelectedRow();
        
        try {
            if(linha == -1) throw new Exception("Erro: Nenhuma linha da tabela selecionada!");
            
            int id =(Integer) this.tabela_minhas_doacoes.getValueAt(linha, 0);
            String descricao =(String) this.tabela_minhas_doacoes.getValueAt(linha, 1);
            int quantidade = Integer.parseInt(""+this.tabela_minhas_doacoes.getValueAt(linha, 2));
            String cidade =(String) this.tabela_minhas_doacoes.getValueAt(linha, 3);
            System.out.println("quantidade: "+quantidade);
            this.sistema.alteraDoacao(descricao, cidade, quantidade, id);
        }catch(Exception ex){
            JOptionPane.showMessageDialog(this, ex.getMessage(),"Mensagem de erro",0);
        }
    }//GEN-LAST:event_botaoAlteraDoacaoActionPerformed

    private void botaoExcluirDoacaoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botaoExcluirDoacaoActionPerformed
        int linha = this.tabela_minhas_doacoes.getSelectedRow();
        
        try {
            if(linha == -1) throw new Exception("Erro: Nenhuma linha da tabela selecionada!");
            int id = (Integer) this.tabela_minhas_doacoes.getValueAt(linha, 0);
            this.sistema.deletaDoacao(id);
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(this, ex.getMessage(),"Mensagem de erro",0);
        }
    }//GEN-LAST:event_botaoExcluirDoacaoActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        this.ji.reinicializaComponentes();
        this.setEnabled(false);
        ji.setVisible(true);
    }//GEN-LAST:event_jButton3ActionPerformed

    private void botaoVerFotosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botaoVerFotosActionPerformed
        int linha = this.tabela_de_itens.getSelectedRow();
        
        if(linha != -1)
            try {
                int id_item = (Integer) this.tabela_de_itens.getValueAt(linha, 0);
                Object fotos[] = this.sistema.pesquisaDoacao(id_item).getItem().getFotos();
                PainelDeFotos pf = new PainelDeFotos(fotos);
                JOptionPane.showMessageDialog(this, pf,"Fotos",-1);
            } catch (Exception ex) {
                JOptionPane.showMessageDialog(this, ex.getMessage(),"Mensagem de erro",0);
            }
    }//GEN-LAST:event_botaoVerFotosActionPerformed

    private void atualizaJComboTipoItem(){
        this.jComboTipoItem.removeAllItems();
        this.jComboTipoItem2.removeAllItems();
        
        for(String tipo_item : this.sistema.tipos()){
            this.jComboTipoItem.addItem(tipo_item);
            this.jComboTipoItem2.addItem(tipo_item);
        }
    }
    
    /**
     * @param DefaultTableModel tabela
     * Métodos atualmente está apenas limpando uma tabela
     */
    private void resetaJTable(DefaultTableModel tabela){
        while(tabela.getRowCount() > 0)
           tabela.removeRow(0);
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton botaoAlteraDoacao;
    private javax.swing.JButton botaoAprovar;
    private javax.swing.JButton botaoAtualizaTabela;
    private javax.swing.JButton botaoAtualizaTabela1;
    private javax.swing.JButton botaoCadastrar;
    private javax.swing.JButton botaoCadastrar1;
    private javax.swing.JButton botaoDemonstraInteresse;
    private javax.swing.JButton botaoEscolheInteressado;
    private javax.swing.JButton botaoExcluirDoacao;
    private javax.swing.JButton botaoLogar;
    private javax.swing.JButton botaoNovoTipoItem;
    private javax.swing.JButton botaoReprovar;
    private javax.swing.JButton botaoVerFotos;
    private javax.swing.JTextField campoCidade;
    private javax.swing.JTextField campoDescricao;
    private javax.swing.JTextField campoDescricaoPesquisa;
    private javax.swing.JTextField campoEmail;
    private javax.swing.JTextField campoJustificativa;
    private javax.swing.JSpinner campoQuantidade;
    private javax.swing.JTextField campoSenha;
    private javax.swing.JTextField campoTipoItemAdm;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JComboBox<String> jComboTipoItem;
    private javax.swing.JComboBox<String> jComboTipoItem2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JSeparator jSeparator4;
    private javax.swing.JSeparator jSeparator5;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JLabel labelAviso;
    private javax.swing.JLabel labelEmail;
    private javax.swing.JLabel labelSenha;
    private javax.swing.JPanel painelCadastroDeItem;
    private javax.swing.JPanel painelDeAprovacaoDeDoacao;
    private javax.swing.JPanel painelDeDoacoes;
    private javax.swing.JPanel painelDePesquisa;
    private javax.swing.JPanel painelDeTiposDeItem;
    private javax.swing.JPanel painelLogin;
    private javax.swing.JPanel painelVariavelPrincipal;
    private javax.swing.JPanel painelVariavelSecundario;
    private javax.swing.JTable tabela_de_itens;
    private javax.swing.JTable tabela_doacoes_nao_avaliadas;
    private javax.swing.JTable tabela_minhas_doacoes;
    // End of variables declaration//GEN-END:variables
}
