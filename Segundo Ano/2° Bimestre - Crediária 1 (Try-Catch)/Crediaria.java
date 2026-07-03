package crediaria;
import java.util.InputMismatchException;
import java.util.Scanner;
public class Crediaria 
{
    public static int quociente(int numerador, int denominador)
    {
        return numerador / denominador;
    }
    public static void main(String[] args) 
    {
        boolean verificarlaco = true;
        int numerador=0, denominador=0, resultado=0;
        Scanner entrada = new Scanner(System.in);
        do{
            try{
                System.out.print("Informe o numerador: ");
                numerador = entrada.nextInt();
                verificarlaco = false;
            } catch (InputMismatchException error){
                entrada.nextLine();
                System.out.println("Valor nao inteiro digitado");
            }
        }while(verificarlaco);
        verificarlaco = true;
        do{
            try{
                System.out.print("Informe o denominador: ");
                denominador = entrada.nextInt();
                verificarlaco = false;
            } catch (InputMismatchException error){
                entrada.nextLine();
                System.out.println("Valor nao inteiro digitado");
            }
        }while(verificarlaco);
        try{
            resultado = quociente(numerador, denominador);
            System.out.printf("\nResultado: %d/%d = %d\n",numerador,denominador,resultado);
        }
        catch(ArithmeticException error){
            System.out.println("Divisao por zero nao existe");
        }
    }
}

