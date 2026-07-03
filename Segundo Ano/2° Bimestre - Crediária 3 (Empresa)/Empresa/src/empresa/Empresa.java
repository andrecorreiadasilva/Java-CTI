package empresa; // oi debora!! (～￣▽￣)～

import java.text.DateFormat;
import java.text.ParseException;
public class Empresa {

    public static void main(String[] args) throws ParseException {
        DateFormat f = DateFormat.getDateInstance();

        Funcionario f1 = new Funcionario();

        f1.nome = "Arnaldo";
        f1.departamento = "Informática";
        f1.salario = 1000.0;

        f1.data = f.parse("12/01/1995");
        f1.rg = "1234567890";
        f1.estanaEmpresa = true;

        Funcionario f2 = new Funcionario();

        f2.nome = "Roberto";
        f2.departamento = "Informática";
        f2.salario = 2000.0;
        f2.data = f.parse("30/03/1997");
        f2.rg = "1234567890";
        f2.estanaEmpresa = true;

        f1.mostra();
        f2.mostra();

        f1.bonifica(10);
        f2.bonifica(100);

        f2.demite();

        f1.mostra();
        f2.mostra();

        System.out.println("Ganho anual de " + f1.nome + ": " + f1.ganhoAnual() + "\n");

        f1.trocarDep("Gestão ambiental");

        f1.mostra();
    }
}
