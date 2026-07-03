package animais;
public class Animais {
    public static void main(String[] args) {
        Mamifero m = new Mamifero("Marrom", 95.3, 3, 15);
        Reptil r = new Reptil("Verde", 15.2, 5, 10);
        Peixe p = new Peixe("Cinza", 0.35, 1, 2);
        Ave a = new Ave("Azul", 0.7, 2, 10);

        m.locomover(); // correndo
        m.alimentar(); // mamando
        m.emitirSom(); // som de mamífero
        System.out.println(m);
        
        r.locomover(); // rastejando
        r.alimentar(); // comendo vegetais
        r.emitirSom(); // som de réptil
        System.out.println(r);
        
        p.locomover(); // nadando
        p.alimentar(); // comendo substâncias
        p.emitirSom(); // peixe não faz som!
        p.soltarBolha(); // soltou uma bolha
        System.out.println(p);
        
        a.locomover(); // voando
        a.alimentar(); // comendo frutas
        a.emitirSom(); // som de ave
        a.fazerNinho(); // construiu um ninho
        System.out.println(a);
        
        Arara a2 = new Arara("Azul", 0.8, 1, 0);
        Cachorro c = new Cachorro("Caramelo", 5.6, 1, 20);
        Canguru c2 = new Canguru("Marrom", 12.1, 2, 3);
        Cobra c3 = new Cobra("Verde", 0.6, 1, 5);
        
        a2.locomover(); // voando
        a2.alimentar(); // comendo frutas
        a2.emitirSom(); // som de ave
        a2.fazerNinho(); // construiu um ninho
        System.out.println(a2);
        
        c.locomover(); // correndo
        c.alimentar(); // mamando
        c.emitirSom(); // som de mamífero
        c.abanarRabo(); // abanando o rabo
        System.out.println(c);
        
        c2.locomover(); // saltando
        c2.alimentar(); // mamando
        c2.emitirSom(); // som de mamífero
        c2.usarBolsa(); // usando bolsa
        System.out.println(c2);
        
        c3.locomover(); // rastejando
        c3.alimentar(); // comendo vegetais
        c3.emitirSom(); // som de réptil
        System.out.println(c3);
        
        GoldFish g = new GoldFish("Amarelo", 0.3, 1, 10);
        Tartaruga t = new Tartaruga("Verde", 3.2, 1, 2);
        
        g.locomover(); // nadando
        g.alimentar(); // comendo substâncias
        g.emitirSom(); // peixe não faz som!
        g.soltarBolha(); // soltou uma bolha
        System.out.println(g);
        
        t.locomover(); // andando beeeeem devagar
        t.alimentar(); // comendo vegetais
        t.emitirSom(); // som de réptil
        System.out.println(t);
    }
}
