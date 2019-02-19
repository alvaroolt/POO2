package ejerciciosPOO2.vehiculos;
import java.util.Scanner;

/**
 * Crea la clase Vehiculo, as� como las clases Bicicleta y Coche como subclases
 * de la primera. Para la clase Vehiculo, crea los atributos de clase
 * vehiculosCreadosy kilometrosTotales, as� como el atributo de instancia
 * kilometrosRecorridos. Crea tambi�n alg�n m�todo espec�fico para cada una de
 * las subclases. Prueba las clases creadas mediante un programa con un men�
 * como el que se muestra a continuaci�n:
 * 
 * VEH�CULOS ========= 1. Anda con la bicicleta 2. Haz el caballito con la
 * bicicleta 3. Anda con el coche 4. Quema rueda con el coche 5. Ver kilometraje
 * de la bicicleta 6. Ver kilometraje del coche 7. Ver kilometraje total 8.
 * Salir Elige una opci�n (1-8):
 * 
 * @author Alvaro Leiva Toledano
 * @version
 */
public class Vehiculo {// EJercicio 2

	/*
	 * Caracter�sticas de la clase Vehiculo
	 */
	private static int contadorVehiculos;

	private static int kmTotales;

	private int km;

	public Vehiculo() {
		Vehiculo.contadorVehiculos++;
		km = 0;
	}
	
	public int getKmTotales() {
		return kmTotales;
	}

	public int getVehiculos() {
		return contadorVehiculos;
	}

	public int getKM() {
		return this.km;
	}

	public void anda(int kilometros) {
		if (kilometros < 0) {
			kilometros = kilometros * -1;
		}
		kmTotales += kilometros;
		this.km += kilometros;

		System.out.println("Kilometros introducidos correctamente.");
	}

	public void verKilometraje() {
		System.out.println("El veh�culo ha recorrido un total de " + getKM() + "km.");
	}

	public void verKilometrajeTotal() {
		System.out.println(
				"La cantidad de kilometros totales recorridos por todos los vehiculos es de " + getKmTotales() + "km.");
	}
}
