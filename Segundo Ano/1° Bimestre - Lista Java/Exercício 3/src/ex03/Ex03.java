package ex03;
import java.util.Scanner;
public class Ex03 {
    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);
        float n;
        System.out.println("Digite um numero: ");
        n = read.nextFloat();
        if (n > 0)
            System.out.println("Numero positivo");
        else if (n < 0)
            System.out.println("Numero negativo");
        else
            System.out.println("Numero igual a zero");
    }
}
