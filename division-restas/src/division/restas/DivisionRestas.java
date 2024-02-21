
package division.restas;
import java.util.*;
public class DivisionRestas {

    public static void main(String[] args) {
        Scanner leer=new Scanner (System.in);
        int a,b,r=0, x, y;
        System.out.print("A: ");
        a=leer.nextInt();
        x=a;
        System.out.print("B: ");
        b=leer.nextInt();
        y=b;
        
        a=Math.abs(a);
        b=Math.abs(b);
        
        while(a>=b){
            a-=b;
            r++;
        }
        
        if(x>0 && y>0){
        System.out.println("Cociente: "+r);
        System.out.println("Resto: "+a);
        }
        else if (x>0 && y<0){
        System.out.println("Cociente: -"+r);
        System.out.println("Resto: "+a);
        }
        else if(x<0 && y>0){
        System.out.println("Cociente: -"+r);
        if(a!=0){
        System.out.println("Resto: -"+a);
        }
        else{
            System.out.println("Resto: "+a);
        }
        }
        else if(x<0 && y<0){
        System.out.println("Cociente: "+r);
        System.out.println("Resto: -"+a);   
        }
        
    }
    
}
