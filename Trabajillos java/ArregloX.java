import java.util.Scanner;
import java.util.*;
public class ArregloX {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        
        System.out.println("ingrese el tamaño de su arreglo");
        int n = scan.nextInt();
        int[] arreglo = new int[n];

        for (int x =0; x<n ; x++){
        System.out.println("Ingrese el número en la posición " +(x+1)+" del arreglo" );
        arreglo[x]= scan.nextInt();
        }
        
        System.out.println("ingrese el número que desea revisar en el arreglo");
        int y = scan.nextInt();
        int s = 0;
        for (int x = 0; x<n ;x++)
        if (arreglo[x]==y)
            s++;
    
    if (s<0){
    System.out.println("El número "+y+ " no se encuentra en el arreglo");
    }
    else{
    System.out.println("El número "+y+" se encuentra en el arreglo un total de "+s+" veces");
    } 
    }
}
