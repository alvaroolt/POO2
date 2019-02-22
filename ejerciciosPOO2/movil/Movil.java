package ejerciciosPOO2.movil;

import ejerciciosPOO2.terminal.Terminal;

/**
 * Implementa la clase Movil como subclase de Terminal (la clase del ejercicio
 * anterior que ya no hace falta modificar). Cada m�vil lleva asociada una
 * tarifa que puede ser �rata�, �mono� o �bisonte�. El coste por minuto es de 6,
 * 12 y 30 c�ntimos respectivamente. Se tarifican los segundos exactos.
 * Obviamente, cuando un m�vil llama a otro, se le cobra al que llama, no al que
 * recibe la llamada. A continuaci�n se proporciona el contenido del main y el
 * resultado que debe aparecer por pantalla. Para que el total tarificado
 * aparezca con dos decimales, puedes utilizar DecimalFormat
 * 
 * @author �lvaro Leiva Toledano
 * @version
 */

public class Movil extends Terminal {

	// caracter�sticas del m�vil
	private String tarifa;

	// constructor
	public Movil(String id, String tarifa) {
		super(id);
		// TODO Auto-generated constructor stub
		this.tarifa = tarifa;
		if (compruebaTarifa() == false) {
			System.out.println("Tarifa introducida err�nea. El programa va a finalizar.");
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
