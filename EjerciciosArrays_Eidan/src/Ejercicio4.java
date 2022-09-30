/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import java.util.Scanner; //importar el scanner

/**
 *
 * @author Acer
 */
public class Ejercicio4 { //inicar metodo

public static void main(String[] args) { //iniciar metodo main

Scanner sn=new Scanner(System.in); //crear nuevo scanner

//Pedimos una longitud
System.out.println("Inserte una longitud");
int longitud=sn.nextInt(); //introducido por usuario

//creo un array con esa longitud
int numeros[]=new int[longitud];

//recorro el arreglo y uso la funcion para crear un aleatorio
for(int i=0;i<numeros.length;i++){
numeros[i]=generaNumeroAleatorio(0,10);
System.out.println("En la posicion "+i+" esta el valor: "+numeros[i]); //imprime numero aleatorio
}

}

//Crea un numero aleatorio, entre un minimo y un maximo
public static int generaNumeroAleatorio(int minimo, int maximo){

return (int)Math.floor(Math.random()*(minimo-(maximo+1))+(maximo+1));

}

}
