package ex2;
import java.util.Random;
public class Ex2 {
    public static void main(String[] args) {
        Random rand = new Random();
        int[] array = new int[10];
        for (int i = 0; i < 10; i++)
            array[i] = rand.nextInt(101);
        System.out.println("Vetor");
        for (int i : array)
            System.out.println(i);
        System.out.println("Valores das posicoes pares");
        for (int i = 0; i < 10; i+=2)
            System.out.println(array[i]);
        System.out.println("Valores das posicoes impares");
        for (int i = 1; i < 10; i+=2)
            System.out.println(array[i]);
        System.out.println("Vetor na posicao inversa");
        for (int i = 9; i > -1; i--)
            System.out.println(array[i]);
    }
}
