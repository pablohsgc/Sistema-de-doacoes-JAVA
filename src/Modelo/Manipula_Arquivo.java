package Modelo;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
/**
 * Classe Responsável por manipular um arquivo Json com os dados. 
 */
public class Manipula_Arquivo {

    private String nome_arquivo;

    public Manipula_Arquivo(String nome_arquivo) {
        this.nome_arquivo = nome_arquivo;
    }

    /**
     * Lê o arquivo Json contendo os dados dos Catálogos
     * @return String
     * @throws FileNotFoundException
     * @throws IOException 
     * @see Inicializa_Catalogo
     */
    public String lerArquivo() throws FileNotFoundException, IOException {
        String conteudo = "";
        String linha = "";

        BufferedReader buffRead = new BufferedReader(new FileReader(nome_arquivo));

        while (linha != null) {
            conteudo += linha;
            linha = buffRead.readLine();
        }

        buffRead.close();

        return conteudo;
    }

    /**
     * Salva em arquivo Json os dados dos Catálogos
     * @param dados
     * @return
     * @throws IOException 
     * @see Inicializa_Catalogo, Catalogo_Usuarios, Catalogo_Itens
     */
    public boolean salvarDados(String dados) throws IOException {
        FileWriter fileWriter = new FileWriter(nome_arquivo);
        fileWriter.write(dados);
        fileWriter.flush();
        fileWriter.close();
        return false;
    }

    public String getNome_arquivo() {
        return nome_arquivo;
    }

    public void setNome_arquivo(String nome_arquivo) {
        this.nome_arquivo = nome_arquivo;
    }

}
