package ejercicios;

public class tests {

	public static void main(String[] args) {
		
		String[] w = new String[2];
		w[0] = "º";
		w[1] = "2";
		for(int i = 0 ; i<3 ; i++) {
			w = new String[3];
		}
		
		System.out.println(w[0]);
	}
	
}
