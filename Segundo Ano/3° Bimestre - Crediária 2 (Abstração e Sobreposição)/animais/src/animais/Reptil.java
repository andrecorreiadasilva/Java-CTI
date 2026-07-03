package animais;
public class Reptil extends Animal {
    public String corEscama;
    
    public Reptil(String corEscama, double peso, int idade, int membros) {
        super(peso, idade, membros);
        this.corEscama = corEscama;
    }
    
    public String getCorEscama() {
        return corEscama;
    }
    public void setCorEscama(String corEscama) {
        this.corEscama = corEscama;
    }
    
    @Override
    public void locomover() {
        System.out.println("Rastejando");
    }
    @Override
    public void alimentar() {
        System.out.println("Comendo vegetais");
    }
    @Override
    public void emitirSom() {
        System.out.println("Som de réptil");
    }

    @Override
    public String toString() {
        return "Reptil { " + "corEscama=" + corEscama + ", idade=" + super.getIdade() 
                + ", peso=" + super.getPeso() + ", membros=" + super.getMembros() +" } ";
    }
}
