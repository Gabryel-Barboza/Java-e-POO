/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package testefuncao02;

/**
 *
 * @author gabri
 */
public class Operacoes {
    
    public static String contador(int i, int f) { //public indica se a classe pode ser usada em qualquer projeto.
        String s = "";
        for (int c = i;c <= f;c++) {
            s += c + " ";
        }
        return s;
    }
    //Private impede o uso do metódo em outras classes, "Privado"
    
}
