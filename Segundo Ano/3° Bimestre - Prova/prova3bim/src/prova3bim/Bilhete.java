package prova3bim;
public abstract class Bilhete {
    protected String codigo;
    protected String assento;
    protected double valor;

    
    public Bilhete(String codigo, String assento, double valor) {
        this.codigo = codigo;
        this.assento = assento;
        this.valor = valor;
    }
    

    public String getCodigo() {
        return codigo;
    }
    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public String getAssento() {
        return assento;
    }
    public void setAssento(String assento) {
        this.assento = assento;
    }

    public double getValor() {
        return valor;
    }
    public void setValor(double valor) {
        this.valor = valor;
    }
    
    
    public abstract void checkIn(String codigo, int qtdeMalaDespachada);

    @Override
    public String toString() {
        return " {" + "codigo=" + codigo + ", assento=" + assento 
                + ", valor=" + valor + '}';
    }
}
