package empresa;
import java.util.Date;
public class Funcionario {    
    String nome;
    String departamento;
    double salario;
    Date data;
    String rg;
    boolean estanaEmpresa;
    
    void mostra()
    {
        if(this.estanaEmpresa)
        {
            System.out.println("Nome do funcionário: "+this.nome);
            System.out.println("Nome do departamento: "+this.departamento);
            System.out.println("Salário do funcionário: "+this.salario);
            System.out.println("Data: "+this.data);
            System.out.println("RG do funcionário: "+this.rg+"\n");
        }
        else
            System.out.println("Funcionário demitido. Não é possível mostrar informações\n");
    }
    
    void bonifica(double aumento)
    {
        if(this.estanaEmpresa)
            this.salario += (this.salario / aumento);
    }
    
    void demite()
    {
        if(this.estanaEmpresa)
        {
            this.nome = null;
            this.departamento = null;
            this.salario = 0;
            this.data = null;
            this.rg = null;
            this.estanaEmpresa = false;
        }
    }
    
    double ganhoAnual()
    {
        if(this.estanaEmpresa)
            return this.salario*12;
        else
            return 0;
    }
    
    void trocarDep(String novoDep)
    {
        this.departamento = novoDep;
    }
}