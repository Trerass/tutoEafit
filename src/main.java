import java.util.*;

public class main {

	public static void main(String[] args) {
		ArrayList<String> tutores = new ArrayList<String>();
		tutores.add("Tutor FDP");
		tutores.add("Tutor Cálculo");
		tutores.add("Tutor PDS");
		
		ArrayList<String> materias = new ArrayList<String>();
		materias.add("FDP");
		materias.add("Clculo");
		materias.add("PDS");
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Ingrese su nombre");
		String nombre = sc.nextLine();

		System.out.println(nombre + " ¿De qué materia deseas una turoría?");
		System.out.println("Elija el número de la opción: ");
		System.out.println("1: FDP");
		System.out.println("2: Cálculo");
		System.out.println("3: PDS");
		int opcion = sc.nextInt();
		
		if(opcion == 1) {
			System.out.println("");
		} else if(opcion == 2){
			System.out.println("");
		} else {
			System.out.println("");
		}

	}

}
