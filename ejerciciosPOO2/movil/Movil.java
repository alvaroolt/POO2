package ejerciciosPOO2.movil;

import ejerciciosPOO2.terminal.Terminal;

/**
 * Implementa la clase Movil como subclase de Terminal (la clase del ejercicio
 * anterior que ya no hace falta modificar). Cada móvil lleva asociada una
 * tarifa que puede ser “rata”, “mono” o “bisonte”. El coste por minuto es de 6,
 * 12 y 30 céntimos respectivamente. Se tarifican los segundos exactos.
 * Obviamente, cuando un móvil llama a otro, se le cobra al que llama, no al que
 * recibe la llamada. A continuación se proporciona el contenido del main y el
 * resultado que debe aparecer por pantalla. Para que el total tarificado
 * aparezca con dos decimales, puedes utilizar DecimalFormat
 * 
 * @author Álvaro Leiva Toledano
 * @version
 */

public class Movil extends Terminal {

	// características del móvil
	private String tarifa;

	// constructor
	public Movil(String id, String tarifa) {
		super(id);
		// TODO Auto-generated constructor stub
		this.tarifa = tarifa;
		if (compruebaTarifa() == false) {
			System.out.println("Tarifa introducida errónea. El programa va a finalizar.");
			System.exit(0);
		}
	}

	private String getTarifa() {
		return this.tarifa;
	}

	private boolean compruebaTarifa() {
		if ((getTarifa() != "rata") && (getTarifa() != "mono") && (getTarifa() != "bisonte")) {
			return false;
		} else {
			return true;
		}
	}

}
