package ejercicios;

import java.util.Scanner;

public class T23 {

		public static void main(String[] args) {
			
			Scanner KB = new Scanner(System.in);
			
			System.out.print("Introduce la longintud del array: ");
			int n = KB.nextInt();
			
			System.out.println("Introduce ahora "+n+" numeros");
			int [] num = new int[n];
			for(int i = 0 ; i<n ; i++) {
				System.out.print(i+"º: ");
				num[i] = KB.nextInt();
			}
			
			int tiny;
			int[] result = new int[n];
			int counter;
			
			for(int i = 0 ; i<n ; i++) {
				
				tiny = Integer.MAX_VALUE;
				
				for(int c = 0 ; c<n ; c++) {
					if(num[c]<tiny) {
						tiny = num[c];
					}
				}
				
				counter = 0;
				for(int c = 0 ; c<n ; c++) {
					if(num[c] == tiny && num[c] != Integer.MAX_VALUE) {
						num[c] = Integer.MAX_VALUE;
						counter++;
					}
				}

				if(counter>1) {
					for(int c = 0 ; c<counter ; c++) {
						result[i+c] = tiny;
					}
					i = i+--counter;
				}
				else
					result[i] = tiny;
			}
			
			for(int m : result)
				System.out.print(m + " ");
	}

}
