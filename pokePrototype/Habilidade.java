//Aluno: Leonardo Terra dos Santos
public class Habilidade {

    private final String nome;
    private final String tipo;  
    private final double danoBase;
    private final int PPMax;
    private int PPAtual;

    public Habilidade(String nome, int tipo, int dano, int pp) {
        this.nome = nome;

        if(tipo == 1) this.tipo = "agua";
        else if(tipo == 2) this.tipo = "fogo";
        else if(tipo == 3) this.tipo = "planta";
        else this.tipo = "normal"; //causa o dano base da habilidade contra outros tipos, sem alteração
        
        if(dano > 100) this.danoBase = 100; //limite máximo de dano
        else if(dano < 10) this.danoBase = 10; //limite mínimo de dano
        else this.danoBase = dano; //dano base da habilidade (posteriormente manipulado pela interação entre tipos)

        if(dano >= 75 && pp > 15) this.PPMax = 15; //limitador de PP para habilidades muito fortes
        else if(pp < 5) this.PPMax = 5;
        else this.PPMax = pp; //PP = quantidade de vezes que uma habilidade pode ser utilizada
        this.PPAtual = this.PPMax;
    }

    public String getNome() {
        return this.nome;
    }
    public String getTipo() {
        return this.tipo;
    }
    public String getInicialTipo() {
        if(this.tipo.equals("agua")) return "a";
        else if(this.tipo.equals("fogo")) return "f";
        else if(this.tipo.equals("planta")) return "p";
        else return "n";
    }
    public double getDanoBase() {
        return this.danoBase;
    }
    public int getPPMax() {
        return this.PPMax;
    }
    public int getPPAtual() {
        return this.PPAtual;
    }
    public void setPPAtual(int valor) {
        this.PPAtual = valor;
    }

    @Override
    public String toString() {
        return this.nome+" (PP: "+this.PPAtual+"/"+this.PPMax+")\nTipo: "+this.tipo+"\nDano base: "+this.danoBase;
    }
}