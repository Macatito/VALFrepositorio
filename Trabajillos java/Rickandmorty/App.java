package Rickandmorty;
import java.util.ArrayList;
import java.util.List;
import java.util.*;



public class App {
    public static void main(String[] args) throws Exception {
        
            Character p1 = ApiUtil.getCharacterById(1);
            Character p2 = ApiUtil.getCharacterById(2);
            Character p3 = ApiUtil.getCharacterById(3);
            Character p4 = ApiUtil.getCharacterById(4);
            Character p5 = ApiUtil.getCharacterById(5);
            Character p6 = ApiUtil.getCharacterById(6);
            Character p7 = ApiUtil.getCharacterById(7);
            
            Character p8 = ApiUtil.getCharacterById(8);
            Character p9 = ApiUtil.getCharacterById(9);
            Character p10 = ApiUtil.getCharacterById(10);
            ArrayList nombres = new ArrayList<>();

            Character [] personajes = {p1,p2,p3,p4,p5,p6,p7,p8,p9,p10};
            
           // for (int x=0 ; x<personajes.length ; x++){
             //   if(personajes[x].name.contains("r"))
             //   nombres.add(personajes[x].name);
            //}
            int contador = 0;
            int y;
            for (int x=0 ; x<personajes.length ; x++){
                for (y=1 ; y<personajes[x].name.length() ; y++){
                    char caracter = personajes[x].name.charAt(y);
                    if (personajes[x].name.charAt(y) == 'a' ||
                    caracter == 'e'  ||
                    caracter == 'i'  ||
                    caracter == 'o'  ||
                    caracter == 'u' ) 
                    contador++;
                }
            }
            System.out.println("Hay "+contador +" vocales en los nombres del id 1 al 10");
            //System.out.println(nombres.toString());
            //System.out.println("Nombre: " + character.name);
            //System.out.println("Estado: " + character.status);
            //System.out.println("Tipo " + character.type);
            // Imprimir más datos según sea necesario
        }
    }

