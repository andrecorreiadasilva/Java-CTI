package prova3bim;
import java.util.Scanner;
public class Biblioteca {
    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);
        
        Passageiro passageiro;
        Bilhete bilhete;
        
        String nome;
        String documento;
        long numCartao;
        
        int tipo;
        String codigo;
        String assento;
        double valor;
        int qtdeMalaDespachada;
        
        boolean validarLogin;
        
        System.out.print("Digite o nome do passageiro: ");
        nome = read.nextLine();
        
        System.out.print("Digite o documento do passageiro: ");
        documento = read.nextLine();
        
        System.out.print("Digite o número do cartão do passageiro: ");
        numCartao = read.nextLong();
        
        do {
            System.out.print("Digite o tipo do bilhete ("
                + "1- Econômico, 2- Executivo, 3- Primeira classe): ");
            tipo = read.nextInt();
            
            if (tipo < 1 || tipo > 3)
                System.out.println("Valor inválido. Redigite.");
        } while (tipo < 1 || tipo > 3);
        
        read.nextLine();
        System.out.print("Digite o código do bilhete: ");
        codigo = read.nextLine();
        
        System.out.print("Digite o assento: ");
        assento = read.nextLine();
        
        System.out.print("Digite o valor do bilhete: ");
        valor = read.nextDouble();
        
        
        
        if (tipo == 1)
            bilhete = new Economica(codigo, assento, valor);
        else if (tipo == 2)
            bilhete = new Executiva(codigo, assento, valor);
        else
            bilhete = new PrimeiraClasse(codigo, assento, valor);
        
        
        
        passageiro = new Passageiro(nome, documento, numCartao, bilhete);
        
        do {
            System.out.println("Antes de fazer o check-in, valide as informações");
            
            System.out.print("Digite o nome do passageiro: ");
            read.nextLine();
            nome = read.nextLine();
            
            System.out.print("Digite o documento do passageiro: ");
            documento = read.nextLine();
            
            validarLogin = passageiro.login(nome, documento);
        } while (!validarLogin);
        
        System.out.print("Digite a quantidade de malas a seram despachadas: ");
        qtdeMalaDespachada = read.nextInt();
        
        passageiro.bilhete.checkIn(codigo, qtdeMalaDespachada);
        
        System.out.println(passageiro);
        
    }   
}