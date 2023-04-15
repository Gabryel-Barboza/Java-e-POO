package classes;

public class Triangulo extends Figura2D {
    private double base;
    private double altura;
    
    @Override
    public double calcularArea() {
        double area = (base * altura) / 2;
        return area;
    }
    
    public Triangulo() {
        setNome("Triangulo");
        setCor("Verde");
        this.base = 3;
        this.altura = 5;
    }

    public double getBase() {
        return base;
    }

    public void setBase(double base) {
        this.base = base;
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }
}
