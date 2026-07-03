package exercicio5;
public class Exercicio5 {
    public static void main(String[] args) {
        int var1 = 10;
        int var2 = 2;
        int var3 = 5;
        float media = (float) (var1+var2+var3)/3;
        System.out.println("Media do aluno: "+media);
        if (media >= 6)
            System.out.println("Aprovado!");
        else if (media >= 3)
            System.out.println("Recuperacao!");
        else
            System.out.println("Reprovado!");
    }
}