package Modelo;
/**
 * Classe respónsável por modelar o interesse de um usuário por uma doação.
 * @see Controle_Interesse
 */
public class Interesse {

    private int id_usuario;
    private boolean estado_doacao; //true= doacao aprovada e false = doacao nao aprovada
    private String justificativa;
    private int qntd_itens;

    public Interesse(int id_usuario, String justificativa, int qntd_itens) {
        this.id_usuario = id_usuario;
        this.justificativa = justificativa;
        this.qntd_itens = qntd_itens;
        this.estado_doacao = false;
    }

    public int getId_usuario() {
        return this.id_usuario;
    }

    public void setId_usuario(int id_usuario) {
        this.id_usuario = id_usuario;
    }

    public String getJustificativa() {
        return this.justificativa;
    }

    public void setJustificativa(String justificativa) {
        this.justificativa = justificativa;
    }

    public int getQntdItens() {
        return this.qntd_itens;
    }

    public void setQntdItens(int quantidade) {//a qntd de itens pedidos deve ser <= qntd de itens doados
        this.qntd_itens = quantidade;
    }

    public boolean getEstadoDoacao() {
        return this.estado_doacao;
    }

    public void setEstadoDoacao(boolean estado_doacao) {
        if (estado_doacao = true) {
            this.estado_doacao = true;
            //enviar email para recebedor da doacao                    
        } else {
            this.estado_doacao = false;
        }
    }

    @Override
    public String toString() {
        return "Interessse{"
                + "id_usuario=" + id_usuario
                + ", justificativa='" + justificativa + '\''
                + ", qntd_itens=" + qntd_itens
                + '}';
    }
}
