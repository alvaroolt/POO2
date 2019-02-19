package ejerciciosPOO2.vehiculos;

import java.util.Scanner;

/**
 * Crea la clase Vehiculo, así como las clases Bicicleta y Coche como subclases
 * de la primera. Para la clase Vehiculo, crea los atributos de clase
 * vehiculosCreadosy kilometrosTotales, así como el atributo de instancia
 * kilometrosRecorridos. Crea también algún método específico para cada una de
 * las subclases. Prueba las clases creadas mediante un programa con un menú
 * como el que se muestra a continuación:
 * 
 * VEHÍCULOS ========= 1. Anda con la bicicleta 2. Haz el caballito con la
 * bicicleta 3. Anda con el coche 4. Quema rueda con el coche 5. Ver kilometraje
 * de la bicicleta 6. Ver kilometraje del coche 7. Ver kilometraje total 8.
 * Salir Elige una opción (1-8):
 * 
 * @author Alvaro Leiva Toledano
 * @version
 */
public class TestVehiculo {

	public static void main(String[] args) {
		Bicicleta bicicleta1 = new Bicicleta();
		Coche coche1 = new Coche();
		elegirOpcion();
	}

	private static void mostrarMenu() {
		System.out.println("VEHÍCULOS" + "\n=========" + "\n1. Anda con la bicicleta"
				+ "\n2. Haz el caballito con la bicicleta" + "\n3. Anda con el coche" + "\n4. Quema rueda con el coche"
				+ "\n5. Ver kilometraje de la bicicleta" + "\n6. Ver kilometraje del coche" + "\n7. Ver kilometraje total"
				+ "\n8. Salir" + "\nElige una opción (1-8):");
	}

	private static void elegirOpcion() {
		Scanner sc = new Scanner(System.in);
		int opcion = 0;
		do {
			mostrarMenu();
			System.out.print("Elige una opción: ");
			opcion = sc.nextInt();
			int cantidad;
			switch (opcion) {
			case 1:
				System.out.println("¿Cuántos km avanza?");
				cantidad = sc.nextInt();
				// bicicleta1.anda(cantidad);
				break;
			case 2:
				// hacerCaballito();
				break;
			case 3:
				System.out.println("¿Cuántos km avanza?");
				cantidad = sc.nextInt();
				// coche1.anda(cantidad);
				break;
			case 4:
				// coche1.quemarRueda();
				break;
			case 5:
				// bicicleta1.verKilometraje();
				break;
			case 6:
				// coche1.verKilometraje();
				break;
			case 7:
				// verKilometrajeTotal();
				break;
			case 8:
				System.exit(0);
				break;
			default:
				System.out.println("ERROR.");
				break;
			}
		} while (opcion != 8);
	}
}
