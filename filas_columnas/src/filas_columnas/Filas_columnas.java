
package filas_columnas;
import java.util.*;
public class Filas_columnas {

    public static void main(String[] args) {
        Scanner leer=new Scanner (System.in);
        Random alea=new Random();
        int filas, columnas, cf, cff;
        int arr[];
        System.out.print("Filas: ");
        filas=leer.nextInt();
        System.out.print("Columnas: ");
        columnas=leer.nextInt();
        System.out.println("Matriz generada: ");
        int mat[][]=new int[filas][columnas];
        for(int i=0; i<filas; i++){
            for(int j=0; j<columnas; j++){
                mat[i][j]=alea.nextInt(19)-9;
                System.out.printf("%4d ",mat[i][j]);
            }
            System.out.println("");
        }
        System.out.print("Cambiar fila: ");
        cf=leer.nextInt();
        System.out.print("por fila: ");
        cff=leer.nextInt();
        arr=mat[cf-1];
        mat[cf-1]=mat[cff-1];
        mat[cff-1]=arr;
        for(int i=0; i<filas; i++){
            for(int j=0; j<columnas; j++){
                System.out.printf("%4d ",mat[i][j]);
            }
            System.out.println("");
        }
        
        System.out.print("Cambiar columna: ");
        cf=leer.nextInt();
        System.out.print("por columna: ");
        cff=leer.nextInt();
        
        int mataux[][]=new int[filas][columnas];
        int aux=0;
        for(int i=0; i<filas; i++){
                    aux=mat[i][cf-1];
                    mat[i][cf-1]=mat[i][cff-1];
                    mat[i][cff-1]=aux;
            
        }
        
        for(int i=0; i<filas; i++){
            for(int j=0; j<columnas; j++){
                System.out.printf("%4d ",mat[i][j]);
            }
            System.out.println("");
        }
    }
    
}
