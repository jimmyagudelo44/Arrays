package ejercicios;

import java.util.Scanner;

public class T10 {

	public static void main(String[] args) {

		Scanner KB = new Scanner(System.in);
		
		int[] n = new int[6];
		
		System.out.println("Introduce 6 numeros:");
		for(int i = 0 ; i<n.length ; i++) {
			System.out.print(i+1+"º: ");
			n[i] = KB.nextInt();
		}
		
		int big = n[0];
		int tiny = n[0];
		
		for(int i = 0 ; i<n.length ; i++) {
			if(n[i]>big)
				big = n[i];
			if(n[i]<tiny)
				tiny = n[i];
		}
		
		System.out.println("Mayor: "+big);
		System.out.println("Menor: "+tiny);
	}

}
