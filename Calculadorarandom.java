
package calculadorarandom;
import java.util.Random;

public class Calculadorarandom {

   
    public static void main(String[] args) {
      Random leia = new Random();
      
    int n1 = leia.nextInt(5);
    int n2 = leia.nextInt(5);
    int soma= metodoscalculadorarandon.soma(n1,n2);
    
    System.out.println("A soma é:" + soma);
            
    int subtracao= n1-n2;
    System.out.println("a subtração é:" + subtracao);
    
    int multiplicacao= n1*n2;
    System.out.println(" A multilplicação é:" + multiplicacao);
    
    int divisao= n1/n2;
    System.out.println(" A divisão é:" + divisao);
    
            
            
            


    }
    
}
