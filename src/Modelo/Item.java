package Modelo;

/**
 * Classe responsável por modelar um Item.
 * @see Doacao
 */
public class Item {

    private String descricao;
    private int quantidade;
    private String cidade;
    private int id_doador;
    private int id_item;
    private String[] fotos;

    public Item(String descricao, int quantidade, String cidade, int id_doador, int id_item, String[] fotos) {
        this.descricao = descricao.toUpperCase();
        this.quantidade = quantidade;
        this.cidade = cidade.toUpperCase();
        this.id_doador = id_doador;
        this.id_item = id_item;
        this.fotos = fotos;
    }

    public Item(String descricao, int quantidade, String cidade, int id_doador, String[] fotos) {
        this.descricao = descricao.toUpperCase();
        this.quantidade = quantidade;
        this.cidade = cidade.toUpperCase();
        this.id_doador = id_doador;
        this.id_item = -1;
        this.fotos = fotos;
    }

    public String getDescricao() {
        return this.descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao.toUpperCase();
    }

    public int getQuantidade() {
        return this.quantidade;
    }

    public void setQuantidade(int quantidade) {
        this.quantidade = quantidade;
    }

    public String getCidade() {
        return this.cidade;
    }

    public void setCidade(String cidade) {
        this.cidade = cidade.toUpperCase();
    }

    public int getIdDoador() {
        return this.id_doador;
    }

    public void setIdDoador(int id_doador) {
        this.id_doador = id_doador;
    }

    public int getIdItem() {
        return this.id_item;
    }

    public void setIdItem(int id_item) {
        this.id_item = id_item;
    }

    public String[] getFotos() {
        return fotos;
    }

    public void setFotos(String[] fotos) {
        this.fotos = fotos;
    }

    @Override
    public String toString() {
        return "Item{"
                + "descricao='" + descricao + '\''
                + ", quantidade=" + quantidade
                + ", cidade='" + cidade + '\''
                + ", id_item=" + id_item
                + '}';
    }
}
