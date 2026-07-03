package animais;
public class Canguru extends Mamifero {
    public Canguru(String corPelo, double peso, int idade, int membros) {
        super(corPelo, peso, idade, membros);
    }
    
    public void usarBolsa() {
        System.out.println("Usando bolsa");
    }
    
    @Override
    public void locomover() {
        System.out.println("Saltando");
    }
    
    @Override
    public String toString() {
        return "Canguru { " + super.toString() +" }";
    }
}
