package animais;
public class Ave extends Animal {
    public String corPena;
    
    public Ave(String corPena, double peso, int idade, int membros) {
        super(peso, idade, membros);
        this.corPena = corPena;
    }
    
    public String getCorPena() {
        return corPena;
    }
    public void setCorPena(String corPena) {
        this.corPena = corPena;
    }
    
    @Override
    public void locomover() {
        System.out.println("Voando");
    }
    @Override
    public void alimentar() {
        System.out.println("Comendo frutas");
    }
    @Override
    public void emitirSom() {
        System.out.println("Som de ave");
    }
    public void fazerNinho() {
        System.out.println("Construiu um ninho");
    }
    
    @Override
    public String toString() {
        return "Ave { " + "corPena=" + corPena + ", idade=" + super.getIdade() + ", peso=" + super.getPeso() + ", membros=" + super.getMembros() +" } ";
    }
}