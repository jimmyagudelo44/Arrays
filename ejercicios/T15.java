package ejercicios;

import java.util.Scanner;

public class T15 {

	public static void main(String[] args) {

		Scanner KB = new Scanner(System.in);
		
		int[] n = new int[10];
		
		System.out.println("Introduce "+n.length+" numeros");
		for(int i = 0 ; i<n.length ; i++) {
			System.out.print(i+1+"º: ");
			n[i] = KB.nextInt();
		}
		
		int nO = n[0]; 
		
		for(int i = 0 ; i<n.length ; i++) { 
			if(i != n.length-1)
				n[i] = n[i+1];
			else
				n[n.length-1] = nO;
		}
		
		for(int i = 0 ; i<n.length ; i++) {
			if(i != n.length-1)
				System.out.print(n[i]+", ");
			else
				System.out.print(n[i]);
		}
	}

}
