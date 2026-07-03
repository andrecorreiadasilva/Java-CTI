package ex4;
import java.util.Arrays;
import java.util.Scanner;
public class Ex4 {
    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);
        String[] array = new String[30];
        for (int i = 0; i < array.length; i++){
            System.out.print("Digite o login do aluno "+i+": ");
            array[i] = read.nextLine();
        }
        Arrays.sort(array);
        System.out.println("Logins em ordem alfabetica: ");
        for (String i : array)
            System.out.println(i);
    }
}
