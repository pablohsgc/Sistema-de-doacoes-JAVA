package Modelo;

import com.google.gson.Gson;
import java.util.ArrayList;

/**
 * Classe responsável por modelar o Catálogo de Itens.
 * @see Tipo_Item
 */
public class Catalogo_Itens {

    private ArrayList<Tipo_Item> conjunto_tipo_itens;
    private ArrayList<String> tipos_de_item;

    public Catalogo_Itens() {
        this.conjunto_tipo_itens = new ArrayList<>();
        this.tipos_de_item = new ArrayList<>();
    }

    public Catalogo_Itens(ArrayList<Tipo_Item> conjunto_tipo_itens) {
        this.conjunto_tipo_itens = conjunto_tipo_itens;
    }

    public void setConjunto_tipo_itens(ArrayList<Tipo_Item> conjunto_tipo_itens) {
        this.conjunto_tipo_itens = conjunto_tipo_itens;
    }

    public ArrayList<Tipo_Item> getConjuntoTipoItens() {
        return this.conjunto_tipo_itens;
    }

    public ArrayList<String> getTipos_de_item() {
        return tipos_de_item;
    }

    public void setTipos_de_item(ArrayList<String> tipos_de_item) {
        this.tipos_de_item = tipos_de_item;
    }

    /**
     * Recebe uma Doacao e seu tipo para serem adicionados ao Catálogo
     * @param doacao
     * @param tipo
     * @throws Exception 
     * @see Tipo_Item, numeraItem
     */
    public void adicionaDoacao(Doacao doacao, String tipo) throws Exception {
        if(this.tipos_de_item.isEmpty())
            throw new Exception("Erro: Não existe tipo de item cadastrado!");
        
        if (this.tipos_de_item.contains(tipo.toUpperCase())) { //verifica se já foi cadastrado esse tipo de doacao
            Tipo_Item ti = new Tipo_Item(tipo.toUpperCase(), doacao);
            this.conjunto_tipo_itens.add(ti);
            this.numeraItem(doacao);
        } else {
            throw new Exception("Doação já cadastrada!");
        }
    }

    /**
     * @param item 
     */
    public void removeDoacao(Tipo_Item item) {
        this.conjunto_tipo_itens.remove(item);
    }

    /**
     * Adiciona um novo tipo de item escolhido pelo ADM
     * @param tipo 
     * @see Tipo_Item
     */
    public void adicionaTiposDeItem(String tipo) throws Exception{
        if (!this.tipos_de_item.contains(tipo.toUpperCase())){ //verifica se não existe esse tipo de item
            this.tipos_de_item.add(tipo.toUpperCase());
        } else {
            throw new Exception("Erro: Tipo de item já cadastrado!");
        }
    }

    /**
     * Remove um tipo de item já cadastrado pelo ADM
     * @param tipo 
     * @see Tipo_Item
     */
    public void removeTiposDeItem(String tipo) throws Exception {
        if (this.tipos_de_item.contains(tipo.toUpperCase())){ //revome o tipo se ele existir
            this.tipos_de_item.remove(tipo.toUpperCase());
        } else {
            throw new Exception("Erro: Tipo de item não cadastrado!");
        }
    }

    /**
     * Converte o Catálogo para Json
     * @return String
     */
    public String toJson() {
        return new Gson().toJson(this, Catalogo_Itens.class);
    }

    /**
     * Numera (id_item) as doações adicionadas.
     * @param doacao 
     * @see Item
     */
    private void numeraItem(Doacao doacao) {
        /*adicionar na uml (ADICIONADO)*/
        if (this.conjunto_tipo_itens.size() == 1) {
            doacao.getItem().setIdItem(1);
        } else {
            int tamanho = this.conjunto_tipo_itens.size();
            doacao.getItem().setIdItem(this.conjunto_tipo_itens.get(tamanho - 2).getDoacao().getItem().getIdItem() + 1);
            //Soma 1 ao id do anterior usuario a ser adicionado
        }
    }

}
