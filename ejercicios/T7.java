package ejercicios;

import java.util.Scanner;

public class T7 {

	//Programa sin acabar
	
	public static void main(String[] args) {

		Scanner KB = new Scanner(System.in);
		
		String[] word = new String[5];
		
		System.out.println("Introduce 5 palabras:");
		for(int i = 0 ; i<5 ; i++) {
			System.out.print(i+1+"º: ");
			word[i] = KB.nextLine();
		}
		
		int n = 0;
		for(int i = 0 ; i<5 ; i++) {
			n = Integer.parseInt(word[i]);
			System.out.println(n);
		}
	}

}
