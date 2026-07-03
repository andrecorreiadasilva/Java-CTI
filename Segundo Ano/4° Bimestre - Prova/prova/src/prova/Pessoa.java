package prova;
public abstract class Pessoa {
    protected String nome;
    protected Endereco endereco;
    protected String email;

    public Pessoa(String nome, Endereco endereco, String email) {
        this.nome = nome;
        this.endereco = endereco;
        this.email = email;
    }
    

    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }

    public Endereco getEndereco() {
        return endereco;
    }
    public void setEndereco(Endereco endereco) {
        this.endereco = endereco;
    }

    public String getEmail() {
        return email;
    }
    public void setEmail(String email) {
        this.email = email;
    }

    
    public boolean validarEmail(String email) {
        if (email.contains("@") && email.contains(".")) {
            System.out.println("Email válido");
            return true;
        }
        else {
            System.out.println("Email inválido");
            return false;
        }
          
    }
    
    public abstract String getTipoDocumento();
    
    
    @Override
    public String toString() {
        return "Pessoa{" + "nome=" + nome + ", endereco=" + endereco 
                + ", email=" + email + '}';
    }
}
