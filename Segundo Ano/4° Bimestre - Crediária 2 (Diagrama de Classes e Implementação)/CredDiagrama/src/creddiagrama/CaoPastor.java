package creddiagrama;
public abstract class CaoPastor implements CaoDeGuarda {
    public final static int N_PATAS = 4;
 
    // métodos privados
    private void fecharBoca()   { System.out.println("Grrrr........................................................................"); }
    private boolean haPredadores() {
        if (Math.random() < 0.5) {
            System.out.println("Há predadores");
            return true;
        }
        else {
            System.out.println("Não há predadores");
            return false;
        }
    }

    // interface CãoDeGuarda
    @Override
    public void morder() { fecharBoca(); }

    // inteface Cão
    @Override
    public int  nPatas() { return N_PATAS; }
    
    @Override
    public abstract void ladrar();

    // interface Vigilante
    @Override
    public void    soarAlarme() { ladrar(); }
    
    @Override
    public boolean haIntrusos() { return haPredadores(); }
}
