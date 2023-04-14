/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package vetor02;

import java.util.Calendar;

/**
 *
 * @author gabri
 */
public class Vetor02 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        String mes[] = {"Jan", "Fev", "Mar", "Abr", "Mai", "Jun", "Jul",
            "Ago", "Set", "Out", "Nov", "Dez"};
        int tot[] = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
        int ano = Calendar.getInstance().get(Calendar.YEAR); //Metódo descontinuado(deprecated), usar Year.now()
        if ((ano % 4 == 0 && ano % 100 != 0) || (ano % 400 == 0)) tot[1] = 29; //Verificando ano bissexto
        for(int c = 0;c < mes.length;c++) {
            System.out.printf("O mês de %s tem %s dias \n", mes[c], tot[c]);
        }
        
    }
    
}
