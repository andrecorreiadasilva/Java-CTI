package banco; // oi debora! (～￣▽￣)～
public class Banco {
    public static void main(String[] args) {
        Conta minhaConta = new Conta();
        
        minhaConta.numero = 1234;
        minhaConta.nome = "João Pedro";
        minhaConta.saldo = 10.0;
        minhaConta.limite = 2000.0;
        
        System.out.println("Saldo atual: "+minhaConta.saldo);
        
        minhaConta.deposita(350);
        minhaConta.deposita(1200);
        
        System.out.println("Saldo após depósitos: "+minhaConta.saldo);
        
        if(minhaConta.saca(570))
            System.out.println("Consegui sacar, saldo = "+minhaConta.saldo);
        else
            System.out.println("Valor não disponível para saque, saldo: "+minhaConta.saldo);
        
        if(minhaConta.saca(5000))
            System.out.println("Consegui sacar, saldo = "+minhaConta.saldo);
        else
            System.out.println("Valor não disponível para saque, saldo: "+minhaConta.saldo);
        
        Conta meuSonho = new Conta();
        
        meuSonho.numero = 1235;
        meuSonho.nome = "Diorio";
        meuSonho.saldo = 10000.0;
        meuSonho.limite = 200000.0;
        
        System.out.println("Saldo da minha conta: "+minhaConta.saldo);
        System.out.println("Saldo dos meus sonhos: "+meuSonho.saldo);
        
        if(meuSonho.transfere(minhaConta,5000))
        {
            System.out.println("Saldo da minha conta: "+minhaConta.saldo);
            System.out.println("Saldo dos meus sonhos: "+meuSonho.saldo);
        }
        else
            System.out.println("Transferência não realizada!!!!!");
    }
}