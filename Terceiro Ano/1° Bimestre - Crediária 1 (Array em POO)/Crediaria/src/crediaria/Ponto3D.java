package crediaria;
public class Ponto3D {
    double[] vetor = new double[3];
    
    public Ponto3D() {
        for(int i=0; i<vetor.length; i++)
            vetor[i] = 0.0;
    }
    
    public Ponto3D(double x, double y, double z) {
        vetor[0] = x;
        vetor[1] = y;
        vetor[2] = z;
    }
}
