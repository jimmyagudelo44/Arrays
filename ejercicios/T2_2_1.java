package ejercicios;

import java.util.Scanner;

public class T2_2_1 {

	public static void main(String[] args) {

//		programa no terminado, esta version dira cuales son las palabras iguales
		
		Scanner KB = new Scanner(System.in);

		String[] word = new String[5];
		boolean equals = false;
		int i;
		int coincidence = 0;
		
		for(i = 0 ; i<5 ; i++) {							//en este bucle iremos guardando las palabras de 1 en 1
			System.out.print("Introduce una palabra: ");
			word[i] = KB.nextLine();
		} 
		
		for(i = 0 ; i<5 ; i++) {				//aqui anidamos dos for para ir mirando si la palabra 0 no coincida ni con la 1 ni con la 2 ni con la 3 ni con la 4 
			for(int c = 0 ; c<5 ; c++) {		//luego habra que comprobar que la 1 no coincida con la 2 con la 3 y asi hasta que comprobemos todas
					if(word[i].equals(word[c]) && c!=i) {
						equals = true;
						coincidence++;
						
						word[c] += word[c];					//si dos palabras son iguales, habra que cambiar una de ellas para que
						for(int f = 0 ; f<5 ; f++) {					//en la siguiente vuelta no sean iguales y el contador no suba
							if(word[c].equals(word[f]) && f!=c) {		//aqui miramos si despues de modificar la palabra da la casualidad que la palabra siga siendo igual a otra,
								word[c] += word[c];			//las posibilidades son bajas pero no nulas. Aqui volvemos a modificar la palabra.
								f = 0;						//si hay alguna coincidencia habra que reiniciar el contador y volver a comprobar que no haya coincidencias de nuevo
							}
						}
					}
			}
		}
		coincidence++; 		//este contador cuenta las coincidencias pero no las palabras iguales. asi que si hay dos palabras iguales, el contador sumara solo 1 vez. asi que por eso le sumamos 1
		
		String result = equals? "Hay "+coincidence+" palabras iguales" : "Ninguna de las palabras son iguales entre si";
		System.out.println(result);
	}

}

