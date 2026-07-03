package banco;
public class Conta {
    int numero;
    String nome;
    double saldo;
    double limite;
    
    void deposita(double valor){
        this.saldo += valor;
    }
    
    boolean saca(double valor){
        if(this.saldo < valor)
            return false;
        else
        {
            this.saldo = this.saldo - valor;
            return true;
        }
    }
    
    boolean transfere(Conta destino, double valor){
        boolean retirou = this.saca(valor);
        if (retirou == false)
            return false;
        else
        {
            destino.deposita(valor);
            return true;
        }
    }
}