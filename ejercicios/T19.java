package ejercicios;

import java.util.Scanner;

public class T19 {

	public static void main(String[] args) {

		Scanner KB = new Scanner(System.in);
		
		int capacity = 10;
		int[] x = new int[capacity];
		int[] y = new int[capacity];
		
		System.out.println("Introduce "+capacity+" numeros en cada array");
		for(int i = 0 ; i<capacity ; i++) {
			
			System.out.print("X"+i+"º: ");
			x[i] = KB.nextInt();
			System.out.print("Y"+i+"º: ");
			y[i] = KB.nextInt();
			System.out.println();
			
			if(i != 0) {
				while(x[i]<x[i-1]) {
					System.err.println("ERROR. El numero X tiene que ser mayor al anterior");
					System.out.print("Introduzcalo de nuevo: ");
					x[i] = KB.nextInt();
				}
				while(y[i]<y[i-1]) {
					System.err.println("ERROR. El numero Y tiene que ser mayor al anterior");
					System.out.print("Introduzcalo de nuevo: ");
					y[i] = KB.nextInt();
				}
			}
		}
		
		int[] z = new int[capacity*2];
		int counterX = 0;
		int counterY = 0;
		
		for(int i = 0 ; i<z.length ; i++) {
			
//			System.out.print(i+"º: X"+counterX+" | Y"+counterY);
			
			if(i == z.length-1) {
				if(x[counterX]>y[counterY])
					z[i] = x[counterX];
				else 
					z[i] = y[counterY];
			}
			else {
			if(x[counterX]<y[counterY]) {
				z[i] = x[counterX];
//				System.out.print(" || "+z[i]+" X"+counterX);
				counterX++;
				if(counterX == capacity)
					counterX--;
			}
			else if(y[counterY]<x[counterX]) {
				z[i] = y[counterY];
//				System.out.print(" || "+z[i]+" Y"+counterY);
				counterY++;
				if(counterY == capacity)
					counterY--;
			}
			else {
				z[i] = x[counterX];
				counterX++;
				i++;
				z[i] = y[counterY];
				counterY++;
//				System.out.print(" || X"+counterX+" | Y"+counterY);
			}
//			System.out.println();
			}
		}
		
		for(int n : z)
			System.out.print(n+" - ");
	}

}
