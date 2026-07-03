package prova;
public class PessoaFisica extends Pessoa implements Validador{
    private String cpf;

    public PessoaFisica(String cpf, String nome, Endereco endereco, String email) {
        super(nome, endereco, email);
        this.cpf = cpf;
    }

    
    public String getCpf() {
        return cpf;
    }
    public void setCpf(String cpf) {
        this.cpf = cpf;
    }
    
    
    @Override
    public boolean validarDocumento(String doc) {
        int caracteres = doc.length();
        if (caracteres >= 11) { // O CPF deve ter no mínimo 11 caracteres
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
        return "CPF";
    }

    @Override
    public String toString() {
        return "PessoaFisica{" + "cpf=" + cpf + '}';
    }
}
