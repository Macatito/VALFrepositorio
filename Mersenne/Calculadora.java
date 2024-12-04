package Mersenne;
import java.math.BigInteger;
import java.util.ArrayList;
import java.util.Scanner;


public class Calculadora {
    public static void main(String[] args) {
         System.out.println("Bienvenido a la calculadora de primos de merssene");
    ArrayList<BigInteger> pmers = new ArrayList<>();
    BigInteger dos = BigInteger.valueOf(2);
    BigInteger cero = BigInteger.valueOf(0);
    int [] primos = operaciones.arreglote();
    BigInteger mp;
    Scanner SioNoInador = new Scanner(System.in);
    int i = 1;
    // PrimoAnterior
    int pant = 2;
    //Lucas lehmer test resultado S(p-2)
    BigInteger s;
    // Lucas lehmer test resultado para el primo anterior 
    BigInteger sa = BigInteger.valueOf(0);

    for (int p : primos) {
        System.out.println("Calculando para p = "+p+"...");
        mp = operaciones.potenciaAB(dos,p).subtract(BigInteger.valueOf(1));
        s = operaciones.Si(p-pant,sa);
        pant = p;
        sa = s;
        if (cero.compareTo(s.remainder(mp))==0){
            
            pmers.add(mp);
            i++;
            System.out.println("---------------------------------------------------------");
            System.out.println("El "+i+"° primo de mersenne es "+mp.toString());
            System.out.println("¿Desea detener el programa?");
            System.out.println("1 = SI");
            System.out.println("Cualquier otro entero = NO");
            if(SioNoInador.nextInt()==1)
            break;
        }




//BigInteger a = BigInteger.valueOf(4);
//BigInteger b = BigInteger.valueOf(2);
//BigInteger cero = BigInteger.valueOf(0);
//if(cero.compareTo(a.remainder(b))==0)
  //  System.out.println("El pepe");
//else
 //   System.out.println("Osu!");
 //   }

        


   

    //BigInteger h = operaciones.Si(p);
    //System.out.println(h.toString());


        //do {
       
        


       


    
        //} while (lince);

        


        







    }
    }
}