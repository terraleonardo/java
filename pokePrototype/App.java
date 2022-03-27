//Aluno: Leonardo Terra dos Santos
public class App {
    
    public static void main(String[] args) {
        System.out.println("Bem vindo ao criador de Pokemon!");

        TelaPoke tp = new TelaPoke();
        TelaHab th = new TelaHab(tp);
        int opcaoEscolhidaTP = -1;

        while(opcaoEscolhidaTP != 0) {
            opcaoEscolhidaTP = tp.mostraMenu(); 
            System.out.println();

            switch (opcaoEscolhidaTP) {
                case 1:
                    tp.adicionaPokemon();
                    System.out.println("____________________");
                break;
                case 2:
                    tp.printaPokemons();
                    System.out.println("____________________");
                break;
                case 3:
                    tp.removePokemon();
                    System.out.println("____________________");
                break;
                case 4:
                    if(tp.pokemons.size() != 0) {

                        th.selecionaPokemon();
                        int opcaoEscolhidaTH = -1;
                        while(opcaoEscolhidaTH != 0) {
                            opcaoEscolhidaTH = th.mostraMenu();
                            System.out.println();

                            switch (opcaoEscolhidaTH) {
                                case 1:
                                    th.adicionaHabilidade();
                                    System.out.println("____________________");
                                break;
                                case 2:
                                    th.printaHabilidades();
                                    System.out.println("____________________");
                                break;
                                case 3:
                                    th.esqueceHabilidade();
                                    System.out.println("____________________");
                                break;
                            }
                        }
                    }
                    else System.out.println("Você ainda não criou nenhum Pokemon!");
                break;
            }
        }
        System.out.println("Até logo!");
    }
}