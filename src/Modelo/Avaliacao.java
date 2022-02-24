package Modelo;
/**
 * Classe responsável por modelar a avaliação do ADM a uma doação cadastrada
 * @see Tipo_Estado_Avaliacao
 */
public class Avaliacao {

    private Tipo_Estado_Avaliacao estado_avaliacao;
    private String justificativa;
    private int id_doador;
    private int id_item;

    public Avaliacao(Tipo_Estado_Avaliacao estado_avaliacao, String justificativa, int id_doador, int id_item) {
        this.estado_avaliacao = estado_avaliacao;
        this.justificativa = justificativa;
        this.id_doador = id_doador;
        this.id_item = id_item;
    }

    public void setEstadoAvaliacao(Tipo_Estado_Avaliacao estado) {
        this.estado_avaliacao = estado;
    }

    public Tipo_Estado_Avaliacao getEstadoAvaliacao() {
        return estado_avaliacao;
    }

    public void setJustificativa(String justificativa) {
        this.justificativa = justificativa;
    }

    public String getJustificativa() {
        return this.justificativa;
    }

    public int getIdDoador() {
        return this.id_doador;
    }

    public void setIdDoador(int id_doador) {
        this.id_doador = id_doador;
    }

    public void setIdItem(int id_item) {
        this.id_item = id_item;
    }

    public int getIdItem() {
        return this.id_item;
    }
    
    public String mensagem(){
        return "Doação em estado " + this.estado_avaliacao + "pelo administrador.\nJustificativa: "+this.justificativa;
    }
    
}
