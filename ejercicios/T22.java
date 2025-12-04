package ejercicios;

import java.util.Scanner;
import java.util.Random;

public class T22 {

	public static void main(String[] args) {

		Scanner KB = new Scanner(System.in);
		
		Random RNG = new Random();
		
		int[] grade = new int[15];
		int[] student = new int[5];
		
		int counter = 0;
		for(int i = 0 ; i<5; i++) {
			System.out.println("alumno "+i+":");
				for(int c = 0; c<3 ; c++) {
					grade[counter] = RNG.nextInt(11);
					System.out.print(grade[counter]+"  ");
					student[i] += grade[counter];
					counter++;
				}
			System.out.println();
			student[i] /= 3;
//			System.out.println(student[i]);
		}
		
		int average;
		counter = 0;
		int counterT = 1;
		
		for(int i = 0 ; i<3 ; i++) {
			
			switch(i) {
				case 0:
					counter = 0;
					break;
				case 1:
					counter = 1;
					break;
				case 2:
					counter = 2;
					break;
			}
			
			average = 0;
			for(int c = 0; c<5 ; c++) {
				average += grade[counter];
				counter += 3;
//				System.out.println(average);
			}
			System.out.println("media "+counterT+"º trimestre: "+ average/5);
			counterT++;
		}
		
		System.out.print("de que alumno quieres saber su media?: ");
		int n = KB.nextInt();
		System.out.println(student[n]);
	}

}
