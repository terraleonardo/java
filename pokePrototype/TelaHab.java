//Aluno: Leonardo Terra dos Santos
import java.util.ArrayList;
import java.util.Scanner;
public class TelaHab {
    
    private final String[] opcoes = {"Voltar", "Ensinar habilidade", "Ver habilidades", "Remover habilidade"};
    private final TelaPoke tp;
    private ArrayList<Pokemon> pokemons;
    private final Scanner input;
    private int pokemonSelecionado;

    public TelaHab(TelaPoke tp) {
        this.input = new Scanner(System.in);
        this.tp = tp;
        this.pokemons = tp.pokemons;
    }

    public void selecionaPokemon() {
        System.out.println("Deseja gerenciar as habilidades de qual Pokemon?");
        tp.printaListaPokemons();
        this.pokemonSelecionado = input.nextInt();
    }

    private void printaMenu() {
        System.out.println("____________________\nMENU DE HABILIDADES ["+pokemons.get(pokemonSelecionado).getNome()+"]: ");
        for(int i = 0; i <= (this.opcoes.length - 1); i++) {
            System.out.println("["+i+"] "+opcoes[i]);
        }
        System.out.print("O que deseja fazer?: ");
    }

    public int mostraMenu() {
        int opc = -1;

        while(opc < 0 || opc > opcoes.length) {
            this.printaMenu();
            opc = input.nextInt();
        }
        input.nextLine();
        return opc;
    }

    public void adicionaHabilidade() {
        if(this.pokemons.size() != 0) {

            System.out.println("Qual o tipo da habilidade? ");
            tp.printaListaTipos();
            int tipo = input.nextInt();

            System.out.print("Digite o número de dano base dessa habilidade: ");
            int dano = input.nextInt();

            System.out.print("Digite o número de vezes que essa habilidade pode ser usada: ");
            int pp = input.nextInt(); input.nextLine();

            System.out.print("Qual o nome dessa habilidade?: ");
            String nome = input.nextLine();

            pokemons.get(pokemonSelecionado).criaHabilidade(nome, tipo, dano, pp);
        }
        else System.out.println("Você ainda não criou nenhum Pokemon!");
    }

    public void printaHabilidades() {
        if(this.pokemons.get(pokemonSelecionado).getNumHabilidades() != 0) {
            
            System.out.println("Habilidades de "+pokemons.get(pokemonSelecionado).getNome()+": ");
            for(int i = 0; i < pokemons.get(pokemonSelecionado).getNumHabilidades(); i++) {
                System.out.println(pokemons.get(pokemonSelecionado).getHabilidade(i)+"\n");
            }
        }
        else System.out.println("Este Pokemon ainda não aprendeu nenhuma habilidade!");
    }

    public void esqueceHabilidade() {
        if(this.pokemons.get(pokemonSelecionado).getNumHabilidades() != 0) {

            System.out.println("Digite o índice da habilidade a ser apagada: ");
            tp.printaListaHabilidades(pokemonSelecionado);
            int pos = input.nextInt();

            String nomeApagado = pokemons.get(pokemonSelecionado).getHabilidade(pos).getNome();

            pokemons.get(pokemonSelecionado).removeHabilidade(pos);
            System.out.println(pokemons.get(pokemonSelecionado).getNome()+" esqueceu a habilidade "+nomeApagado);
        }
        else System.out.println("Este Pokemon ainda não aprendeu nenhuma habilidade!");
    }
}