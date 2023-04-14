/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package programaidade;

import java.util.Scanner;
import java.time.Year;
import java.time.ZoneId;

/**
 *
 * @author gabri
 */
public class ProgramaIdade {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //Verificando a idade
        Scanner teclado = new Scanner(System.in);
        System.out.print("Digite seu ano de Nascimento: ");
        int ano = teclado.nextInt();
        int idade = Year.now(ZoneId.of("America/Sao_Paulo")).getValue() - ano;
        System.out.println(String.format("Idade: %s anos", idade));
        if (idade >= 18) {
            System.out.println("Maior");
         } else {
            System.out.println("Menor");
        }
    }
    
}
