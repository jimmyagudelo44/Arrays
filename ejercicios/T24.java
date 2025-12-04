package ejercicios;

import java.util.Scanner;

public class T24 {

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
		int counterB;
		int counterA = 0;
		
		for(int i = 0 ; i<n ; i++) {
			
			tiny = Integer.MAX_VALUE;
			
			for(int c = 0+counterA ; c<n ; c++) {
				if(num[c]<tiny) {
					tiny = num[c];
				}
			}
			
			counterB = 0;
			for(int c = 0+counterA ; c<n ; c++) {
				if(num[c] == tiny && num[c] != Integer.MAX_VALUE) {
					counterB++;
				}
			}

			if(counterB>1) {
				for(int c = 0+counterA ; c<counterB ; c++) {
					num[i+c] = tiny;
				}
				i = i+--counterB;
			}
			else
				num[i] = tiny;
			
			counterA++;
		}
		
		for(int m : num)
			System.out.print(m + " ");

	}

}
