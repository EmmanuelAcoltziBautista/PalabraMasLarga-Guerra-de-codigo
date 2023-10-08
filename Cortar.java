/*
Guerra de codigos
Creado por Emmanuel Acoltzi Bautista
Fecha de creacion:05/10/2023
Correo electronico:basedeemma@gmail.com
*/
import java.util.*;
public class Cortar {
    public static void main(String args[]){  
    Scanner ENTRADA=new Scanner(System.in);
        System.out.println("Ingresa algo");
    String PalabraOriginal=ENTRADA.nextLine();
    
    int cantidad=PalabraOriginal.length();
    String VECTOR1[]=new String[cantidad];
    int []VECTOR2=new int[cantidad];
    
    //variables que contienen espacio y caracteres
    
    
    String espacio=" ";
    String ILatina="&";
    String exclamacion="!";
    String contenedor="";
    String letra;
    int posicion=0;


    for(int i=0;i<=cantidad-1;i++){
       letra=PalabraOriginal.substring(i,i+1); 
   if(letra.equals(espacio) || letra.equals(ILatina) || letra.equals(exclamacion)){//le decimos que si esta
        //algo como esto que lo asigne a la primera posicion del vector1
        VECTOR1[posicion]=contenedor;    
   
   posicion=posicion+1;//le sumo uno
        contenedor="";//reseteo el contenedor
   }else{
       contenedor=contenedor+letra;//si no hay lo que esta en el if que continue concatenando
   }
   VECTOR1[posicion]=contenedor;//cuando termine la palabra que lo agregue a la ultima posicion del vector
    }

    
    //aqui para agregar contenido al vector 2
    for(int i=0;i<=posicion;i++){
String caracteres1=VECTOR1[i];

int CantidadCaracteres1=caracteres1.length();

VECTOR2[i]=CantidadCaracteres1;//asigno la cantidad de caracteres que estan en el primer vector
}

//orderno de menor a mayor
Arrays.sort(VECTOR2);

//aqui imprimo la cantidad de caracteres que tiene la palabra mas larga
        System.out.println("El numero mas grande es el:"+VECTOR2[cantidad-1]);
  //le digo cuanto vale el vector
        int vec2=VECTOR2[cantidad-1];
        //le digo que ubique la letra
        for(int i=0;i<=posicion;i++){
   String ma2=VECTOR1[i];
   int cantidadma2=ma2.length();
   if(cantidadma2==vec2){//si coincide que lo imprima
       System.out.println(VECTOR1[i]);
   }
   }
    }
}
