package ejercicios;

import java.util.Scanner;

public class T5 {

	public static void main(String[] args) {

		Scanner KB = new Scanner(System.in);
		
		int[] n = new int[10];
		System.out.println("Vas a introducir 10 numeros");
		for(int i = 0 ; i<10 ; i++) {
			System.out.print(i+1+"º: ");
			n[i] = KB.nextInt();
		}
		
		for(int i = 0 ; i<10 ; i++) {
			System.out.println(n[i]+" | "+n[9-i]);
		}
		
	}

}
