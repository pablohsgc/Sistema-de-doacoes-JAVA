package Modelo;

import Modelo.Catalogo_Itens;
import Modelo.Tipo_Item;
import java.util.ArrayList;
/**
 * Classe responsável por realizar a pesquisa de dados no Catálogo de itens.
 * @see Catalogo_Itens
 */
public class Pesquisa {

    private Catalogo_Itens catalogo_itens;

    public Pesquisa(Catalogo_Itens catalogo_itens) {
        this.catalogo_itens = catalogo_itens;
    }

    public Catalogo_Itens getCatalogo_itens() {
        return catalogo_itens;
    }

    public void setCatalogo_itens(Catalogo_Itens catalogo_itens) {
        this.catalogo_itens = catalogo_itens;
    }

    /**
     * Recebe uma descrição de item e retorna itens com essa descrição.
     * @param descricao
     * @return ArrayList<\Item>
     * @throws Exception 
     * @see Item
     */
    public ArrayList<Item> pesquisaPorDescricao(String descricao) throws Exception {
        ArrayList<Item> itens_descricao = new ArrayList<>();
        //apenas itens aprovados serao mostrados na pesquisa
        for (Item item : this.itensAprovados()) {
            if (item.getDescricao().equalsIgnoreCase(descricao)) {
                itens_descricao.add(item);
            }
        }
        if (itens_descricao.isEmpty()) {
            throw new Exception("Descrição não encontrada");
        }
        return itens_descricao;
    }

    /**
     * Recebe um tipo de item e retorna itens desse tipo.
     * @param tipo
     * @return ArrayList<\Item>
     * @throws Exception 
     * @see Tipo_Item
     */
    public ArrayList<Item> pesquisaPorTipo(String tipo) throws Exception {
        ArrayList<Item> itens_tipo = new ArrayList<>();
        for (Tipo_Item ti : this.catalogo_itens.getConjuntoTipoItens()) {
            if (ti.getTipo().equalsIgnoreCase(tipo) && (ti.getDoacao().getEstadoAvaliacao() == Tipo_Estado_Avaliacao.APROVADO)) { //So aparece itens aprovados na pesquisa
                itens_tipo.add(ti.getDoacao().getItem());
            }
        }

        if (itens_tipo.isEmpty()) {
            throw new Exception("Tipo não encontrado");
        }

        return itens_tipo;
    }

    /**
     * Retorna todos os itens aprovados pelo ADM
     * @return ArrayList<\Item>
     * @throws Exception 
     * @see Item, Controle_Administrador
     */
    public ArrayList<Item> itensAprovados() throws Exception {
        ArrayList<Item> itens_aprovados = new ArrayList<>();
        ArrayList<Tipo_Item> conj = this.catalogo_itens.getConjuntoTipoItens();

        for (Tipo_Item ti : conj) {
            if (ti.getDoacao().getEstadoAvaliacao() == Tipo_Estado_Avaliacao.APROVADO) {
                itens_aprovados.add(ti.getDoacao().getItem());
            }
        }
        if (itens_aprovados.isEmpty()) {
            throw new Exception("Todos os itens foram avaliados");
        }
        return itens_aprovados;
    }

    /**
     * Retorna os itens não avaliados pelo ADM.
     * @return ArrayList<\Item>
     * @throws Exception 
     * @see Item, Controle_Administrador
     */
    public ArrayList<Item> itensNaoAvaliados() throws Exception {
        ArrayList<Item> itens_nao_avaliados = new ArrayList<>();
        ArrayList<Tipo_Item> conj = this.catalogo_itens.getConjuntoTipoItens();

        for (Tipo_Item ti : conj) {
            if (ti.getDoacao().getEstadoAvaliacao() == Tipo_Estado_Avaliacao.NAO_AVALIADO) {
                itens_nao_avaliados.add(ti.getDoacao().getItem());
            }
        }
        if (itens_nao_avaliados.isEmpty()) {
            throw new Exception("Não há doações para avaliar!");
        }
        return itens_nao_avaliados;
    }

    /**
     * Recebe o id_item e retorna essa Doação
     * @param id_item
     * @return Doacao
     * @throws Exception 
     * @see Doacao, Item
     */
    public Tipo_Item tipoItemPorId(int id_item) throws Exception {
        Tipo_Item doacao = null;
        for (Tipo_Item ti : this.catalogo_itens.getConjuntoTipoItens()) {
            if (ti.getDoacao().getItem().getIdItem() == id_item) {
                doacao = ti;
            }
        }
        
        if (doacao == null) {
            throw new Exception("Dados incorretos ou Item não existe");
        }

        return doacao;
    }

    /**
     * Recebe id_usuario e retorna a lista de doações dele.
     * @param id_usuario
     * @return ArrayList <\Doacao>
     * @throws Exception 
     * @see Doacao, Usuario
     */
    public ArrayList<Doacao> doacaoPorUsuario(int id_usuario) throws Exception {
        ArrayList<Doacao> doacao_usuario = new ArrayList<>();

        for (Tipo_Item ti : this.catalogo_itens.getConjuntoTipoItens()) {
            if (ti.getDoacao().getItem().getIdDoador() == id_usuario) {
                doacao_usuario.add(ti.getDoacao());
            }
        }
        if (doacao_usuario.isEmpty()) {
            throw new Exception("Nenhuma doação encontrada!");
        }
        return doacao_usuario;
    }
    

}
