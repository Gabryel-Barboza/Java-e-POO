package classes;

public class Testes {
    //01
    //Escreva uma classe FiguraGeometrica com atributos nome e cor. Escreva uma classe Figura2D e uma
    //classe Figura3D. Ambas classes Figura 2D e Figura3D são subclasses da FiguraGeometrica. Crie ainda
    //as classes Circulo, Quadrado e Triangulo que estendem a classe Figura2D e crie também as classes
    //Cubo, Cilindro e piramide que estendem a classe Figura3D.
    
    //02
    //Escreva a interface DimensaoSuperficial que contém o método calcularArea. Escreva a interface DimensaoVolumetrica
    //que contém o método calcularVolume. Aplique as interfaces nas respectivas classes, implementando seus métodos e 
    //atributos necessários.
    
    //03
    //Crie pelo menos uma instância de cada e adicione em um array do tipo FiguraGeometrica. Itere esse array, imprimindo
    //na tela a area e o volume (quando aplicável)
    
    public static void main(String[] args) {
        Circulo c1 = new Circulo();
        Quadrado q1 = new Quadrado();
        Triangulo t1 = new Triangulo();
        Cubo C1 = new Cubo();
        Cilindro cl1 = new Cilindro();
        Piramide p1 = new Piramide();
        p1.setBase(q1);
        //Inicializando array figuras com as instâncias.
        FiguraGeometrica[] figuras = {c1, q1, t1, C1, cl1, p1};
        System.out.println("==============");
        for (FiguraGeometrica figura: figuras) {
            System.out.println(figura.getNome());
            if (figura instanceof Figura2D) {
                Figura2D f2d = (Figura2D) figura; //Downcasting
                System.out.printf("Área: %.2f\n", f2d.calcularArea());
            }
            
            if (figura instanceof Figura3D) {
                Figura3D f3d = (Figura3D) figura;
                System.out.printf("Área: %.2f\nVolume: %.2f\n", f3d.calcularArea(), f3d.calcularVolume());
            }
            System.out.println("==============");
        }
    }
}
