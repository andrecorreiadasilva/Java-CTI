package animais;
public class Arara extends Ave {

    public Arara(String corPena, double peso, int idade, int membros) {
        super(corPena, peso, idade, membros);
    }
    
    @Override
    public String toString() {
        return "Arara { " + super.toString() +" }";
    }
}
