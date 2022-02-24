package Controle;

import Modelo.Catalogo_Usuarios;
import Modelo.Usuario;
/**
 * Classe responsável por controlar o login dos usuários ao sistema.
 * @see Catalogo_Usuarios, Usuario
 */
public class Login {

    private Catalogo_Usuarios cat_usr;
    private Usuario usuario;

    public Login(Catalogo_Usuarios cat_usr) {
        this.cat_usr = cat_usr;
        this.usuario = null;
    }

    public Catalogo_Usuarios getCat_usr() {
        return cat_usr;
    }

    public void setCat_usr(Catalogo_Usuarios cat_usr) {
        this.cat_usr = cat_usr;
    }

    public Usuario getUsuario() {
        return usuario;
    }

    public void setUsuario(Usuario usuario) {
        this.usuario = usuario;
    }
    
    /**
     * Método responsável por validar o login do usuário.
     * @param email
     * @param senha
     * @return Usuario
     * @throws Exception 
     */
    public Usuario validaLogin(String email, String senha) throws Exception {
        for (Usuario u : this.cat_usr.getConjuntoUsuarios()) {
            if (u.getEmail().equals(email) && u.getSenha().equals(senha)) { //verifica email e senha
                this.usuario = u;
            }
        }
        if (this.usuario == null) {
            throw new Exception("Dados incorretos ou usuário não cadastrado");
        }
        return this.usuario;
    }
}
