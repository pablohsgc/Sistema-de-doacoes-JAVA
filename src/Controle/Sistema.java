package Controle;

import Modelo.Catalogo_Itens;
import Modelo.Catalogo_Usuarios;
import Modelo.Doacao;
import Modelo.Inicializa_Catalogo;
import Modelo.Item;
import Modelo.Manipula_Arquivo;
import Modelo.Pesquisa;
import Modelo.Pessoa;
import Modelo.Tipo_Item;
import Modelo.Usuario;
import java.io.IOException;
import java.util.ArrayList;
/**
 * Classe responsável por intermediar a interface com as classes de controle.
 * @see Catalogo_Usuarios, Catalogo_Itens, Login
 */
public class Sistema {

    private Catalogo_Usuarios usuarios;
    private Catalogo_Itens itens;
    private Login login;

    public Sistema() {
        this.usuarios = new Catalogo_Usuarios();
        this.itens = new Catalogo_Itens();
        this.login = new Login(usuarios);
    }

    /**
     * Método responsável por inicializar os dados dos Catálogos.
     * @see Manipula_Arquivo, Inicializa_Catalogo
     * @throws Exception 
     */
    public void inicializaSistema() throws Exception {
        Manipula_Arquivo arquivo = new Manipula_Arquivo("Usuarios.json");
        Inicializa_Catalogo inicializador = new Inicializa_Catalogo(arquivo);
        inicializador.inicializaCatalogoUsuario(usuarios);
        arquivo.setNome_arquivo("Doacoes.json");
        inicializador.inicializaCatalogoItens(itens);
    }

    /**
     * @param email
     * @param senha
     * @throws Exception 
     */
    public void login(String email, String senha) throws Exception {
        this.login.validaLogin(email, senha);
    }
    
    /**     * 
     * @param email
     * @param senha
     * @throws Exception 
     */
    public void cadastraUsuario(String email, String senha, Pessoa pessoa) throws Exception {
        Cadastro cadastro = new Cadastro(this.usuarios);
        cadastro.cadastrarUsuario(email, senha, pessoa);
    }

    /**  
     * Salva os dados em um arquivo Json.
     * @see Manipula_Arquivo
     * @throws IOException 
     */
    public void salvaSessao() throws IOException {
        Manipula_Arquivo arquivo = new Manipula_Arquivo("Usuarios.json");
        arquivo.salvarDados(usuarios.toJson());
        arquivo.setNome_arquivo("Doacoes.json");
        arquivo.salvarDados(itens.toJson());
    }

    /**
     * Chama Controle_Administrador para adicionar im tipo de item.
     * @see Controle_Administrador
     * @param tipo_item
     * @throws Exception 
     */
    public void insereTipoItem(String tipo_item) throws Exception {
        Controle_Administrador adm = new Controle_Administrador(itens, this.login.getUsuario());
        adm.insereTipoItem(tipo_item);
    }

    /**
     * Recebe os dados da interface e transmite para Controle_Doacao.
     * @param descricao
     * @param cidade
     * @param qntd
     * @param tipo_item
     * @param fotos
     * @return String
     * @throws Exception 
     * @see Controle_Doacao
     */
    public String cadastraDoacao(String descricao, String cidade, int qntd, String tipo_item, String[] fotos) throws Exception {
        Controle_Doacao controle = new Controle_Doacao(this.itens);
        return controle.cadastraDoacao(descricao, cidade, qntd, tipo_item, this.login.getUsuario().getId(), fotos);
    }

    /**
     * Recebe os dados da interface e transmite para Catalogo_Itens.
     * @return ArrayList<String>
     * @see Catalogo_Itens
     */
    public ArrayList<String> tipos() {
        return this.itens.getTipos_de_item(); // Esse método deve ser de pesquisa
    }

    /**
     * Recebe os dados da interface e transmite para Pesquisa.
     * @param descricao
     * @return ArrayList<Item>
     * @throws Exception 
     * @see Pesquisa
     */
    public ArrayList<Item> pesquisaPorDescricao(String descricao) throws Exception {
        Pesquisa pesquisa = new Pesquisa(this.itens);
        return pesquisa.pesquisaPorDescricao(descricao);
    }

    /**
     * Recebe os dados da interface e transmite para Pesquisa.
     * @return ArrayList<Item>
     * @throws Exception 
     * @see Pesquisa
     */
    public ArrayList<Item> pesquisaItensNaoAvaliados() throws Exception {
        Pesquisa pesquisa = new Pesquisa(this.itens);
        return pesquisa.itensNaoAvaliados();
    }

