import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.util.ArrayList;

public class MinhaPlaylist{
    ArrayList<String> nameMusicas = new ArrayList <String>();
    public static void main(String[] args) {
        new MinhaPlaylist().leMusicas();
    }
    public void adicionaMusica(String musica){
        String[] lista = musica.split("/");
            nameMusicas.add(lista[0]); //split: quando encontra a "/", ele passa para a linha debaixo
    }

    public void go() {
        leMusicas();
        System.out.println(nameMusicas);
    }

    public void leMusicas(){
        try{

            File arquivo = new File("Playlist_do_Leo.txt");
            BufferedReader reader = new BufferedReader(new FileReader(arquivo)); //lê e armazena; FileReader = lê um arquivo
            String linha = null;
            
            while((linha = reader.readLine())!=null){
                adicionaMusica(linha);
            }

        } catch(Exception ex){ //gera erro no debug
            ex.printStackTrace();
        }
    } 
}
