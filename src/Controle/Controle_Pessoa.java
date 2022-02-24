package Controle;

import Modelo.Pessoa;
import Modelo.PessoaFisica;
import Modelo.PessoaJuridica;

/**
 * Classe com métodos estáticos para auxiliar no momento de criar instâncias de pessoas 
 * a serem cadastradas no sistema.
 */
public class Controle_Pessoa {
    public static Pessoa instancia_Pessoa_Fisica(String nome,String documento) throws Exception{
        if(nome.equals("") || documento.equals(""))
            throw new Exception("Erro: Nenhum dos campos deve ser vazio!");
        
        return new PessoaFisica(nome,documento);
    }
    
    public static Pessoa instancia_Pessoa_Juridica(String nome,String documento) throws Exception{
        if(nome.equals("") || documento.equals(""))
            throw new Exception("Erro: Nenhum dos campos deve ser vazio!");
        
        return new PessoaJuridica(nome,documento);
    }
}
