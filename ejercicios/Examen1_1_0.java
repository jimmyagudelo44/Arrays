package ejercicios;

import java.util.Scanner;

public class Examen1_1_0 {

	public static void main(String[] args) {

		Scanner KB = new Scanner(System.in);
		
		int n;
		System.out.print("Introduce un numero: ");
		while((n = KB.nextInt()) <0) {
			System.err.println("ERROR. el numero tiene que ser mayor que 0");
			System.out.print("Introducelo de nuevo: ");
		}
		
		int counter = 0;
		int counterAux = 0;
		int summary = 0;
		if(n<100) {
			while(counter*2+1<100) {
//				System.out.print(counter+"º: ");
				if(counter*2+1>=n) {
					summary += counter*2+1;
					counterAux++;
				}
				counter++;
//				System.out.println(summary);
			}
			System.out.println("media de los impares desde "+n+" hasta 100 es: "+summary/counterAux);
		}
		else {
			while(counter*2<=n) {
				if(counter*2>=100) {
					System.out.print(counter+"º: ");
					summary += counter*2;
					counterAux++;
					System.out.println(summary);
				}
				counter++;
			}
			System.out.println("media de los pares desde "+100+" hasta "+n+" es: "+summary/counterAux);
		}
		
	}

}
