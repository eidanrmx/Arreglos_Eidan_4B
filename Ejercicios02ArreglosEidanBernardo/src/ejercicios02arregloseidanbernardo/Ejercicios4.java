package ejercicios02arregloseidanbernardo;

import java.util.Scanner;
public class Ejercicios4  {
public static void main(String[] args) { 
char mayusculas[]=new char[91-65];
for(int i=65, indice=0;i<91;i++, indice++){
mayusculas[indice]=(char)i;
}
Scanner sn=new Scanner(System.in);
System.out.println("inserte un numero entre 0 y "+(mayusculas.length-1)+". -1 para acabar");
int num=sn.nextInt();
String cadena="";
while(num!=-1){
if(num>=0 && num<mayusculas.length){
cadena+=mayusculas[num];
System.out.println("inserte un numero entre 0 y "+(mayusculas.length-1)+". -1 para acabar");
}else{
System.out.println("Error, inserte otro numero entre 0 y "+(mayusculas.length-1)+". -1 para acabar");
}
num=sn.nextInt();
}
System.out.println("Cadena resaltante: "+cadena);
}
}
 
