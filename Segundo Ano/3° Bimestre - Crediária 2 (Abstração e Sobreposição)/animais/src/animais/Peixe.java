package animais;
public class Peixe extends Animal {
    public String corEscama;
    
    public Peixe(String corEscama, double peso, int idade, int membros) {
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
        System.out.println("Nadando");
    }
    @Override
    public void alimentar() {
        System.out.println("Comendo substâncias");
    }
    @Override
    public void emitirSom() {
        System.out.println("Peixe não faz som!");
    }
    public void soltarBolha() {
        System.out.println("Soltou uma bolha");
    }

    @Override
    public String toString() {
        return "Peixe { " + "corEscama=" + corEscama + ", idade=" + super.getIdade() 
                + ", peso=" + super.getPeso() + ", membros=" + super.getMembros() +" } ";
    }
}
