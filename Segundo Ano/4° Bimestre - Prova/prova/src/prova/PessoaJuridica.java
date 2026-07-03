package prova;
public class PessoaJuridica extends Pessoa implements Validador {
    private String cnpj;

    public PessoaJuridica(String cnpj, String nome, Endereco endereco, String email) {
        super(nome, endereco, email);
        this.cnpj = cnpj;
    }

    
    public String getCnpj() {
        return cnpj;
    }
    public void setCnpj(String cnpj) {
        this.cnpj = cnpj;
    }
    
    
    @Override
    public boolean validarDocumento(String doc) {
        int caracteres = doc.length();
        if (caracteres >= 14) { // O CNPJ deve ter no mínimo 14 caracteres
            System.out.println("Documento válido");
            return true;
        }
        else {
            System.out.println("Documento inválido");
            return false;
        }
    }
    
    @Override
    public String getTipoDocumento() {
        return "CNPJ";
    }
    

    @Override
    public String toString() {
        return "PessoaJuridica{" + "cnpj=" + cnpj + '}';
    }
}
