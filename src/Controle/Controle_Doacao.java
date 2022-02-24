package Controle;

import Modelo.Catalogo_Itens;
import Modelo.Doacao;
import Modelo.Item;
import Modelo.Tipo_Item;

/**
 * Classe responsável por controlar o cadastro de doações ao sistema
 * @see Catalogo_Itens, Doacao
 */
public class Controle_Doacao {

    private Catalogo_Itens catalogo_itens;

    public Controle_Doacao(Catalogo_Itens catalogo_itens) {
        this.catalogo_itens = catalogo_itens;
    }

    public Controle_Doacao() {
        this.catalogo_itens = new Catalogo_Itens();
    }

    public Catalogo_Itens getCatalogo_itens() {
        return catalogo_itens;
    }

    public void setCatalogo_itens(Catalogo_Itens catalogo_itens) {
        this.catalogo_itens = catalogo_itens;
    }

    /**
     * Método responsãvel por adicionar uma doação ao sistema
     * @param descricao
     * @param cidade
     * @param qntd
     * @param tipo_item
     * @param id_doador
     * @return  String
     * @throws Exception 
     * @see Doacao
     */
    public String cadastraDoacao(String descricao, String cidade, int qntd, String tipo_item, int id_doador, String[] fotos) throws Exception {
        if(descricao.equals("") || cidade.equals(""))
            throw new Exception("Erro: Item não deve conter campos vazios!");
        
        Item item = new Item(descricao, qntd, cidade, id_doador,fotos);
        
        Doacao doacao = new Doacao(item);
        this.catalogo_itens.adicionaDoacao(doacao, tipo_item);

        return "Doação cadastrada!";
    }
    
    /**
     * Alterar os dados da doação passada como parâmetro.
     * @param descricao
     * @param cidade
     * @param qntd
     * @param d 
     */
    public void alteraDoacao(String descricao, String cidade, int qntd, Doacao d){
        Item item = d.getItem();
        item.setCidade(cidade);
        item.setDescricao(descricao);
        item.setQuantidade(qntd);
    }
    
    /**
     * Exclui a doação passada como parâmetro.
     * @param d 
     */
    public void excluiDoacao(Tipo_Item d){
        this.catalogo_itens.removeDoacao(d);
    }
    
}
