//Aluno: Leonardo Terra dos Santos
import java.util.ArrayList;
public class Pokemon {
    
    private final String nome;
    private final String tipo;
    private final double HPMax;
    private double HPAtual;
    private ArrayList<Habilidade> habilidades;

    public Pokemon(String nome, int tipo, int hp) {
        this.nome = nome;
        
        if(tipo == 1) this.tipo = "agua"; 
        else if(tipo == 2) this.tipo = "fogo";
        else if(tipo == 3) this.tipo = "planta";
        else this.tipo = "normal"; //recebe o dano base de habilidades de outros tipos, sem alteração

        if(hp < 20) this.HPMax = 20; //limite mínimo de HP
        else if(hp > 300) this.HPMax = 300; //limite máximo de HP
        else this.HPMax = hp; //HP = pontos de "vida"
        this.HPAtual = this.HPMax;
        this.habilidades = new ArrayList<Habilidade>();
    }

    public String getNome() {
        return this.nome;
    }
    public String getTipo() {
        return this.tipo;
    }
    public double getHPMax() {
        return this.HPMax;
    }
    public double getHPAtual() {
        return this.HPAtual;
    }
    public void setHPAtual(double valor) {
        this.HPAtual = valor;
    }

    public void criaHabilidade(String nome, int tipo, int dano, int pp) {
        Habilidade h = new Habilidade(nome, tipo, dano, pp);
        this.habilidades.add(h);
    }

    public int getNumHabilidades() {
        return this.habilidades.size();
    }
    public Habilidade getHabilidade(int pos) {
        return habilidades.get(pos);
    }
    public void removeHabilidade(int pos) {
        this.habilidades.remove(pos);
    }

    @Override
    public String toString() {
        String habs = "";
        for(int i = 0; i < habilidades.size(); i++) {
            habs += "\n ["+habilidades.get(i).getInicialTipo()+"] "+habilidades.get(i).getNome()+" (PP: "+habilidades.get(i).getPPAtual()+"/"+habilidades.get(i).getPPMax()+")";
        }
        return "Nome: "+this.nome+" (HP: "+this.HPAtual+"/"+this.HPMax+")\nTipo: "+this.tipo+"\nHabilidades: "+habs;
    }
}
