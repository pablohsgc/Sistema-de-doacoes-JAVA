package Modelo;

import java.util.ArrayList;
/**
 * Classe responsável por modelar a Doação de um usuário.
 * @see Item, Interesse, Tipo_Estado_Avaliacao, Controle_Doacao
 */
public class Doacao {

    private Item item;
    private ArrayList<Interesse> interessados;
    private Tipo_Estado_Avaliacao estado_avaliacao = Tipo_Estado_Avaliacao.NAO_AVALIADO;

    public Doacao(Item item) {
        this.item = item;
        this.interessados = new ArrayList<>();
    }

    public Doacao(Item item, ArrayList<Interesse> interessados) {
        this.item = item;
        this.interessados = interessados;
    }

    public Item getItem() {
        return this.item;
    }

    public void setItem(Item item) {
        this.item = item;
    }

    public void setInteressados(ArrayList<Interesse> interessados) {
        this.interessados = interessados;
    }

    public ArrayList<Interesse> getInteressados() {
        return this.interessados;
    }

    public Tipo_Estado_Avaliacao getEstadoAvaliacao() {
        return this.estado_avaliacao;
    }

    public void setEstadoAvaliacao(Tipo_Estado_Avaliacao estado_avaliacao) {
        this.estado_avaliacao = estado_avaliacao;
    }

    /**
     * Recebe um tipo Interesse e o adiciona como interessado na doação.
     * @param interessado 
     * @see Interesse
     */
    public void adicionaInteresse(Interesse interessado) {
        this.interessados.add(interessado);
    }

    /**
     * Recebe um tipo Interesse e o escolhe para receber a doação.
     * @param interessado 
     * @see Interesse
     */
    public void escolheInteressado(Interesse interessado) throws Exception {
        interessado.setEstadoDoacao(true); //doacao feita
        int qntd_atual = this.item.getQuantidade();
        int qntd_doada = interessado.getQntdItens();

        if (qntd_atual < qntd_doada) { //nao pode doar mais itens do que existem
            throw new Exception("Não pode doar mais itens do que existem!");
        }
                   
        this.interessados.remove(interessado);//remove o interessado escolhido da lista
    }

}
