package crediaria2;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;
public class Crediaria2 {
    public static void main(String[] args) {
        ListaCandidatos lista = new ListaCandidatos();
        Scanner scanf = new Scanner(System.in);
        int menu;
        String nome;
        Candidato c;
        
        do {
            System.out.print("""
                               
                               1- Adicionar candidato
                               2- Remover candidato
                               3- Iniciar votacao
                             
                             """);
            System.out.print("Escolha a opcao desejada: ");
            menu = scanf.nextInt();
            
            if(menu == 1) {
                scanf.nextLine();
                System.out.print("Digite o nome do candidato: ");
                nome = scanf.nextLine();
                lista.inserirCandidato(nome);
            }
            
            if(menu == 2) {
                scanf.nextLine();
                System.out.print("Digite o nome do candidato: ");
                nome = scanf.nextLine();
                lista.removerCandidato(nome);
            }
        } while(menu!=3);
        
        int termino = lista.candidatos.size();
        
        do {
            for (int i=0; i<termino; i++) {
                System.out.println(i+": "+lista.candidatos.get(i).nome);
            }
            System.out.print("Digite o numero do candidato que voce quer votar. "
                    + "Digite "+termino+" para finalizar a votacao: ");
            menu = scanf.nextInt();
            if(menu > termino || menu < 0)
                System.out.println("Valor invalido digitado. Tente novamente\n");
            else if (menu != termino) {
                c = new Candidato(lista.candidatos.get(menu).nome, lista.candidatos.get(menu).votos);
                c.votado();
                lista.candidatos.set(menu, c);
                System.out.println("\nVoto registrado!\n");
            }
            else
                System.out.println(""); //pular linha
        } while (menu != termino);
        
        for (int i=0; i<termino; i++) {
            System.out.println(lista.candidatos.get(i).nome+": "
                        +lista.candidatos.get(i).votos+" votos");
        }
        
        Collections.sort(lista.candidatos, new Comparator<Candidato>() {
            @Override
            public int compare(Candidato c1, Candidato c2) {
                return Integer.compare(c2.votos, c1.votos);
            }
        });
        
        System.out.println("\nO candidato com a maior quantidade de votos foi "+
                lista.candidatos.get(0).nome+", com "+lista.candidatos.get(0).votos
                +" voto(s).");
    }
}
