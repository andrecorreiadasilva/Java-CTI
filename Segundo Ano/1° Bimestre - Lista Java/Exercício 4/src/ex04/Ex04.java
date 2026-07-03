package ex04;
import java.util.Scanner;
public class Ex04 {
    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);
        int menu;
        float n1, n2, res;
        do{
            System.out.println("1-Soma\n2-Subtracao\n3-Multiplicacao\n4-Divisao\n5-Sair\n\nDigite a opcao desejada: ");
            menu = read.nextInt();
            if (menu < 1 || menu > 5)
                System.out.println("Opcao inexistente escolhida. Tente novamente.");
            else if (menu == 5)
                System.out.println("Adeus!");
            else{
                System.out.println("Digite o valor do primeiro numero: ");
                n1 = read.nextFloat();
                System.out.println("Digite o valor do segundo numero: ");
                n2 = read.nextFloat();
                if (menu == 1)
                    res = n1 + n2;
                else if (menu == 2)
                    res = n1 - n2;
                else if (menu == 3)
                    res = n1 * n2;
                else
                    res = n1 / n2;
                System.out.println("Resultado: "+res);
            }
        }while (menu != 5);
    }
}
