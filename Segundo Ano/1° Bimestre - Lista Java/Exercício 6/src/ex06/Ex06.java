package ex06;
import java.util.Scanner;
public class Ex06 {
    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);
        System.out.print("Digite um numero: ");
        int n = read.nextInt();
        System.out.println("Tabuada de "+n+": ");
        for (int i = 1; i <= 10; i++)
            System.out.println(n+" * "+i+" = "+(n*i));
    }
}
