public class Aluno {
    
    String nome;
    String turma;
    double nota;

    Aluno(String nome, String turma, double nota) {
        this.nome = nome;
        this.turma = turma;
        this.nota = nota;
    }

    public int compareTo(Aluno aluno) {
        return this.nome.compareTo(aluno.getNome());
    }

    public String getNome() {
        return this.nome;
    }

    @Override
    public String toString() {
        return this.nome;
    }
}
