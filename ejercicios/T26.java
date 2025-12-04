package ejercicios;

import java.util.Scanner;

public class T26 {

	public static void main(String[] args) {

		Scanner KB = new Scanner(System.in);
		
		int[] n = new int[7];
		System.out.println("Introduce mas de "+n.length+" numeros (el programa acabara cuando introduzcas 0)");	
		
		int x;
		
		do {
			System.out.print("-");
			x = KB.nextInt();
			if(x!=0)
				for(int i = 0 ; i<n.length ; i++) {
					if(i!=n.length-1)
						n[i] = n[i+1];
					else
						n[i] = x;
				}
			else
				System.err.println("0 introducido. FINALIZANDO SECUENCIA");
			System.out.println();
		}while(x!=0);
		
		for(int m : n)
			System.out.print(m+", ");
	}

}
