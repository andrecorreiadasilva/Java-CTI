package prova;
import java.util.Scanner;
public class Prova {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        
        Endereco e; //será usado para a pessoa física e para a jurídica
        String er;
        String eci;
        String ee;
        String ece;
        String ep;
        
        System.out.println("Digite a rua: ");
        er = scan.nextLine();
        System.out.println("Digite a cidade: ");
        eci = scan.nextLine();
        System.out.println("Digite o estado: ");
        ee = scan.nextLine();
        System.out.println("Digite o CEP: ");
        ece = scan.nextLine();
        System.out.println("Digite o país: ");
        ep = scan.nextLine();
        
        e = new Endereco(er, eci, ee, ece, ep);
        System.out.println(e);
        
        
        String pfn;
        String cpf;
        String pfe;
        
        System.out.println("Digite o nome da pessoa física: ");
        pfn = scan.nextLine();
        System.out.println("Digite o CPF da pessoa física: ");
        cpf = scan.nextLine();
        System.out.println("Digite o email da pessoa física: ");
        pfe = scan.nextLine();
        
        PessoaFisica pf = new PessoaFisica(cpf, pfn, e, pfe);
        System.out.println(pf.getTipoDocumento());
        
        if(pf.validarDocumento(cpf) && pf.validarEmail(pfe))
            System.out.println(pf);
        
        
        
        String pjn;
        String cnpj;
        String pje;
        
        System.out.println("Digite o nome da pessoa jurídica: ");
        pjn = scan.nextLine();
        System.out.println("Digite o CNPJ da pessoa jurídica: ");
        cnpj = scan.nextLine();
        System.out.println("Digite o email da pessoa jurídica: ");
        pje = scan.nextLine();
        
        PessoaJuridica pj = new PessoaJuridica(cnpj, pjn, e, pje);
        System.out.println(pj.getTipoDocumento());
        
        if(pj.validarDocumento(cnpj) && pj.validarEmail(pje))
            System.out.println(pj);
            
    }
}