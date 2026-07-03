package animais;
public class Tartaruga extends Reptil {
    public Tartaruga(String corEscama, double peso, int idade, int membros) {
        super(corEscama, peso, idade, membros);
    }
    
    @Override
    public void locomover() {
        System.out.println("Andando beeeeem devagar");
    }
    
    @Override
    public String toString() {
        return "Tartaruga { " + super.toString() +" }";
    }
}