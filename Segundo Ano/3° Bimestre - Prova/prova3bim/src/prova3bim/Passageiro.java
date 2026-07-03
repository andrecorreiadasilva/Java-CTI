package prova3bim;
public class Passageiro {
    private String nome;
    private String documento;
    private long numCartao;
    public Bilhete bilhete; // dava erro no main quando era private. mudei pra public por recomendação da professora
    

    public Passageiro(String nome, String documento, long numCartao, Bilhete bilhete) {
        this.nome = nome;
        this.documento = documento;
        this.numCartao = numCartao;
        this.bilhete = bilhete;
    }


    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getDocumento() {
        return documento;
    }
    public void setDocumento(String documento) {
        this.documento = documento;
    }

    public long getNumCartao() {
        return numCartao;
    }
    public void setNumCartao(long numCartao) {
        this.numCartao = numCartao;
    }

    /*public Bilhete getBilhete() {
        return bilhete;
    }
    public void setBilhete(Bilhete bilhete) {
        this.bilhete = bilhete;
    }
    
    desnecessário após mudança para public mas deixarei nos comentários*/
    
    public boolean login (String nome, String documento) {
        if (this.nome.equals(nome) && this.documento.equals(documento)) {
            System.out.println("Login válido");
            return true;
        }
        else {
            System.out.println("Login inválido");
            return false;
        }
    }

    @Override
    public String toString() {
        return "Passageiro{" + "nome=" + nome + ", documento=" + documento 
                + ", numCartao=" + numCartao + ", bilhete=" + bilhete + '}';
    }
}
