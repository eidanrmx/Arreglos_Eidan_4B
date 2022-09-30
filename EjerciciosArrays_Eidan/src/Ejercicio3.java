/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import java.util.Scanner; //importar scanner para poder leer

/**
 *
 * @author Acer
 */
public class Ejercicio3 {
public static void main(String[] args) {
Scanner sn=new Scanner(System.in); 
int numeros[]=new int[15];
int num;
for(int i=0;i<numeros.length;i++){
System.out.println("Inserte un número en la posicion "+i);
do{
num=sn.nextInt();
if(!(num>=0 && num<=10)){
System.out.println("Error. Solo números del 0 al 10. "
+ "Inserte un número en la posicion "+i);
}
}while(!(num>=0 && num<=10));
numeros[i]=num;
}
System.out.println("Estos son los números elegidos por el usuario");
for(int i=0;i<numeros.length;i++){
System.out.println("En la posicion "+i+" esta el valor: "+numeros[i]); //imprime numero aleatorio
}
}

}