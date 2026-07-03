package ex08;
import java.util.Scanner;
public class Ex08 {
    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);
        System.out.print("Digite um valor: ");
        int n = read.nextInt();
        int fat = n;
        boolean existe = true;
        if (n == 0)
            fat = 1;
        else if (n < 0)
            existe = false;
        else
            for (int i = n-1; i > 1; i--)
                fat *= i;
        if (existe)
            System.out.println(n+"! = "+fat);
        else
            System.out.println("Nao existe fatorial de "+n);
    }
}
