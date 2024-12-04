import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;


public class Menusillo {



public static void menu(ArrayList<Product> epitaph){
    int pepinillo;
do {
Scanner perú = new Scanner(System.in);
System.out.println("*****************************************");
System.out.println("*  Bienvenido al catálogo de productos  *");
System.out.println("*  ¿Qué desea realizar?                 *");
System.out.println("*  1) Buscar productos                  *");
System.out.println("*  2) Eliminar producto                 *");
System.out.println("*  3) salir                             *");
System.out.println("*****************************************");
pepinillo = perú.nextInt();
} while (pepinillo>3||pepinillo<1);
switch (pepinillo) {
    case 1:
    Menusillo.buscador(epitaph);
    Menusillo.menu(epitaph);
        break;
    case 2:
    Menusillo.eliminador(epitaph); 
    Menusillo.menu(epitaph);
        break;
    case 3:
    System.out.println("Adiosín");
        break;
}}



public static void buscador(ArrayList<Product> bolsitadecacahuates){
    Scanner perú = new Scanner(System.in);

System.out.println("¿Cómo desea buscar?");
System.out.println("1) Por Id");
System.out.println("2) Por Nombre");
int canguro = perú.nextInt();
ArrayList<Product> deanHerbert = new ArrayList<Product>();
switch (canguro) {
    case 1:
        System.out.println("Ingrese el Id a buscar");
        int hipopótamo = perú.nextInt();
        for (Product cacahuate : bolsitadecacahuates ) {
            if (cacahuate.id==hipopótamo){
                deanHerbert.add(cacahuate);
                System.out.println("Producto encontrado!!!!!!!!");
                break;
            }
        }
        if (deanHerbert.size()==0){
        System.out.println("No se encontró ningún producto");
        }
        break;
    case 2:
    System.out.println("ingrese su búsqueda:");
    perú.nextLine();
    String palabritabuscadora = perú.nextLine();
    for (Product cacahuate : bolsitadecacahuates ) {
    if (cacahuate.title.contains(palabritabuscadora)){
        deanHerbert.add(cacahuate);}
    }
    System.out.println("Se encontró "+deanHerbert.size()+ " producto(s)");
        break;
    default:
    System.out.println("Simio le dije que 1 o 2");
        break;
    }
if (deanHerbert.size()!=0){
System.out.println("¿Cómo desea imprimir?");
System.out.println("1)Por consola");
System.out.println("2)Por PDF");
int cheetos = perú.nextInt();
switch (cheetos) {
    case 1:
        imprimirproducto(deanHerbert);
        break;
    case 2:
        try {
            Pedefesiador.papu(deanHerbert);
        } catch (IOException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
        break;
    default:
        break;
}}}

public static void imprimirproducto(ArrayList<Product> deanHerbert){
for (Product pp : deanHerbert) {
System.out.println("--------------------------------------------------");
System.out.println("Título: "+pp.title);
System.out.println("Id: "+Integer.toString(pp.id));
System.out.println("Precio: "+Double.toString(pp.price));
System.out.println("Descripción: "+pp.description);
System.out.println("Categoría: "+pp.category.name);

}





}

public static void eliminador(ArrayList<Product> epitaph){
    Scanner perú = new Scanner(System.in);

    System.out.println("Ingrese el ID del producto a eliminar: ");
    
    int eliminar = perú.nextInt();
    for (Product cacahuate : epitaph ) {
        if (cacahuate.id==eliminar){
            ArrayList<Product> eliminación = new ArrayList<Product>();
            eliminación.add(cacahuate);
            System.out.println("Se encontró el siguiente producto: ");
            imprimirproducto(eliminación);
            System.out.println("-----------------------------");
            System.out.println("¿Desea continuar? ");
            System.out.println("1)Si ");
            System.out.println("0)NO, NO QUERÍA HACER ESO");
            int gerundio = perú.nextInt();
            if (gerundio == 1){
                epitaph.remove(cacahuate);
            }

            break;
        }
    }
    //ArrayList<Product> eliminación = new ArrayList<Product>();



}

}
