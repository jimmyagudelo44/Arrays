package ejercicios;

import java.util.Scanner;

public class T9 {

	public static void main(String[] args) {
		
		Scanner KB = new Scanner(System.in);
		
		int[] A = new int[12];
		int[] B = new int[12];
		
		System.out.println("Introduce 12 numeros en cada array");
		for(int i = 0 ; i<A.length ; i++) {
			System.out.print("A"+(i+1)+": ");
			A[i] = KB.nextInt();
			System.out.print("B"+(i+1)+": ");
			B[i] = KB.nextInt();
			System.out.println();
		}
		
		int c = 0;
		
		for(int i = 0 ; i<=A.length/4 ; i++) {
			
			int cO = c;
			
			for(int t = 0 ; t<3 ; t++) {
				System.out.print("A: "+A[c]+"  ");
				c++;
			}
			System.out.println();
			
			c = cO;
			
			for(int t = 0 ; t<3 ; t++) { 
				System.out.print("B: "+B[c]+"  ");
				c++;
			}
			System.out.println();
			System.out.println();
		}
	}
	
}
