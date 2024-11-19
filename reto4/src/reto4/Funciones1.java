package reto4;

public class Funciones1 {
public static void primo(int num) {
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
}
