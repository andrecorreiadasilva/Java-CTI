package ex1;
import java.util.Random;
public class Ex1 {
    public static void main(String[] args) {
        Random rand = new Random();
        int[] array = new int[10];
        for (int i = 0; i < 10; i++)
            array[i] = rand.nextInt(101);
        for (int n : array)
            System.out.println(n);
    }
}
