//Aluno: Leonardo Terra dos Santos
import java.util.ArrayList;
import java.util.Scanner;
public class TelaPoke {
    
    private final String[] opcoes = {"Sair", "Criar Pokemon", "Ver Pokemons", "Remover Pokemon", "Gerenciar habilidades"};
    private final String[] tipos = {"agua", "fogo", "planta"};
    public ArrayList<Pokemon> pokemons;
    private final Scanner input;

    public TelaPoke() {
        this.input = new Scanner(System.in);
        this.pokemons = new ArrayList<Pokemon>();
    }

    private void printaMenu() {
        System.out.println("____________________\nMENU: ");
        for(int i = 0; i <= this.opcoes.length - 1; i++) {
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

    public void printaListaPokemons() {
        for(int i = 0; i < pokemons.size(); i++) {
            System.out.println("["+i+"] "+this.pokemons.get(i).getNome());
        }
    }

    public void printaListaTipos() {
        for(int i = 0; i <= (this.tipos.length - 1); i++) {
            System.out.println("["+(i + 1)+"] "+tipos[i]);
        }
    }

    public void printaListaHabilidades(int poke) {
        for(int i = 0; i < pokemons.get(poke).getNumHabilidades(); i++) {
            System.out.println("["+i+"] "+this.pokemons.get(poke).getHabilidade(i).getNome());
        }
    }

    public void adicionaPokemon() {
        System.out.println("Qual o tipo do seu Pokemon?");
        printaListaTipos();
        int tipo = input.nextInt();

        System.out.println("Quantos pontos de vida ele(a) terá?");
        int hp = input.nextInt();
        input.nextLine();

        System.out.println("Qual o nome da sua criação?");
        String nome = input.nextLine();

        Pokemon pokemon = new Pokemon(nome, tipo, hp);
        pokemons.add(pokemon);
    }

    public void printaPokemons() {
        if(this.pokemons.size() != 0) {

            System.out.println("Digite o índice do Pokemon que deseja visualizar: ");
            printaListaPokemons();
            int pos = input.nextInt();

            System.out.println(this.pokemons.get(pos));
        }
        else System.out.println("Você ainda não criou nenhum Pokemon!");
    }

    public void removePokemon() {
        if(this.pokemons.size() != 0) {
            System.out.println("Qual Pokemon você deseja remover?");
            printaListaPokemons();
            int pos = input.nextInt();

            String nomeRemovido = pokemons.get(pos).getNome();

            pokemons.remove(pos);
            System.out.println(nomeRemovido+" removido.");
        }
        else System.out.println("Você ainda não criou nenhum Pokemon!");
    }
}