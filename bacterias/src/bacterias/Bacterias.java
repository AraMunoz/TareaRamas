
package bacterias;
import java.util.*;
public class Bacterias {

    public static void main(String[] args) {
        Scanner leer=new Scanner (System.in);
        long t=0, nb=0;
        System.out.println("Tiempo (minutos): ");
        t=leer.nextInt();
        System.out.println("Tiempo                  Bacterias");
        nb=1;
        for(int c=0; c<=t; c++){
            System.out.printf("%4d                  %9d \n",c,nb);
            nb=nb*2;
        }
    }
    
}
