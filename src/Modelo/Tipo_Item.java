package Modelo;
/**
 * Classe que modela um tipo de item adicionado pelo ADM.
 */
public class Tipo_Item {

    private String tipo;
    private Doacao doacao;

    public Tipo_Item(String tipo) {
        this.tipo = tipo.toUpperCase();
        this.doacao = null;
    }

    public Tipo_Item(String tipo, Doacao doacao) {
        this.tipo = tipo.toUpperCase();
        this.doacao = doacao;
    }

    public String getTipo() {
        return this.tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo.toUpperCase();
    }

    public Doacao getDoacao() {
        return this.doacao;
    }

    public void setDoacao(Doacao doacao) {
        this.doacao = doacao;
    }
}
