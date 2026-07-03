package ex5;

import java.util.Random;

public class Ex5 {
    public static void main(String[] args) {
        Random rand = new Random();
        int[] a = new int[10];
        int[] b = new int[10];
        for (int i = 0; i < 10; i++){
            a[i] = rand.nextInt(301);
            b[i] = rand.nextInt(301);
        }
        for (int i = 0; i < 10; i++){
            System.out.println("\nA["+i+"]: "+a[i]);
            System.out.println("B["+i+"]: "+b[i]);
        }
    }
}
