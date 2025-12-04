package ejercicios;

import java.util.Scanner;

public class T28_1_0 {

	public static void main(String[] args) {

		Scanner KB = new Scanner(System.in);
		
		int cap = 0;		//esta variable la usaremos para aumentar de tamaño nuestros arrays
		String[] student = new String[cap];			//como al cambiar el tamaño de un array se borra el contenido de la misma
		String[] aux = new String[cap];				//necesitaremos un array auxiliar
		boolean exit = false;
		int opt;
		
		System.out.println("IES ROSA CHACEL");
		while(!exit) {
			
			if(student.length!=0) { 		//si la longitud del array es 0, significa que no cabe ningun dato
				System.out.println("Lista de alumnos: ");
				for(String r : student)
					System.out.println("-"+r);
			}
			System.out.println("1.Insertar un alumno");			//por lo tanto no me interesa otra opcion mas que meterle un dato
			if(student.length!=0) {			
				System.out.println("2.Eliminar un alumno");
				System.out.println("3.Buscar un alumno");
			}
			System.out.println("4.Finalizar programa");
			System.out.print("Introduzca su seleccion: ");
			opt = KB.nextInt();
			if(student.length==0)
				while(opt!=1 && opt!=4) {
					System.err.println("ERROR. No se ha encontrado esta opcion, intentelo de nuevo");
					System.out.print("Introduzca su seleccion: ");
					opt = KB.nextInt();
				}
			KB.nextLine();
			
			switch(opt) {
			
				case 1:
					
					boolean check;
					cap++;			//cada vez que nos metamos aqui necesitaremos un array mas grande, por lo tanto la capacidad hay que aumentarla
									//pero antes de aumentar la capacidad de los arrays, necesitaremos guardar la informacion en algun sitio
					if(student.length!=0) {
						
						for(int i = 0 ; i<student.length ; i++)		//guardamos los datos de un array a otra
							aux[i] = student[i];
						student = new String[cap];					//y ahora ya podemos aumentar la longitud
						for(int i = 0 ; i<aux.length ; i++)
							student[i] = aux[i];					//copiamos los datos de nuevo en nuestra array con mas longitud ahora
						aux = new String[cap];						//y aumentamos la auxiliar para futuras expansiones de ambas arrays
						
						System.out.print("Introduzca el nombre del nuevo alumno: ");
						student[student.length-1] = KB.nextLine();		//solo nos falta un dato por rellenar, que es el nombre del nuevo alumno
						for(int i = 0 ; i<student.length ; i++) {
							check = false;			//si no creamos esta boolean el programa solo comprobara la palabra en la i actual y no mirara el resto si da la casualidad
							while(student.length-1!=i && student[student.length-1].equals(student[i])) {	//de que metamos un nombre que estaba antes que la i actual
								System.err.println("ERROR. El alumno no puede llamarse igual que otro");
								System.out.print("Introduzcalo de nuevo: ");
								student[student.length-1] = KB.nextLine();
								check = true;			
							}
							if(check)			//por lo tanto habra que mirar otra vez desde el principio cada vez que se introduzca una palabra
								i = -1;			//-1 porque justo despues de esto se le sumara 1 resultando en 0
						}
					}
					
					else {
						student = new String[cap];		//si cap es 0, significa que ambas arrays no tenian datos y no se perdera naa aunque las aumentemos
						aux = new String[cap];		
						System.out.print("Introduzca el nombre del nuevo alumno: ");
						student[0] = KB.nextLine();		//como solo hay una posicion con poner 0 me basta
					}
					
					System.out.println();
					break;
					
				case 2:
					
					boolean notfound = true;
					String delete = "";
					while(notfound) {
						System.out.print("Introduce el nombre del alumno que quieras eliminar: ");
						delete = KB.nextLine();
						for(int i = 0 ; i<cap ; i++)
							if(delete.equals(student[i]))
								notfound = false;
						if(notfound)
							System.err.println("NOMBRE NO ENCONTRADO. Intentelo de nuevo");
					}
					
					int reminder = 0;				//este lo usaremos para saber en que posicion de la array son iguales
					for(int i = 0 ; i<cap ; i++)
						if(delete.equals(student[i]))
							reminder = i;
					
					cap--;			//en este caso es lo contrario al anterior, necesitamos disminuar la capacidad,
					aux = new String[cap];
					
					boolean skip = false;		//saltandonos el dato que queriamos borrar en un principio (en verdad no vamos a borrar nada, el borrado es
					if(cap==0)					//una consecuencia que ocurre al cambiar el tamaño de los arrays)
						student = new String[0];		//si al disminuir cap resulta que la capacidad pasa a ser 0 no necesitare meter datos asi que con cambiar el tamaño me vale
					else {
						for(int i = 0 ; i<student.length-1 ; i++) {		//como vamos a obviar uno de los datos necesito una vuelta menos del for(-1)
							if(reminder!=student.length-1) {
								if(i==reminder)			//en el momento que llegamos a la parte en la que eran iguales podemos saltarnos el dato que queriamos
									skip = true;
								if(!skip)
									aux[i] = student[i];
								else
									aux[i] = student[i+1];	//y nos saltamos este dato simplemente poniendo i+1, y como el for tiene un -1 no van a haber out of bounds
							}else
								aux[i] = student[i];		//si donde coincidian era en la ultima posicion del array, con poner que sean iguales en cada posicion me vale, ya que el for ya tiene el -1 y no pasaremos por la ultima posicion
						}
						student = new String[cap];			//una vez hecho todo esto ya podemos cambiar el tamaño de nuestra array y copiar los datos de antes quitando el nombre que queriamos eliminar
						for(int i = 0 ; i<student.length ; i++)
							student[i] = aux[i];
					}
					
					System.out.println();
					break;
					
				case 3:
					
					String search;
					boolean out = false;
					boolean found = false;
					
					while(!out) {
						System.out.print("Introduce el nombre del alumno al que quieras buscar: ");
						search = KB.nextLine();
						for(int i = 0 ; i<student.length ; i++)
							if(student[i].equals(search)) {
								System.out.println("el alumno "+student[i]+" se encuentra en la posicion: "+i);
								out = true;
								found = true;
							}
						if(!found)
							System.err.println("ERROR. no se ha encontrado un alumno con este nombre. Intentelo de nuevo");
					}
					
					System.out.println();
					break;
					
				case 4:
					System.err.println("FINALIZANDO PROGRAMA. Hasta luego");
					exit = true;
					break;
					
				default:
					System.err.println("ERROR. El numero no aparece en las opciones establecidas. Intentelo de nuevo");
					System.out.println();
			}
		}
		
	}

}
