package lutadorini2a;
public class Lutador {
    private String nome;
    private String nacionalidade;
    private int idade;
    private double altura;
    private double peso;
    private String categoria;
    private int vitorias;
    private int empates;
    private int derrotas;

    public Lutador(String no, String na, int id, double al, double pe, int vi, int em, int de) {
        this.nome = no;
        this.nacionalidade = na;
        this.idade = id;
        this.altura = al;
        setPeso(pe);
        this.vitorias = vi;
        this.empates = em;
        this.derrotas = de;
    }

    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getNacionalidade() {
        return nacionalidade;
    }
    public void setNacionalidade(String nacionalidade) {
        this.nacionalidade = nacionalidade;
    }

    public int getIdade() {
        return idade;
    }
    public void setIdade(int idade) {
        this.idade = idade;
    }

    public double getAltura() {
        return altura;
    }
    public void setAltura(double altura) {
        this.altura = altura;
    }

    public double getPeso() {
        return peso;
    }
    public void setPeso(double peso) {
        this.peso = peso;
        setCategoria();
    }

    public String getCategoria() {
        return categoria;
    }
    public void setCategoria() {
        if(peso < 52.2)
            this.categoria = "Inválido";
        else if(peso <= 70.3)
            this.categoria = "Leve";
        else if(peso <= 83.9)
            this.categoria = "Médio";
        else if(peso <= 120.2)
            this.categoria = "Pesado";
        else
            this.categoria = "Inválido";
    }

    public int getVitorias() {
        return vitorias;
    }
    public void setVitorias(int vitorias) {
        this.vitorias = vitorias;
    }

    public int getEmpates() {
        return empates;
    }
    public void setEmpates(int empates) {
        this.empates = empates;
    }

    public int getDerrotas() {
        return derrotas;
    }
    public void setDerrotas(int derrotas) {
        this.derrotas = derrotas;
    }
    
    public void ganharLuta() {
        setVitorias(getVitorias() + 1);
    }
    public void perderLuta() {
        setDerrotas(getDerrotas() + 1);
    }
    public void empatarLuta() {
        setEmpates(getEmpates() + 1);
    }

    @Override
    public String toString() {
        return "Este é "+nome+", ele é "+nacionalidade+" e pesa "+peso+", "
                + "estando na categoria "+categoria+". Possui "+idade+" anos "
                + "de idade, possui "+vitorias+" vitórias, "+empates+" empates "
                + "e "+derrotas+" derrotas.";
    }
    
    public String status(){
        return "Este é "+nome+", ele é um peso "+categoria+"possui "+vitorias+" "
                + "vitórias, além de "+empates+"empates e "+derrotas+" derrotas";
    }
}