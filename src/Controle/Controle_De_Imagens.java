package Controle;

import java.io.File;
import java.util.ArrayList;
import javax.imageio.ImageIO;
import javax.swing.ImageIcon;

/**
 * Classe utilizada para auxiliar na adição de imagens na aplicação. Auxilia as interfaces que trabalham com imagens.
 */
public class Controle_De_Imagens {
    
    private ArrayList<String> imagens;
    
    public Controle_De_Imagens() {
        this.imagens = new ArrayList();
    }

    public ArrayList<String> getImagens() {
        return imagens;
    }

    public void setImagens(ArrayList<String> imagens) {
        this.imagens = imagens;
    }
    
    /**
     * Método que adiciona imagens no buffer de fotos.
     * @param imagem
     * @throws Exception 
     */
    public void adicionaImagem(String imagem) throws Exception{
        if(this.imagemAdicionada(imagem))
            throw new Exception("Erro: Imagem já adicionada!");
        if(imagem.equals(""))
            throw new Exception("Erro: Imagem sem caminho não pode ser adicionada!");
        this.imagens.add(imagem);
    }
    
    /**
     * Método para auxiliar no controle da classe.
     * @param imagem
     * @return 
     */
    public boolean imagemAdicionada(String imagem){
        for(String img : this.imagens){
            if(img.equalsIgnoreCase(imagem)) 
                return true;
        }
        
        return false;
    }
    
    /**
     * Método utilizado para ler uma imagem, e verifica se o arquivo selecionado realmente é imagem, caso contrário uma exceção é lançada.
     * @param arquivo
     * @return
     * @throws Exception 
     */
    public static ImageIcon leImagem(File arquivo) throws Exception{
        if(ImageIO.read(arquivo) == null)
            throw new Exception("Erro: Arquivo não possui formato de imagem!");
        
        return new ImageIcon(arquivo.getPath());
    }
    
    public void limpaBufferDeImagens(){
        this.imagens.clear();
    }
    
    /**
     * Metodo utilizado para redimensionar a imagem caso o tamanho seja maior que 600x400.
     * @param imagem 
     */
    public static void ajustaImagem(ImageIcon imagem){ 
        int altura = imagem.getIconHeight();
        int largura = imagem.getIconWidth();
        
        if(altura > 400)
            altura = 400;
        
        if(largura > 600)
            largura = 400;
        
        imagem.setImage(imagem.getImage().getScaledInstance(largura,altura,100));
    }
}
