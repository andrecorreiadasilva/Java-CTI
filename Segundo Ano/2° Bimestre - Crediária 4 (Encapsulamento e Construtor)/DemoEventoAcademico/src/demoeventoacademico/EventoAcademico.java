package demoeventoacademico;
import java.util.Date;
public class EventoAcademico {
    private String nomeDoEvento, localDoEvento;
    private Date inicioDoEvento, fimDoEvento;
    private int numeroDeParticipantes;

    EventoAcademico (String n, String l, Date i, Date f, int num) {
        nomeDoEvento = n;
        localDoEvento = l;
        inicioDoEvento = i;
        fimDoEvento = f;
        numeroDeParticipantes = num;
    }
    
    public String getNomeDoEvento(){
        return nomeDoEvento;
    }
    public void setNomeDoEvento(String newNomeDoEvento) {
        this.nomeDoEvento = newNomeDoEvento;
    }
    
    public String getLocalDoEvento(){
        return localDoEvento;
    }
    public void setLocalDoEvento(String newLocalDoEvento) {
        this.localDoEvento = newLocalDoEvento;
    }
    
    public Date getInicioDoEvento(){
        return inicioDoEvento;
    }
    public void setInicioDoEvento(Date newInicioDoEvento) {
        this.inicioDoEvento = newInicioDoEvento;
    }
    
    public Date getFimDoEvento(){
        return fimDoEvento;
    }
    public void setFimDoEvento(Date newFimDoEvento) {
        this.fimDoEvento = newFimDoEvento;
    }
    
    public int getNumeroDeParticipantes(){
        return numeroDeParticipantes;
    }
    public void setNumeroDeParticipantes(int newNumeroDeParticipantes) {
        this.numeroDeParticipantes = newNumeroDeParticipantes;
    }

    public String toString() {
        String frase = "O evento "+nomeDoEvento+" terá "+numeroDeParticipantes+" participantes e ocorrerá em "
                +localDoEvento+" de "+inicioDoEvento+" até "+fimDoEvento;
        return frase;
    }
}
