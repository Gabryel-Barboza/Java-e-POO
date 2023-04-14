/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package exerciciorepita;

import javax.swing.JOptionPane;

/**
 *
 * @author gabri
 */
public class ExercicioRepita {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        //JOptionPane.showMessageDialog(null, "Olá, Mundo!", "Boas Vindas", JOptionPane.WARNING_MESSAGE);
        int n = 0, par = 0, imp = 0, m100 = 0, cont = 0;
        float med = 0;
        do {
            n = Integer.parseInt(JOptionPane.showInputDialog(null,
                    "<html>Informe um número: <br><em>(0 Interrompe)</em></html>",
                    "Entrada de Dados", 2));
            if (n != 0) {
                cont++; //Total de Válores
                if (n % 2 == 0) par++; //Par ou Ímpar
                else imp++;
                if (n > 100) m100++; //Acima de 100
                med += n; //Média somatória
            }
            
        } while (n != 0);
        med /= cont;
        JOptionPane.showMessageDialog(null,String.format("<html>Resultado:<hr>" +
                "<br>Total de Valores: %s <br>Total de Pares: %s <br>Total de Ímpares: %s <br>Acima de 100: %s <br>Média de Valores: %.2f"
                + "</html>", cont, par, imp, m100, med), //Todos os cálculos formatados e média .2f
                "Resultado Final", JOptionPane.INFORMATION_MESSAGE); //Argumentos do Dialog: Frame, Message, Title e Icon respectivamente
        
    }
    
}
