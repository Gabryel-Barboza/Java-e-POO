package classes;

public class Cubo extends Figura3D {
    private double lado;
    
    @Override
    public double calcularVolume() {
        return Math.pow(lado, 3);
    }
    
    @Override
    public double calcularArea() {
        return 6 * Math.pow(lado, 2);
    }
    
    public Cubo() {
        setNome("Cubo");
        setCor("Laranja");
        this.lado = 4;
    }

    public double getLado() {
        return lado;
    }

    public void setLado(double lado) {
        this.lado = lado;
    }
    
    
}
