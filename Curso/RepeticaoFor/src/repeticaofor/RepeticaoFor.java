/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package repeticaofor;


/**
 *
 * @author gabri
 */
public class RepeticaoFor {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        for (int cc = 1;cc <= 4;cc++){
            System.out.println("Cambalhota " + cc);
        }
        System.out.println("\033[1;33mPasso maior\033[m");
        for (int cc = 0;cc <= 4;cc += 2) {
            System.out.println("Cambalhota " + cc);
        }
        System.out.println("\033[1;33mVoltando\033[m");
        for (int cc = 15;cc >10;cc--) {
            System.out.println("Cambalhota " + cc);
        }
        System.out.println("\033[1;33mDesafio Guanabara: Pulando de 10 em 10\033[m");
        for (int cc = 10;cc <= 100;cc += 10) {
            System.out.println("Cambalhota " + cc);
        }
        System.out.println("\033[1;33mLaços Aninhados\033[m");
        for (int i = 0;i <= 2;i++) {
            for (int cc = 0;cc <= 2;cc++) {
                System.out.printf("Cambalhota %s Iteração %s \n", cc, i);
            }
        }
        
        //Teste
        for (int cc = 0;cc < 4;cc++){
            System.out.println("--------------");
        }
        System.out.println("\033[1;33mTeste\033[m");
        int cc = 0;
        while (true) {
            System.out.printf("\033[1;31mAtualmente, estamos na %s° Iteração.\033[m \n", cc+1);
            cc++;
            if (cc == 10) break;
        }
        
        //ForEach
        
        //Gerando uma matriz aleatória
        float random;
        float[][]notasAlunos = new float[2][2];
        for (int i = 0; i<notasAlunos.length; i++) {
            for (int j = 0; j<notasAlunos[i].length; j++) {
                random = 10 + (float)Math.random() * (20-10);
                notasAlunos[i][j] = random;
            }
            
        }
        
        //Usando ForEach
        int c, n = 0;
        for (float[] notasAluno : notasAlunos) { //1° ForEach usando um vetor para receber a Matriz
            c = 0;
            System.out.println(++n + "° Aluno:");
            for (float nota: notasAluno) {
                System.out.print(++c +"°nota : " + nota + "\n");
            }
            System.out.println("--------------------");
        }
    }
    
}
