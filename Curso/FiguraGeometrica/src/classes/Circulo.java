package classes;

public class Circulo extends Figura2D {
    private float raio;

    @Override
    public double calcularArea() {
        double area = Math.PI * Math.pow(raio, 2);
        return area;
    }
    
    public Circulo() {
        setNome("Circulo");
        setCor("Amarelo");
        this.raio = 5;
    }
    
    public float getRaio() {
        return raio;
    }

    public void setRaio(float raio) {
        this.raio = raio;
    }
    
}
