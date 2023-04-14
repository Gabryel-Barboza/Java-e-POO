package resoluçãodosistema;

import java.awt.*;
        
public class ResoluçãoDoSistema {

    public static void main(String[] args) {
        Dimension resolucao = Toolkit.getDefaultToolkit().getScreenSize();
        int largura = (int)resolucao.getWidth();
        int altura = (int)resolucao.getHeight();
        System.out.println("Sua resoução é : " + largura + "x" + altura);
    }
    
}
