package ejercicios;

import java.util.Scanner;

public class T16 {

	public static void main(String[] args) {

		Scanner KB = new Scanner(System.in);
		
		int[] n = new int[10];
		int[] backup = new int[n.length];
				
		System.out.println("Introduce 10 numeros");
		for(int i = 0 ; i<n.length ; i++) {
			System.out.print(i+"º: ");
			n[i] = KB.nextInt();
			backup[i] = n[i];
		}
		
		System.out.print("posiciones en la que se desplazaran: ");
		int position = KB.nextInt() %10;
		
		for(int i = 0 ; i<n.length ; i++) {
			if(i+position<=n.length-1)
				n[i] = n[i+position];
			else
				n[i] = backup[(i+position)-(n.length-1)-1];
			
			if(i != n.length-1)
				System.out.print(n[i]+", ");
			else
				System.out.print(n[i]);
		} 
	}

}
