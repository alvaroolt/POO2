package ejerciciosPOO2.terminal;

/**
 * Implementa la clase Terminal. Un terminal tiene asociado un n�mero. Los
 * terminales se pueden llamar unos a otros y el tiempo de conversaci�n corre
 * para ambos. A continuaci�n se proporciona el contenido del main y el
 * resultado que debe aparecer por pantalla.
 * 
 * @author Alvaro Leiva Toledano
 * @version 1.0
 */

public class Terminal {

	private String identificador;
	private int tiempoConversacion; // en segundos

	// variable que cuenta los segundos en los que llama el terminal (es decir, los
	// segundos en los que paga una tarifa
	private int segundosCoste = 0;

	// constructor
	public Terminal(String id) {
		setId(id);
	}

	// setter n�mero de terminal
	private void setId(String id) {
		// TODO Auto-generated method stub
		this.identificador = id;
	}

	// getter
	public String getId() {
		return this.identificador;
	}

	// setter de tiempo transcurrido en llamada
	private void setTiempo(int t) {
		this.tiempoConversacion = t;
	}

	// getter
	public int getTiempo() {
		return this.tiempoConversacion;
	}
	
	// getter
	public int getSegundosCoste() {
		return this.segundosCoste;
	}

	// m�todo que establece una llamada entre dos instancias de Terminal y les a�ade
	// segundos de conversaci�n
	public void llama(Terminal terminal, int segundos) {
		this.tiempoConversacion += segundos;
		segundosCoste += segundos;
		terminal.setTiempo(terminal.tiempoConversacion += segundos);
	}

	// m�todo toString
	public String toString() {
		String mensaje = "N� " + getId() + " - " + getTiempo() + "s de conversaci�n";
		return mensaje;
	}
}
