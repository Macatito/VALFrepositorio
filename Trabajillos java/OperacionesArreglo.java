import java.util.*;
public class OperacionesArreglo {

public int SumaDeValores(int[]arreglo){
int suma = 0;
for (int i : arreglo) {
suma = suma + i;}
    return suma;}

public int ValoresUnicos(Object[]arreglo){
ArrayList<Object> arreglito = new ArrayList<>();
for (Object o : arreglo) {
    if (!arreglito.contains(o)){
        arreglito.add(o);
    }}
return arreglito.size();
}}