import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class MinhaPlaylist {

    ArrayList<String> nomeMusicas = new ArrayList <String>();

    public static void main(String[] args) {
        new MinhaPlaylist().go();
        
    }

    public void adicionaMusica(String musica) {
        String[] lista = musica.split("/");
        nomeMusicas.add(lista[0]);
    }

    public void go() {
        leMusicas();
        System.out.println("Não ordenado\n"+nomeMusicas);
        
        Collections.sort(nomeMusicas);
        System.out.println("Ordenado\n"+nomeMusicas);
    }

    public void leMusicas() {
        try{

            File arquivo = new File("lista_musicas.txt");
            BufferedReader reader = new BufferedReader(new FileReader("lista_musicas.txt"));
            String linha = null;
            while((linha = reader.readLine()) != null) {
                adicionaMusica(linha);
            }
            reader.close();

        } catch(Exception ex) {
            ex.printStackTrace();
        }
    }

}
