package animais;
public class Cobra extends Reptil {
    public Cobra(String corEscama, double peso, int idade, int membros) {
        super(corEscama, peso, idade, membros);
    }

    @Override
    public String toString() {
        return "Cobra { " + super.toString() +" }";
    }
}