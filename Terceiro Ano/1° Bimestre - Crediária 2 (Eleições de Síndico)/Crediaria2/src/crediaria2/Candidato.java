package crediaria2;
public class Candidato {
    String nome;
    int votos;
    
    public Candidato(String nome) {
        this.nome = nome;
        this.votos = 0;
    }
    
    public Candidato(String nome, int votos) {
        this.nome = nome;
        this.votos = votos;
    }

    public int getVotos() {
        return votos;
    }
    
    public void votado() {
        this.votos++;
    }

    @Override
    public String toString() {
        return nome;
    }
}
