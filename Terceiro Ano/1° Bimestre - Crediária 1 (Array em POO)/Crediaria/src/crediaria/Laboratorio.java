package crediaria;
import java.util.Scanner;

public class Laboratorio {
    public static void main(String[] args) {
        Ponto3D ponto[] = new Ponto3D[5];
        Scanner scanf = new Scanner(System.in);
        
        for(int i=0; i<3; i++) {
            ponto[i] = new Ponto3D();
            
            System.out.printf("Digite o valor x do ponto 3D %d: ",i);
            ponto[i].vetor[0] = scanf.nextDouble();
            System.out.printf("Digite o valor y do ponto 3D %d: ",i);
            ponto[i].vetor[1] = scanf.nextDouble();
            System.out.printf("Digite o valor z do ponto 3D %d: ",i);
            ponto[i].vetor[2] = scanf.nextDouble();
            
            
            System.out.printf("Valor x do ponto %d: ",i);
            System.out.println(ponto[i].vetor[0]);
            
            System.out.printf("Valor y do ponto %d: ",i);
            System.out.println(ponto[i].vetor[1]);
            
            System.out.printf("Valor z do ponto %d: ",i);
            System.out.println(ponto[i].vetor[2]);
        }
        
        for(int i=3; i<ponto.length; i++) {
            System.out.printf("Digite o valor x do ponto 3D %d: ",i);
            double x = scanf.nextDouble();
            System.out.printf("Digite o valor y do ponto 3D %d: ",i);
            double y = scanf.nextDouble();
            System.out.printf("Digite o valor z do ponto 3D %d: ",i);
            double z = scanf.nextDouble();
            
            ponto[i] = new Ponto3D(x, y, z);
            
            
            System.out.printf("Valor x do ponto %d: ",i);
            System.out.println(ponto[i].vetor[0]);
            
            System.out.printf("Valor y do ponto %d: ",i);
            System.out.println(ponto[i].vetor[1]);
            
            System.out.printf("Valor z do ponto %d: ",i);
            System.out.println(ponto[i].vetor[2]);
        }
    }
}
