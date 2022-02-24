package Controle;

import Modelo.Avaliacao;
import Modelo.Catalogo_Itens;
import Modelo.Catalogo_Usuarios;
import Modelo.Doacao;
import Modelo.Pesquisa;
import Modelo.Privilegio;
import Modelo.Sistema_Email;
import Modelo.Tipo_Estado_Avaliacao;
import Modelo.Usuario;

/**
 * Classe responsável por controlar as funções do administrador do Sistema.
 * @see Catalogo_Itens, Usuario * 
 */
public class Controle_Administrador {

    private Catalogo_Itens catalogo;
    private Usuario usuario;

    public Controle_Administrador(Catalogo_Itens catalogo, Usuario usuario) {
        this.catalogo = catalogo;
        this.usuario = usuario;
    }
    
    /**
     * Insere um novo tipo de item definido pelo ADM.
     * @param tipo_item
     * @throws Exception 
     * @see Catalogo_Itens, Usuario
     */
    public void insereTipoItem(String tipo_item) throws Exception {
        if (this.usuario.getPrivilegio() == Privilegio.ADM) { //verifica se o usuário atual é ADM
            this.catalogo.adicionaTiposDeItem(tipo_item);
        } else {
            throw new Exception("Usuario não possui privilégio de administrador!");
        }
    }

    /**
     * ADM aprova o cadastro das doações
     * @param id_item
     * @param usuarios
     * @throws Exception
     * @see Usuario, Pesquisa, Doacao
     */
    public void aprovaDoacao(int id_item, Catalogo_Usuarios usuarios) throws Exception {
        if (this.usuario.getPrivilegio() != Privilegio.ADM) {
            throw new Exception("Usuario não possui privilégio de administrador!");
        }
        
        Pesquisa p = new Pesquisa(this.catalogo);
        Doacao doacao = p.tipoItemPorId(id_item).getDoacao();
        
        Usuario u = usuarios.pesquisaUsuarioPorId(doacao.getItem().getIdDoador());
        doacao.setEstadoAvaliacao(Tipo_Estado_Avaliacao.APROVADO);
        
        Avaliacao av = new Avaliacao(Tipo_Estado_Avaliacao.APROVADO, "Aprovação", doacao.getItem().getIdDoador(), id_item);
        Sistema_Email.enviaEmail(u.getEmail(), "Reprovação de proposta de doação!" , av.mensagem());
    }

    /**
     * ADM reprova o cadastro das doações
     * @param id_item
     * @param justificativa
     * @param usuarios
     * @throws Exception 
     * @see Pesquisa, Doacao, Avaliacao
     */
    public void reprovaDoacao(int id_item, String justificativa, Catalogo_Usuarios usuarios) throws Exception {
        if (this.usuario.getPrivilegio() != Privilegio.ADM) {
            throw new Exception("Usuario não possui privilégio de administrador!");
        }
        
        Pesquisa p = new Pesquisa(this.catalogo);
        Doacao doacao = p.tipoItemPorId(id_item).getDoacao();
       
        Avaliacao av = new Avaliacao(Tipo_Estado_Avaliacao.REPROVADO, justificativa, doacao.getItem().getIdDoador(), id_item);
        doacao.setEstadoAvaliacao(Tipo_Estado_Avaliacao.REPROVADO);
        
        Usuario u = usuarios.pesquisaUsuarioPorId(id_item);
        Sistema_Email.enviaEmail(u.getEmail(), "Reprovação de proposta de doação!" , av.mensagem());
    }

}
