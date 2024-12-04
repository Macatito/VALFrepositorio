import java.util.*;
public class Tablas1al100 {
    public static void main(String[] args){
        int[][] arreglo = new int[101][101];
        int i = 0;
        int j = 0;
        while (j<=100) {
            arreglo[i][j]=j;
            j++;
        }
        j = 0;
        while (i<=100) {
            arreglo[i][j]=i;
            i++;
        }
        i=1;
        while (i<=100) {
            j=1;
            arreglo [i][j]=i*j;
            while (j<=99) {
                j++;
                arreglo[i][j]=i*j; 
            }
            i++;
        }
        
        System.out.println(arreglo[100][100]);
        System.out.println(Arrays.toString(arreglo[37]));
        
}
}