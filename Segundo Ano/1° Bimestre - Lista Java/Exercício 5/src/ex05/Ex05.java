package ex05;
import java.util.Scanner;
public class Ex05 {
    public static void main(String[] args) {
        Scanner read = new Scanner (System.in);
        System.out.println("Digite um numero inteiro: ");
        int n = read.nextInt();
        boolean primo = true;
        if (n == 1)
            primo = false;
        for (int i = n-1; i > 1; i--)
            if (n%i == 0)
                primo = false;
        if (primo)
            System.out.println("O numero eh primo!");
        else
            System.out.println("O numero nao eh primo!");
    }
}