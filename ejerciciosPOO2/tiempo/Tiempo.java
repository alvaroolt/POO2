package ejerciciosPOO2.tiempo;

import java.util.Scanner;

/**
 * Crea la clase Tiempo con los métodos suma y resta. Los objetos de la clase
 * Tiempo son intervalos de tiempo y se crean de la forma Tiempo t = new
 * Tiempo(1, 20, 30) donde los parámetros que se le pasan al constructor son las
 * horas, los minutos y los segundos respectivamente. Crea el método toString
 * para ver los intervalos de tiempo de la forma 10h 35m 5s. Si se suman por
 * ejemplo 30m 40s y 35m 20s el resultado debería ser 1h 6m 0s. Realiza un
 * programa de prueba para comprobar que la clase funciona bien.
 * 
 * @author Alvaro Leiva Toledano
 * @version 1.0
 */

public class Tiempo {

	private int horas;
	private int minutos;
	private int segundos;
	
	// constructor
	public Tiempo(int horas, int minutos, int segundos) {
		setHoras(horas);
		setMinutos(minutos);
		setSegundos(segundos);
	}

	// setter
	private void setHoras(int h) {
		// TODO Auto-generated method stub
		this.horas = h;
	}

	// getter
	public int getHoras() {
		return this.horas;
	}

	// setter
	private void setMinutos(int m) {
		// TODO Auto-generated method stub
		this.minutos = m;
	}

	// getter
	public int getMinutos() {
		return this.minutos;
	}

	// setter
	private void setSegundos(int s) {
		// TODO Auto-generated method stub
		this.segundos = s;
	}

	// getter
	public int getSegundos() {
		return this.segundos;
	}

	// el tiempo (h m s) en segundos (s)
	public int getSegundosTotales() {
		return getHoras() * 3600 + getMinutos() * 60 + getSegundos();
	}

	// método que recoge las horas, minutos y segundos a sumar al tiempo establecido
	// en nuestra instancia de tiempo.
	public void suma() {
		Scanner sc = new Scanner(System.in);

		System.out.print("Horas a sumar: ");
		int sumaHoras = sc.nextInt();

		System.out.print("Minutos a sumar: ");
		int sumaMinutos = sc.nextInt();

		System.out.print("Segundos a sumar: ");
		int sumaSegundos = sc.nextInt();

		// el tiempo a sumar, pero en segundos
		int sumaTotalSegundos = sumaHoras * 3600 + sumaMinutos * 60 + sumaSegundos;
		// el tiempo a sumar añadido al tiempo establecido en la instancia anteriormente
		int resultadoEnSegundos = sumaTotalSegundos + getSegundosTotales();

		ordenaTiempo(resultadoEnSegundos);
	}

	public void resta() {
		Scanner sc = new Scanner(System.in);

		System.out.print("Horas a restar: ");
		int restaHoras = sc.nextInt();

		System.out.print("Minutos a restar: ");
		int restaMinutos = sc.nextInt();

		System.out.print("Segundos a restar: ");
		int restaSegundos = sc.nextInt();

		int restaTotalSegundos = restaHoras * 3600 + restaMinutos * 60 + restaSegundos;
		int resultadoEnSegundos = getSegundosTotales() - restaTotalSegundos;

		ordenaTiempo(resultadoEnSegundos);
	}

	// ordena los segundos en horas, minutos y segundos
	private void ordenaTiempo(int segundos) {
		int contadorHoras = 0;
		int contadorMinutos = 0;
		while (segundos > 3600) {
			segundos -= 3600;
			contadorHoras++;
			// System.out.println(segundos);
		}
		setHoras(contadorHoras);

		while (segundos < 3600 && segundos > 60) {
			segundos -= 60;
			contadorMinutos++;
		}
		setMinutos(contadorMinutos);

		setSegundos(segundos);
	}

	// método toString
	@Override
	public String toString() {
		return "Tiempo [horas = " + horas + "h, minutos = " + minutos + "m, segundos = " + segundos + "s";
	}

}
