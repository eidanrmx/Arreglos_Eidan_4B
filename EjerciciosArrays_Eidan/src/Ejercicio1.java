/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Acer
 */
public class Ejercicio1{//inicar el metodo
public static void main(String[] args) {//iniciar metodo main
//Creo el array
int[] numeros=new int[100];
//Lo recorro y le asigno números
for(int i=0;i<numeros.length;i++){
numeros[i]=i+1;//se suma cada vez un valor
System.out.println(numeros[i]); //imprimir el numero cada vez que se sume el valor
}
}
}