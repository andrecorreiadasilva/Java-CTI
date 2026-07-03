package animais;
public class GoldFish extends Peixe {
    public GoldFish(String corEscama, double peso, int idade, int membros) {
        super(corEscama, peso, idade, membros);
    }

    @Override
    public String toString() {
        return "GoldFish { " + super.toString() +" } ";
    }

}
