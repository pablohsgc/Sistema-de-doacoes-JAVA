package Modelo;

import java.util.regex.Matcher;
import java.util.regex.Pattern;
/**
 * Classe que modela um usuário. * 
 */
public class Usuario {

    private String email;
    private String senha;
    private Pessoa pessoa;
    private int id;
    private Privilegio privilegio;

    public Usuario(String email, String senha,Pessoa pessoa) throws Exception {
        if (!Usuario.verificaEmailValido(email)) {
            throw new Exception("Formato de email invalido!");
        }

        this.pessoa = pessoa;
        this.email = email;
        this.senha = senha;
        this.privilegio = Privilegio.USR;
        this.id = -1;
    }

    public Usuario(String email, String senha, int id, Privilegio privilegio,Pessoa pessoa) throws Exception {
        if (!Usuario.verificaEmailValido(email))
            throw new Exception("Formato de email invalido!");
        
        this.pessoa = pessoa;
        this.email = email;
        this.senha = senha;
        this.id = id;
        this.privilegio = privilegio;
    }

    public String getEmail() {
        return this.email;
    }

    public void setEmail(String email) throws Exception {
        if (!Usuario.verificaEmailValido(email)) 
            throw new Exception("Formato de email invalido!");
        
        this.email = email;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }

    public String getSenha() {
        return this.senha;
    }

    public int getId() {
        return this.id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Privilegio getPrivilegio() {
        return this.privilegio;
    }

    public void setPrivilegio(Privilegio privilegio) {
        this.privilegio = privilegio;
    }

    @Override
    public String toString() {
        return "Usuario{" + "email=" + email + ", senha=" + senha + ", pessoa=" + pessoa.toString() + ", id=" + id + ", privilegio=" + privilegio + '}';
    }

    /**
     * Verifica se o formato do email é válido.
     * @param email   
     * @return boolean
     */
    public static boolean verificaEmailValido(String email) {
        boolean isEmailIdValid = false;
        if (email != null && email.length() > 0) {
            String expression = "^[\\w\\.-]+@([\\w\\-]+\\.)+[A-Z]{2,4}$";
            Pattern pattern = Pattern.compile(expression, Pattern.CASE_INSENSITIVE);
            Matcher matcher = pattern.matcher(email);
            if (matcher.matches()) {
                isEmailIdValid = true;
            }
        }
        return isEmailIdValid;
    }

    public Pessoa getPessoa() {
        return pessoa;
    }

    public void setPessoa(Pessoa pessoa) {
        this.pessoa = pessoa;
    }
}
