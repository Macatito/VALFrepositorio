import java.util.Random;
public class bubblesort {
    public static void main(String[] args) {

        int[] arreglo = new int[100];
        int x = 0; 
        Random r = new Random ();
        while (x<100) {
        arreglo [x] = r.nextInt(500,1001);
        System.out.println( x+", "+ arreglo[x]);
        x++;
        }

        




    }

    
        
    }

