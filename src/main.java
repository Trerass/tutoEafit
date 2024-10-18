import java.util.*;

public class Main {

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int materiaElegida = elegirMateria(sc);  
    elegirTutor(materiaElegida, sc);
    

  }

  public static void mostrarDatos(int mat, int tutor){
    if(tutor == 1 && mat == 1){
      System.out.println("\nEl tutor Juan tiene disponibles los siguientes días:");
      System.out.println("23/02/2025");
      System.out.println("02/06/2025");
      System.out.println("16/11/2025\n"); 
    } else if(tutor == 2 && mat == 1){
      System.out.println("\nEl tutor Pedro tiene disponibles los siguientes días:");
      System.out.println("22/10/2024");
      System.out.println("23/10/2024");
      System.out.println("01/11/2024\n"); 
    } else if(tutor == 1 && mat == 2){
      System.out.println("\nEl tutor Arnold tiene disponibles los siguientes días:");
      System.out.println("20/10/2024");
      System.out.println("21/10/2024");
      System.out.println("22/10/2024\n"); 
    } else if(tutor == 2 && mat == 2){
      System.out.println("\nEl tutor Gasparin tiene disponibles los siguientes días:");
      System.out.println("29/10/2024");
      System.out.println("30/10/2024");
      System.out.println("31/10/2024\n"); 
    } else if(tutor == 3 && mat == 2){
      System.out.println("\nEl tutor Pablo tiene disponibles los siguientes días:");
      System.out.println("02/11/2024");
      System.out.println("05/11/2024");
      System.out.println("06/11/2024\n"); 
    } else if(tutor == 1 && mat == 3){
      System.out.println("\nEl tutor Jose tiene disponibles los siguientes días:");
      System.out.println("19/10/2024");
      System.out.println("20/10/2024");
      System.out.println("21/10/2024\n"); 
    } else if(tutor == 2 && mat == 3){
      System.out.println("\nLa tutora María tiene disponibles los siguientes días:");
      System.out.println("22/10/2024");
      System.out.println("23/10/2024");
      System.out.println("24/10/2024\n"); 
    }
  } 

  public static void elegirTutor(int matEleg, Scanner s) {
    int tutorElegido;
    System.out.println("Elije el tutor que deseas");
    switch (matEleg) {
      case 1:
        System.out.println("1. Juan");
        System.out.println("2. Pedro");
        tutorElegido = s.nextInt();
        mostrarDatos(matEleg, tutorElegido);
        break;
      case 2:
        System.out.println("1. Arnold");
        System.out.println("2. Gasparin");
        System.out.println("3. Pablo");
        tutorElegido = s.nextInt();
        mostrarDatos(matEleg, tutorElegido);
        break;
      case 3:
        System.out.println("1. José");
        System.out.println("2. María");
        tutorElegido = s.nextInt();
        mostrarDatos(matEleg, tutorElegido);
        break;
    }
  }

  public static int elegirMateria(Scanner s) {
    boolean verificador = true;
    System.out.println("Elige el número de la materia: ");
    System.out.println("1. PDS");
    System.out.println("2. Cálculo");
    System.out.println("3. FDP");
    while (verificador) {
      int op = s.nextInt();
      switch (op) {
        case 1:
          System.out.println("\nParciales:");
          System.out.println("21/10/2024");
          System.out.println("31/10/2024");
          System.out.println("14/11/2024\n");
          return 1;
        case 2:
          System.out.println("\nParciales:");
          System.out.println("25/10/2024");
          System.out.println("02/11/2024\n");
          return 2;
        case 3:
          System.out.println("\nParciales:");
          System.out.println("8/11/2024");
          System.out.println("15/11/2024\n");
          return 3;
        default:
          System.out.println("Opción no válida, elije un número valido");
          break;
      }
    }
    return -1;
  }
}
