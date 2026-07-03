package ex07;
import java.util.Scanner;
public class Ex07 {
    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);
        int menu;
        float temp;
        do{
            System.out.print("1-Celsius para Fahrenheit\n2-Fahrenheit para Celsius\n3-Sair\nDigite sua opcao: ");
            menu = read.nextInt();
            if (menu < 1 || menu > 3)
                System.out.println("Opcao invalida digitada. Tente novamente.");
            else if (menu == 3)
                System.out.println("Adeus!");
            else{
                System.out.print("Digite a temperatura original: ");
                temp = read.nextFloat();
                if (menu == 1)
                    System.out.println("A temperatura digitada equivale, em Fahrenheit, a "+(temp*1.8+32));
                else
                    System.out.println("A temperatura digitada equivale, em Celsius, a "+((temp-32)/1.8));
            }
        }while (menu != 3);
    }
}
