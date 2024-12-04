
public class PruebaModulos {
    public static void main(String[] args) {
        Object[] arreglo = {1,2,1,2,3,5,5,6,8,1,2};
        int[] arreglocopia = {1,2,1,2,3,5,5,6,8,1,2};
        OperacionesArreglo m = new OperacionesArreglo();
        System.out.println("La suma de los numeros del arreglo es: "+m.SumaDeValores(arreglocopia));
        System.out.println("La cantidad de Objetos unicos en el arreglo es: "+m.ValoresUnicos(arreglo));

 
    }

}
