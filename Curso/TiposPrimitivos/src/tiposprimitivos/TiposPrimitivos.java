/* <-- comentário de múltiplas linhas
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tiposprimitivos;

import java.util.Scanner;

/** <-- comentário de documentação
 *  <-- tradição de programador, não necessário
 * @author gabri
 */
public class TiposPrimitivos {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here <-- comentário de única linha
        String nome = "Gabryel";
        float nota = 8.5f;
        //float nota = (float) 8.5; f/float
        System.out.println("A nota é: " + nota);
        // formatação de Strings
        System.out.printf("A nota é: %.2f \n", nota); //.2 entre % e f indica casas decimais
        System.out.printf("Nome: %s | Nota: %.2f \n", nome, nota);
        //System.out.format("Nome: %s | Nota: %.2f /n", nome, nota); format/printf
        
        //Entrada de dados
        Scanner teclado = new Scanner(System.in);
        System.out.println("Digite o nome do aluno :");
        nome = teclado.nextLine();
        System.out.println("Digite a nota do aluno :");
        nota = teclado.nextFloat();
        System.out.printf("%s | %.2f \n", nome, nota);
        
        //Conversão de valores
        int idade = 18;
        System.out.println("Convertendo para String");
        String valor = Integer.toString(idade);
        System.out.println(valor);
        System.out.println("Convertendo para Integer");
        idade = Integer.parseInt(valor);
        System.out.println(idade);
        System.out.println("Convertendo para Float");
        float decimal = Float.parseFloat(valor);
        System.out.println(decimal);
        
    }
    
}
