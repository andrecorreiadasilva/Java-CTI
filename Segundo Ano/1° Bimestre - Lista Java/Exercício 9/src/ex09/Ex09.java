package ex09;
import java.util.Scanner;
public class Ex09 {
    public static int fibonacci(int n){
        if (n == 0)
            return 0;
        else if (n == 1 || n == 2)
            return 1;
        else
            return fibonacci(n-1) + fibonacci(n-2);
    }
    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);
        System.out.print("Digite um valor: ");
        int n = read.nextInt();
        int fibo = fibonacci(n);
        System.out.println("Fibonacci = "+fibo);
    }
}
