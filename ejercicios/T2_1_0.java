package ejercicios;

import java.util.Scanner;
public class T2_1_0 {

	public static void main(String[] args) {

		Scanner KB = new Scanner(System.in);
		
		String[] word = new String[5];
		boolean equals = false;
		
		for(int i = 0 ; i<5 && !equals ; i++) {
			System.out.print("Introduce 5 palabras: ");
			word[i] = KB.nextLine();
			if(i == 0) {}
			else {
				if(word[i].equals(word[i-1]))
					equals = true;
			}
		}
		
		String result = equals? "la palabra introducida es igual a la anterior" : "ninguna de las palabras son iguales";
		System.out.println(result);
	}

}
