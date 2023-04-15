package classes;

public class Quadrado extends Figura2D {
    private double lado;
    
    @Override
    public double calcularArea() {
        return Math.pow(lado, 2);
    }
    
    public Quadrado() {
        setNome("Quadrado");
        setCor("Vermelho");
        this.lado = 4;
    }

    public double getLado() {
        return lado;
    }

    public void setLado(double lado) {
        this.lado = lado;
    }
    
}
