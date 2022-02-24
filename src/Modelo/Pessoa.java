package Modelo;

/**
 *
 * @author pablo
 */
public abstract class Pessoa {
    private String razaoSocial;

    public Pessoa(String razaoSocial) {
        this.razaoSocial = razaoSocial;
    }

    public String getRazaoSocial() {
        return razaoSocial;
    }

    public void setRazaoSocial(String razaoSocial) {
        this.razaoSocial = razaoSocial;
    }
    
    public abstract String documento();
}
