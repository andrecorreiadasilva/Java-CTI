package animais;
public class Cachorro extends Mamifero {
    
    public Cachorro(String corPelo, double peso, int idade, int membros) {
        super(corPelo, peso, idade, membros);
    }
    
    public void enterrarOsso() {
        System.out.println("Enterrando osso");
    }
    
    public void abanarRabo() {
        System.out.println("Abanando o rabo");
    }
    
    @Override
    public String toString() {
        return "Cachorro { " + super.toString() +" }";
    }
}
