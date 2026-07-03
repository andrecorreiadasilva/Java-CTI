package animais;
public class Mamifero extends Animal {
    public String corPelo;

    public Mamifero(String corPelo, double peso, int idade, int membros) {
        super(peso, idade, membros);
        this.corPelo = corPelo;
    }
    
    @Override
    public void locomover() {
        System.out.println("Correndo");
    }
    @Override
    public void alimentar() {
        System.out.println("Mamando");
    }
    @Override
    public void emitirSom() {
        System.out.println("Som de mamífero");
    }

    public String getCorPelo() {
        return corPelo;
    }
    public void setCorPelo(String corPelo) {
        this.corPelo = corPelo;
    }

    @Override
    public String toString() {
        return "Mamifero { " + "corPelo=" + corPelo + ", idade=" + super.getIdade() 
                + ", peso=" + super.getPeso() + ", membros=" + super.getMembros() +" } ";
    }
}