import java.util.Scanner;

public class aDoble_mas_triple {
    public static void main(String[] args) throws Exception {
        try (Scanner papu = new Scanner(System.in)) {
            System.out.println("Ingrese un número");
            int x = papu.nextInt();
            System.out.println("Ingrese otro número");
            int y = papu.nextInt();
            int r;
            x=3*x; y=2*y;
            r=x+y;
            System.out.println("El triple del primer número más el doble del segundo es: "+ r);
        }
}
}