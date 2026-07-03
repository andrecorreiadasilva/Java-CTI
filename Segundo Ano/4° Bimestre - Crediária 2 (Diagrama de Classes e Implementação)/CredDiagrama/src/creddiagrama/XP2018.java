package creddiagrama;
public class XP2018 extends XP implements Robot {
    // interface Robot
    @Override
    public void avisarIntrusos()   { System.out.println("Isto é o último aviso!"); }
    
    @Override
    public void destruirIntrusos() { System.out.println("Eu avisei..."); }

    // interface Vigilante
    @Override
    public void soarAlarme() { System.out.println("AAAARGH"); }

    // public boolean haIntrusos() { return true; } // herdado de XP...
}