    /**
     * Recebe os dados da interface e transmite para Controle_Administrador.
     * @param id_item
     * @throws Exception 
     * @see Controle_Administrador
     */
    public void aprovaDoacao(int id_item) throws Exception {
        Controle_Administrador adm = new Controle_Administrador(itens, this.login.getUsuario());
        adm.aprovaDoacao(id_item, this.usuarios);
    }

    /**
     * Recebe os dados da interface e transmite para Controle_Administrador.
     * @param id_item
     * @param justificativa
     * @throws Exception 
     * @see Controle_Administrador
     */
    public void reprovaDoacao(int id_item, String justificativa) throws Exception {
        Controle_Administrador adm = new Controle_Administrador(itens, this.login.getUsuario());
        adm.reprovaDoacao(id_item, justificativa,this.usuarios);
    }

    /**
     * Recebe os dados da interface e transmite para Pesquisa.
     * @param tipo
     * @return ArrayList<Item>
     * @throws Exception 
     * @see Pesquisa
     */
    public ArrayList<Item> pesquisaPorTipo(String tipo) throws Exception {
        Pesquisa pesquisa = new Pesquisa(this.itens);
        return pesquisa.pesquisaPorTipo(tipo);
    }

    /**
     * Recebe os dados da interface e transmite para Pesquisa.
     * @return ArrayList<Doacao>
     * @throws Exception 
     * @see Pesquisa
     */
    public ArrayList<Doacao> pesquisaDoacaoPorUsuario() throws Exception {
        Pesquisa pesquisa = new Pesquisa(this.itens);
        return pesquisa.doacaoPorUsuario(this.login.getUsuario().getId());
    }

    /**
     * Recebe os dados da interface e transmite para Pesquisa.
     * @param id_item
     * @return Doacao
     * @throws Exception 
     * @see Doacao
     */
    public Doacao pesquisaDoacao(Integer id_item) throws Exception {
        Pesquisa pesquisa = new Pesquisa(this.itens);
        return pesquisa.tipoItemPorId(id_item).getDoacao();
    }

    /**
     * Recebe os dados da interface e transmite para Controle_Interesse.
     * @param justificativa
     * @throws Exception 
     * @see Controle_Interesse, Pesquisa
     */
    public void adicionaInteresse(String justificativa, int id_item) throws Exception {
        Pesquisa pesquisa = new Pesquisa(this.itens);
        Controle_Interesse ci = new Controle_Interesse(pesquisa);
        ci.criaInteresse(this.login.getUsuario().getId(), justificativa, id_item);
    }
    
    /**
     * Método que altera alguns atributos de uma doação.
     * @param descricao
     * @param cidade
     * @param qntd
     * @param id_item
     * @throws Exception 
     */
    public void alteraDoacao(String descricao, String cidade, int qntd, int id_item) throws Exception{
        Pesquisa p = new Pesquisa(this.itens);
        Doacao doacao = p.tipoItemPorId(id_item).getDoacao();
        Controle_Doacao cd = new Controle_Doacao(this.itens);
        cd.alteraDoacao(descricao, cidade, qntd, doacao);
    }
    
    /**
     * Método que exclui uma doação inserida.
     * @param id_item
     * @throws Exception 
     */
    public void deletaDoacao(int id_item) throws Exception{
        Pesquisa p = new Pesquisa(this.itens);
        Tipo_Item doacao = p.tipoItemPorId(id_item);
        Controle_Doacao cd = new Controle_Doacao(this.itens);
        cd.excluiDoacao(doacao);
    }
    
    /**
     * Método que permite ao usuario escolher um interessado e o sistema envia um email, o retorno é 
     * o próprio email do usuario escolhido.
     * @param id_item
     * @param id_usuario
     * @return
     * @throws Exception 
     */
    
    public String escolheInteresse(int id_item, int id_usuario) throws Exception{
        Pesquisa p = new Pesquisa(this.itens);
        Item doacao = p.tipoItemPorId(id_item).getDoacao().getItem();
        Usuario usuario = this.usuarios.pesquisaUsuarioPorId(id_usuario);
        Controle_Interesse ci = new Controle_Interesse(p);
        ci.escolheInteresse(usuario,doacao);
        return usuario.getEmail();
    }
}
