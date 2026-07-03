package crediaria2;
import java.util.ArrayList;
public class ListaCandidatos {
    ArrayList<Candidato> candidatos;

    public ListaCandidatos() {
        this.candidatos = new ArrayList<>();
    }
    
    public void inserirCandidato(String n) {
        Candidato c = new Candidato(n);
        this.candidatos.add(c);
    }
    
    public void removerCandidato(String n) {
        int indice = -1;
        for (Candidato c : candidatos)
            if (c.nome.equals(n))
                indice = this.candidatos.indexOf(c);
        
        if (indice != -1) {
            this.candidatos.remove(indice);
            System.out.println("Candidato removido!");
        }
        else
            System.out.println("Candidato nao existe.");
    }
    
    
}
