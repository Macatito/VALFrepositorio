import java.util.Scanner;

public class Sueldos {
    public static void main(String[] args) throws Exception {
    
    System.out.println("¿Cuántos sueldos va a ingresar?");
    @SuppressWarnings("resource")
    Scanner scan = new Scanner(System.in);
    int n = scan.nextInt();
    System.out.println("---------------------");
    double sueldoMayor = 0;

    for(int x = n;x>0;x-- ) {
        System.out.println("Ingrese el siguiente sueldo:  ");
        double sueldo = scan.nextDouble();
        if (sueldo>sueldoMayor) 
        sueldoMayor = sueldo;

    }
    System.out.println("El sueldo mayor es: $"+sueldoMayor);

    }
    }
    