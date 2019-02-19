package ejerciciosPOO2.terminal;

/**
 * Implementa la clase Terminal. Un terminal tiene asociado un número. Los
 * terminales se pueden llamar unos a otros y el tiempo de conversación corre
 * para ambos. A continuación se proporciona el contenido del main y el
 * resultado que debe aparecer por pantalla.
 * 
 * @author Alvaro Leiva Toledano
 * @version 1.0
 */

public class Terminal {

	private String identificador;
	private int tiempoConversacion; // en segundos

	// constructor
	public Terminal(String id) {
		setId(id);
	}

	// setter número de terminal
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

	// método que establece una llamada entre dos instancias de Terminal y les añade
	// segundos de conversación
	public void llama(Terminal terminal, int segundos) {
		this.tiempoConversacion += segundos;
		terminal.setTiempo(terminal.tiempoConversacion += segundos);
	}

	// método toString
	public String toString() {
		String mensaje = "Nº " + getId() + " - " + getTiempo() + "s de conversación";
		return mensaje;
	}
}
