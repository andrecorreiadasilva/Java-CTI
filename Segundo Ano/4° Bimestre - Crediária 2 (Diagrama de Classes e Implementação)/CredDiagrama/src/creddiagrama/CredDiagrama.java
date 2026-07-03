package creddiagrama;
public class CredDiagrama {
    public static void main(String[] args) {
        Cao       c = new Chihuahua();
        Vigilante v = new Chihuahua();
        CaoPastor p = new Chihuahua();
        Chihuahua c2 = new Chihuahua();
        Robot     r = new XP2018();
        XP        x = new XP();

        c.ladrar();
        v.soarAlarme();
        ((Chihuahua)v).ladrar();
        ((Chihuahua)v).morder();
        ((Chihuahua)v).haIntrusos();
        p.soarAlarme();
        r.avisarIntrusos();
        r.soarAlarme();
        x.reboot();
        x.crash();
        ((XP2018)r).soarAlarme();
    }
}
