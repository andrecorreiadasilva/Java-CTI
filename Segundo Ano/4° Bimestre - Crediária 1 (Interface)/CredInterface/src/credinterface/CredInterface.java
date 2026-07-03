package credinterface;
public class CredInterface {
    public static void main(String[] args) {
        ControleRemoto cr = new ControleRemoto();
        System.out.println(cr);
        
        cr.ligar();
        System.out.println(cr);
        cr.desligar();
        System.out.println(cr);
        
        cr.abrirMenu();
        cr.fecharMenu();
        
        cr.ligar();
        cr.maisVolume();
        System.out.println(cr);
        cr.menosVolume();
        System.out.println(cr);
        
        cr.ligarMudo();
        System.out.println(cr);
        cr.desligarMudo();
        System.out.println(cr);
        
        cr.play();
        System.out.println(cr);
        cr.pause();
        System.out.println(cr);
    }
}
