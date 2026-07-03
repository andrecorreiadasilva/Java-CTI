package lutadorini2a;
public class Lutadorini2a {
    public static void main(String[] args) {
        Lutador lutadores[] = new Lutador[2];
        lutadores[0] = new Lutador("Josias da Família", "Boliviano", 41, 1.72, 89.4, 6, 1, 4);
        lutadores[1] = new Lutador("Mike Malvado", "Polonês", 35, 1.83, 101.3, 10, 2, 3);
        Luta lutaDoSeculo = new Luta();
        lutaDoSeculo.marcarLuta(lutadores[0], lutadores[1]);
        lutaDoSeculo.lutar();
    }
}