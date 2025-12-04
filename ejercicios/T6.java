package ejercicios;

import java.util.Scanner;

public class T6 {

	public static void main(String[] args) {

		Scanner KB = new Scanner(System.in);
		
		char[] l = new char[5];
		
		System.out.println("Introduce 5 letras minusculas");
		for(int i = 0 ; i<l.length ; i++) {
			System.out.print(i+1+"º: ");
			
			while( (l[i] = KB.next().charAt(0))<97 || l[i]>122) {
				System.err.println("ERROR. el caracter introducido no es minuscula");
				System.out.println("Introducelo de nuevo: ");
			}
		}
		
		System.out.println("En mayusculas serian:");
		for(int i = 0 ; i<5 ; i++) {
			l[i] -= 32;
			System.out.println(i+1+"º: "+l[i]);
		}
	}

}
