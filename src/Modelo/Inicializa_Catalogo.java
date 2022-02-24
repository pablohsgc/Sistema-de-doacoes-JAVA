package Modelo;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import java.io.IOException;
/**
 * Classe responsável por inicializar o catálogo com os dados.
 * @see Manipula_Arquivo
 */
public class Inicializa_Catalogo {

    private Manipula_Arquivo manipula_arquivo;

    public Inicializa_Catalogo(Manipula_Arquivo arquivo) {
        this.manipula_arquivo = arquivo;
    }

    /**
     * Recebe um Catalogo_Usuarios e o preenche com os dados lidos do Json.
     * @param catalogo
     * @throws IOException
     * @throws Exception 
     * @see Manipula_Arquivo
     */
    public void inicializaCatalogoUsuario(Catalogo_Usuarios catalogo) throws IOException, Exception {
        String conteudo = manipula_arquivo.lerArquivo();
        //Gson gson = new Gson();
        
        GsonBuilder builder = new GsonBuilder();
        builder.registerTypeAdapter(Pessoa.class, new PessoaAdapter());
        Gson gson = builder.create();
        
        
        if (!(conteudo.length() > 0)) {
            throw new Exception("Catalogo de usuarios não pode ser inicializado!");
        }

        Catalogo_Usuarios catalogo_aux = gson.fromJson(conteudo, Catalogo_Usuarios.class);
        catalogo.setConjuntoUsuarios(catalogo_aux.getConjuntoUsuarios());
    }
 
    /**
     * Recebe um Catalogo_Itens e o preenche com os dados lidos do Json.
     * @param catalogo
     * @throws IOException
     * @throws Exception 
     * @see Manipula_Arquivo
     */
    public void inicializaCatalogoItens(Catalogo_Itens catalogo) throws IOException, Exception {
        String conteudo = manipula_arquivo.lerArquivo();
        Gson gson = new Gson();

        if (!(conteudo.length() > 0)) {
            throw new Exception("Catalogo de itens não pode ser inicializado!");
        }

        Catalogo_Itens catalogo_aux = gson.fromJson(conteudo, Catalogo_Itens.class);
        catalogo.setTipos_de_item(catalogo_aux.getTipos_de_item());
        catalogo.setConjunto_tipo_itens(catalogo_aux.getConjuntoTipoItens());
    }

}
