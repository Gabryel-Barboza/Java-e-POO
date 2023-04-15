package classes;

public class Cilindro extends Figura3D {
    private double raio;
    private double altura;
    
    @Override
    public double calcularVolume() {
        return (Math.PI * Math.pow(raio, 2)) * altura;
        
    }
    
     @Override
    public double calcularArea() {
        double areaB = Math.PI * Math.pow(raio, 2);
        double areaL = 2 * Math.PI * (raio * altura);
        return areaL + 2 * areaB;
    }
    
    public Cilindro() {
        setNome("Cilindro");
        setCor("Azul");
        this.altura = 6;
        this.raio = 3;
    }

    public double getRaio() {
        return raio;
    }

    public void setRaio(double raio) {
        this.raio = raio;
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }
    
}
