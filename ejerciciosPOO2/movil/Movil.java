package ejerciciosPOO2.movil;

import java.text.DecimalFormat;
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
 * @version 1.0
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

	// getter
	private String getTarifa() {
		return this.tarifa;
	}

	// comprueba si la tarifa introducida es válida
	private boolean compruebaTarifa() {
		if ((getTarifa() != "rata") && (getTarifa() != "mono") && (getTarifa() != "bisonte")) {
			return false;
		} else {
			return true;
		}
	}

	// getter que obtiene el coste de la tarifa
	String getCoste() {
		DecimalFormat formato = new DecimalFormat("###.##");
		// He de aclarar que 0.001, 0.002 y 0.005 son los precios de las tarifas
		// (pero en segundos, no minutos)
		if (this.tarifa == "rata") {
			return formato.format(0.001 * this.getSegundosCoste()) + "€";
		} else if (this.tarifa == "mono") {
			return formato.format(0.002 * this.getSegundosCoste()) + "€";
		} else if (this.tarifa == "bisonte") {
			return formato.format(0.005 * this.getSegundosCoste()) + "€";
		} else {
		}
		return "Hubo algún error.";
	}

	@Override
	public String toString() {
		return super.toString() + " - tarificados " + this.getCoste();

	}

}
