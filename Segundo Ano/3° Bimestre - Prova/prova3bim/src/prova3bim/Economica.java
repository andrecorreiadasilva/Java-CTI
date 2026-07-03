package prova3bim;
public class Economica extends Bilhete {
    public Economica(String codigo, String assento, double valor) {
        super(codigo, assento, valor);
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
    
    
    @Override
    public void checkIn(String codigo, int qtdeMalaDespachada) {
        if(qtdeMalaDespachada > 1)
            valor += 60 * (qtdeMalaDespachada-1);
        System.out.println("Check-in realizado");
    }
    
    @Override
    public String toString() {
        return "Executiva{" + super.toString() + '}';
    }
}
