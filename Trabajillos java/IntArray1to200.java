import java.util.*;

public class IntArray1to200 {
    public static void main(String[] args){
        int[] arreglo = new int[100];
        for (int i = 0; i<100;i++)
        arreglo[i] = i+1;
        System.out.println();

        ArrayList<Integer> arrayList = new ArrayList<>();
        for (int i = 0; i<100;i++)
        arrayList.add(i+101);
        System.out.println(arrayList);

        ArrayList<Integer> arrayFull = new ArrayList<>();
        



        arrayFull.addAll(arrayList);

    

 
        
    }
}