package ejercicios;

import java.util.Scanner;

public class T20 {

	public static void main(String[] args) {

		Scanner KB = new Scanner(System.in);
		
		int[] m = new int[10];
		int i;
		
		System.out.println("Introduce 10 numeros de manera creciente");
		for(i = 0; i<m.length ; i++) {
			System.out.print(i+"º: ");
			m[i] = KB.nextInt();
			while(i != 0 && m[i]<m[i-1]) {
				System.err.println("ERROR. el valor actual tiene que ser mayor al anterior");
				System.out.print("Introducelo de nuevo: ");
				m[i] = KB.nextInt();
			}
		}
		
		System.out.print("Introduce ahora otro numero N: ");
		int N = KB.nextInt();
		boolean coincidence = false;
		
		for(i = 0 ; i<m.length && !coincidence; i++) {
			if(m[i] == N)
				coincidence = true;
		}
		
		String result = coincidence? "N se encuentra en la posicion "+(i-1) : "N no coincide con"
				+ " ningun numero dentro de la array";
		System.out.println(result);
	}

}
