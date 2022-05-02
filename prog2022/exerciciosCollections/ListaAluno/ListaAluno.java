import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
public class ListaAluno {

    public void adicionaAluno(Aluno aluno, List<Aluno> lista) {
        lista.add(aluno);
    }

    public void printaLista(List<Aluno> lista) {
        for(int i = 0; i <= (lista.size() - 1); i++) {
            System.out.println(lista.get(i));
        }
    }

    public static void main(String[] args) {
        
        ListaAluno lista = new ListaAluno();
        List<Aluno> alunos = new ArrayList<Aluno>();
        ComparaAluno ca = new ComparaAluno();
        
        Aluno al01 = new Aluno("Jéssica", "301", 8.8);
        Aluno al02 = new Aluno("Sarah", "301", 9.0);
        Aluno al03 = new Aluno("Leonardo", "301", 8.9);

        lista.adicionaAluno(al02, alunos);
        lista.adicionaAluno(al01, alunos);
        lista.adicionaAluno(al03, alunos);

        lista.printaLista(alunos); //lista não ordenada

        Collections.sort(alunos, ca);
        System.out.println();

        lista.printaLista(alunos); //lista ordenada
    }
}
