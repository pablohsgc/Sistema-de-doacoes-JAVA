package Modelo;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import java.util.ArrayList;
/**
 * Classe responsável por modelar o Catálogo de Usuários do sistema
 * @see Usuario
 */
public class Catalogo_Usuarios {

    private ArrayList<Usuario> conjunto_usuarios;

    public Catalogo_Usuarios(ArrayList<Usuario> conjunto_usuarios) {
        this.conjunto_usuarios = conjunto_usuarios;
    }

    public Catalogo_Usuarios() {
        this.conjunto_usuarios = new ArrayList<>();
    }

    public ArrayList<Usuario> getConjuntoUsuarios() {
        return this.conjunto_usuarios;
    }

    public void setConjuntoUsuarios(ArrayList<Usuario> usuarios) {
        this.conjunto_usuarios = usuarios;
    }

    /**
     * Recebe um Usuario e adiciona ao Catálogo.
     * @param usuario 
     * @see Usuario
     */
    public void adicionaUsuario(Usuario usuario) {
        this.conjunto_usuarios.add(usuario);
        if (conjunto_usuarios.size() == 1) {
            usuario.setPrivilegio(Privilegio.ADM);
        }
        this.numeraUsuario(usuario);
    }

    /**
     * Recebe um Usuario e remove do Catálogo.
     * @param usuario  
     */
    public void removeUsuario(Usuario usuario) {
        this.conjunto_usuarios.remove(usuario);
    }

    
    /**
     * Recebe um Usuário e o numera (id_usuario)
     * @param usuario 
     * @see Usuario
     */
    private void numeraUsuario(Usuario usuario) {
        /*adicionar na uml (ADICIONADO)*/
        if (this.conjunto_usuarios.size() == 1) {
            usuario.setId(1);
        } else {
            int tamanho = this.conjunto_usuarios.size();
            usuario.setId(this.conjunto_usuarios.get(tamanho - 2).getId() + 1);
            //Soma 1 ao id do anterior usuario a ser adicionado
        }
    }
    
    /**
     * Recebe um id de usuário e retorna seu email
     * @param id
     * @return String
     */
    public Usuario pesquisaUsuarioPorId(int id){
        for(Usuario u : this.conjunto_usuarios){
            if(id == u.getId())
                return u;
        }
        
        return null;
    }

    /**
     * Converte o Catálogo para Json a criação de um TypeAdapter é necessária para que o json funcione corretamente.
     * @return String
     */
    public String toJson() {
        GsonBuilder builder = new GsonBuilder();
        builder.registerTypeAdapter(Pessoa.class, new PessoaAdapter());
        Gson gson = builder.create();
        
        return gson.toJson(this, Catalogo_Usuarios.class);
        //return new Gson().toJson(this, Catalogo_Usuarios.class);
    }

}
