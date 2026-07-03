package credinterface;
public class ControleRemoto implements Controlador{
    private int volume;
    private boolean ligado;
    private boolean tocando;

    public ControleRemoto() {
        this.volume = 50;
        this.ligado = false;
        this.tocando = false;
    }
    
    public int getVolume() {
        return volume;
    }
    public void setVolume(int volume) {
        this.volume = volume;
    }

    public boolean getLigado() {
        return ligado;
    }
    public void setLigado(boolean ligado) {
        this.ligado = ligado;
    }

    public boolean getTocando() {
        return tocando;
    }
    public void setTocando(boolean tocando) {
        this.tocando = tocando;
    }
    
    
    @Override
    public String toString() {
        return "ControleRemoto{" + "volume=" + volume + ", ligado=" + ligado + ", tocando=" + tocando + '}';
    }
    
    @Override
    public void ligar() {
        setLigado(true);
    }
    
    @Override
    public void desligar() {
        setLigado(false);
    }
    
    @Override
    public void abrirMenu() {
        System.out.println("Ligado: "+getLigado());
        System.out.println(getVolume());
        for(int i=0; i<=getVolume(); i+=10)
            System.out.println("|");
        System.out.println("Tocando: "+getTocando());
    }
    
    @Override
    public void fecharMenu() {
        System.out.println("Fechando menu...");
    }
    
    @Override
    public void maisVolume() {
        if(getLigado())
            setVolume(getVolume()+1);
    }
    
    @Override
    public void menosVolume() {
        if(getLigado())
            setVolume(getVolume()-1);
    }
    
    @Override
    public void ligarMudo() {
        if(getLigado() && getVolume()>0)
            setVolume(0);
    }
    
    @Override
    public void desligarMudo() {
        if(getLigado() && getVolume() == 0)
            setVolume(50);
    }
    
    @Override
    public void play() {
        if (getLigado() && !getTocando())
            setTocando(true);
    }
    
    @Override
    public void pause() {
        if (getLigado() && getTocando())
            setTocando(false);
    }
}
