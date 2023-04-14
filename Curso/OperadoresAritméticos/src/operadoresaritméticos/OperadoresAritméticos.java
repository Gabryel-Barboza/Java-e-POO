/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package operadoresaritméticos;

import java.util.Random;

/**
 *
 * @author gabri
 */
public class OperadoresAritméticos {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        System.out.println("Operações Aritméticas");
        int n1 = 5;
        int n2 = 2;
        float media = (n1 + n2)/2;
        System.out.println(media);
        
        //Operadores Unários
        int numero = 5;
        System.out.println("Operador Unário");
        int valor1 = 5 + numero++; //pós-incremento, atribui o valor da soma a variável e soma +1 à var numero.
        int valor2 = 5 + ++numero; //pré-incremento, soma +1 à var numero e atribui valor da soma a variável.
        System.out.println(valor1);//a variável numero recebe valor 6 após a soma.
        System.out.println(valor2);//a váriavel numero recebe valor 7 antes da soma. 
        System.out.println(numero);
        
        //Operadores de atribuição
        int x = 4;
        x += 2; // x = x + 2
        System.out.println("Operador de atribuição");
        System.out.println(x);
        x -= 2;
        System.out.println(x);
        x *= 2;
        System.out.println(x);
        x /= 2;
        System.out.println(x);
        
        //Metódos de arredondamento
        System.out.println("Arredondamento");
        float v = -8.5f; //número negativo inverte o funcionamento da função igual a matemática
        System.out.println(v);
        int ar = (int) Math.floor(v);
        System.out.println(ar);
        ar = (int) Math.ceil(v);
        System.out.println(ar);
        ar = (int) Math.round(v);
        System.out.println(ar);
        
        //Gerador de número
        System.out.println("Números aleatórios");
        double ran = Math.random();
        System.out.println(ran);
        float nran = 5 + (float)ran * (10-5);
        System.out.println(Math.round(nran));
    }
    
}
