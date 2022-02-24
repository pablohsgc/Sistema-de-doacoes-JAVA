package Controle;

import Modelo.Catalogo_Usuarios;
import Modelo.Pessoa;
import Modelo.Usuario;

/** *
 * Classe resposável por adicionar novos usuários ao Catálogo de Usuários
 * @see Catalogo_Usuarios* 
 */
public class Cadastro {

    private Catalogo_Usuarios cat_usr;

    public Cadastro(Catalogo_Usuarios cat_usr) {
        this.cat_usr = cat_usr;
    }

    public Catalogo_Usuarios getCat_usr() {
        return cat_usr;
    }

    public void setCat_usr(Catalogo_Usuarios cat_usr) {
        this.cat_usr = cat_usr;
    }
    /**
     * Cadastra novos usuários ao Catálogo de Usuários
     * @param email
     * @param senha
     * @throws Exception    
     */
    public void cadastrarUsuario(String email, String senha, Pessoa pessoa) throws Exception {
        if(pessoa == null || email.equals("") || senha.equals("")){
            throw new Exception("Erro: Cadastro incompleto!");
        }
        
        for (Usuario u : this.cat_usr.getConjuntoUsuarios()) { //verifica se já existe esse usuário
            if (u.getEmail().equalsIgnoreCase(email) ||
                pessoa.documento().equalsIgnoreCase(u.getPessoa().documento()) ) {
            
                throw new Exception("Erro: Usuário já cadastrado!");
            }
        }        
        
        Usuario usr = new Usuario(email, senha, pessoa);
        this.cat_usr.adicionaUsuario(usr);
    }
}
