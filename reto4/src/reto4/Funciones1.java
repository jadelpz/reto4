package reto4;

public class Funciones1 {
	//comprobamos si es primo
public static int primo(int num) {
	int cont=1;
	for(int i=2;i<num;i++) {
		if(num%i==0) {
			cont++;
		}
		if(cont>0) {
			System.out.println(num+" es primo");
		}
			}
		
}
//Si no es primo sacamos los Multiplos impares
public static void MultImpares(int num) {
	System.out.println("los multiplos impares son ");
	for(int i=2;i<num;i++) {
		if(num%i==0 || i%2==0) {
			System.out.println(","+i);
		}
	}
	
}
}
