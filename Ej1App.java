import java.util.ArrayList;
import java.util.Scanner;

public class Ej1App {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		Scanner sc = new Scanner(System.in);
		double nota = 0;
		
		ArrayList<Double>lista = new ArrayList<>();
		
		System.out.println("Entra la cantidad de alumnos");
		int alumnos = sc.nextInt();
		
		System.out.println("Entra la cantidad de examenes");
		int exam = sc.nextInt();
		
		for(int i= 0; i < alumnos; i++) {
			
			double media=0;
			System.out.println("-------Notas del alumno "+(i+1)+"-------");
			
			for(int j = 0; j < exam; j++) {
				
				System.out.println("Entra la nota del examen "+(j+1));
				nota = sc.nextDouble();
				
				media = media+nota;
			}
			
			media = media / exam;
			lista.add(media);
			
		}
		
		for(int i=0; i < lista.size(); i++) {
			
			System.out.println("Nota media del alumno"+(i+1)+": "+lista.get(i));
			
		}
		
		
	}

}
