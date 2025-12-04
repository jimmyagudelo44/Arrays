package ejercicios;

import java.util.Scanner;

public class Examen2_1_0 {

	public static void main(String[] args) {

		Scanner KB = new Scanner(System.in);
		
		int capacity = 5;
		int[] x = new int[capacity];
		int[] y = new int[capacity];
		boolean equal = false;
		
		System.out.println("Introduce 5 numeros");
		for(int i = 0 ; i<capacity ; i++) {
			System.out.print(i+"º: ");
			if(i==0)
				while( (x[i] = KB.nextInt()) <1) {
					System.err.println("ERROR. El numero tiene que ser positivo");
					System.out.print("Introducelo de nuevo: ");
				}
			else {
				while( (x[i] = KB.nextInt()) <1) {
					System.err.println("ERROR. El numero tiene que ser positivo");
					System.out.print("Introducelo de nuevo: ");
				}
				
				for(int c = 0 ; c<i ; c++) {
					while(x[i]==x[c]) {
						System.err.println("ERROR. el numero no puede ser igual a alguno anterior");
						System.out.print("Introducelo de nuevo: ");
						x[i] = KB.nextInt();
					}
				}
			}
		} 
		
		int counter = 0;
		
		do {
			
			if(counter==0 || counter%2==0) {
				System.out.println("Introduce ahora otros 5 numeros");
				for(int i = 0 ; i<capacity ; i++) {
					System.out.print(i+"º: ");
					while( (y[i] = KB.nextInt()) <1){
						System.err.println("ERROR. El numero tiene que ser positivo");
						System.out.print("Introducelo de nuevo: ");
					}
					
					for(int c = 0 ; c<capacity ; c++) {
						if(x[c]==y[i])
							equal = true;
					}
				}
			}
			else{
				System.out.println("Introduce ahora otros 5 numeros");
				for(int i = 0 ; i<capacity ; i++) {
					System.out.print(i+"º: ");
					while( (x[i] = KB.nextInt()) <1){
						System.err.println("ERROR. El numero tiene que ser positivo");
						System.out.print("Introducelo de nuevo: ");
					}
					
					for(int c = 0 ; c<capacity ; c++) {
						if(y[c]==x[i])
							equal = true;
					}
				}
			}
			
			counter++;
			
		}while(!equal);
		
		System.out.println("Uno de los numeros coincidia con otro de los anteriores. Finalizando programa");
		
	}

}
