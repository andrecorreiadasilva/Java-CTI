package exercicio6;
public class Exercicio6 {
    public static void main(String[] args) {
        float alt = 1.73f;
        float peso = 63.5f;
        float imc = (float) peso / (alt * alt);
        System.out.println("IMC: "+imc);
        if (imc < 18.5)
            System.out.println("Abaixo do peso");
        else if (imc < 25)
            System.out.println("Peso ideal");
        else if (imc < 30)
            System.out.println("Acima do peso");
        else if (imc < 35)
            System.out.println("Obesidade grau I");
        else if (imc < 40)
            System.out.println("Obesidade grau II");
        else
            System.out.println("Obesidade grau III");
    }
}
