package ejercicios;

import java.util.Scanner;

public class T27 {

	public static void main(String[] args) {

		Scanner KB = new Scanner(System.in);
		
		int[] n = new int[10];
		int x;
		System.out.println("Introduce una secuencia de numeros(la secuencia finalizara cuando se escriba 0)");
		do {
			x = KB.nextInt();
			if(x!=0)
				for(int i = 0 ; i<n.length ; i++) 
					if(i!=n.length-1)
						n[i] = n[i+1];
					else
						n[i] = x;
		}while(x!=0);
	
		int[] nPrime = new int[n.length/2];
		int[] nNoPrime = new int[n.length/2];
		int counterP = 0;
		int counterNP = 0;
		boolean prime;
		
		for(int i = 0 ; i<n.length ; i++) {
			
			prime = true;
			for(int c = 2 ; c<n[i] ; c++)
				if(n[i]%c==0)
					prime = false;
			if(n[i]==1)
				prime = false;
			
			if(prime) {
				for(int c = 0 ; c<nPrime.length ; c++)
					if(c!=nPrime.length-1)
						nPrime[c] = nPrime[c+1];
					else
						nPrime[c] = n[i];
			}else
				for(int c = 0 ; c<nNoPrime.length ; c++)
					if(c!=nNoPrime.length-1)
						nNoPrime[c] = nNoPrime[c+1];
					else
						nNoPrime[c] = n[i];
		}
		
		boolean exit = false;
		int option;
		
		while(!exit) {
		System.out.println("Elija una de las opciones:");
		System.out.println("  1.Mostrar numeros primos");
		System.out.println("  2.Mostrar numeros no primos");
		System.out.println("  3.Finalizar programa");
		System.out.print("Opcion nº");
		option = KB.nextInt();
			switch(option) {
				case 1:
					System.out.println("Numeros primos: ");
					for(int m : nPrime)
						System.out.print(m+", ");
					System.out.println(); System.out.println();
					break;
				case 2:
					System.out.println("Numeros no primos: ");
					for(int m : nNoPrime)
						System.out.print(m+", ");
					System.out.println(); System.out.println();
					break;
				case 3:
					System.err.println("FINALIZANDO PROGRAMA. Hasta luego.");
					exit = true;
					break;
				default:
					System.err.println("ERROR. El numero no entra en una de las opciones. Intentelo de nuevo.");
					System.out.println();
			}
		}
	}

}
