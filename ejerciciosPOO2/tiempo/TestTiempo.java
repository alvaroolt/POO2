package ejerciciosPOO2.tiempo;

/**
 * Crea la clase Tiempo con los m�todos suma y resta. Los objetos de la clase
 * Tiempo son intervalos de tiempo y se crean de la forma Tiempo t = new
 * Tiempo(1, 20, 30) donde los par�metros que se le pasan al constructor son las
 * horas, los minutos y los segundos respectivamente. Crea el m�todo toString
 * para ver los intervalos de tiempo de la forma 10h 35m 5s. Si se suman por
 * ejemplo 30m 40s y 35m 20s el resultado deber�a ser 1h 6m 0s. Realiza un
 * programa de prueba para comprobar que la clase funciona bien.
 * 
 * @author Alvaro Leiva Toledano
 * @version 1.0
 */

public class TestTiempo {

	public static void main(String[] args) {
		Tiempo cronometro1 = new Tiempo(1, 30, 20);
		System.out.println(cronometro1);

		cronometro1.suma();
		System.out.println(cronometro1);

		cronometro1.resta();
		System.out.println(cronometro1);
	}
}
