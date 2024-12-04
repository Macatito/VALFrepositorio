public class Arreglobjetos {
    
    public static void main(String[] args) {
        Object[] arreglo = new Object[8];
        arreglo[0]=12.1F;
        arreglo[1]=1;
        arreglo[2]="Renacuajo";
        arreglo[3]='@';
        arreglo[4]=12.33333;
        arreglo[5]=-11;
        arreglo[6]="Pepinillo";
        arreglo[7]=true;
        for (Object elemento : arreglo) {
            System.out.println(elemento+" "+elemento.getClass().getSimpleName());
        }






    }
}
