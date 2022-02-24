package Modelo;

/**
 * Extensão da classe Pessoa que representa uma pessoa Juridica.
 */
public class PessoaJuridica extends Pessoa{
    private String cnpj;

    public PessoaJuridica(String cnpj, String razaoSocial) {
        super(razaoSocial);
        this.cnpj = cnpj;
    }

    public String getCnpj() {
        return cnpj;
    }

    public void setCnpj(String cnpj) {
        this.cnpj = cnpj;
    }
    
    @Override
    public String documento() {
        return this.getCnpj();
    }
    
}
