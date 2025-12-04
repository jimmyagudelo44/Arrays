package ejercicios;

import java.util.Scanner;

public class T25 {

	public static void main(String[] args) {

		Scanner KB = new Scanner(System.in);
		
		int n;
		System.out.print("Introduce la longitud del array: ");
		while((n = KB.nextInt())<1) {
			System.err.println("ERROR. La array no puede ser menor que 1");
			System.out.print("Introducelo de nuevo: ");
		}
		KB.nextLine();
		
		String[] word = new String[n];
		System.out.println("Introduce "+n+" palabras");
		for(int i = 0 ; i<n ; i++) {
			System.out.print(i+"º: ");;
			word[i] = KB.nextLine();
		}
		
		for(int i = 0 ; i<n ; i++)
			for(int c = 0 ; c<n ; c++)
				if(c!=i && word[i].equals(word[c]))
					word[c] = "";
		
		int counter = 0;
		
		for(int i = 0 ; i<n ; i++) 
			if(!(word[i].equals("")))
				counter++;
		
		String[] wordF = new String[counter];
		
		counter = 0;
		for(int i = 0 ; i<n ; i++) 
			if(!(word[i].equals(""))) {
				wordF[counter] = word[i];
				counter++;
			}
		
		System.out.println("Array sin duplicidad: ");
		for(String result : wordF)
			System.out.println(result);
	}

}