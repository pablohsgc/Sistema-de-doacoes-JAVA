package Controle;

import Modelo.Doacao;
import Modelo.Interesse;
import Modelo.Item;
import Modelo.Pesquisa;
import Modelo.Sistema_Email;
import Modelo.Usuario;

/**
 * Classe resposável por controlar o interesse do usuário por doações
 * @see Pesquisa, Interesse
 */
public class Controle_Interesse {

    private Pesquisa pesquisa;

    public Controle_Interesse(Pesquisa pesquisa) {
        this.pesquisa = pesquisa;
    }

    public Pesquisa getPesquisa() {
        return pesquisa;
    }

    public void setPesquisa(Pesquisa pesquisa) {
        this.pesquisa = pesquisa;
    }

    /**
     * Método resposável por criar um interesse do usuário por uma doação
     * @param id_interessado
     * @param justificativa
     * @param id_item
     * @throws Exception 
     * @see Interesse, Doacao
     */
    public void criaInteresse(int id_interessado, String justificativa, int id_item) throws Exception {
        Interesse interesse = new Interesse(id_interessado, justificativa, 1); // O sistema limita a quantidade em apenas 1
        Doacao doacao = this.pesquisa.tipoItemPorId(id_item).getDoacao();

        for (Interesse i : doacao.getInteressados()) {
            if (i.getId_usuario() == id_interessado) { //verifica se essa pessoa já tem interesse nesse item
                throw new Exception("Esse usuário já possui um interesse nessa doação!");
            }
        }
        
        doacao.adicionaInteresse(interesse);
    }
    
    /**
     * Método para montar uma mensagem e chamar o sistema de email para entrar em contato com o usuário.
     * @param u
     * @param i 
     */
    public void escolheInteresse(Usuario u,Item i){
        String mensagem = u.getPessoa().getRazaoSocial() + "você foi selecionado para receber a doação:" + 
                          i.getDescricao() + "aguarde o contato do dono do item.\n";
        String email = u.getEmail();
        String assunto = "Recebimento de doação.";
        Sistema_Email.enviaEmail(email, assunto, mensagem);
    }
}
