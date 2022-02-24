package Modelo;

/**
 * Extensão de classe Pessoa que representa uma pessoa Fisica. 
 */
public class PessoaFisica extends Pessoa{
    private String cpf;

    public PessoaFisica(String cpf, String razaoSocial) {
        super(razaoSocial);
        this.cpf = cpf;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }
    
    
    @Override
    public String documento() {
        return this.getCpf();
    }
    
}
