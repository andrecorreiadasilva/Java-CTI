package ex3;
import java.util.Arrays;
import java.util.Scanner;
public class Ex3 {
    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);
        double[] array = new double[8];
        for (int i = 0; i < array.length; i++){
            do{
                System.out.print("Digite um valor "+i+" (deve ser entre 0.0 e 10.0): ");
                array[i] = read.nextDouble();
                if (array[i] < 0.0 || array[i] > 10.0)
                    System.out.println("Valor invalido digitado. Tente novamente.");
            }while (array[i] < 0.0 || array[i] > 10.0);
        }
        System.out.println("Vetor original: ");
        for (double i : array)
            System.out.println(i);
        Arrays.sort(array);
        System.out.println("Vetor ordenado: ");
        for (double i : array)
            System.out.println(i);
    }
}
